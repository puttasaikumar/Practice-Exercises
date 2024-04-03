package com.learning.core.day2session1;

public class D02P5I {
    public static void main(String[] args) {
        String input = "Mr John Smith";
        String output = replaceSpaces(input);
        System.out.println("Output: " + output); // Output: Mr%20John%20Smith
    }

    public static String replaceSpaces(String str) {
        StringBuilder sb = new StringBuilder();

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                // Replace space with "%20"
                sb.append("%20");
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}