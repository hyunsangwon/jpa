package com.dw.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="salary")
    private Integer salary;
    @Column(name="age")
    private Integer age;
}
