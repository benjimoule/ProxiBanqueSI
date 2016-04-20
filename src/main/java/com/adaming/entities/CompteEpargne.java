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
@Table(name = "compte_epargne")
public class CompteEpargne extends CompteBancaire{
    
    @OneToOne(fetch = FetchType.LAZY)
    private Client client;
    
    @Column(name = "taux")
    private float taux;

    public CompteEpargne() {
    }

    public CompteEpargne(Client client, float taux, Date dateOuverture, float solde) {
        super(dateOuverture, solde);
        this.client = client;
        this.taux = taux;
    }

    public CompteEpargne(int id, Client client, float taux, Date dateOuverture, float solde) {
        super(id, dateOuverture, solde);
        this.client = client;
        this.taux = taux;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }
    
    
}
