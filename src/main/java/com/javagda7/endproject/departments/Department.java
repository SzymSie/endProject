package com.javagda7.endproject.departments;

import com.javagda7.endproject.cars.Car;
import com.javagda7.endproject.workers.Worker;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id", nullable = false)
    private int id;

    @Column(name = "address", nullable = false)
    private String address;

    @ManyToOne
    private Worker worker;

    @ManyToOne
    private Car car;
}
