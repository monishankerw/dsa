package com.dsa.arrays.intersectionUnion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public  class CommonElementsInArrays {
        public static void main(String[] args) {
            // 1. By using nested for loop
            Integer[] array1 = {4, 2, 3, 1, 6};
            Integer[] array2 = {6, 7, 8, 4};
            List<Integer> commonElements = new ArrayList<>();

            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i].equals(array2[j])) {
                        if (!commonElements.contains(array1[i])) { // Avoid duplicates
                            commonElements.add(array1[i]);
                        }
                    }
                }
            }
            System.out.println("Common Elements using for loop: " + commonElements);

            // 2. Using ArrayList with retainAll method
            ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
            ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
            list1.retainAll(list2);
            System.out.println("Common Elements using retainAll: " + list1);

            // 3. By using Java Streams
            String[] array3 = {"Java", "JavaScript", "C", "C++"};
            String[] array4 = {"Python", "C#", "Java", "C++"};
            List<String> list3 = new ArrayList<>(Arrays.asList(array3));
            List<String> list4 = new ArrayList<>(Arrays.asList(array4));

            List<String> commonElementsStream = list3.stream()
                    .filter(list4::contains)
                    .collect(Collectors.toList());
            System.out.println("Common Elements using Streams: " + commonElementsStream);
        }
    }