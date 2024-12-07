package com.topicFunctionalInterfaces.task2;

import com.topicFunctionalInterfaces.task1.Filter;
import com.topicFunctionalInterfaces.task1.IntegerTransform;
import com.topicFunctionalInterfaces.task1.Transform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        IntegerTransform integerTransform = new IntegerTransform();
        List<Integer> result1 = create(numbers, n -> n > 2, integerTransform);
        System.out.println(result1);

        List<Integer> result2 = create(numbers, n -> n > 2, s -> s - 1);
        System.out.println(result2);
    }

    static <T, S> List<T> create(List<S> src, Filter<S> f, Transform<T, S> t) {
        List<T> resultList = new ArrayList<>();
        for (S s : src) {
            if (f.check(s)) {
                resultList.add(t.transform(s));
            }
        }
        return resultList;
    }
}
