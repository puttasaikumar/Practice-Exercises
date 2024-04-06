package com.learning.core.day3session1;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.setName(name);
        this.setDepartment(department);
        this.designation = designation;
    }

    private void setName(String name2) {
		// TODO Auto-generated method stub
		
	}

	private void setDepartment(String department2) {
		// TODO Auto-generated method stub
		
	}

	public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + getName() + ", Department: " + getDepartment() + ", Designation: " + designation;
    }

    private String getDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getName() {
		// TODO Auto-generated method stub
		return null;
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

public class D03P8I {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        // Adding employee details to the Hashtable
        employeeTable.put(1, new Employee(1, "John", "HR", "Manager"));
        employeeTable.put(2, new Employee(2, "Alice", "IT", "Developer"));
        employeeTable.put(3, new Employee(3, "Bob", "Finance", "Accountant"));
        employeeTable.put(4, new Employee(4, "Eva", "Marketing", "Coordinator"));

        // Verifying whether the Hashtable is empty or not
        boolean isEmpty = employeeTable.isEmpty();
        System.out.println(isEmpty);
    }
}
