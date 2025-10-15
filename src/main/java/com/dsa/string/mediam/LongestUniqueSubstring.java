package com.dsa.string.mediam;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println("Longest Substring Length: " + longestSubstringWithoutRepeating(s));
    }

    public static int longestSubstringWithoutRepeating(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left); // Update left to skip repeating character
            }
            map.put(s.charAt(right), right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}