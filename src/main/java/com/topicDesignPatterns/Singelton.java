package com.topicDesignPatterns;

public class Singelton {
    private static Singelton INSTANCE;
    private Singelton() {}
    public static Singelton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singelton();
        }
        return INSTANCE;
    }
}
