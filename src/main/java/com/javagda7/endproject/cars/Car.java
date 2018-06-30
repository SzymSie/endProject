package com.javagda7.endproject.cars;


import javax.persistence.*;

@Entity
@Table(name="tbl_car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id", nullable = false)
    private int id;

    @Column(name = "company", nullable = false)
    private String company;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "body", nullable = false)
    private String body;

    @Column(name = "year", nullable = false)
    private int year;

    @Column(name = "status", nullable = false)
    private String status;

}
