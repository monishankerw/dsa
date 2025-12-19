package com.dsa.string.basics;

public class LongestWordPalindrome {

    /**
     * Returns the longest palindromic word from the input string.
     * Words are sequences of alphanumeric characters. Comparison is case-insensitive.
     * If multiple palindromic words have the same (max) length, the first one is returned.
     * Returns an empty string if no palindromic word found.
     */
    public static String longestWordPalindrome(String input) {
        if (input == null || input.trim().isEmpty()) return "";

        // Split on any sequence of non-alphanumeric characters
        String[] words = input.split("[^A-Za-z0-9]+");
        String best = "";
        for (String w : words) {
            if (w.isEmpty()) continue;
            String normalized = w.toLowerCase();
            if (isPalindrome(normalized)) {
                if (normalized.length() > best.length()) {
                    best = w; // preserve original-case form for return
                }
            }
        }
        return best;
    }

    // helper: check palindrome in O(length)
    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    // quick tests
    public static void main(String[] args) {
        String[] tests = {
            "madam arora teaches malayalam",
            "Hello level noon civic kayak",
            "No palindromes here!",
            "A man, a plan, a canal: panama",
            "RaceCar racecar RACEcar",
            ""
        };

        for (String t : tests) {
            System.out.printf("Input: \"%s\" -> Longest palindromic word: \"%s\"%n",
                    t, longestWordPalindrome(t));
        }
    }
}
