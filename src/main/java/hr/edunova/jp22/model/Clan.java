/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Bole
 */
@Entity
public class Clan extends Entitet {
private String ime;
private String prezime;
private Date datumr;
private String mjestor;
private Date datump;
private String mjestop;
private String biljeske;

@ManyToOne
    private Umjetnik umjetnik;


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Date getDatumr() {
        return datumr;
    }

    public void setDatumr(Date datumr) {
        this.datumr = datumr;
    }

    public String getMjestor() {
        return mjestor;
    }

    public void setMjestor(String mjestor) {
        this.mjestor = mjestor;
    }

    public Date getDatump() {
        return datump;
    }

    public void setDatump(Date datump) {
        this.datump = datump;
    }

    public String getMjestop() {
        return mjestop;
    }

    public void setMjestop(String mjestop) {
        this.mjestop = mjestop;
    }

    public Umjetnik getUmjetnik() {
        return umjetnik;
    }

    public void setUmjetnik(Umjetnik umjetnik) {
        this.umjetnik = umjetnik;
    }

    public String getBiljeske() {
        return biljeske;
    }

    public void setBiljeske(String biljeske) {
        this.biljeske = biljeske;
    }

    public Clan() {
    }

    public Clan(String ime, String prezime, Date datumr, String mjestor, Date datump, String mjestop, Umjetnik umjetnik, String biljeske) {
        this.ime = ime;
        this.prezime = prezime;
        this.datumr = datumr;
        this.mjestor = mjestor;
        this.datump = datump;
        this.mjestop = mjestop;
        this.umjetnik = umjetnik;
        this.biljeske = biljeske;
    }


}
