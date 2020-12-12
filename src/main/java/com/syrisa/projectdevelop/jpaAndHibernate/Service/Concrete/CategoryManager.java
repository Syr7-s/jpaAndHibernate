package com.syrisa.projectdevelop.jpaAndHibernate.Service.Concrete;

import com.syrisa.projectdevelop.jpaAndHibernate.Dao.Abstract.ICategoryDao;
import com.syrisa.projectdevelop.jpaAndHibernate.Entities.Category;
import com.syrisa.projectdevelop.jpaAndHibernate.Service.Abstract.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CategoryManager implements ICategoryService<Category> {
    private ICategoryDao categoryDao;
    @Autowired
    public CategoryManager(ICategoryDao categoryDao){
        this.categoryDao=categoryDao;
    }
    @Override
    @Transactional
    public List<Category> getAll() {
        return this.categoryDao.getAll();
    }

    @Override
    @Transactional
    public Category getById(int id) {
        return (Category) this.categoryDao.getById(id);
    }

    @Override
    @Transactional
    public void add(Category category) {
        this.categoryDao.add(category);
    }

    @Override
    @Transactional
    public void update(Category category) {
        this.categoryDao.update(category);
    }

    @Override
    @Transactional
    public void delete(Category category) {
        this.categoryDao.delete(category);
    }
}
