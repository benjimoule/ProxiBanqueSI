/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaming.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author inti0302
 */
public abstract class DaoGenerique<T, PK extends Serializable> implements IDaoGenerique<T, PK>{
    
    @PersistenceContext(unitName = "ProxiBanqueSIPU")
    protected EntityManager em;
    
    protected Class classe; 
    
    @Override
    public List<T> getAll(){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> criteria = cb.createQuery(classe);
        return em.createQuery(criteria.select(criteria.from(classe))).getResultList();
    }
    
    @Override
    public T getById(PK id){
        return (T) em.find(classe, id);
    }
    
    @Override
    public void add(T entity){
        em.persist(entity);
        em.flush();
    }
    
    @Override
    public void update(T entity){
        em.merge(entity);
    }
    
    @Override
    public void remove(T entity){
        T toRemove = em.merge(entity);
        em.remove(toRemove);
    }
}
