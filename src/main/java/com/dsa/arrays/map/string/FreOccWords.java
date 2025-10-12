package com.dsa.arrays.map.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreOccWords {
    public static void main(String[] args) {
        String text = "Test I Test My Test abc";
        freqOccWords(text);
        freqOccWordsJava8(text);
    }


    private static void freqOccWords(String text) {
        String[] words = text.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }

    private static void freqOccWordsJava8(String text) {
        Map<String, Integer> map = Arrays.stream(text.split("\\s+")).map(String::toLowerCase).collect(Collectors.toMap(Function.identity(), word -> 1, Integer::sum));
        System.out.println(map);
    }

}
