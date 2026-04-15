package com.sid.tutorials.spring.boot3.java.app.Test;

import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;

/**
 * @author kunmu On 15-04-2026
 */
@Component
public class StreamMinComparators {

    public Integer min() {
        List<Integer> number = List.of(20, 3, 54, 25, 69, 17, 98, 9, 1);
        Integer minValue = number.stream().min((num1, num2) -> num1 - num2).get();
        /*Integer minValue = number.stream().min(Comparator.naturalOrder()).get();*/
        return minValue;
    }

    public Integer max() {
        List<Integer> number = List.of(20, 3, 54, 25, 69, 17, 98, 9, 1);
        /*Integer maxValue = number.stream().max((num1, num2) -> num1 - num2).get();*/
        Integer maxValue = number.stream().max(Comparator.naturalOrder()).get();
        return maxValue;
    }
}
