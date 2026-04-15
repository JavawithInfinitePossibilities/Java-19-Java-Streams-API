package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.Test.TransformationsWithStreamMap;
import com.sid.tutorials.spring.boot3.java.app.bean.Car;
import com.sid.tutorials.spring.boot3.java.app.bean.Person;
import com.sid.tutorials.spring.boot3.java.app.mockdata.MockDataPrep;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

/**
 * @author kunmu On 15-04-2026
 */
@SpringBootTest(classes = {Section17TransformationsWithStreamMap.class})
class Section17TransformationsWithStreamMapTest {
    @Autowired
    private MockDataPrep mockDataPrep;

    @Autowired
    private TransformationsWithStreamMap transformationsWithStreamMap;

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
    void transformationsWithStreamMapTest() {
        try {
            transformationsWithStreamMap
                    .getPersonDTOList()
                    .stream()
                    .forEach(personDto -> System.out.println(personDto.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void transformationsWithStreamMapByMethodReferenceTest() {
        try {
            transformationsWithStreamMap
                    .getPersonDTOListByMethodReference()
                    .stream()
                    .forEach(personDto -> System.out.println(personDto.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}