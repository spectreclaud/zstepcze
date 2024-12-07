package com.topicAbstract;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String description() {
        return String.format("Prostokąt o bokach %.0f i %.0f - pole = %.2f, obwód = %.2f", length, width, calculateArea(), calculatePerimeter());
    }
}
