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
public class Osoba {
    private Long id;
    
    private String ime;
    private boolean student;
    private BigDecimal skolarina;
    private Date datumRodenja;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    public BigDecimal getSkolarina() {
        return skolarina;
    }

    public void setSkolarina(BigDecimal skolarina) {
        this.skolarina = skolarina;
    }

    public Date getDatumRodenja() {
        return datumRodenja;
    }

    public void setDatumRodenja(Date datumRodenja) {
        this.datumRodenja = datumRodenja;
    }
    
    
}
