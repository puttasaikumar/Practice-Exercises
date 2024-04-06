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

class ReversePriceComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return Double.compare(car2.getPrice(), car1.getPrice());
    }
}

public class D03P8F {
    public static void main(String[] args) {
        TreeMap<Car, String> carMap = new TreeMap<>(new ReversePriceComparator());

        // Adding cars to the TreeMap
        carMap.put(new Car("Benz", 900000.0), "Car details");
        carMap.put(new Car("Audi", 600100.0), "Car details");
        carMap.put(new Car("Sugat", 800500.0), "Car details");

        // Retrieving and printing prices of cars in reverse order
        for (Car car : carMap.keySet()) {
            System.out.println(car);
        }
    }
}