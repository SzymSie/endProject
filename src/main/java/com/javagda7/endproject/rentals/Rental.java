package com.javagda7.endproject.rentals;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id", nullable = false)
    private int id;

    @Column(name = "worker", nullable = false)
    private String worker;

    @Column(name = "rentDate", nullable = false)
    private LocalDateTime rentDate;

    @Column(name = "reservation", nullable = false)
    private int reservation;

    @Column(name = "comments", nullable = false)
    private String comments;
}


