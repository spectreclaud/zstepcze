package com.topicStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");

        Map<String, String> reverse = elements.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        s -> new StringBuilder(s).reverse().toString()
                ));

        reverse.forEach((k, v) -> System.out.println(k + " --> " + v));
    }
}
