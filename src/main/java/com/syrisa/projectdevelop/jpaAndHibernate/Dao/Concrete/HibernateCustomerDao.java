package com.syrisa.projectdevelop.jpaAndHibernate.Dao.Concrete;

import com.syrisa.projectdevelop.jpaAndHibernate.Dao.Abstract.ICustomerDao;
import com.syrisa.projectdevelop.jpaAndHibernate.Entities.Customer;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateCustomerDao implements ICustomerDao<Customer> {
    private EntityManager entityManager;

    @Autowired
    public HibernateCustomerDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Customer> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Customer> customers = session.createQuery("from Customer ", Customer.class).getResultList();
        return customers;
    }

    @Override
    public Customer getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Customer customer = session.get(Customer.class, id);
        return customer;
    }

    @Override
    public void add(Customer customer) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(customer);
    }

    @Override
    public void update(Customer customer) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(customer);
    }

    @Override
    public void delete(Customer customer) {
        Session session = entityManager.unwrap(Session.class);
        Customer customerToDelete = session.get(Customer.class, customer.getCustomerId());
        session.delete(customerToDelete);
    }
}
