package com.learning.core.day2session2;

import java.util.ArrayList;

public class D02P7A {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Jack");
        studentNames.add("Paul");
        studentNames.add("Henry");
        studentNames.add("Mary");
        studentNames.add("Ronaldo");

        String searchName = "Henry";
        if (studentNames.contains(searchName)) {
            System.out.println("Output: Found");
        } else {
            System.out.println("Output: Not Found");
        }
    }
}