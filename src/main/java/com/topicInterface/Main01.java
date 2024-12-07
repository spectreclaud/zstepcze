package com.topicInterface;

public class Main01 {
    public static void main(String[] args) {
        Movable[] movableTab = new Movable[3];
        movableTab[0] = new Cat();
        movableTab[1] = new Car();
        movableTab[2] = new Person();

        for (Movable movable : movableTab) {
            movable.start();
        }
    }
}
