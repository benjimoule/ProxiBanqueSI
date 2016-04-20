/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaming.dao;

import com.adaming.entities.CompteEpargne;
import com.adaming.entities.Conseiller;
import java.io.Serializable;
import javax.ejb.Stateless;

/**
 *
 * @author inti0294
 */
@Stateless
public class daoCompteEpargne extends DaoGenerique<CompteEpargne, Integer> implements IDaoCompteEpargne{

    public daoCompteEpargne() {
        this.classe=CompteEpargne.class;
    }
    
}
