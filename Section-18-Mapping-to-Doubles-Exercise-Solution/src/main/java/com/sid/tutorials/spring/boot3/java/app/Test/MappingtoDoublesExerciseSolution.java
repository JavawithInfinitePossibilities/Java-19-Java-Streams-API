package com.sid.tutorials.spring.boot3.java.app.Test;

import com.sid.tutorials.spring.boot3.java.app.mockdata.MockDataPrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author kunmu On 15-04-2026
 */
@Component
public class MappingtoDoublesExerciseSolution {

    @Autowired
    private MockDataPrep mockDataPrep;

    public Double getAveragePriceOfCar() throws IOException {
        return mockDataPrep
                .getCars()
                .stream()
                .mapToDouble(car -> car.getPrice())
                .average()
                .orElse(0);
    }
}
