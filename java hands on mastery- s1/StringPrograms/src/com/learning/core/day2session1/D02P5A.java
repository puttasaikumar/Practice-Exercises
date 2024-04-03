package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P5A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Display length of the string
        int length = input.length();
        System.out.println("Length of the string: " + length);

        // Display the string in uppercase
        String uppercaseString = input.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);

        // Check if the string is a palindrome
        boolean isPalindrome = isPalindrome(input);
        if (isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        // Iterate through the string from both ends
        while (left < right) {
            // Skip non-alphanumeric characters from left
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            // Skip non-alphanumeric characters from right
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            // Compare characters at left and right positions
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            // Move to the next characters
            left++;
            right--;
        }
        return true;
    }
}