package com.sid.tutorials.spring.boot3.java.app.task;

import com.sid.tutorials.spring.boot3.java.app.bean.Person;
import com.sid.tutorials.spring.boot3.java.app.mockdata.MockDataPrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kunmu On 15-02-2025
 */
@Component
public class DeclararativeFunctionalApproach {

    @Autowired
    private MockDataPrep mockDataPrep;

    /*1.Find the people age less or equal 18
   2.Change the implementation to find first 10 people*/
    public List<Person> getYoungPeople() throws IOException {
        List<Person> people = mockDataPrep.getPeople();
        List<Person> youngPeople = people.stream()
                .filter(person -> person.getAge() <= 18)
                .limit(10)
                .collect(Collectors.toList());
        return youngPeople;
    }
}
