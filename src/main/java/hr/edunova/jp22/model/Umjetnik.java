/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.model;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author Bole
 */
@Entity
public class Umjetnik extends Entitet {

	private String ime;
	private String zanr;
	private String podzanr;
	private String mjesto;
	private Date datumpocetka;
	private Date datumkraja;


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
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

    public String getMjesto() {
        return mjesto;
    }

    public void setMjesto(String mjesto) {
        this.mjesto = mjesto;
    }

    public Date getDatumpocetka() {
        return datumpocetka;
    }

    public void setDatumpocetka(Date datumpocetka) {
        this.datumpocetka = datumpocetka;
    }

    public Date getDatumkraja() {
        return datumkraja;
    }

    public void setDatumkraja(Date datumkraja) {
        this.datumkraja = datumkraja;
    }

    public Umjetnik() {
    }

    public Umjetnik(String ime, String zanr, String podzanr, String mjesto, Date datumpocetka, Date datumkraja) {
        this.ime = ime;
        this.zanr = zanr;
        this.podzanr = podzanr;
        this.mjesto = mjesto;
        this.datumpocetka = datumpocetka;
        this.datumkraja = datumkraja;
    }
        
        
}
