package com.sid.tutorials.spring.boot3.java.app.Test;

import com.sid.tutorials.spring.boot3.java.app.bean.Car;
import com.sid.tutorials.spring.boot3.java.app.mockdata.MockDataPrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author kunmu On 15-04-2026
 */
@Component
public class MinMaxwithoutComparators {

    @Autowired
    private MockDataPrep mockDataPrep;

    public Double getMinCar() throws IOException {
        return mockDataPrep
                .getCars()
                .stream()
                .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(car -> car.getPrice())
                .min()
                .getAsDouble();
    }

    public Double getMaxCar() throws IOException {
        return mockDataPrep
                .getCars()
                .stream()
                .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(car -> car.getPrice())
                .max()
                .getAsDouble();
    }
}
