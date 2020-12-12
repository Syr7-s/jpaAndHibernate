package com.syrisa.projectdevelop.jpaAndHibernate.Service.Concrete;

import com.syrisa.projectdevelop.jpaAndHibernate.Dao.Abstract.IActorDao;
import com.syrisa.projectdevelop.jpaAndHibernate.Entities.Actor;
import com.syrisa.projectdevelop.jpaAndHibernate.Service.Abstract.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ActorManager implements IActorService<Actor> {
    private IActorDao actorDao;
    //Constructor injection
    @Autowired
    public ActorManager(IActorDao actorDao){
        this.actorDao=actorDao;
    }
    @Override
    @Transactional
    public List<Actor> getAll() {
        return this.actorDao.getAll();
    }

    @Override
    @Transactional
    public Actor getById(int id) {
        return (Actor) this.actorDao.getById(id);
    }

    @Override
    @Transactional
    public void add(Actor actor) {
        this.actorDao.add(actor);
    }

    @Override
    @Transactional
    public void update(Actor actor) {
        this.actorDao.update(actor);
    }

    @Override
    @Transactional
    public void delete(Actor actor) {
        this.actorDao.delete(actor);
    }
}
