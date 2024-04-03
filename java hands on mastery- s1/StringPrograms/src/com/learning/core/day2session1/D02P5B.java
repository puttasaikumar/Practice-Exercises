package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P5B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Input n
        System.out.print("Enter the number of last vowels to count: ");
        int n = scanner.nextInt();

        // Count the last n vowels
        String result = countLastNVowels(input, n);

        // Display the result
        System.out.println("Output: " + result);
    }

    public static String countLastNVowels(String str, int n) {
        int count = 0;
        StringBuilder vowels = new StringBuilder();

        // Iterate over the string from the end
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels.insert(0, ch); // Insert at the beginning to maintain the order
                count++;
                if (count == n) {
                    return vowels.toString();
                }
            }
        }

        // If the number of vowels found is less than n, return a message
        if (count < n) {
            return "Mismatch in Vowel Count";
        }

        return vowels.toString();
    }
}