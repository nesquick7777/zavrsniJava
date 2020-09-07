/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Bole
 */
public class EP extends Umjetnik {

private int sifra;
private String ime;
private BigDecimal ocjena;
private Date datumEP;
private String zanr;
private String podzanr;
private Umjetnik umjetnik;
private String izdavackakuca;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public BigDecimal getOcjena() {
        return ocjena;
    }

    public void setOcjena(BigDecimal ocjena) {
        this.ocjena = ocjena;
    }

    public Date getDatumEP() {
        return datumEP;
    }

    public void setDatumEP(Date datumEP) {
        this.datumEP = datumEP;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public String getPodzanr() {
        return podzanr;
    }

    public void setPodzanr(String podzanr) {
        this.podzanr = podzanr;
    }

    public Umjetnik getUmjetnik() {
        return umjetnik;
    }

    public void setUmjetnik(Umjetnik umjetnik) {
        this.umjetnik = umjetnik;
    }

    public String getIzdavackakuca() {
        return izdavackakuca;
    }

    public void setIzdavackakuca(String izdavackakuca) {
        this.izdavackakuca = izdavackakuca;
    }

    public EP() {
    }

    public EP(int sifra, String ime, BigDecimal ocjena, Date datumEP, String zanr, String podzanr, Umjetnik umjetnik, String izdavackakuca) {
        this.sifra = sifra;
        this.ime = ime;
        this.ocjena = ocjena;
        this.datumEP = datumEP;
        this.zanr = zanr;
        this.podzanr = podzanr;
        this.umjetnik = umjetnik;
        this.izdavackakuca = izdavackakuca;
    }


}
