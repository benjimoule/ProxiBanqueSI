/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaming.dao;

import java.io.Serializable;
import java.util.List;


/**
 *
 * @author inti0302
 */
public interface IDaoGenerique<T, PK extends Serializable> {
    List<T> getAll();
    T getById(PK id);
    void add(T entity);
    void update(T entity);
    void remove(T entity);
}
