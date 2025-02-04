package com.topicStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> transfor = numbers
                .stream()
                .map(n -> n * n - 5)
                .filter(n -> n < 20)
                .toList();

        System.out.println(transfor);
    }
}
