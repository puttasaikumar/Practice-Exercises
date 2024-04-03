package com.learning.core.day1session1;

import java.util.Scanner;

public class ControlStatementD01P03C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the percentage obtained by the student: ");
        double percentage = scanner.nextDouble();

        char grade;

        if (percentage >= 60) {
            grade = 'A';
        } else if (percentage >= 45) {
            grade = 'B';
        } else if (percentage >= 35) {
            grade = 'C';
        } else {
            grade = 'F'; // Fail
        }

        System.out.println("Grade: " + grade);
    }
}
