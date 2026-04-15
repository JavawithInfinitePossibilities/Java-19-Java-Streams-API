package com.sid.tutorials.spring.boot3.java.app.Test;

import com.sid.tutorials.spring.boot3.java.app.bean.Car;
import com.sid.tutorials.spring.boot3.java.app.mockdata.MockDataPrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kunmu On 15-04-2026
 */
@Component
public class FilteringWithStreams {

    @Autowired
    private MockDataPrep mockDataPrep;

    public List<Car> getCarDetailsByValue() throws IOException {
        List<Car> cars = mockDataPrep.getCars();
        List<Car> carCollectWithPrice = cars.stream().filter(car -> car.getPrice() < 10000)
                .collect(Collectors.toList());
        return carCollectWithPrice;
    }
}
