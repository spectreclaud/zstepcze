package com.topicAbstract;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public String description() {
        return String.format("Kwadrat o boku %.0f - pole = %.2f, obwód = %.2f", side, calculateArea(), calculatePerimeter());
    }
}
