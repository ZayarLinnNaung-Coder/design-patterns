package org.demo.jdkdynamicproxy.zpa.repository;

import java.util.List;

public interface ZPARepository<T, ID> {
    T save(T entity);
    List<T> findAll();
    void delete(T entity);
}
