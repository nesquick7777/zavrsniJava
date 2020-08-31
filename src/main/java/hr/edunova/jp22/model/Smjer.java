/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Bole
 */
@Entity
public class Smjer extends Entitet{
    
    private String naziv;
    private String opis;
    private BigDecimal cijena;
    private Boolean verificiran;
    
    @ManyToOne
    private Smjer nadreden;

    public Smjer getNadreden() {
        return nadreden;
    }

    public void setNadreden(Smjer nadreden) {
        this.nadreden = nadreden;
    }
    
    

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public Boolean getVerificiran() {
        return verificiran;
    }

    public void setVerificiran(Boolean verificiran) {
        this.verificiran = verificiran;
    }
    
    
    
}
