package com.learning.core.day2session1;

public class D02P5D {
    public static void main(String[] args) {
        String input = "aebcbda";
        int minDeletions = minDeletionsToPalindrome(input);
        System.out.println("Minimum number of deletions to make the string palindrome: " + minDeletions);
    }

    public static int minDeletionsToPalindrome(String str) {
        // Find the longest palindromic subsequence length
        int longestPalindromeLength = longestPalindromeLength(str);

        // Minimum number of deletions = (length of input string) - (length of longest palindromic subsequence)
        return str.length() - longestPalindromeLength;
    }

    public static int longestPalindromeLength(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        // Single characters are palindromes of length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Calculate longest palindromic subsequence lengths for substrings of length 2 and above
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (str.charAt(i) == str.charAt(j) && len == 2) {
                    dp[i][j] = 2;
                } else if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }

        // Length of longest palindromic subsequence for the entire string
        return dp[0][n - 1];
    }
}