package com.sid.tutorials.spring.boot3.java.app.Test;

import com.sid.tutorials.spring.boot3.java.app.bean.Person;
import com.sid.tutorials.spring.boot3.java.app.bean.PersonDTO;
import com.sid.tutorials.spring.boot3.java.app.mockdata.MockDataPrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kunmu On 15-04-2026
 */
@Component
public class TransformationsWithStreamMap {

    @Autowired
    private MockDataPrep mockDataPrep;

    public List<PersonDTO> getPersonDTOList() throws IOException {
        List<PersonDTO> personDTOS = mockDataPrep.getPeople().stream()
                .map(person -> new PersonDTO(person.getId(), person.getFirstName(), person.getLastName(), person.getEmail()))
                .collect(Collectors.toList());
        return personDTOS;
    }

    public List<PersonDTO> getPersonDTOListByMethodReference() throws IOException {
        List<PersonDTO> personDTOS = mockDataPrep.getPeople().stream()
                .map(PersonDTO::map)
                .collect(Collectors.toList());
        return personDTOS;
    }
}
