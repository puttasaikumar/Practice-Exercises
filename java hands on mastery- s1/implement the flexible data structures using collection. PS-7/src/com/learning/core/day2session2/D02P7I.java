package com.learning.core.day2session2;

import java.util.TreeSet;

class Person1 implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    // Constructor
    public void Person(int id, String name, int age, double salary) {
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
        return id == person.getId();
    }

    @Override
    public int hashCode() {
        return id;
    }
}

public class D02P7I {
    public static void main(String[] args) {
        // Creating a TreeSet of Person objects
        TreeSet<Person> personSet = new TreeSet<>();

        // Adding predefined person details
        personSet.add(new Person(1, "John", 32, 1999.0));
        personSet.add(new Person(2, "Smith", 28, 2999.0));
        personSet.add(new Person(3, "Jerry", 25, 999.0));
        personSet.add(new Person(4, "Jones", 22, 6999.0));
        personSet.add(new Person(5, "Popeye", 35, 5999.0));
        personSet.add(new Person(6, "Jane", 40, 7999.0));

        // Finding the first person whose name starts with 'J'
        for (Person person : personSet) {
            if (person.getName().startsWith("J")) {
                System.out.println(person);
                break;
            }
        }
    }
}