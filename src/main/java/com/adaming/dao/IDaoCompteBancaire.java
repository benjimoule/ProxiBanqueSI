/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaming.dao;

import com.adaming.entities.CompteBancaire;
import java.io.Serializable;
import javax.ejb.Local;

/**
 *
 * @author inti0294
 */
@Local
public interface IDaoCompteBancaire extends IDaoGenerique<CompteBancaire, Integer>{
    
}
