package com.learning.core.day2session2;

import java.util.HashSet;

class Product {
    String productId;
    private String productName;

    // Constructor
    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    // Getter methods
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    // Method to override hashCode and equals for HashSet
    @Override
    public int hashCode() {
        return productId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product product = (Product) obj;
        return productId.equals(product.productId);
    }
}

public class DO2P7B {
    public static void main(String[] args) {
        HashSet<Product> productSet = new HashSet<>();

        // Add predefined product information
        productSet.add(new Product("P001", "Maruti 800"));
        productSet.add(new Product("P002", "Maruti Zen"));
        productSet.add(new Product("P003", "Maruti Dezire"));
        productSet.add(new Product("P004", "Maruti Alto"));

        // Display all product details
        System.out.println("Output:");
        for (Product product : productSet) {
            System.out.println(product.getProductId() + " " + product.getProductName());
        }
    }
}