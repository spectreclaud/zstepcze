package com.topicStreams;

import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> el = Arrays.asList(2, 4, 6, 8, 9, 10, 12);

        List<Integer> selectedElements = el.stream()
                .takeWhile(n -> n % 2 == 0)
                .toList();

        selectedElements.forEach(System.out::println);
    }
}
