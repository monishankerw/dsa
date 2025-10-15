package com.dsa.string.mediam;


import java.util.HashMap;
import java.util.Map;

public  class LongestSubstringWithKDistinct {
    public static void main(String[] args) {
        String str = "eceba";
        int k = 2;
        System.out.println("Longest substring length: " + longestSubstringWithKDistinct(str, k));
    }

    private static int longestSubstringWithKDistinct(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, maxLength = 0;
        while (right < s.length()) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            while (map.size() > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                if (map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}