/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.controller;

import hr.edunova.jp22.model.Clan;
import hr.edunova.jp22.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Bole
 */
public class ObradaClan extends Obrada<Clan>{

    public ObradaClan(Clan clan) {
        super(clan);
    }
    
    public ObradaClan() {
        super();
    }
    
    @Override
    public List<Clan> getPodaci() {
     return sesion.createQuery("from Clan").list();
    }
    
    

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaIme();
        kontrolaPrezime();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
    
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
    
    }
    
    
    private void kontrolaIme() throws EdunovaException{
        if(entitet.getIme()==null){
            throw new EdunovaException(" Ime nije definirano! ");
        }
        if(entitet.getIme().isEmpty()){
            throw new EdunovaException(" Morate unijeti ime! ");
        }
        if(entitet.getIme().length()>50){
            throw new EdunovaException(" Ime ne smije sadržavati više od 50 znakova. ");
        }
    }
    
    private void kontrolaPrezime() throws EdunovaException{
        if(entitet.getPrezime()==null){
            throw new EdunovaException(" Prezime nije definirano! ");
        }
        if(entitet.getPrezime().isEmpty()){
            throw new EdunovaException(" Morate unijeti prezime! ");
        }
        if(entitet.getPrezime().length()>50){
            throw new EdunovaException(" Prezime ne smije sadržavati više od 50 znakova. ");
        }
    }
}
