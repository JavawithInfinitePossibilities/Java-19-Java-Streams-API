package com.sid.tutorials.spring.boot3.java.app.Test;

import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

/**
 * @author kunmu On 15-04-2026
 */
@Component
public class IntStreamsRangeRangeClosed {

    public void range() {
        System.out.println("Imperative Approach");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Range Exclusive");
        IntStream.range(0, 10).forEach(intex -> System.out.println(intex));
        System.out.println("Range close/Inclusive");
        IntStream.rangeClosed(0, 10).forEach(intex -> System.out.println(intex));
    }
}
