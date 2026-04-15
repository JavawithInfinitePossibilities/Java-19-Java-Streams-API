package com.sid.tutorials.spring.boot3.java.app.Test;

import com.sid.tutorials.spring.boot3.java.app.bean.Person;
import com.sid.tutorials.spring.boot3.java.app.mockdata.MockDataPrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author kunmu On 15-04-2026
 */
@Component
public class IntStreamIterate {

    @Autowired
    private MockDataPrep mockDataPrep;

    public void iteratorRange() throws IOException {
        List<Person> people = mockDataPrep.getPeople();
        IntStream.iterate(0, operand -> operand + 1)
                .limit(people.size())
                .forEach(index -> {
                    Person person = people.get(index);
                    System.out.println(person);
                });
        System.out.println("---------------------------------------------");
        IntStream.iterate(0, operand -> operand < people.size(), operand -> operand + 1)
                .forEach(index -> {
                    Person person = people.get(index);
                    System.out.println(person);
                });
    }
}
