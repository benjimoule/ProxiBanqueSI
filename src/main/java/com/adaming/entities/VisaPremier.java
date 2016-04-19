/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaming.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author inti0302
 */
@Entity
@Table(name = "visa_premier")
public class VisaPremier extends CarteBancaire implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carte")
    private int id;

    public VisaPremier() {
    }

    public VisaPremier(int numero, String dateValidite, int pictogramme, boolean active) {
        super(numero, dateValidite, pictogramme, active);
    }

    public VisaPremier(int id, int numero, String dateValidite, int pictogramme, boolean active) {
        super(numero, dateValidite, pictogramme, active);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
