/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaming.dao;

import com.adaming.entities.Conseiller;
import com.adaming.entities.Gerant;
import java.io.Serializable;
import javax.ejb.Stateless;

/**
 *
 * @author inti0294
 */
@Stateless
public class DaoGerant extends DaoGenerique<Gerant, Integer> implements IDaoGerant{

    public DaoGerant() {
        this.classe=Gerant.class;
    }
    
}
