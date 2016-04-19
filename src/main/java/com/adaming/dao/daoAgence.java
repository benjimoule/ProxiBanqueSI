/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaming.dao;

import com.adaming.entities.Agence;
import com.adaming.entities.VisaElectron;
import java.io.Serializable;
import javax.ejb.Stateless;

/**
 *
 * @author inti0294
 */
@Stateless
public class daoAgence extends DaoGenerique<Agence, Integer> implements IDaoAgence{

    public daoAgence() {
        this.classe=Agence.class;}
    
}
