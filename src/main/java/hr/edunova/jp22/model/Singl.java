/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Bole
 */
@Entity
public class Singl extends Entitet{
 
private String ime;
private int ocjena ;
private Date datumsingla ;
private String zanr ;
private String podzanr;
private String izdavackakuca;

@ManyToOne
private Umjetnik umjetnik;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getOcjena() {
        return ocjena;
    }

    public void setOcjena(int ocjena) {
        this.ocjena = ocjena;
    }

    public Date getDatumsingla() {
        return datumsingla;
    }

    public void setDatumsingla(Date datumsingla) {
        this.datumsingla = datumsingla;
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

    public Singl() {
    }

    public Singl(String ime, int ocjena, Date datumsingla, String zanr, String podzanr, Umjetnik umjetnik, String izdavackakuca) {
        this.ime = ime;
        this.ocjena = ocjena;
        this.datumsingla = datumsingla;
        this.zanr = zanr;
        this.podzanr = podzanr;
        this.umjetnik = umjetnik;
        this.izdavackakuca = izdavackakuca;
    }




}
