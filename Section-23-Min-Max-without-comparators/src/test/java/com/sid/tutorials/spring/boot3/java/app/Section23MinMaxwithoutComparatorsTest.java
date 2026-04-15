package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.Test.MinMaxwithoutComparators;
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
@SpringBootTest(classes = Section23MinMaxwithoutComparators.class)
class Section23MinMaxwithoutComparatorsTest {
    @Autowired
    private MockDataPrep mockDataPrep;

    @Autowired
    private MinMaxwithoutComparators  minMaxwithoutComparators;

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
    void minwithoutComparatorsTest(){
        Double minCar = null;
        try {
            minCar = minMaxwithoutComparators.getMinCar();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(minCar);
    }

    @Test
    void maxwithoutComparatorsTest(){
        Double maxCar = null;
        try {
            maxCar = minMaxwithoutComparators.getMaxCar();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(maxCar);
    }
}