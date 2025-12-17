package com.dsa.arrays.map.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//TODO: 1
public class FreOccString {
    public static void main(String[] args) {
        String str="teretrerttee";
        freOccString(str);
        freOccStringJava8(str);
    }

    private static void freOccString(String str) {
        Map<Character,Integer> map=new HashMap<>();
        //TODO: What is toCharArray() in Java?
        //toCharArray() is a String method that converts a string into a char[] (character array).
        for (char c:str.toCharArray()){
        //TODO:What does getOrDefault(c, 0) do?
            //It means:
            //"Give me the value for key c.
            //If c is not in the map, return 0 instead."
            //This prevents NullPointerException and avoids writing containsKey() manually.
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
    private static void freOccStringJava8(String str) {
        Map<String, Long> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(map);
    }

/*
✔ 1. str.chars()

Converts the string into an IntStream of ASCII values.

For "abc" → [97, 98, 99]

✔ 2. .mapToObj(c -> (char) c)

Convert each int ASCII to char object.

Now stream becomes:
['a', 'b', 'c']

✔ 3. .collect(...)

We collect the characters into a Map<Character, Long>.

✔ 4. Collectors.groupingBy(...)

Group characters by their identity (i.e., the character itself)

✔ 5. Collectors.counting()

Counts the occurrences of each character in the group.
 */
}
