package com.dsa.arrays.map.string;

import java.util.HashSet;
import java.util.Set;

public class PangramString {
    //TODO: A Sentence that contains every letter of the english alphabet at least once.
    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog.";
        boolean result=pangramString(str);
        System.out.println("Pangram String..."+result);
    }

    private static boolean pangramString(String str) {
        Set<Character> set = new HashSet<>();

        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                set.add(ch);

                // 🔥 Optimization: exit early if all 26 letters found
                if (set.size() == 26) {
                    return true;
                }
            }
        }
        return false;
    }

}
