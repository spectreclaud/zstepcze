package com.topicDesignPatterns.factory;

public class VirtualProduct implements Product{
    @Override
    public void create() {
        System.out.println( "VirtualProduct - create");
    }
}
