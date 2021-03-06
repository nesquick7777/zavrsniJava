/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author Bole
 */
@Entity
public class Pjesma extends Entitet {

    

    private String ime;
    private String trajanje;
    private String putDoPjesme;

    @ManyToMany(mappedBy = "pjesme")
    private List<Album> albumi = new ArrayList<>();

    public List<Album> getAlbumi() {
        return albumi;
    }

    public void setAlbumi(List<Album> albumi) {
        this.albumi = albumi;
    }

    public Pjesma() {
    }

    public Pjesma(String ime, String trajanje, String putDoPjesme) {
        this.ime = ime;
        this.trajanje = trajanje;
        this.putDoPjesme = putDoPjesme;
    }
    
    public String getPutDoPjesme() {
        return putDoPjesme;
    }

    public void setPutDoPjesme(String putDoPjesme) {
        this.putDoPjesme = putDoPjesme;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(String trajanje) {
        this.trajanje = trajanje;
    }

}
