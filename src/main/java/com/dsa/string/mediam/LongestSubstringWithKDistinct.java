package com.dsa.string.mediam;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithKDistinct {

    public static void main(String[] args) {

        String str = "eceba";
        int k = 2;

        System.out.println("Longest substring length: " + longestSubstringWithKDistinct(str, k));
    }

    private static int longestSubstringWithKDistinct(String s, int k) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            set.add(s.charAt(right));

            while (set.size() > k) {
                set.remove(s.charAt(left));
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}