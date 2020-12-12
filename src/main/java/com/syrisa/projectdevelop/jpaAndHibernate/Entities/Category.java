package com.syrisa.projectdevelop.jpaAndHibernate.Entities;

import com.syrisa.projectdevelop.jpaAndHibernate.Entities.Abstract.IEntity;

import javax.persistence.*;

@Entity
@Table(name="category")
public class Category implements IEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int categoryId;
    @Column(name = "name")
    private String categoryName;
    public Category(){}
    public Category(int categoryId,String categoryName){
        this.categoryId=categoryId;
        this.categoryName=categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
