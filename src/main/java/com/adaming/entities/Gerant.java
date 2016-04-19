/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaming.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author inti0302
 */
@Entity
@Table(name = "gerant")
public class Gerant implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_gerant")
    private int id;
    
    @Column(name = "nom")
    private String nom;
    
    @Column(name = "prenom")
    private String prenom;
    
    @OneToMany(mappedBy = "gerant")
    private List<Conseiller> conseillers;
    
    @Column(name = "civilite")
    private String civilite;

    public Gerant() {
    }

    public Gerant(String nom, String prenom, List<Conseiller> conseillers, String civilite) {
        this.nom = nom;
        this.prenom = prenom;
        this.conseillers = conseillers;
        this.civilite = civilite;
    }

    public Gerant(int id, String nom, String prenom, List<Conseiller> conseillers, String civilite) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.conseillers = conseillers;
        this.civilite = civilite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Conseiller> getConseillers() {
        return conseillers;
    }

    public void setConseillers(List<Conseiller> conseillers) {
        this.conseillers = conseillers;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }
    
    
}
