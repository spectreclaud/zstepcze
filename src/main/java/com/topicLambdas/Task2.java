package com.topicLambdas;

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Predicate<Object> isString = o -> o instanceof String;

        System.out.println( isString.test( "Hello" ));
        System.out.println( isString.test( 18736));
    }
}
