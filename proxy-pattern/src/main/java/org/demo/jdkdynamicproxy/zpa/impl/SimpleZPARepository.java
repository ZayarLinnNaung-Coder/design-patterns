package org.demo.jdkdynamicproxy.zpa.impl;

import org.demo.jdkdynamicproxy.zpa.repository.ZPARepository;

import java.util.List;

public class SimpleZPARepository<T, ID> implements ZPARepository<T, ID> {
    @Override
    public T save(T entity) {
        System.out.println("SAVING ...");
        return null;
    }

    @Override
    public List<T> findAll() {
        System.out.println("FINDING ALL ...");
        return null;
    }

    @Override
    public void delete(T entity) {
        System.out.println("DELETING ...");
    }
}
