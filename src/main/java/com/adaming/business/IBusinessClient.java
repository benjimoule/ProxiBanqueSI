/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaming.business;

import com.adaming.entities.Client;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author inti0302
 */
@Local
public interface IBusinessClient {

    public List<Client> obtenirClients();

    public Client obtenirClient(Integer id);

    public void ajouterClient(Client client);

    public void modifierClient(Client client);

    public void supprimerClient(Integer id);
}
