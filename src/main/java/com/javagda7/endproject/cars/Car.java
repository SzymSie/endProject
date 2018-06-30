package com.javagda7.endproject.cars;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name="cars")
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

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
