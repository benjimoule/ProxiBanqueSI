/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaming.business;

import com.adaming.entities.Client;
import com.adaming.dao.IDaoClient;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.PathParam;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author inti0294
 */
@Stateless
public class BusinessClient {
  
    @EJB
    private IDaoClient daoClient;
    
    
    public List<Client> obtenirClients() {
        return daoClient.getAll();
    }
    
    public Client obtenirClient(Integer id) {
        return daoClient.getById(id);
    }
    
    public void ajouterClient(Client client) {
      daoClient.add(client);
      
    }
    public void modifierClient(Client client) {
       daoClient.update(client);
         
}
 public void supprimerClient( Integer id) {
  Client client=daoClient.getById(id);
 daoClient.remove(client);
 }
}
