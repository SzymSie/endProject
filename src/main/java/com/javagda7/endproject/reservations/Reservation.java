package com.javagda7.endproject.reservations;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id", nullable = false)
    private int id;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    @Column(name = "client", nullable = false)
    private String client;

    @Column(name = "car", nullable = false)
    private String car;

    @Column(name = "rentDate", nullable = false)
    private LocalDateTime rentDate;

    @Column(name = "returnDate", nullable = false)
    private LocalDateTime returnDate;

    @Column(name = "rentDepartment", nullable = false)
    private String rentDepartment;

    @Column(name = "returnDepartment", nullable = false)
    private String returnDepartment;


    @Column(name = "amount", nullable = false)
    private BigDecimal amount;
}
