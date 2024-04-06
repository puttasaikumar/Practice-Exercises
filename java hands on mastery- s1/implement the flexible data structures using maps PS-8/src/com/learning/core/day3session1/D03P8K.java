package com.learning.core.day3session1;

import java.util.*;

class Employee {
    private int id;
    String name;
    String department;
    String designation;

    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + designation + " " + department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}

public class D03P8K {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        // Adding predefined employee details to the Hashtable
        employeeTable.put(1001, new Employee(1001, "Daniel", "L&D", "Analyst"));
        employeeTable.put(1002, new Employee(1002, "Thomas", "Testing", "Tester"));
        employeeTable.put(1003, new Employee(1003, "Robert", "Development", "Product Manager"));
        employeeTable.put(1004, new Employee(1004, "Grace", "HR", "Tech Support"));

        // Add new employees if not exists
        addEmployeeIfNotExists(employeeTable, 1005, "Charles", "Testing", "QA Lead");

        // Display all employee details
        for (Employee employee : employeeTable.values()) {
            System.out.println(employee);
        }
    }

    // Method to add new employee if not exists
    private static void addEmployeeIfNotExists(Hashtable<Integer, Employee> employeeTable, int id, String name, String department, String designation) {
        if (!employeeTable.containsKey(id)) {
            employeeTable.put(id, new Employee(id, name, department, designation));
        } else {
            // Update the designation of existing employee
            Employee existingEmployee = employeeTable.get(id);
            existingEmployee.name = name.substring(1); // Modify name slightly to indicate duplicate
            existingEmployee.department = department;
            existingEmployee.designation = designation;
        }
    }
}