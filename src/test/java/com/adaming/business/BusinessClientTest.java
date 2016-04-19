/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaming.business;

import com.adaming.entities.Client;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;

/**
 *
 * @author inti0294
 */
public class BusinessClientTest extends TestCase {
    
    public BusinessClientTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of obtenirClients method, of class BusinessClient.
     */
  
    public void testObtenirClients() {
        System.out.println("obtenirClients");
        BusinessClient instance = new BusinessClient();
        List<Client> result = instance.obtenirClients();
        assert( result!=null);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of obtenirClient method, of class BusinessClient.
     */
    public void testObtenirClient() {
        System.out.println("obtenirClient");
        Integer id = 1;
        BusinessClient instance = new BusinessClient();
        
        Client result = instance.obtenirClient(id);
       assert( result!=null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterClient method, of class BusinessClient.
     */
    public void testAjouterClient() {
        System.out.println("ajouterClient");
        Client client = null;
        BusinessClient instance = new BusinessClient();
        instance.ajouterClient(client);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modifierClient method, of class BusinessClient.
     */
    public void testModifierClient() {
        System.out.println("modifierClient");
        Client client = null;
        BusinessClient instance = new BusinessClient();
        instance.modifierClient(client);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supprimerClient method, of class BusinessClient.
     */
    public void testSupprimerClient() {
        System.out.println("supprimerClient");
        Integer id = null;
        BusinessClient instance = new BusinessClient();
        instance.supprimerClient(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
