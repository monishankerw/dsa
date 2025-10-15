package com.dsa.string.mediam;

import java.util.Arrays;

public  class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};



        System.out.println("Traditional LCP: " + longestCommonPrefixTraditional(words));
        System.out.println("Java 8 LCP: " + longestCommonPrefixJava8(words));
    }

    // ✅ Traditional Approach (Using Iteration)
    public static String longestCommonPrefixTraditional(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for (String s : strs) {
            while (s.indexOf(prefix) != 0) { // Reduce prefix until it matches
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    // ✅ Java 8 Streams Approach
    public static String longestCommonPrefixJava8(String[] strs) {
        return Arrays.stream(strs)
                .reduce((s1, s2) -> {
                    int i = 0;
                    while (i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)) i++;
                    return s1.substring(0, i);
                }).orElse("");
    }
}
