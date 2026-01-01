package com.dsa.arrays.basic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseAndPalindromeString {
    public static class ReverseString {
        public static void main(String[] args) {
            String str = "testing";
            String rev = "";
            reverseStrings(str, rev);
        }

        private static void reverseStrings(String str, String rev) {
            for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);
            }
            System.out.println(rev);
        }
    }

    public static class ReverseEachWordInString {
        public static void main(String[] args) {
            String str = "my name is abc";
            reverseEachWordInString(str);
        }

        private static void reverseEachWordInString(String str) {
            String[] words = str.split(" ");
            String result = "";
            for (String word : words) {
                String rev = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    rev += word.charAt(i);
                }
                result += rev + " ";
            }
            System.out.println(result.trim());
        }
    }

    public static class ReverseSentenceWithOutExtraSpace {
        public static void main(String[] args) {
            String str = "My name is ABC";
            String[] words = str.split(" ");
            String rev = " ";
            for (int i = words.length - 1; i >= 0; i--) {
                rev += words[i] + " ";
            }
            System.out.println(rev.trim());
        }
    }

    public static class PalindromicString {
        public static void main(String[] args) {
            String str = "madam";

            boolean isPalindrome = isPalindromicString(str);
            System.out.println("isPalindromicString: " + isPalindrome);
        }

        private static boolean isPalindromicString(String str) {
            String rev = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);
            }
            return str.equals(rev);
        }
    }


    public static class FindPalindromicWordInSentence {

        public static void main(String[] args) {
            String str = "madam teachers malayalam level civic java madam";

            findPalindromicWordInSentence(str);
            longestPalindromicWordInSentence(str);
        }

        // 1️⃣ Find all palindromic words (no duplicates)
        private static void findPalindromicWordInSentence(String str) {
            Set<String> set = new LinkedHashSet<>();
            String[] words = str.split("\\s+");

            for (String word : words) {
                if (isPalindromicString(word)) {
                    set.add(word);
                }
            }
            System.out.println("Palindromic Words: " + set);
        }

        // 2️⃣ Find longest palindromic word
        private static void longestPalindromicWordInSentence(String str) {
            String[] words = str.split("\\s+");
            String longest = "";

            for (String word : words) {
                if (isPalindromicString(word) && word.length() > longest.length()) {
                    longest = word;
                }
            }
            System.out.println("Longest Palindromic Word: " + longest);
        }

        // Utility method
        private static boolean isPalindromicString(String str) {
            String rev = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);
            }
            return str.equals(rev);
        }


        public static class LongestPalindromicString {
            public static void main(String[] args) {
                String str = "babad";
                String result = longestPalindromic(str);
                System.out.println("Result:" + result);
            }

            private static String longestPalindromic(String str) {
                if (str.isEmpty()) return " ";
                String longest = " ";
                for (int i = 0; i < str.length(); i++) {
                    String odd = expondAroundCenter(str, i, i);
                    String even = expondAroundCenter(str, i, i++);
                    String max = odd.length() > even.length() ? odd : even;
                    if (max.length() > longest.length()) {
                        longest = max;
                    }
                }
                return longest;
            }

            private static String expondAroundCenter(String str, int left, int right) {
                while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                    left--;
                    right++;
                }
                return str.substring(left + 1, right);
            }
        }

    }

    /*
    Check If String Can Become Palindrome

(Remove at most one character)
     */
    public static class ValidPalindrome {
        public static void main(String[] args) {
            System.out.println(canBePalindrome("abca"));
        }

        static boolean canBePalindrome(String s) {
            int l = 0, r = s.length() - 1;

            while (l < r) {
                if (s.charAt(l) != s.charAt(r)) {
                    return isPal(s, l + 1, r) || isPal(s, l, r - 1);
                }
                l++;
                r--;
            }
            return true;
        }

        static boolean isPal(String s, int l, int r) {
            while (l < r) {
                if (s.charAt(l++) != s.charAt(r--)) return false;
            }
            return true;
        }
    }

    /*
    Longest Palindromic Subsequence

    (Not necessarily continuous)
    Input: "bbbab"
    Output: 4   // "bbbb"

     */
    public static class LongestPalindromicSubsequence {
        public static void main(String[] args) {
            String s = "bbbab";
            System.out.println(lps(s));
        }

        static int lps(String s) {
            int n = s.length();
            int[][] dp = new int[n][n];

            for (int i = n - 1; i >= 0; i--) {
                dp[i][i] = 1;
                for (int j = i + 1; j < n; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = 2 + dp[i + 1][j - 1];
                    } else {
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                    }
                }
            }
            return dp[0][n - 1];
        }
    }


}


