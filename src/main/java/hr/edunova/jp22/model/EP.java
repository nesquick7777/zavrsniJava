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
public class EP extends Entitet {

private String ime;
private BigDecimal ocjena;
private Date datumEP;
private String zanr;
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

    public EP(String ime, BigDecimal ocjena, Date datumEP, String zanr, String podzanr, Umjetnik umjetnik, String izdavackakuca) {
        this.ime = ime;
        this.ocjena = ocjena;
        this.datumEP = datumEP;
        this.zanr = zanr;
        this.podzanr = podzanr;
        this.umjetnik = umjetnik;
        this.izdavackakuca = izdavackakuca;
    }


}