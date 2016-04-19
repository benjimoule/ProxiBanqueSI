/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaming.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author inti0302
 */
public class CompteBancaire {
    @Column(name = "date_ouverture")
    private Date dateOuverture;
    
    @Column(name = "solde")
    private float solde;

    public CompteBancaire() {
    }

    public CompteBancaire(Date dateOuverture, float solde) {
        this.dateOuverture = dateOuverture;
        this.solde = solde;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }
    
    
}
