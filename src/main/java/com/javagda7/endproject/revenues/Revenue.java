package com.javagda7.endproject.revenues;

import javax.persistence.Column;
import java.math.BigDecimal;

public class Revenue {


    @Column(name = "sum", nullable = false)
    private BigDecimal sum;


}
