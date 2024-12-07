package com.topicAbstract;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        List<Shape> list = new ArrayList<>();

        Shape circle = new Circle(3);
        Shape square = new Square(2);
        Shape rectangle = new Rectangle(2, 4);

        list.add(circle);
        list.add(square);
        list.add(rectangle);

        for (Shape shape : list) {
            System.out.println(shape.description());
        }
    }
}
