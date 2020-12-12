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
    @PostMapping("/customer/update")
    public void update(@RequestBody Customer customer){
        this.customerService.update(customer);
    }
}
