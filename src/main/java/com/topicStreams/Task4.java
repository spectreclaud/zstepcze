package com.topicStreams;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");

        // Dlugosc
        System.out.println("Zwraca dl elementow");
        elements.stream()
                .map(String::length)
                .forEach(System.out::println);

        // Sortowanie
        System.out.println("---------------------------");
        List<String> sorted = elements.stream()
                .sorted()
                .toList();
        System.out.println(sorted);

        // Elementy zawierajace litere c
        System.out.println("---------------------------");
        elements.stream()
                .filter(s -> s.contains("c"))
                .forEach(System.out::println);

        System.out.println("---------------------------");
        // Suma dlugosci wszystkich elementow
        int totalLength = elements.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(totalLength);

        System.out.println("---------------------------");
        // Trzy pierwsze elementy posortowane alfabetycznie
        List<String> sortedElements = elements.stream()
                .sorted()
                .limit(3)
                .toList();
        System.out.println(sortedElements);
    }

}
