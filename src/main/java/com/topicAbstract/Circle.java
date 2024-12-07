package com.topicAbstract;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String description() {
        return String.format("Koło o promieniu %.0f - pole = %.2f, obwód = %.2f", radius, calculateArea(), calculatePerimeter());
    }
}
