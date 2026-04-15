package com.sid.tutorials.spring.boot3.java.app.Test;

import com.sid.tutorials.spring.boot3.java.app.bean.Car;
import com.sid.tutorials.spring.boot3.java.app.mockdata.MockDataPrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author kunmu On 15-04-2026
 */
@Component
public class StreamGroupingby {

    @Autowired
    public MockDataPrep mockDataPrep;

    public Map<String, List<Car>> streamGroupingbyCar() throws IOException {
        Map<String, List<Car>> groupByMakers = mockDataPrep
                .getCars()
                .stream()
                .collect(Collectors.groupingBy(car -> car.getMake()));
        return groupByMakers;
    }
}
