package com.topicGenericTypes;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "apple", "appleJuice"};
        String searchString = "apple";
        int countString = ArraysUtils.count(stringArray, searchString);
        System.out.println("Słowo 'apple' występuje " + countString + " razy.");

        Integer[] intArr = {1, 12, 1, 3, 1};
        Integer searchInt = 1;
        int countInt = ArraysUtils.count(intArr, searchInt);
        System.out.println("Integer 1 występuje " + countInt + " razy.");

    }
}
