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
public class Operater extends Entitet {
    
    private String ime;
    private String prezime;
    private String uloga;
    private String email;
    private String lozinka;

    public Operater(String ime, String prezime, String uloga, String email, String lozinka) {
        this.ime = ime;
        this.prezime = prezime;
        this.uloga = uloga;
        this.email = email;
        this.lozinka = lozinka;
    }

    public Operater() {
    }

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

    public String getUloga() {
        return uloga;
    }

    public void setUloga(String uloga) {
        this.uloga = uloga;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }
    
    
}
