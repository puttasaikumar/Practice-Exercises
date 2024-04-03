package com.learning.core.day2session1;

import java.util.ArrayList;
import java.util.List;

public class DO2P5C {
    public static void main(String[] args) {
        String input = "abc";
        List<String> subsequences = getAllSubsequences(input);
        System.out.println(subsequences);
    }

    public static List<String> getAllSubsequences(String str) {
        List<String> result = new ArrayList<>();
        generateSubsequences(str, "", 0, result);
        return result;
    }

    private static void generateSubsequences(String str, String current, int index, List<String> result) {
        if (index == str.length()) {
            if (!current.isEmpty()) {
                result.add(current);
            }
            return;
        }
        // Include the current character
        generateSubsequences(str, current + str.charAt(index), index + 1, result);
        // Exclude the current character
        generateSubsequences(str, current, index + 1, result);
    }
}