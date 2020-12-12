package com.syrisa.projectdevelop.jpaAndHibernate.restApi.Controller;

import com.syrisa.projectdevelop.jpaAndHibernate.Entities.Actor;
import com.syrisa.projectdevelop.jpaAndHibernate.Service.Abstract.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actorapi")
public class ActorController {
    private IActorService actorService;
    @Autowired
    public ActorController(IActorService actorService){
        this.actorService=actorService;
    }
    @GetMapping("/actors")
    public List<Actor> getAll(){
        return this.actorService.getAll();
    }
    @GetMapping("/actors/{id}")
    public Actor getById(@PathVariable int id){
        return (Actor) this.actorService.getById(id);
    }
    @PostMapping("/actors/add")
    public void add(@RequestBody Actor actor){
        this.actorService.add(actor);
    }
    @PostMapping("/actors/update")
    public void update(@RequestBody Actor actor){
        this.actorService.update(actor);
    }
    @PostMapping("/actors/delete")
    public void delete(@RequestBody Actor actor){
        this.actorService.delete(actor);
    }

}
