/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.controller;

import hr.edunova.jp22.model.Album;
import hr.edunova.jp22.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Bole
 */
public class ObradaAlbum extends Obrada<Album> {

    public ObradaAlbum(Album album) {
        super(album);
    }

    public ObradaAlbum() {
        super();
    }

    @Override
    public List<Album> getPodaci() {
        return sesion.createQuery("from Album").list();
    }

    public List<Album> getPodaci(String uvjet) {
        return sesion.createQuery("from Album a "
                + " where concat(a.ime, ' ') "
                + " like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaIme();
        kotrolaOcjena();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        kontrolaIme();
        kotrolaOcjena();
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {

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

    private void kotrolaOcjena() throws EdunovaException {
        if (entitet.getOcjena() == 0) {
            throw new EdunovaException(" Morate unijeti ocjenu! ");
        }

        if (entitet.getOcjena() > 10 && entitet.getOcjena() <= 0) {
            throw new EdunovaException(" Ocjena mora biti u rasponu od 1 do 10! ");
        }
    }
}
