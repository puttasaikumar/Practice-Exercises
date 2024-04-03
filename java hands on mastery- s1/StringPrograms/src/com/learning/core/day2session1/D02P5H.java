package com.learning.core.day2session1;

import java.util.HashSet;
import java.util.Set;

public class D02P5H {
    public static void main(String[] args) {
        String str1 = "Helloworld";
        String str2 = "aaabb";

        System.out.println(canBeSplitIntoFourDistinctStrings(str1)); // Output: Yes
        System.out.println(canBeSplitIntoFourDistinctStrings(str2)); // Output: No
    }

    public static String canBeSplitIntoFourDistinctStrings(String str) {
        if (str.length() < 4) {
            return "No"; // String length is less than 4, cannot be split into four distinct strings
        }

        Set<String> seen = new HashSet<>();

        // Try all possible combinations of splitting the string into four substrings
        for (int i = 1; i < str.length() - 2; i++) {
            for (int j = i + 1; j < str.length() - 1; j++) {
                for (int k = j + 1; k < str.length(); k++) {
                    String s1 = str.substring(0, i);
                    String s2 = str.substring(i, j);
                    String s3 = str.substring(j, k);
                    String s4 = str.substring(k);

                    // Check if all four substrings are distinct
                    if (!s1.equals(s2) && !s1.equals(s3) && !s1.equals(s4) &&
                            !s2.equals(s3) && !s2.equals(s4) && !s3.equals(s4)) {
                        return "Yes";
                    }
                }
            }
        }

        return "No";
    }
}