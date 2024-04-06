package com.learning.core.day2session2;

import java.util.TreeSet;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Implementing natural ordering based on id
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }

    // Overriding toString method
    @Override
    public String toString() {
        return name.toUpperCase();
    }

    // Overriding equals and hashCode methods
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return name== person.name;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

public class D02P7G {
    public static void main(String[] args) {
        // Creating a TreeSet of Person objects
        TreeSet<Person> personSet = new TreeSet<>();

        // Adding predefined person details
        personSet.add(new Person(1, "John", 32, 1999.0));
        personSet.add(new Person(2, "Smith", 28, 2999.0));
        personSet.add(new Person(3, "Jerry", 25, 999.0));
        personSet.add(new Person(4, "Tom", 42, 3999.0));
        personSet.add(new Person(5, "Popeye", 35, 5999.0));
        personSet.add(new Person(6, "Jones", 40, 6999.0));

        // Printing names of persons in uppercase
        for (Person person : personSet) {
            System.out.println(person);
        }
    }
}
