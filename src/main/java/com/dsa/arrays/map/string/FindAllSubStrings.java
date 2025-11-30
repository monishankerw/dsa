package com.dsa.arrays.map.string;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubStrings {
    public static void main(String[] args) {

        String str = "abc";
        List<String> result = allSubString(str);
        System.out.println("OUTPUT: " + result);
        // OUTPUT: [a, ab, abc, b, bc, c]
    }

    private static List<String> allSubString(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.isEmpty())
            return result;

        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                result.add(str.substring(i, j)); // ✅ Correct
            }
        }
        return result;
    }
}
