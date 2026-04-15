package com.sid.tutorials.spring.boot3.java.app.Test;

import com.sid.tutorials.spring.boot3.java.app.bean.Person;
import com.sid.tutorials.spring.boot3.java.app.mockdata.MockDataPrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * @author kunmu On 15-04-2026
 */
@Component
public class StreamCount {

    @Autowired
    private MockDataPrep mockDataPrep;

    public Long getAllFemalePersons() throws IOException {
        return mockDataPrep
                .getPeople()
                .stream()
                .filter(person -> person.getGender().equalsIgnoreCase("female"))
                .count();
    }
}
