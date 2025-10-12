package com.dsa.arrays.map.string;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFreqOcc {
    public static void main(String[] args) {
        char[] ch = {'a', 'a', 'd', 'w', 't', 't', 'e', 'q'};
        charFreqOcc(ch);
        charFreqJava8(ch);
    }

    private static void charFreqOcc(char[] ch) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
    private static void charFreqJava8(char[] ch) {
        Map<Character, Long> map = new String(ch)
                .chars()  // converts to IntStream
                .mapToObj(c -> (char) c) // convert int to char
                .collect(Collectors.groupingBy(
                        Function.identity(), // group by character
                        Collectors.counting() // count occurrences
                ));

        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }


}
