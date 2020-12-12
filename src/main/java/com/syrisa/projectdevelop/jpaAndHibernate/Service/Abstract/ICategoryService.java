package com.syrisa.projectdevelop.jpaAndHibernate.Service.Abstract;

import java.util.List;

public interface ICategoryService<T> {
    List<T> getAll();
    T getById(int id);
    void add(T t);
    void update(T t);
    void delete(T t);
}
