package com.dsa.arrays.basic.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateQuestion {
    public static class RemoveDuplicateElements {
        public static void main(String[] args) {
            int[] arr = {1, 2, 1, 3, 4, 3, 5, 2, 6, 7, 8, 5};
            String str = "Java Developer";
            String strs = "This is new word in This new word";
            String str1 = "The quick brown fox jumps over the lazy dog.";
            String str2 = "machine";
            String s1 = "listen";
            String s2 = "slient";
            boolean isAnagram = anagrams(s1, s2);
            System.out.println(isAnagram ? "Anagram" : "Not Anagram");
            boolean pangramStrings = pangramStrings(str1);
            System.out.println(pangramStrings ? "Panagram String" : "Not Panagram String");
            boolean isogramStrings = isogramStrings(str2);
            System.out.println(isogramStrings ? "Isogram String" : "Not ISogram String");
            removeDuplicateElems(arr);
            removeDuplicateElemsJava8(arr);
            showDuplicate(arr);
            showDuplicateJava8(arr);
            showDuplicateCharacterString(str);
            showDuplicateSentence(strs);
            boolean hasDuplicate = checkDuplicates(arr);
            System.out.println(hasDuplicate ? "Duplicate Found" : "No Duplicate Found");

        }

        //TODO: 1.Check Anagram Strings
        private static boolean anagrams(String s1, String s2) {
            Map<Character, Integer> map1 = new HashMap<>();
            Map<Character, Integer> map2 = new HashMap<>();
            for (char ch1 : s1.toCharArray()) {
                map1.put(ch1, map1.getOrDefault(ch1, 0) + 1);
            }
            for (char ch2 : s2.toCharArray()) {
                map2.put(ch2, map2.getOrDefault(ch2, 0) + 1);
            }
            return map1.equals(map2);
        }

        //TODO: 5.Check for Isogram String
        private static boolean isogramStrings(String str2) {
            Set<Character> set = new HashSet<>();
            for (char ch : str2.toLowerCase().toCharArray()) {
                if (!set.add(ch)) {
                    return false;
                }
            }
            return true;
        }

        //TODO: 4.Check Pangram String
        private static boolean pangramStrings(String str1) {
            Set<Character> set = new HashSet<>();
            for (char ch : str1.toLowerCase().toCharArray()) {
                if (Character.isLetter(ch)) {
                    set.add(ch);
                    if (set.size() == 26) {
                        return true;
                    }
                }
            }
            return false;
        }

        // TODO: 6.Find Duplicate Words
        private static void showDuplicateSentence(String strs) {
            strs = strs.toLowerCase().replaceAll("[^a-z\\s]", "");
            String[] words = strs.split("\\s+");
            Map<String, Integer> map = new LinkedHashMap<>();
            for (String w : words) {
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println("Find Duplicate Words..." + entry.getKey() + ":" + entry.getValue());
                }
            }
        }

        private static void showDuplicateCharacterString(String str) {
            str = str.toLowerCase().replaceAll("\\s+", "");
            Set<Character> set = new HashSet<>();
            Set<Character> dup = new LinkedHashSet<>();
            for (char ch : str.toCharArray()) {
                if (!set.add(ch)) {
                    dup.add(ch);
                }
            }
            System.out.println(dup);
        }

        private static boolean checkDuplicates(int[] arr) {
            Set<Integer> set = new HashSet<>();
            for (int num : arr) {
                if (!set.add(num)) {
                    return true;
                }
            }
            return false;
        }

        //TODO: 2.Remove Duplicates from String
        private static void removeDuplicateElemsJava8(int[] arr) {
            Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
            System.out.println("Remove Duplicate.." + set);
        }

        private static void removeDuplicateElems(int[] arr) {
            Set<Integer> set = new HashSet<>();
            for (int num : arr) {
                set.add(num);
            }
            System.out.println("Remove Duplicate.." + set);
        }

        private static void showDuplicate(int[] arr) {
            Set<Integer> set = new HashSet<>();
            Set<Integer> dup = new HashSet<>();
            for (int num : arr) {
                if (!set.add(num)) {
                    dup.add(num);
                }
            }
            System.out.println("Show Duplicate.." + dup);
        }

        private static void showDuplicateJava8(int[] arr) {
            Set<Integer> set = new HashSet<>();
            Set<Integer> set1 = Arrays.stream(arr).filter(x -> !set.add(x)).boxed().collect(Collectors.toSet());
            System.out.println("Show Duplicate..." + set1);
        }


    }

    //TODO:7 Given two strings, find the common characters between them.
    public static class CommonCharactersHashSet {

        public static void main(String[] args) {
            String str1 = "programming";
            String str2 = "gaming";

            Set<Character> commonChars = findCommonCharacters(str1, str2);
            System.out.println("Common Characters: " + commonChars);
        }

        private static Set<Character> findCommonCharacters(String s1, String s2) {
            Set<Character> set1 = new HashSet<>();
            Set<Character> result = new HashSet<>();

            for (char ch : s1.toCharArray()) {
                set1.add(ch);
            }

            for (char ch : s2.toCharArray()) {
                if (set1.contains(ch)) {
                    result.add(ch);
                }
            }
            return result;
        }
    }

    //TODO:8 Check if String Contains Only Alphabets
    public static class OnlyAlphabets {

        public static void main(String[] args) {
            String str = "HelloWorld";

            System.out.println(onlyAlphabets(str) ? "Contains Only Alphabets" : "Contains Non-Alphabet Characters");
        }

        private static boolean onlyAlphabets(String str) {
            for (char ch : str.toCharArray()) {
                if (!Character.isLetter(ch)) {
                    return false;
                }
            }
            return true;
        }
    }
//TODO:9 Check if String Can Form a Palindrome

    public static class PalindromePermutation {

        public static void main(String[] args) {
            String str = "aabbc";

            System.out.println(canFormPalindrome(str) ? "Can Form Palindrome" : "Cannot Form Palindrome");
        }

        private static boolean canFormPalindrome(String str) {
            Set<Character> set = new HashSet<>();

            for (char ch : str.toLowerCase().toCharArray()) {
                if (Character.isLetter(ch)) {
                    if (!set.add(ch)) {
                        set.remove(ch);
                    }
                }
            }
            return set.size() <= 1;
        }
    }

    //TODO:10.Check for Subsequence
    public static class Subsequence {
        //TODO: Meaning
//
//A string s2 is a subsequence of s1 if all characters of s2
//appear in s1 in the same order, but not necessarily consecutively.
        public static void main(String[] args) {
            String str = "subsequence";
            String sub = "sue";

            System.out.println(isSubsequenceSet(str, sub) ? "Subsequence" : "Not a Subsequence");
        }

        //TODO:Logic
//
//Store characters of main string in LinkedHashSet
//
//Traverse subsequence string
//
//Each character must exist in sequence
        private static boolean isSubsequenceSet(String str, String sub) {
            Set<Character> set = new LinkedHashSet<>();

            // Add characters of main string
            for (char ch : str.toCharArray()) {
                set.add(ch);
            }

            // Check subsequence order
            int index = 0;
            for (char ch : set) {
                if (index < sub.length() && ch == sub.charAt(index)) {
                    index++;
                }
            }
            return index == sub.length();
        }
    }

    //TODO:12 Remove Special Characters
    public static class RemoveSpecialCharacters {

        public static String removeSpecial(String str) {
            Set<Character> allowed = new HashSet<>();

            for (char c = 'a'; c <= 'z'; c++) allowed.add(c);
            for (char c = 'A'; c <= 'Z'; c++) allowed.add(c);
            for (char c = '0'; c <= '9'; c++) allowed.add(c);

            StringBuilder sb = new StringBuilder();
            for (char ch : str.toCharArray()) {
                if (allowed.contains(ch)) {
                    sb.append(ch);
                }
            }
            return sb.toString();
        }

        public static void main(String[] args) {
            System.out.println(removeSpecial("He@llo#123!"));
        }
    }

    //TODO:13 Remove Digits from String
    public static class RemoveDigits {

        public static String removeDigits(String str) {
            Set<Character> digits = new HashSet<>();
            for (char c = '0'; c <= '9'; c++) digits.add(c);

            StringBuilder sb = new StringBuilder();
            for (char ch : str.toCharArray()) {
                if (!digits.contains(ch)) {
                    sb.append(ch);
                }
            }
            return sb.toString();
        }

        public static void main(String[] args) {
            System.out.println(removeDigits("Java123World45"));
        }
    }

    //TODO: 14 Count Occurrence of Substring
    public static class SubstringCountSet {

        public static int countSubstring(String str, String sub) {
            Set<Integer> indexes = new HashSet<>();

            for (int i = 0; i <= str.length() - sub.length(); i++) {
                if (str.substring(i, i + sub.length()).equals(sub)) {
                    indexes.add(i);
                }
            }
            return indexes.size();
        }

        public static void main(String[] args) {
            System.out.println(countSubstring("abababa", "aba"));
        }
    }

    //TODO:15 Check Palindromic Subsequence
    public static class PalindromicSubsequenceSet {
        /*
        Meaning

        Characters can be rearranged to form a palindrome subsequence.

        Rule:

        👉 At most one character can have odd frequency
         */
        public static boolean canFormPalindrome(String str) {
            Set<Character> set = new HashSet<>();

            for (char ch : str.toLowerCase().toCharArray()) {
                if (Character.isLetter(ch)) {
                    if (!set.add(ch)) {
                        set.remove(ch);
                    }
                }
            }
            return set.size() <= 1;
        }

        public static void main(String[] args) {
            System.out.println(canFormPalindrome("aabbc"));
        }
    }

    // TODO: 16 Longest Substring without Repeating char
    public static class LongestSubstring {

        public static void main(String[] args) {
            String str = "abcabcbb";

            int maxLen = 0;
            int left = 0;
            Set<Character> set = new HashSet<>();

            for (int right = 0; right < str.length(); right++) {
                char ch = str.charAt(right);

                // Remove characters until duplicate is gone
                while (set.contains(ch)) {
                    set.remove(str.charAt(left));
                    left++;
                }

                // ADD current character (this was the bug)
                set.add(ch);

                maxLen = Math.max(maxLen, right - left + 1);
            }

            System.out.println(maxLen);
        }
    }
//TODO:17 Count Pairs & Find Pairs with Given Sum (Target = 3)

    public static class PairSumUsingSet {

        public static void main(String[] args) {
            int[] arr = {1, 2, 4, -1, -6, -2};
            int target = 3;

            findPairs(arr, target);
        }

        private static void findPairs(int[] arr, int target) {
            Set<Integer> set = new HashSet<>();
            int count = 0;

            for (int num : arr) {
                int complement = target - num;

                if (set.contains(complement)) {
                    System.out.println("Pair: (" + complement + ", " + num + ")");
                    count++;
                }
                set.add(num);
            }

            System.out.println("Total Pairs = " + count);
        }
    }


    public static class PairSumUsingMap {

        public static void main(String[] args) {
            int[] arr = {1, 2, 4, -1, -6, -2};
            int target = 3;

            findPairs(arr, target);
        }

        private static void findPairs(int[] arr, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            int count = 0;

            for (int num : arr) {
                int complement = target - num;

                if (map.containsKey(complement) && map.get(complement) > 0) {
                    System.out.println("Pair: (" + complement + ", " + num + ")");
                    count++;
                }

                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            System.out.println("Total Pairs = " + count);
        }
    }

    public static class Intersection {
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4};
            int[] arr2 = {1, 2};
            intersections(arr1, arr2);
        }

        private static void intersections(int[] arr1, int[] arr2) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < arr1.length; i++) {
                set.add(arr1[i]);
            }
            for (int i = 0; i < arr2.length; i++) {
                if (set.contains(arr2[i])) {
                    System.out.println(arr2[i]);
                }
            }
        }
    }

    public static class Union {
        public static void main(String[] args) {
            int arr1[] = {1, 2, 3};
            int arr2[] = {2, 3, 4};
            unions(arr1, arr2);
        }

        private static void unions(int[] arr1, int[] arr2) {
            Set<Integer> set = new HashSet<>();
            for (int num : arr1)
                set.add(num);
            for (int num : arr2)
                set.add(num);
            System.out.println(set);
        }
    }

    public static class Subset {
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {3, 4, 12};
            int m = arr1.length;
            int n = arr2.length;
            if (isSubsets(arr1, arr2, m, n)) {
                System.out.println("arr2[] is a subset of arr1");
            } else {
                System.out.println("arr2[] is not subset of arr1[]");
            }
        }

        private static boolean isSubsets(int[] arr1, int[] arr2, int m, int n) {
            for (int i = 0; i < n; i++) {
                boolean found = false;
                for (int j = 0; j < m; j++) {
                    if (arr2[i] == arr1[j]) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    return false;
                }

            }
            return true;
        }
    }

    //TODO:18 Remove Consecutive Duplicates from String
    /*
    Remove only adjacent duplicates, not all duplicates.
    Correct Approach: LinkedHashSet + Previous Character
💡 Logic

Keep track of the previous character

Add current character only if it differs from previous

Use LinkedHashSet to preserve insertion order
     */
    public static class RemoveConsecutiveDuplicatesSet {

        public static void main(String[] args) {
            String str = "aaabbccdaa";
            System.out.println(removeConsecutiveDuplicates(str));
        }

        private static String removeConsecutiveDuplicates(String str) {
            if (str == null || str.length() == 0) return str;

            Set<Character> set = new LinkedHashSet<>();
            StringBuilder result = new StringBuilder();

            char prev = str.charAt(0);
            set.add(prev);
            result.append(prev);

            for (int i = 1; i < str.length(); i++) {
                char curr = str.charAt(i);

                if (curr != prev) {
                    set.add(curr);       // Set used as helper
                    result.append(curr);
                }
                prev = curr;
            }
            return result.toString();
        }
    }


    public static class StringProblemsUsingSet {

        public static void main(String[] args) {

            String sentence = "madam teachers malayalam level civic java madam";

            System.out.println("Sentence : " + sentence);
            System.out.println("--------------------------------");

            // 1. Longest word
            System.out.println("1. Longest Word : " + findLongestWord(sentence));

            // 2. Smallest word
            System.out.println("2. Smallest Word : " + findSmallestWord(sentence));

            // 3. Replace word
            System.out.println("3. Replace Word : " + replaceWord(sentence, "java", "python"));

            // 4. Swap first and last word
            System.out.println("4. Swap First & Last : " + swapFirstLastWord(sentence));

            // 5. Sort characters alphabetically
            System.out.println("5. Sorted Characters : " + sortCharacters("banana"));

            // 6. Shortest distance between words
            String[] words = sentence.split("\\s+");
            System.out.println("6. Shortest Distance (madam, java) : " + shortestDistance(words, "madam", "java"));

            // 7. Longest common prefix
            String[] arr = {"flower", "flow", "flight"};
            System.out.println("7. Longest Common Prefix : " + longestCommonPrefix(arr));

            // 8. All permutations
            System.out.println("8. Permutations of 'ABC' : " + findPermutations("ABC"));

            // 9. Lexicographically largest substring
            System.out.println("9. Largest Substring : " + largestSubstring("banana"));

            // 10. Longest repeating substring
            System.out.println("10. Longest Repeating Substring : " + longestRepeatingSubstring("banana"));
        }

        // 1️⃣ Find longest word
        static String findLongestWord(String sentence) {
            Set<String> set = new LinkedHashSet<>(Arrays.asList(sentence.split("\\s+")));
            String longest = "";

            for (String word : set) {
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }
            return longest;
        }

        // 2️⃣ Find smallest word
        static String findSmallestWord(String sentence) {
            Set<String> set = new LinkedHashSet<>(Arrays.asList(sentence.split("\\s+")));
            String smallest = null;

            for (String word : set) {
                if (smallest == null || word.length() < smallest.length()) {
                    smallest = word;
                }
            }
            return smallest;
        }

        // 3️⃣ Replace word
        static String replaceWord(String sentence, String oldWord, String newWord) {
            Set<String> set = new LinkedHashSet<>(Arrays.asList(sentence.split("\\s+")));
           /*
           Used to efficiently build the output string

Better than string concatenation in loops
            */
            StringBuilder sb = new StringBuilder();

            for (String word : set) {
                /*
                if (word.equals(oldWord)) {
    sb.append(newWord);
} else {
    sb.append(word);
}
sb.append(" ");

                 */
                sb.append(word.equals(oldWord) ? newWord : word).append(" ");
            }
            return sb.toString().trim();
        }

        // 4️⃣ Swap first and last word
        static String swapFirstLastWord(String sentence) {
            Set<String> set = new LinkedHashSet<>(Arrays.asList(sentence.split("\\s+")));
            List<String> list = new ArrayList<>(set);

            if (list.size() < 2) return sentence;

            Collections.swap(list, 0, list.size() - 1);
            return String.join(" ", list);
        }

        // 5️⃣ Sort characters alphabetically
        static String sortCharacters(String str) {
            Set<Character> set = new TreeSet<>();

            for (char ch : str.toCharArray()) {
                set.add(ch);
            }

            StringBuilder sb = new StringBuilder();
            for (char ch : set) {
                sb.append(ch);
            }
            return sb.toString();
        }

        // 6️⃣ Shortest distance between two words
        static int shortestDistance(String[] words, String w1, String w2) {
            int p1 = -1, p2 = -1, min = Integer.MAX_VALUE;

            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(w1)) p1 = i;
                if (words[i].equals(w2)) p2 = i;

                if (p1 != -1 && p2 != -1) {
                    min = Math.min(min, Math.abs(p1 - p2));
                }
            }
            return min;
        }

        // 7️⃣ Longest common prefix
        static String longestCommonPrefix(String[] strs) {
            Set<String> set = new HashSet<>(Arrays.asList(strs));
            String prefix = strs[0];

            while (!prefix.isEmpty()) {
                boolean match = true;
                for (String s : set) {
                    if (!s.startsWith(prefix)) {
                        match = false;
                        break;
                    }
                }
                if (match) return prefix;
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            return "";
        }

        // 8️⃣ Find all permutations
        static Set<String> findPermutations(String str) {
            Set<String> result = new HashSet<>();

            if (str.length() == 0) {
                result.add("");
                return result;
            }

            char first = str.charAt(0);
            Set<String> remaining = findPermutations(str.substring(1));

            for (String word : remaining) {
                for (int i = 0; i <= word.length(); i++) {
                    result.add(word.substring(0, i) + first + word.substring(i));
                }
            }
            return result;
        }
        public static class Permutation {
            public static void main(String[] args) {

                String str = "abc";
                List<String> perms = new ArrayList<>();
                generatePermss(str, "", perms);
                System.out.println(perms);

            }

            private static void generatePermss(String str, String prefix, List<String> perms) {
                if(str.isEmpty()){
                    perms.add(prefix);
                }else {
                    for (int i=0;i<str.length();i++){
                        String newPrefix=prefix+str.charAt(i);
                        String remaining=str.substring(0,i)+str.substring(i+1);
                        generatePermss(remaining,newPrefix,perms);
                    }
                }
            }
        }
        // 9️⃣ Lexicographically largest substring
        static String largestSubstring(String str) {
            Set<String> set = new HashSet<>();

            for (int i = 0; i < str.length(); i++) {
                set.add(str.substring(i));
            }
            return Collections.max(set);
        }

        // 🔟 Longest repeating substring
        static String longestRepeatingSubstring(String str) {
            Set<String> set = new HashSet<>();
            String longest = "";

            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j <= str.length(); j++) {
                    String sub = str.substring(i, j);
                    if (!set.add(sub) && sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
            return longest;
        }
    }

}

