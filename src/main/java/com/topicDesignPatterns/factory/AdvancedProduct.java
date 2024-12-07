package com.topicDesignPatterns.factory;

public class AdvancedProduct implements Product{
    @Override
    public void create() {
        System.out.println( "AdvancedProduct - create");
    }
}
