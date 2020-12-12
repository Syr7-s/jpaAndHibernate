package com.syrisa.projectdevelop.jpaAndHibernate.Dao.Concrete;

import com.syrisa.projectdevelop.jpaAndHibernate.Dao.Abstract.IActorDao;
import com.syrisa.projectdevelop.jpaAndHibernate.Entities.Actor;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class HibernateActorDao implements IActorDao {
    private EntityManager entityManager;
    @Autowired
    public HibernateActorDao(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    @Override
    @Transactional
    public List<Actor> getAll() {
        Session session=entityManager.unwrap(Session.class);
        List<Actor> actors=session.createQuery("from Actor",Actor.class).getResultList();
        return actors;

    }

    @Override
    public Actor getById(int id) {
        return null;
    }

    @Override
    public void add(Actor actor) {

    }

    @Override
    public void update(Actor actor) {

    }

    @Override
    public void delete(Actor actor) {

    }
}
