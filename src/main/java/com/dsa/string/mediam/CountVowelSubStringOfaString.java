package com.dsa.string.mediam;

import java.util.HashSet;
import java.util.Set;

public class CountVowelSubStringOfaString {

    public static void main(String[] args) {
        String str = "aeiouu";
        int result = countVowelSubstrings(str);
        System.out.println("Count of vowel substrings containing all vowels: " + result);
    }

    private static int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();

        for (int i = 0; i < n; i++) {
            Set<Character> vowelSet = new HashSet<>();

            for (int j = i; j < n; j++) {
                char ch = word.charAt(j);

                // stop if non-vowel character appears
                if (!isVowel(ch)) break;

                vowelSet.add(ch);

                // if all 5 vowels present, count this substring
                if (vowelSet.size() == 5) count++;
            }
        }
        return count;
    }

    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
