package com.topicDesignPatterns.factory;

public class SimpleProduct implements Product{
    @Override
    public void create() {
        System.out.println("SimpleProduct - create");
    }
}
