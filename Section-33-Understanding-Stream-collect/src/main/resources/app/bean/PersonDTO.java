package com.sid.tutorials.spring.boot3.java.app.bean;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author kunmu On 15-04-2026
 */
@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

    public static PersonDTO map(Person person) {
        return new PersonDTO(person.getId(), person.getFirstName(), person.getLastName(), person.getEmail());
    }
}
