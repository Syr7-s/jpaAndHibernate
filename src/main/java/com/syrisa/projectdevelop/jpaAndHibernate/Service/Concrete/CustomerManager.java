package com.syrisa.projectdevelop.jpaAndHibernate.Service.Concrete;


import com.syrisa.projectdevelop.jpaAndHibernate.Dao.Abstract.ICustomerDao;
import com.syrisa.projectdevelop.jpaAndHibernate.Entities.Customer;
import com.syrisa.projectdevelop.jpaAndHibernate.Service.Abstract.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerManager implements ICustomerService<Customer>{
    private ICustomerDao customerDao;
    @Autowired
    public CustomerManager(ICustomerDao customerDao){
        this.customerDao=customerDao;
    }

    @Override
    @Transactional
    public List<Customer> getAll() {
        return this.customerDao.getAll();
    }

    @Override
    @Transactional
    public Customer getById(int id) {
        return (Customer) this.customerDao.getById(id);
    }

    @Override
    @Transactional
    public void add(Customer customer) {
        this.customerDao.add(customer);
    }

    @Override
    @Transactional
    public void update(Customer customer) {
        this.customerDao.update(customer);
    }

    @Override
    @Transactional
    public void delete(Customer customer) {
        this.customerDao.delete(customer);
    }
}
