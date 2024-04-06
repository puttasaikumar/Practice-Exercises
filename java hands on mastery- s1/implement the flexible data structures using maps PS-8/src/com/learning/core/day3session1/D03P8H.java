package com.learning.core.day3session1;

import java.util.*;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }
}

public class D03P8H {
    public static void main(String[] args) {
        TreeMap<Car, String> carMap = new TreeMap<>();

        // Adding cars to the TreeMap
        carMap.put(new Car("Reva", 80050.0), "Car details");
       // carMap.put(new Car("Swift", 305000.0), "Car details");
       // carMap.put(new Car("Audi", 600100.0), "Car details");

        // Removing and getting the key-value mapping associated with the greatest key
        Map.Entry<Car, String> entry = carMap.pollLastEntry();
        System.out.println(entry.getKey());

        // Replacing the value mapped by the specified key with a new value
        double key = 80050.0;
        for (Map.Entry<Car, String> carEntry : carMap.entrySet()) {
            if (carEntry.getKey().getPrice() == key) {
                carMap.put(carEntry.getKey(), "Reva");
                break;
            }
        }

        // Printing the updated TreeMap
        for (Map.Entry<Car, String> carEntry : carMap.entrySet()) {
            System.out.println(carEntry.getKey());
        }
    }
}