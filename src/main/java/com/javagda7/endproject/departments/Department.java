package com.javagda7.endproject.departments;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id", nullable = false)
    private int id;

    @Column(name = "adress", nullable = false)
    private String adress;

    @Column(name = "workers", nullable = false)
    private String workers;

    @Column(name = "availableCars", nullable = false)
    private String availableCars;
}
