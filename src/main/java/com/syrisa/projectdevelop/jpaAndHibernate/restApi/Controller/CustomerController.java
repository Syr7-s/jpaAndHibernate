package com.syrisa.projectdevelop.jpaAndHibernate.restApi.Controller;

import com.syrisa.projectdevelop.jpaAndHibernate.Entities.Customer;
import com.syrisa.projectdevelop.jpaAndHibernate.Service.Abstract.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private ICustomerService customerService;
    @Autowired
    public CustomerController(ICustomerService customerService){
        this.customerService=customerService;
    }
    @GetMapping("/customers")
    public List<Customer> getAll(){
        return this.customerService.getAll();
    }
    @GetMapping("/customers/{id}")
    public Customer getById(@PathVariable int id){
        return (Customer) this.customerService.getById(id);
    }
    @PostMapping("/customer/add")
    public void add(@RequestBody Customer customer){
        //If  you  add new customer, you can see 500 Internal Server Error.
        //Because stode_id does not map.
        this.customerService.add(customer);
    }
    @PostMapping("/customer/update")
    public void update(@RequestBody Customer customer){
        this.customerService.update(customer);
    }
    @PostMapping("/customer/delete")
    public void delete(@RequestBody Customer customer){
        this.customerService.delete(customer);
    }
    
}
