package com.syrisa.projectdevelop.jpaAndHibernate.Dao.Abstract;

import com.syrisa.projectdevelop.jpaAndHibernate.Entities.Actor;

import java.util.List;

public interface IActorDao<T> {
    List<T> getAll();
    T getById(int id);
    void add(T t);
    void update(T t);
    void delete(T t);
}
