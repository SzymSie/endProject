package com.javagda7.endproject.company;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
