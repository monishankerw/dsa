package com.dsa.arrays.map.string;

import java.util.Map;
import java.util.stream.Collectors;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "slient";
        boolean isAnagram = anagram(s1, s2);
        System.out.println(isAnagram ? "Anagram" : "Not Anagram");
    }

    private static boolean anagram(String s1, String s2) {
        boolean result = getFreMap(s1).equals(getFreMap(s2));

        return result;
    }

    private static Map<Character, Long> getFreMap(String s1) {

        return s1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
