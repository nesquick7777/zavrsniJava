/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.controller;

import hr.edunova.jp22.model.Pjesma;
import hr.edunova.jp22.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Bole
 */
public class ObradaPjesma extends Obrada<Pjesma> {

    public ObradaPjesma(Pjesma pjesma) {
        super(pjesma);
    }

    public ObradaPjesma() {
        super();
    }

    @Override
    public List<Pjesma> getPodaci() {
        return sesion.createQuery("from Pjesma").list();
    }

    public List<Pjesma> getPodaci(String uvjet) {
        return sesion.createQuery("from Pjesma p "
                + " where concat(p.ime, ' ') "
                + " like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaIme();
        kontrolaPut();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        kontrolaIme();
        kontrolaPut();
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        if (entitet.getAlbumi().size() > 0) {
            throw new EdunovaException("Pjesma se ne može obrisat, nalazi se u albumima.");
        }
    }

    private void kontrolaIme() throws EdunovaException {
        if (entitet.getIme() == null) {
            throw new EdunovaException(" Ime nije definirano! ");
        }
        if (entitet.getIme().isEmpty()) {
            throw new EdunovaException(" Morate unijeti ime! ");
        }
        if (entitet.getIme().length() > 50) {
            throw new EdunovaException(" Ime ne smije sadržavati više od 50 znakova. ");
        }
    }
    
    private void kontrolaPut() throws EdunovaException{
        if(entitet.getPutDoPjesme().isEmpty()){
           throw new EdunovaException(" Morate unijeti put do pjesme! ");
        }
        if(!(entitet.getPutDoPjesme().endsWith(".mp3"))){
           throw new EdunovaException(" Krivi format pjesme! ");
        }
    }

}
