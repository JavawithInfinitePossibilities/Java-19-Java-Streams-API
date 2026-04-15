package com.sid.tutorials.spring.boot3.java.app.Test;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kunmu On 15-04-2026
 */
@Component
public class StreamFlatmap {

    public List<Integer> getFlatmap(){
        List<List<Integer>> list = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        return list.stream().flatMap(List::stream).collect(Collectors.toList());
    }
}
