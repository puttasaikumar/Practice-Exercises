package com.learning.core.day2session1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D02P5G {
    public static void main(String[] args) {
        String pattern = "ulie";
        String[] dictionary = {"xyz", "xyy", "abb", "ulte", "ulie", "ulie"};

        List<String> matches = findMatchingStrings(pattern, dictionary);
        System.out.println("Output: " + String.join(" ", matches)); // Output: xyy abb
    }

    public static List<String> findMatchingStrings(String pattern, String[] dictionary) {
        List<String> matches = new ArrayList<>();

        // Map to store character mappings
        Map<Character, Character> charMap = new HashMap<>();

        for (String word : dictionary) {
            // Skip words of different length than pattern
            if (word.length() != pattern.length()) {
                continue;
            }

            boolean isValid = true;

            for (int i = 0; i < pattern.length(); i++) {
                char patternChar = pattern.charAt(i);
                char wordChar = word.charAt(i);

                // If pattern character is encountered for the first time
                if (!charMap.containsKey(patternChar)) {
                    // Check if the corresponding word character is already mapped
                    if (charMap.containsValue(wordChar)) {
                        isValid = false;
                        break;
                    }
                    // Map the pattern character to the word character
                    charMap.put(patternChar, wordChar);
                } else {
                    // If pattern character is already mapped, check if it maps to the same word character
                    if (charMap.get(patternChar) != wordChar) {
                        isValid = false;
                        break;
                    }
                }
            }

            // If word matches the pattern, add it to the list of matches
            if (isValid) {
                matches.add(word);
            }

            // Clear the character map for the next word
            charMap.clear();
        }

        return matches;
    }
}
