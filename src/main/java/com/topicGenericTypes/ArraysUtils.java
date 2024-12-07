package com.topicGenericTypes;

public class ArraysUtils {
    public static <T> int count(T[] array, T element) {
        int count = 0;
        for (T item : array) {
            if (item.equals(element)) {
                count++;
            }
        }
        return count;
    }
}
