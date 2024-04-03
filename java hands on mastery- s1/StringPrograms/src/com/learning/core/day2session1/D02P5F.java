package com.learning.core.day2session1;

public class D02P5F {
    public static void main(String[] args) {
        String str1 = "aabcdaabc";
        String str2 = "abcab";

        System.out.println(longestPrefixSuffixLength(str1)); // Output: 4
        System.out.println(longestPrefixSuffixLength(str2)); // Output: 2
    }

    public static int longestPrefixSuffixLength(String str) {
        int n = str.length();
        
        // Iterate from the longest possible prefix length
        for (int len = n - 1; len > 0; len--) {
            // Check if the prefix of length 'len' matches the suffix
            if (str.substring(0, len).equals(str.substring(n - len))) {
                return len;
            }
        }
        return 0; // No matching prefix and suffix found
    }
}
