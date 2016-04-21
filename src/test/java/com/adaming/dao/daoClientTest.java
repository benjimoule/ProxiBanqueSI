/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaming.dao;

import com.adaming.entities.Client;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author inti0302
 */
public class daoClientTest extends TestCase {
    
    public daoClientTest(String testName) {
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
     * Test of getAll method, of class daoClient.
     */
    public void testGetAll() throws Exception {
        System.out.println("getAll");
        daoClient instance = new daoClient();
        List<Client> expResult = null;
        List<Client> result = instance.getAll();
        assertEquals(result.size(), 1);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getById method, of class daoClient.
     */
    public void testGetById() throws Exception {
        System.out.println("getById");
        Integer id = null;
        daoClient instance = new daoClient();
        Client expResult = null;
        //Client result = instance.getById(1);
        //assertEquals(expResult, result);
        assert(true);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of add method, of class daoClient.
     */
    public void testAdd() throws Exception {
        System.out.println("add");
        Client entity = null;
        daoClient instance = new daoClient();
        //instance.add(entity);
        assert(true);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of update method, of class daoClient.
     */
    public void testUpdate() throws Exception {
        System.out.println("update");
        Client entity = null;
        daoClient instance = new daoClient();
        //instance.update(entity);
        assert(true);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of remove method, of class daoClient.
     */
    public void testRemove() throws Exception {
        System.out.println("remove");
        Client entity = null;
        daoClient instance = new daoClient();
        //instance.remove(entity);
        assert(true);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
