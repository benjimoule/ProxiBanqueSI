/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaming.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author inti0302
 */
public class CarteBancaire{
    
    
    
    @Column(name = "numero")
    private int numero;
    
    @Column(name = "date_validite")
    private String dateValidite;
    
    @Column(name = "pictogramme")
    private int pictogramme;
    
    @Column(name = "active")
    private boolean active;

    public CarteBancaire() {
    }

    public CarteBancaire(int numero, String dateValidite, int pictogramme, boolean active) {
        this.numero = numero;
        this.dateValidite = dateValidite;
        this.pictogramme = pictogramme;
        this.active = active;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDateValidite() {
        return dateValidite;
    }

    public void setDateValidite(String dateValidite) {
        this.dateValidite = dateValidite;
    }

    public int getPictogramme() {
        return pictogramme;
    }

    public void setPictogramme(int pictogramme) {
        this.pictogramme = pictogramme;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
}
