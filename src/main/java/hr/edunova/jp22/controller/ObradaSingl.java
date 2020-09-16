/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.controller;

import hr.edunova.jp22.model.Album;
import hr.edunova.jp22.model.Singl;
import hr.edunova.jp22.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Bole
 */
public class ObradaSingl extends Obrada<Singl> {
    public ObradaSingl(Singl singl) {
        super(singl);
    }
    
    public ObradaSingl() {
        super();
    }
    
    @Override
    public List<Singl> getPodaci() {
     return sesion.createQuery("from Singl").list();
    }
    
    

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaIme();
        kotrolaOcjena();
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

    private void kotrolaOcjena() throws EdunovaException{
        if(entitet.getOcjena() == 0){
            throw new EdunovaException(" Morate unijeti ocjenu! ");
    }
        
        if(entitet.getOcjena() > 10 && entitet.getOcjena() <= 0){
            throw new EdunovaException(" Ocjena mora biti u rasponu od 1 do 10! ");
        }
    }
}
