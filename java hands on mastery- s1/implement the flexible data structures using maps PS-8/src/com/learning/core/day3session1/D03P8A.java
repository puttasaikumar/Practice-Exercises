package com.learning.core.day3session1;

import java.util.HashMap;

public class D03P8A {
    public static void main(String[] args) {
        // Creating a HashMap to store phone book details
        HashMap<String, String> phoneBook = new HashMap<>();

        // Adding predefined phone book details
        phoneBook.put("Amal", "998787823");
        phoneBook.put("Manvitha", "937843978");
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Smith", "8293893311");
        phoneBook.put("Kathe", "7234560011");

        // Printing all phone book details
        System.out.println("Output:");
        for (String name : phoneBook.keySet()) {
            System.out.println(name + " " + phoneBook.get(name));
        }
    }
}