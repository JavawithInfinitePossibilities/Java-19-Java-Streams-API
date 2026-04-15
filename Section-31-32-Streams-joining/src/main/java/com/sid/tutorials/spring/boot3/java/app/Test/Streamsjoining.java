package com.sid.tutorials.spring.boot3.java.app.Test;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kunmu On 16-04-2026
 */
@Component
public class Streamsjoining {

    public String getJoinValue() {
        List<String> list = List.of("Depending", "on", "whether", "your", "list", "contains", "String", "objects");
        return list
                .stream()
                .map(value->new StringBuffer(value).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
