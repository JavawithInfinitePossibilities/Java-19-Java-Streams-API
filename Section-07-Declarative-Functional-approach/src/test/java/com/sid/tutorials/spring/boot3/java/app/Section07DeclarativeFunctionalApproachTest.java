package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.bean.Car;
import com.sid.tutorials.spring.boot3.java.app.bean.Person;
import com.sid.tutorials.spring.boot3.java.app.mockdata.MockDataPrep;
import com.sid.tutorials.spring.boot3.java.app.task.DeclararativeFunctionalApproach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kunmu On 15-02-2025
 */
@SpringBootTest(classes = Section07DeclarativeFunctionalApproach.class)
class Section07DeclarativeFunctionalApproachTest {
    @Autowired
    private MockDataPrep mockDataPrep;

    @Autowired
    private DeclararativeFunctionalApproach functionalApproach;

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
    public void getYoungPeople() throws IOException {
        List<Person> youngPeople = functionalApproach.getYoungPeople();
        youngPeople.stream().forEach(System.out::println);
    }
}