/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaming.dao;

import com.adaming.entities.CarteBancaire;
import javax.ejb.Stateless;

/**
 *
 * @author inti0302
 */
@Stateless
public class DaoCarteBancaire extends DaoGenerique<CarteBancaire, Integer> implements IDaoCarteBancaire{
    
    public DaoCarteBancaire() {
       this.classe=CarteBancaire.class;
    }
}
