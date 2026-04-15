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
public class IteratingListsWithIntStreamExerciseSolution {

    @Autowired
    private MockDataPrep mockDataPrep;

    public void rangeIterator() throws IOException {
        List<Person> people = mockDataPrep.getPeople();
        IntStream.range(0, people.size()).forEach(intex -> {
            Person person = people.get(intex);
            System.out.println(person);
        });
    }
}
