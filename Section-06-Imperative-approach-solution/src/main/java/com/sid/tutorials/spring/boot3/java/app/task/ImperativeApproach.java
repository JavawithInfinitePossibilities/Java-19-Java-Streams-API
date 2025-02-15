package com.sid.tutorials.spring.boot3.java.app.task;

import com.sid.tutorials.spring.boot3.java.app.bean.Person;
import com.sid.tutorials.spring.boot3.java.app.mockdata.MockDataPrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kunmu On 15-02-2025
 */
@Component
public class ImperativeApproach {

    @Autowired
    private MockDataPrep mockDataPrep;

    /*1.Find the people age less or equal 18
    2.Change the implementation to find first 10 people*/
    public List<Person> getPeople() throws IOException {
        List<Person> youngPeople = new ArrayList<>();
        List<Person> people = mockDataPrep.getPeople();
        int counter = 0, limit = 10;
        for (Person person : people) {
            if (person.getAge() <= 18) {
                youngPeople.add(person);
                counter++;
                if (counter == limit) {
                    break;
                }
            }
        }
        return youngPeople;
    }
}
