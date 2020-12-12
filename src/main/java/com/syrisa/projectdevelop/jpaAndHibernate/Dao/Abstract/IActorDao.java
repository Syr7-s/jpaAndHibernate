package com.syrisa.projectdevelop.jpaAndHibernate.Dao.Abstract;

import com.syrisa.projectdevelop.jpaAndHibernate.Entities.Actor;

import java.util.List;

public interface IActorDao {
    List<Actor> getAll();
    Actor getById(int id);
    void add(Actor actor);
    void update(Actor actor);
    void delete(Actor actor);
}
