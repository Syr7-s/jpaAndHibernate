package com.syrisa.projectdevelop.jpaAndHibernate.Entities;

import com.syrisa.projectdevelop.jpaAndHibernate.Entities.Abstract.IEntity;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer implements IEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customerId;
    @Column(name="first_name")
    private String firstName;
    @Column(name ="last_name")
    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name = "active")
    private short active;

    public Customer(){}

    public Customer(int customerId, String firstName, String lastName, String email, short active) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.active = active;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public short getActive() {
        return active;
    }

    public void setActive(short active) {
        this.active = active;
    }
}
