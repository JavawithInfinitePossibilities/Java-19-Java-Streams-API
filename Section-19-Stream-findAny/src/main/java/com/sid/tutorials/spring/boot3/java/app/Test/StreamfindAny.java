package com.sid.tutorials.spring.boot3.java.app.Test;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author kunmu On 15-04-2026
 */
@Component
public class StreamfindAny {

    public Integer getStreamfindAny() {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer findAny = Arrays.stream(arr).filter(index -> index < 10).findAny().get();
        return findAny;
    }
}
