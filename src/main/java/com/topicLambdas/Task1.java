package com.topicLambdas;

import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) {
        Predicate<Object> isNumber = o -> o instanceof Number;

        boolean isNumber1 = isNumber.test(18736);
        System.out.println(isNumber1);
        boolean isNumber2 = isNumber.test(5f);
        System.out.println(isNumber2);
        boolean isNumber3 = isNumber.test("18736");
        System.out.println(isNumber3);
        boolean isNumber4 = isNumber.test("seven");
        System.out.println(isNumber4);
    }
}
