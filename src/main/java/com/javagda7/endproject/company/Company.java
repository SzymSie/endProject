package com.javagda7.endproject.company;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id", nullable = false)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "domain", nullable = false)
    private String domain;

    @Column(name = "adress", nullable = false)
    private String adress;

    @Column(name = "owner", nullable = false)
    private String owner;

    @Column(name = "logo", nullable = false)
    private String logo;

    @Column(name = "departments", nullable = false)
    private String departments;

}
