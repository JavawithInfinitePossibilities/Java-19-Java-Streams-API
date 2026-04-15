package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.Test.StreamDistinct;
import com.sid.tutorials.spring.boot3.java.app.bean.Car;
import com.sid.tutorials.spring.boot3.java.app.bean.Person;
import com.sid.tutorials.spring.boot3.java.app.mockdata.MockDataPrep;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kunmu On 15-04-2026
 */
@SpringBootTest(classes = Section14StreamDistinct.class)
class Section14StreamDistinctTest {
    @Autowired
    private MockDataPrep mockDataPrep;

    @Autowired
    private StreamDistinct streamDistinct;

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
    public void distinctValue(){
        List<Integer> distinctValue = streamDistinct.StreamDistinctValue();
        distinctValue.stream().forEach(distinct -> System.out.println(distinct.toString()));
    }
}