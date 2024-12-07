package com.topicDesignPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Post implements Subject{
    private String content;
    private String title;
    private List<Observer> observers = new ArrayList<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.title);
        }
    }

    public void share() {
        System.out.println("UPDATE OBSERVERS");
        notifyObservers();

    }
}
