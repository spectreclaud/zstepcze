package com.topicDesignPatterns.observer;

public class FacebookObserver implements Observer{
    @Override
    public void update(String title) {
        System.out.println( "Facebook: " + title);
    }
}
