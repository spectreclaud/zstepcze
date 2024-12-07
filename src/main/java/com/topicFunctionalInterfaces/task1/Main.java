package com.topicFunctionalInterfaces.task1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        IntegerTransform integerTransform = new IntegerTransform();

        // First solution
        printList(numbers, n -> n > 2, integerTransform);

        // Second solution - anonim
        printList(numbers, n -> n > 2, s -> s - 1);
    }

    static <T, S> void printList(List<S> src, Filter<S> f, Transform<T, S> t) {
        for (S s : src) {
            if (f.check(s)) {
                System.out.println(t.transform(s));
            }
        }
    }

}
