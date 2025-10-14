package com.dsa.string;

public class IsSubString {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "ell";

        boolean result = isSubstring(str1, str2);
        System.out.println("Is \"" + str2 + "\" a substring of \"" + str1 + "\"? " + result);
    }

    private static boolean isSubstring(String str1, String str2) {
        // ✅ Handle null or empty cases safely
        if (str1 == null || str2 == null || str2.isEmpty()) {
            return false;
        }
        return str1.contains(str2);
    }
}
