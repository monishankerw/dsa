package com.dsa.string.mediam;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int result = longestSubstring(str);
        System.out.println("Length of Longest Substring Without Repeating Characters: " + result);
    }

    private static int longestSubstring(String str) {
        int maxLen = 0, left = 0;
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);

            // Remove left chars until duplicate removed
            while (set.contains(ch)) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
