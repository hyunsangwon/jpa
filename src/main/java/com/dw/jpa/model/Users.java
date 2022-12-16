package com.dw.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "dw_user")
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="name",length = 30, nullable = false)
    private String name;
    @Column(name="salary")
    private Integer salary;
    @Column(name="age")
    private Integer age;
    @Column(name="user_id" ,length = 30)
    private String userId;
    @Column(name="user_pw")
    private String userPassword;
    
	@ManyToOne
	@JoinColumn(name = "dept_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Dept dept;

}
