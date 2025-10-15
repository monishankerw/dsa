package com.dsa.string.mediam;

public class LongestPalindromicString {
    public static void main(String[] args) {
        String str = "babad";
        String result = longestPalindromic(str);
        System.out.println("Result:" + result);
    }

    private static String longestPalindromic(String str) {
        if (str.isEmpty())
            return " ";
        String longest = " ";
        for (int i = 0; i < str.length(); i++) {
            String odd = expondAroundCenter(str, i, i);
            String even = expondAroundCenter(str, i, i++);
            String max = odd.length() > even.length() ? odd : even;
            if (max.length() > longest.length()) {
                longest = max;
            }
        }
        return longest;
    }

    private static String expondAroundCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }
}
