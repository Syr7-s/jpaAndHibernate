package com.syrisa.projectdevelop.jpaAndHibernate.restApi.Controller;

import com.syrisa.projectdevelop.jpaAndHibernate.Entities.Category;
import com.syrisa.projectdevelop.jpaAndHibernate.Service.Abstract.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private ICategoryService categoryService;
    @Autowired
    public CategoryController(ICategoryService categoryService){
        this.categoryService=categoryService;
    }
    @GetMapping("/categoryAll")
    public List<Category> getAll(){
        return this.categoryService.getAll();
    }
    @GetMapping("/categoryAll/{id}")
    public Category getById(@PathVariable int id){
        return (Category) this.categoryService.getById(id);
    }
    @PostMapping("/category/add")
    public void add(@RequestBody Category category){
        this.categoryService.add(category);
    }
    @PostMapping("/category/update")
    public void update(@RequestBody Category category){
        this.categoryService.update(category);
    }
    @PostMapping("/category/delete")
    public void delete(@RequestBody Category category){
        this.categoryService.delete(category);
    }
}
