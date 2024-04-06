package com.learning.core.day2session2;

import java.util.HashSet;

class Product1 {
    private String productId;
    private String productName;

    // Constructor
    public void Product(String productId, String productName) {
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

public class D02P7C {
    public static void main(String[] args) {
        HashSet<Product> productList = new HashSet<>();

        // Add predefined product information to the HashSet
        productList.add(new Product("P001", "Maruti 800"));
        productList.add(new Product("P002", "Maruti Zen"));
        productList.add(new Product("P003", "Maruti Dezire"));
        productList.add(new Product("P004", "Maruti Alto"));

        // Product to search
        String searchProductId = "P003";
        String searchProductName = "Maruti Dezire";

        // Check if the product exists in the HashSet
        Product searchProduct = new Product(searchProductId, searchProductName);
        if (productList.contains(searchProduct)) {
            System.out.println("Output: Product found");
        } else {
            System.out.println("Output: Product not found");
        }
    }
}