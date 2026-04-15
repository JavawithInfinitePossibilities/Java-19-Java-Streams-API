package com.sid.tutorials.spring.boot3.java.app.Test;

import com.sid.tutorials.spring.boot3.java.app.bean.Car;
import com.sid.tutorials.spring.boot3.java.app.mockdata.MockDataPrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author kunmu On 15-04-2026
 */
@Component
public class StreamCounting {

    @Autowired
    private MockDataPrep mockDataPrep;

    public Map<String,Long> getCountingByName() throws IOException {
        Map<String, Long> groupByMakers = mockDataPrep
                .getCars()
                .stream()
                .collect(Collectors.groupingBy(Car::getMake,Collectors.counting()));
        return groupByMakers;
    }
}
