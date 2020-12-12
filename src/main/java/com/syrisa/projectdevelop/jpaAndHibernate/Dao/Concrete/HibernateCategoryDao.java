package com.syrisa.projectdevelop.jpaAndHibernate.Dao.Concrete;

import com.syrisa.projectdevelop.jpaAndHibernate.Dao.Abstract.ICategoryDao;
import com.syrisa.projectdevelop.jpaAndHibernate.Entities.Category;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class HibernateCategoryDao implements ICategoryDao<Category> {
    private EntityManager entityManager;
    @Autowired
    public HibernateCategoryDao(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    @Override
    @Transactional
    public List<Category> getAll() {
        Session session=entityManager.unwrap(Session.class);
        List<Category> categories=session.createQuery("from Category",Category.class).getResultList();
        return categories;
    }

    @Override
    public Category getById(int id) {
        Session session=entityManager.unwrap(Session.class);
        Category category=session.get(Category.class,id);
        return category;
    }

    @Override
    public void add(Category category) {
        Session session=entityManager.unwrap(Session.class);
        session.saveOrUpdate(category);
    }

    @Override
    public void update(Category category) {
        Session session=entityManager.unwrap(Session.class);
        session.saveOrUpdate(category);
    }

    @Override
    public void delete(Category category) {
        Session session=entityManager.unwrap(Session.class);
        Category categoryToDelete=session.get(Category.class,category.getCategoryId());
        session.delete(categoryToDelete);
    }
}
