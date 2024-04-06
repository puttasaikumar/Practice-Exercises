package com.learning.core.day3session1;

import java.util.*;

class Car {
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
        return name + "\n" + price;
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
}

class NameComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getName().compareTo(car2.getName());
    }
}

public class D03P8G {
    public static void main(String[] args) {
        TreeMap<Car, String> carMap = new TreeMap<>(new NameComparator());

        // Adding cars to the TreeMap
        carMap.put(new Car("Benz", 900000.0), "Car details");
        carMap.put(new Car("Bugatti", 80050.0), "Car details");

        // Retrieving the key-value mapping associated with the greatest price
        Map.Entry<Car, String> maxEntry = carMap.lastEntry();
        System.out.println(maxEntry.getKey());
        
        // Retrieving the key-value mapping associated with the least price
        Map.Entry<Car, String> minEntry = carMap.firstEntry();
        System.out.println(minEntry.getKey());
    }
}