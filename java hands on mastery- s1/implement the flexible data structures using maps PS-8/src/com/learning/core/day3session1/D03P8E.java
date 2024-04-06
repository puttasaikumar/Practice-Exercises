package com.learning.core.day3session1;

import java.util.TreeMap;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    // Constructor
    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Implementing natural ordering based on car name
    @Override
    public int compareTo(Car other) {
        return this.name.compareTo(other.name);
    }

    // Overriding toString method
    @Override
    public String toString() {
        return name + " " + price;
    }

    // Overriding equals and hashCode methods
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

public class D03P8E {
    public static void main(String[] args) {
        // Creating a TreeMap of Car objects with natural ordering based on car name
        TreeMap<Car, Double> carMap = new TreeMap<>();

        // Adding predefined car details
        carMap.put(new Car("Swift", 305000.0), 305000.0);
        carMap.put(new Car("Benz", 900000.0), 900000.0);
        carMap.put(new Car("Bugatti", 80050.0), 80050.0);
        carMap.put(new Car("Audi", 600100.0), 600100.0);

        // Retrieving and printing all car details
        System.out.println("Output:");
        for (Car car : carMap.keySet()) {
            System.out.println(car);
        }
    }
}