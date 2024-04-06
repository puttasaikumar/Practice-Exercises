package com.learning.core.day3session1;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

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

	public void setName(String substring) {
		// TODO Auto-generated method stub
		
	}

	public void setDepartment(String department2) {
		// TODO Auto-generated method stub
		
	}

	public void setDesignation(String designation2) {
		// TODO Auto-generated method stub
		
	}
}

public class D03P8J {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        // Adding employee details to the Hashtable
        employeeTable.put(1001, new Employee(1001, "John", "HR", "Manager"));
        employeeTable.put(1002, new Employee(1002, "Alice", "IT", "Developer"));
        employeeTable.put(1003, new Employee(1003, "Robert", "Development", "Product Manager"));
        employeeTable.put(1004, new Employee(1004, "Eva", "Marketing", "Coordinator"));

        // Searching for a specific employee
        int searchId = 1003;
        Employee employee = employeeTable.get(searchId);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found with id: " + searchId);
        }
    }
}