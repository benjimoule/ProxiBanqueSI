/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.adaming.entities.Client;
import java.io.Serializable;
import javax.ejb.Local;

/**
 *
 * @author inti0294
 */
@Local
public interface IDaoClient extends IDaoGenerique<Client, Integer>{
    
}
