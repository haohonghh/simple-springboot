package com.boot.srimplespringboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;


@Entity(name="Student")
@Data
@Table(name="t_stuednt")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name="user_name",length=20)
    private String userName;
    @Column(name="password",length=20)
    private  String password;
    @Column(name="age",length=20)
    private Integer age;
}
