package com.topicDesignPatterns.factory;

public class ProductFactory {
    public Product createProduct(String type) {
        return switch (type.toLowerCase()) {
            case "simple" -> new SimpleProduct();
            case "advanced" -> new AdvancedProduct();
            case "virtual" -> new VirtualProduct();
            default -> throw new IllegalArgumentException("Unknown product type: " + type);
        };
    }
}
