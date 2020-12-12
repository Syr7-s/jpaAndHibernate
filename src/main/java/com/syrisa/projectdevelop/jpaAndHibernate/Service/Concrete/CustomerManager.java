package com.syrisa.projectdevelop.jpaAndHibernate.Service.Concrete;


import com.syrisa.projectdevelop.jpaAndHibernate.Entities.Customer;
import com.syrisa.projectdevelop.jpaAndHibernate.Service.Abstract.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerManager implements ICustomerService<Customer>{
    private ICustomerService customerService;
    @Autowired
    public CustomerManager(ICustomerService customerService){
        this.customerService=customerService;
    }

    @Override
    @Transactional
    public List<Customer> getAll() {
        return null;
    }

    @Override
    @Transactional
    public Customer getById(int id) {
        return null;
    }

    @Override
    @Transactional
    public void add(Customer customer) {

    }

    @Override
    @Transactional
    public void update(Customer customer) {

    }

    @Override
    @Transactional
    public void delete(Customer customer) {

    }
}
