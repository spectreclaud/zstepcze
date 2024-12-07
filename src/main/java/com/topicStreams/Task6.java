package com.topicStreams;

import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(2, 4, 6, 8, 9, 10, 12);

        List<Integer> selectedEl = elements.stream()
                .dropWhile(n -> n % 2 == 0)
                .toList();

        selectedEl.forEach(System.out::println);
    }
}
