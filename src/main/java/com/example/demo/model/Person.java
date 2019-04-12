package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Date dob;
    private String address;
    private int height;
    private int weight;
    private Integer age;

    protected Person() {}

    public Person(String name, Date dob, String address, int height, int weight, Integer age) {
        super();
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }
}