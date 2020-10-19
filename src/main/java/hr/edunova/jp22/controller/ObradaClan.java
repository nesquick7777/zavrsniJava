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
public class ObradaClan extends Obrada<Clan> {

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

    public List<Clan> getPodaci(String uvjet) {
        return sesion.createQuery("from Clan c "
                + " where concat(c.ime, ' ', c.prezime, ' ') "
                + " like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaMjesto();
        kontrolaBiljeske();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaMjesto();
        kontrolaBiljeske();
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        if (entitet.getUmjetnici().size() > 0) {
            throw new EdunovaException("Clan se ne može obrisat, nalazi se u umjetnicima.");
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

    private void kontrolaPrezime() throws EdunovaException {
        if (entitet.getPrezime() == null) {
            throw new EdunovaException(" Prezime nije definirano! ");
        }
        if (entitet.getPrezime().isEmpty()) {
            throw new EdunovaException(" Morate unijeti prezime! ");
        }
        if (entitet.getPrezime().length() > 50) {
            throw new EdunovaException(" Prezime ne smije sadržavati više od 50 znakova. ");
        }
    }

    private void kontrolaMjesto() throws EdunovaException {
        if (entitet.getMjestor() == null || entitet.getMjestop() == null) {
            throw new EdunovaException(
                    entitet.getMjestor() == null ? " Mjesto rođenja nije definirano. "
                    : " Mjesto preminuća nije definirano.  ");
        }
        if (entitet.getMjestor().isEmpty() || entitet.getMjestop().isEmpty()) {
            throw new EdunovaException(
                    entitet.getMjestor().isEmpty() ? " Mjesto rođenja ne smije biti prazno. "
                    : " Mjesto preminuća ne smije biti prazno. ");
        }
        if (entitet.getMjestor().length() > 50 || entitet.getMjestop().length() > 50) {
            throw new EdunovaException(
                    entitet.getMjestor().length() > 50 ? " Mjesto rođenja ne smije sadržavati više od 50 znakova. "
                    : " Mjesto preminuća ne smije sadržavati više od 50 znakova. ");
        }
    }

    private void kontrolaBiljeske() throws EdunovaException {
        if (entitet.getBiljeske() == null) {
            throw new EdunovaException(" Biljeske nisu definirane! ");
        }
        if (entitet.getBiljeske().length() > 255) {
            throw new EdunovaException(" Biljeske ne smiju sadržavati više od 255 znakova. ");
        }
    }
}
