/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaming.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author inti0302
 */
@Entity
public class CompteBancaire implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compte")
    private int id;
    
    @Column(name = "date_ouverture")
    @Temporal(TemporalType.DATE)
    private Date dateOuverture;
    
    @Column(name = "solde")
    private float solde;

    public CompteBancaire() {
    }

    public CompteBancaire(int id, Date dateOuverture, float solde) {
        this.id = id;
        this.dateOuverture = dateOuverture;
        this.solde = solde;
    }

    public CompteBancaire(Date dateOuverture, float solde) {
        this.dateOuverture = dateOuverture;
        this.solde = solde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CompteBancaire other = (CompteBancaire) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
