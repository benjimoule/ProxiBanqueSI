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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author inti0302
 */
@Entity
@Table(name = "compte_courant")
public class CompteCourant extends CompteBancaire{
    
    
    @OneToOne(fetch = FetchType.LAZY)
    private Client client;
    
    @Column(name = "decouvert")
    private float decouvert;
    
    @OneToOne(fetch = FetchType.EAGER)
    private CarteBancaire carte;

    public CompteCourant() {
    }

    public CompteCourant(Client client, float decouvert, CarteBancaire carte, Date dateOuverture, float solde) {
        super(dateOuverture, solde);
        this.client = client;
        this.decouvert = decouvert;
        this.carte = carte;
    }

    public CompteCourant(int id, Client client, float decouvert, CarteBancaire carte, Date dateOuverture, float solde) {
        super(id, dateOuverture, solde);
        this.client = client;
        this.decouvert = decouvert;
        this.carte = carte;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public float getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(float decouvert) {
        this.decouvert = decouvert;
    }

    public CarteBancaire getCarte() {
        return carte;
    }

    public void setCarte(CarteBancaire carte) {
        this.carte = carte;
    }

    
    
    
}
