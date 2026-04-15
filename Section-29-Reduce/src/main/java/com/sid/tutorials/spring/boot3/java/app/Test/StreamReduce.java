package com.sid.tutorials.spring.boot3.java.app.Test;

import com.sid.tutorials.spring.boot3.java.app.mockdata.MockDataPrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * @author kunmu On 15-04-2026
 */
@Component
public class StreamReduce {

    @Autowired
    private MockDataPrep mockDataPrep;

    public BigDecimal StreamReduce() throws IOException {
        return BigDecimal.valueOf(mockDataPrep
                .getCars()
                .stream()
                .mapToDouble(car-> car.getPrice())
                .reduce(0,(a,b)->a+b));
    }
}
