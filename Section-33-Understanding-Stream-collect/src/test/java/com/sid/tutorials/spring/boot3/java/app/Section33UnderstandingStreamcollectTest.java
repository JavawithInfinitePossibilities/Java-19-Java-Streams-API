package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.bean.Car;
import com.sid.tutorials.spring.boot3.java.app.bean.Person;
import com.sid.tutorials.spring.boot3.java.app.mockdata.MockDataPrep;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kunmu On 16-04-2026
 */
@SpringBootTest(classes = Section33UnderstandingStreamcollect.class)
class Section33UnderstandingStreamcollectTest {
    @Autowired
    private MockDataPrep mockDataPrep;

    @Test
    void getPeople() {
        try {
            List<Person> people = mockDataPrep.getPeople();
            ArrayList<String> emailList = people.stream()
                    .map(person -> person.getEmail())
                    .collect(
                            () -> new ArrayList<String>(),
                            (list, element) -> list.add(element),
                            (list1, list2) -> list1.addAll(list2)
                    );
            System.out.println(emailList);
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
}