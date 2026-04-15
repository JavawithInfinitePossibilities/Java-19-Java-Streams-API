package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.Test.StreamGroupingby;
import com.sid.tutorials.spring.boot3.java.app.bean.Car;
import com.sid.tutorials.spring.boot3.java.app.bean.Person;
import com.sid.tutorials.spring.boot3.java.app.mockdata.MockDataPrep;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kunmu On 15-04-2026
 */
@SpringBootTest(classes = Section27Groupingby.class)
class Section27GroupingbyTest {
    @Autowired
    private MockDataPrep mockDataPrep;

    @Autowired
    private StreamGroupingby streamGroupingby;

    @Disabled
    @Test
    void getPeople() {
        try {
            List<Person> people = mockDataPrep.getPeople();
            people.stream().forEach(p -> System.out.println(p.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Disabled
    @Test
    void getCars() {
        try {
            List<Car> cars = mockDataPrep.getCars();
            cars.stream().forEach(car -> System.out.println(car.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void groupingbyTest() {
        try {
            Map<String, List<Car>> groupingbyCar = streamGroupingby.streamGroupingbyCar();
            groupingbyCar
                    .forEach((key, value) -> {
                        System.out.println(key + "<-->" + value);
                        System.out.println("--------------------------------------------");
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}