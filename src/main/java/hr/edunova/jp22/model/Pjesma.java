/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.model;

import javax.persistence.Entity;

/**
 *
 * @author Bole
 */
@Entity
public class Pjesma extends Entitet{
 
private String ime;
private String trajanje;

    public Pjesma() {
    }

    public Pjesma(String ime, String trajanje) {
        this.ime = ime;
        this.trajanje = trajanje;
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
