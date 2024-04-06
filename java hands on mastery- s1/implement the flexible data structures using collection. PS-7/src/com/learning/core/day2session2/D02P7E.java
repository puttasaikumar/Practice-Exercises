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

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Implementing natural ordering based on id
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    // Overriding equals and hashCode methods
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

public class D02P7E {
    public static void main(String[] args) {
        // Creating a TreeSet of Person objects
        TreeSet<Person> personSet = new TreeSet<>();

        // Adding predefined person details
        personSet.add(new Person(1, "Alice", 22, 1500.0));
        personSet.add(new Person(2, "Bob", 20, 2000.0));
        personSet.add(new Person(3, "Charlie", 21, 2500.0));
        personSet.add(new Person(4, "David", 18, 1800.0));
        personSet.add(new Person(5, "John", 32, 1999.0));
        personSet.add(new Person(6, "Tom", 42, 3999.0));

        // Printing details of persons whose age is greater than 25
        System.out.println("Output:");
        for (Person person : personSet) {
            if (person.getAge() > 25) {
                System.out.println(person);
            }
        }
    }
}
