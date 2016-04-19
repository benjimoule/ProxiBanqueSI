///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.adaming.business;
//
//import com.adaming.entities.Client;
//import java.util.List;
//import junit.framework.Test;
//import junit.framework.TestCase;
//
///**
// *
// * @author inti0294
// */
//public class BusinessClientTest extends TestCase {
//    
//    public BusinessClientTest(String testName) {
//        super(testName);
//    }
//    
//    @Override
//    protected void setUp() throws Exception {
//        super.setUp();
//    }
//    
//    @Override
//    protected void tearDown() throws Exception {
//        super.tearDown();
//    }
//
//    /**
//     * Test of obtenirClients method, of class BusinessClient.
//     */
//  
//    public void testObtenirClients() {
//        System.out.println("obtenirClients");
//        BusinessClient instance = new BusinessClient();
//        List<Client> result = instance.obtenirClients();
//        assert( result!=null);
//        
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
//
//    /**
//     * Test of obtenirClient method, of class BusinessClient.
//     */
//    public void testObtenirClient() {
//        System.out.println("obtenirClient");
//        Integer id = 1;
//        BusinessClient instance = new BusinessClient();
//        
//        Client result = instance.obtenirClient(id);
//       assert( result!=null);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
//
//    /**
//     * Test of ajouterClient method, of class BusinessClient.
//     */
//    public void testAjouterClient() {
//        System.out.println("ajouterClient");
//        
//        Client client = new Client();
//        BusinessClient instance = new BusinessClient();
//        List<Client> avant =instance.obtenirClients();
//        Integer longeurAvant =avant.size();
//        instance.ajouterClient(client);
//        List<Client> apres =instance.obtenirClients();
//         Integer longeurApres =avant.size();
//        assert(longeurApres==longeurAvant+1);
//    }
//
//    /**
//     * Test of modifierClient method, of class BusinessClient.
//     */
//    public void testModifierClient() {
//        System.out.println("modifierClient");
//        BusinessClient instance = new BusinessClient();
//        
//        Client clientTemoin = instance.obtenirClient(1);
//        Client client=new Client();
//        instance.modifierClient(client);
//     assert(client!=clientTemoin);
//    }
//
//    /**
//     * Test of supprimerClient method, of class BusinessClient.
//     */
//    public void testSupprimerClient() {
//        System.out.println("supprimerClient");
//        BusinessClient instance = new BusinessClient();
//        List<Client> avant =instance.obtenirClients();
//        Integer longeurAvant =avant.size();
//        instance.supprimerClient(1);
//        List<Client> apres =instance.obtenirClients();
//         Integer longeurApres =avant.size();
//        assert(longeurApres==longeurAvant-1);
//    }
//    
//}
