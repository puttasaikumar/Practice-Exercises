package com.learning.core.day1session1;

import java.util.Scanner;

public class ControlStatementD01P03B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number representing the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday): ");
        int dayOfWeek = scanner.nextInt();

        String weekday = "";

        if (dayOfWeek >= 1 && dayOfWeek <= 7) {
            if (dayOfWeek == 1) {
                weekday = "Monday";
            } else if (dayOfWeek == 2) {
                weekday = "Tuesday";
            } else if (dayOfWeek == 3) {
                weekday = "Wednesday";
            } else if (dayOfWeek == 4) {
                weekday = "Thursday";
            } else if (dayOfWeek == 5) {
                weekday = "Friday";
            } else if (dayOfWeek == 6) {
                weekday = "Saturday";
            } else {
                weekday = "Sunday";
            }
            System.out.println(weekday);
        } else {
            System.out.println("Invalid Input");
        }
    }
}
