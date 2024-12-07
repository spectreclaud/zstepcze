package com.topicDesignPatterns.factory;

public class Main {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();

        Product simpleProduct = factory.createProduct( "simple" );
        simpleProduct.create();

        Product advancedProduct = factory.createProduct( "advanced" );
        advancedProduct.create();

        Product virtualProduct = factory.createProduct( "virtual" );
        virtualProduct.create();
    }
}
