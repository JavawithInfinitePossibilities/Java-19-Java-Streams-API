package com.sid.tutorials.spring.boot3.java.app.Test;

import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kunmu On 15-04-2026
 */
@Component
public class StreamDistinct {

    public List<Integer> StreamDistinctValue() {
        List<Integer> number = List
                .of(1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 9, 9);
        List<Integer> distinct = number.stream().distinct().collect(Collectors.toList());
        return distinct;
    }
}
