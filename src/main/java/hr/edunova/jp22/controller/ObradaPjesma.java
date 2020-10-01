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
    
    

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaIme();
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

}
