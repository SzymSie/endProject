package com.javagda7.endproject.returns;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Return {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id", nullable = false)
    private int id;

    @Column(name = "worker", nullable = false)
    private String worker;

    @Column(name = "returnDate", nullable = false)
    private LocalDateTime returnDate;

    @Column(name = "reservation", nullable = false)
    private int reservation;

    @Column(name = "surcharge", nullable = false)
    private BigDecimal surcharge;

    @Column(name = "comments", nullable = false)
    private String comments;
}
