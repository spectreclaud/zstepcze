package com.topicLambdas.task3;

public class Main {
    public static void main(String[] args) {
        SquareAndSquareRootAndFactorial<Double> squareAndSquareRootAndFactorial = x -> x * x;
        System.out.println("Kwadrat 3.3 to: " + squareAndSquareRootAndFactorial.calculate(3.3));

        SquareAndSquareRootAndFactorial<Double> squareRoot = x -> Math.sqrt(x);
        System.out.println("Pierwiastek kwadratowy 9.8 to: " + squareRoot.calculate(9.8));

        SquareAndSquareRootAndFactorial<Long> factorial = x -> {
            long result =1;
            for (int i = 1; i <= x; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("Silnia 3 to: " + squareAndSquareRootAndFactorial.calculate(3d));
    }
}
