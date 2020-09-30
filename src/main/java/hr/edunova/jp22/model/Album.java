/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author Bole
 */
@Entity
public class Album extends Entitet {

    private String ime;
    private int ocjena;
    private Date datumalbuma;
    private String zanr;
    private String podzanr;
    private String izdavackakuca;
    private String vrsta;
    private String trajanje;

    public String getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(String trajanje) {
        this.trajanje = trajanje;
    }

    @ManyToMany
    private List<Pjesma> pjesme = new ArrayList<>();

    public Album() {
    }

    public Album(String ime, int ocjena, Date datumalbuma, String zanr, String podzanr, String izdavackakuca, String vrsta) {
        this.ime = ime;
        this.ocjena = ocjena;
        this.datumalbuma = datumalbuma;
        this.zanr = zanr;
        this.podzanr = podzanr;
        this.izdavackakuca = izdavackakuca;
        this.vrsta = vrsta;
    }

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

    public Date getDatumalbuma() {
        return datumalbuma;
    }

    public void setDatumalbuma(Date datumalbuma) {
        this.datumalbuma = datumalbuma;
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

    public String getIzdavackakuca() {
        return izdavackakuca;
    }

    public void setIzdavackakuca(String izdavackakuca) {
        this.izdavackakuca = izdavackakuca;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public List<Pjesma> getPjesme() {
        return pjesme;
    }

    public void setPjesme(List<Pjesma> pjesme) {
        this.pjesme = pjesme;
    }

}
