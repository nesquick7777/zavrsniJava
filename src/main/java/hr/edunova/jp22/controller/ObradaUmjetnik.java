/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.controller;

import hr.edunova.jp22.model.Umjetnik;
import hr.edunova.jp22.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Bole
 */
public class ObradaUmjetnik extends Obrada<Umjetnik> {

    public ObradaUmjetnik(Umjetnik umjetnik) {
        super(umjetnik);
    }

    public ObradaUmjetnik() {
        super();
    }

    @Override
    public List<Umjetnik> getPodaci() {
        return sesion.createQuery("from Umjetnik").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaIme();
        kontrolaMjesto();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        kontrolaIme();
        kontrolaMjesto();
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

    private void kontrolaMjesto() throws EdunovaException {
        if (entitet.getMjesto() == null) {
            throw new EdunovaException(" Mjeesto nije definirano! ");
        }
        if (entitet.getMjesto().isEmpty()) {
            throw new EdunovaException(" Morate unijeti mjesto! ");
        }
        if (entitet.getMjesto().length() > 50) {
            throw new EdunovaException(" Mjesto ne smije sadržavati više od 50 znakova. ");
        }
    }
}
