package com.dsa.set;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A {
    //TODO : Remove duplicate elements
    public static class RemoveDuplicate {
        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 1, 4, 3, 2};
            removeDuplicate(arr);
            Set<Integer> set = new HashSet<>();
            for (int num : arr) {
                set.add(num);
            }
            System.out.println(set);
        }

        private static void removeDuplicate(int[] arr) {
            Set<Integer> removeDup = Arrays.stream(arr).distinct().boxed().collect(Collectors.toSet());
            System.out.println(removeDup);
        }

        //TODO:Show Duplicate
        public static class ShowDuplicate {
            public static void main(String[] args) {
                int arr[] = {1, 2, 3, 1, 4, 3, 2};
                showDuplicates(arr);
                Set<Integer> set = new HashSet<>();
                Set<Integer> dup = new HashSet<>();
                for (int num : arr) {
                    if (!set.add(num)) {
                        dup.add(num);
                    }
                }
                System.out.println(dup);
            }

            private static void showDuplicates(int[] arr) {
                Set<Integer> set = new HashSet<>();
                Set<Integer> dup = Arrays.stream(arr).filter(x -> !set.add(x)).boxed().collect(Collectors.toSet());
                System.out.println(dup);
            }
        }

        //TODO: Check Number is duplicate
        public static class CheckDup {
            public static void main(String[] args) {
                int arr[] = {1, 2, 3, 1, 2, 3, 4, 5, 6};
                boolean isDuplicate = isDuplicatePresent(arr);
                System.out.println(isDuplicate ? "Duplicate Found" : "No Duplicate Found");
            }

            private static boolean isDuplicatePresent(int[] arr) {
                Set<Integer> set = new HashSet<>();
                for (int num : arr) {
                    if (!set.add(num)) {
                        return true;
                    }
                }
                return false;
            }
        }

        //TODO:Duplicate character in string
        public static class DupCharact {
            public static void main(String[] args) {
                String str = "java Developer";
                duplicateCharacter(str);
                String s = str.toLowerCase().replaceAll("\\s+", "");
                Set<Character> set = new HashSet<>();
                Set<Character> dup = new HashSet<>();
                for (char c : s.toCharArray()) {
                    if (!set.add(c)) {
                        dup.add(c);
                    }
                }
                System.out.println(dup);

            }

            private static void duplicateCharacter(String str) {
                String s = str.toLowerCase().replaceAll("\\s+", "");
                    LinkedHashMap<Character, Long> map = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
                List<Character> list = map.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).toList();
                System.out.println(list);
            }
        }
    }

    //TODO: Find Duplicate Words In Sentence
    public static class DuplicateWord {
        public static void main(String[] args) {
            String sentence = "This is new word in This new word";
            duplicateJava8(sentence);
            String[] words = sentence.toLowerCase().split("\\s+");
            Map<String, Integer> map = new LinkedHashMap<>();
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println("Duplicate word:" + entry.getKey() + ":" + entry.getValue());
                }
            }
        }

        private static void duplicateJava8(String sentence) {
            String[] words = sentence.toLowerCase().split("\\s+");
            LinkedHashMap<String, Long> map = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
            List<String> list = map.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).toList();
            System.out.println(list);
        }
    }

    //TODO:Find Longest Word
    public static class LongestWord {
        public static void main(String[] args) {
            String sentence = "This is new word in This new word";
            Set<String> set = new LinkedHashSet<>(Arrays.asList(sentence.split("\\s+")));
            String lonWord = "";
            for (String words : set) {
                if (words.length() > lonWord.length()) {
                    lonWord = words;
                }
            }
            System.out.println("Longest word:" + lonWord);

        }
    }

    //TODO:Find Smallest Word
    public static class SmallestWord {
        public static void main(String[] args) {
            String sentence = "This is new word in This new word";
            String sents = "madam teachers malayalam level civic java madam";
            sentence = swapFirstLastWord(sents);
            System.out.println(sentence);
            rplaceWord(sentence, "is", "si");
            Set<String> set = new LinkedHashSet<>(Arrays.asList(sentence.split("\\s+")));
            String smallWord = null;
            for (String words : set) {
                if (smallWord == null || words.length() < smallWord.length()) {
                    smallWord = words;
                }
            }
            System.out.println("Smallest word:" + smallWord);

        }

        //TODO: Replace Word
        private static void rplaceWord(String sentence, String is, String si) {
            Set<String> set = new LinkedHashSet<>(Arrays.asList(sentence.split("\\s+")));
            StringBuilder sb = new StringBuilder();
            for (String words : set) {
                sb.append(words.replace(is, si));
            }
            System.out.println(sb);
        }
    }

    //TODO: Union of two sets
    public static class Union {
        public static void main(String[] args) {
            int arr1[] = {1, 2, 3};
            int arr2[] = {2, 3, 4};
            Set<Integer> set = new HashSet<>();
            for (int num : arr1)
                set.add(num);
            for (int num : arr2)
                set.add(num);
            System.out.println(set);
        }
    }


    //TODO:Find Common character
    public static class CommonChar {
        public static void main(String[] args) {
            String s1 = "programming";
            String s2 = "gaming";
            Set<Character> set1 = new HashSet<>();
            Set<Character> result = new HashSet<>();
            for (char c : s1.toCharArray()) {
                /*
                Converts a String → character array
                Because:
              Strings are immutable
              Arrays are easier to iterate and modify
                 */
                set1.add(c);
            }
            for (char c : s2.toCharArray()) {
                if (set1.contains(c)) {
                    /*
                    “Check if something exists inside a collection or string”
                    String s = "hello world";
                       System.out.println(s.contains("hello")); // true
                       System.out.println(s.contains("abc"));   // false
                     */
                    result.add(c);
                }
            }
            System.out.println(result);
        }
    }

    //TODO:Intersection of two sets
    public static class Intersection {
        public static void main(String[] args) {
            int arr1[] = {1, 2, 3, 4};
            int arr2[] = {1, 2,7};
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

    //TODO:Find Isogram String
    public static class IsogramString {
        public static void main(String[] args) {
            String str = "machine";
            boolean isogram = isogramString(str);
            System.out.println(isogram ? "Isogram String" : "Not Isogram String");
        }

        private static boolean isogramString(String str) {
            Set<Character> set = new HashSet<>();
            for (char c : str.toCharArray()) {
                if (!set.add(c)) {
                    return false;
                }
            }
            return true;
        }
    }

    //TODO: Check Pangram string
    public static class PangramString {
        public static void main(String[] args) {
            String str1 = "The quick brown fox jumps over the lazy dog.";
            System.out.println(pangramsStrings(str1) ? "Pangram String" : "Not Pangram String");
        }

        private static boolean pangramsStrings(String str1) {
            Set<Character> set = new HashSet<>();
            for (char c : str1.toCharArray()) {
                if (Character.isLetter(c)) {
                    set.add(c);
                    if (set.size() == 26) {
                        return true;
                    }
                }
            }
            return false;
        }
    }


    //TODO: Check if String can from a Palindrome
    public static class CheckPalindrome {
        public static void main(String[] args) {
            String str = "aabc";
            boolean isPalindrome = checkPalindrome(str);
            System.out.println(isPalindrome ? "Palindrome String" : "Non Palindrome Str");
        }

        private static boolean checkPalindrome(String str) {
            Set<Character> set = new HashSet<>();
            for (char c : str.toLowerCase().toCharArray()) {
                if (Character.isLetter(c)) {
                    if (!set.add(c)) {
                        set.remove(c);
                    }
                }
            }
            return set.size() <= 1;
        }
    }

    // TODO:Longest Substring
    public static class LongestSubstring {
        public static void main(String[] args) {
            String str = "banana";
            String isLongestSubstring = longestsSubstring(str);
            System.out.println(isLongestSubstring);
        }

        private static String longestsSubstring(String str) {
            Set<String> set = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                set.add(str.substring(i));
            }
            return Collections.max(set);
        }
    }

    //TODO:Longest Repeating SubString
    public static class LongestRepeatingSubstring {
        public static void main(String[] args) {
            String str = "banana";
            String s = sortCharacters(str);
            System.out.println(s);
            String isLongestRepeatingSubstring = longestsRepeatingSubstring(str);
            System.out.println(isLongestRepeatingSubstring);
        }

        private static String longestsRepeatingSubstring(String str) {
            Set<String> set = new HashSet<>();
            String longest = "";
            for (int i = 0; i <= str.length(); i++) {
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

    // 4️⃣ Swap first and last word
    static String swapFirstLastWord(String sentence) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList(sentence.split("\\s+")));
        List<String> list = new ArrayList<>(set);

        if (list.size() < 2) return sentence;

        Collections.swap(list, 0, list.size() - 1);
        return String.join(" ", list);
    }

    //TODO:Find All Permutations
    public static class Permutation {
        public static void main(String[] args) {

            String str = "abc";
            List<String> perms = new ArrayList<>();
            generatePermss(str, "", perms);
            System.out.println(perms);

        }
/*
What is substring()?
It is a method of the Java String class used to extract a part of a string.

✅ Syntax
1️⃣ Single parameter
str.substring(beginIndex)
Returns substring from beginIndex → end
2️⃣ Two parameters
str.substring(beginIndex, endIndex)
 Returns substring from beginIndex → endIndex - 1
 String s = "abcdef";
System.out.println(s.substring(2)); ----> cdef
String s = "abcdef";
System.out.println(s.substring(2, 5));---> cde
 */
        private static void generatePermss(String str, String prefix, List<String> perms) {
            if (str.isEmpty()) {
                perms.add(prefix);
            } else {
                for (int i = 0; i < str.length(); i++) {
                    String newPrefix = prefix + str.charAt(i);

                    String remaining = str.substring(0, i) + str.substring(i + 1);
                    generatePermss(remaining, newPrefix, perms);
                }
            }
        }
    }

    //TODO: Longest Common Prefix
    public static class LongestCommonPrefix {
        public static void main(String[] args) {
            String[] arr = {"flower", "flow", "flight"};
            String longestPrefix = longestCommonPrefix(arr);
            System.out.println(longestPrefix);
        }

        static String longestCommonPrefix(String[] strs) {
            String prefix = strs[0];

            for (int i = 1; i < strs.length; i++) {
                while (!strs[i].startsWith(prefix)) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                }
            }
            return prefix;
        }

    }

    public static class CountPair {
        public static void main(String[] args) {
            int arr[] = {1, 2, 4, -1, -6, -2};
            int sum = 3;

            countpair(arr, sum);
            findPair(arr, sum);
        }

        private static void countpair(int[] arr, int sum) {
            Set<Integer> set = new HashSet<>();
            Set<String> seen = new HashSet<>();
            int count = 0;

            for (int num : arr) {
                int target = sum - num;

                if (set.contains(target)) {
                    String key = Math.min(num, target) + ":" + Math.max(num, target);

                    if (!seen.contains(key)) {
                        seen.add(key);
                        count++;
                    }
                }
                set.add(num);
            }

            System.out.println("Count = " + count);
        }

        private static void findPair(int[] arr, int sum) {
            Set<Integer> set = new HashSet<>();

            for (int num : arr) {
                int target = sum - num;

                if (set.contains(target)) {
                    System.out.println("Pair: (" + target + ", " + num + ")");
                }

                set.add(num);
            }
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
            //This will store starting indexes where substring is found.
            Set<Integer> indexes = new HashSet<>();
/*
str.length() = 7
sub.length() = 3
Loop runs: i = 0 → 4
i + sub.length() must not exceed string length
 */
            for (int i = 0; i <= str.length() - sub.length(); i++) {
                //  Step 3: Extract Substring & Compare
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


    public static class CountVowelSubStringOfaString {

        public static void main(String[] args) {
            String str = "aeiouu";
            int result = countVowelSubstrings(str);
            System.out.println("Count of vowel substrings containing all vowels: " + result);
        }

        private static int countVowelSubstrings(String word) {
            int count = 0;
            int n = word.length();

            for (int i = 0; i < n; i++) {
                Set<Character> set = new HashSet<>();

                for (int j = i; j < n; j++) {
                    char ch = word.charAt(j);

                    // stop if non-vowel character appears
                    if (!isVowel(ch)) break;

                    set.add(ch);

                    // if all 5 vowels present, count this substring
                    if (set.size() == 5) count++;
                }
            }
            return count;
        }

        private static boolean isVowel(char ch) {
            return "aeiou".indexOf(ch) != -1;
        }
    }

    // TODO: Longest Substring without Repeating char
    public static class LongestSubstringWithout {

        public static void main(String[] args) {
            /*
            Step 1: Problem Understanding

“We need to find the length of the longest substring without repeating characters.”
             */
            String s = "abcabcbb";
/*
Step 2: Approach Selection

“I’ll use a Sliding Window approach with two pointers (left and right) and a HashMap to track characters.”
Step 3: Why HashMap?

“I use a HashMap<Character, Integer> to store:
character → last seen index
This helps me quickly detect duplicates and adjust the window.”
 */
            Map<Character, Integer> map = new HashMap<>();
            /*
            Step 4: Initialize Variables
            left represents the start of the window, and maxLen stores the result.”
             */
            int left = 0, maxLen = 0;
/*
Step 5: Traverse String

“I iterate the string using a right pointer.”
 */
            for (int right = 0; right < s.length(); right++) {
                /*
                Step 6: Handle Each Character
                 */
                char ch = s.charAt(right);
/*
tep 7: Use containsKey() (IMPORTANT 🔥)

“I check if the character already exists in the map using containsKey().”
Say this clearly:

“If the character is already present, it means we found a duplicate.
So I move the left pointer to one position ahead of the last occurrence of that character.”
 */
                if (map.containsKey(ch)) {
                    left = Math.max(left, map.get(ch) + 1);
                }
/*
Step 8: Update Map
“I update the latest index of the character.”
 */
                map.put(ch, right);
                /*
                Step 9: Update Result
                “I calculate the current window size and update the maximum length.”
                 */
                maxLen = Math.max(maxLen, right - left + 1);
            }

//Step 10: Return Result
            System.out.println(maxLen);
        }
    }

    //TODO:  longest substring that contains at most K distinct characters.
    /*
    Step 1: Problem Understanding
    "We need to find the longest substring that contains at most K distinct characters."
    Step 2: Approach (Sliding Window)
    "I’ll use a sliding window approach with two pointers (left and right)."
    Step 3: Data Structure Choice
    "I use a HashMap to store character frequencies, so I can track how many times each character appears in the current window."
    Step 4: Expand Window
    "I move the right pointer forward and add characters into the map."
    Step 5: Shrink Window
    "If the number of distinct characters exceeds K, I shrink the window from the left until it becomes valid again."
    Step 6: Track Answer
    "At each step, I calculate the window size and update the maximum length."
     */
    public static class LongestSubstringWithKDistinct {

        public static void main(String[] args) {

            String str = "eceba";
            int k = 2;

            System.out.println("Longest substring length: " + longestSubstringWithKDistinct(str, k));
        }

        private static int longestSubstringWithKDistinct(String s, int k) {

            Map<Character, Integer> map = new HashMap<>();

            int left = 0;
            int maxLen = 0;

            for (int right = 0; right < s.length(); right++) {

                char rightChar = s.charAt(right);
                map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

                while (map.size() > k) {
                    char leftChar = s.charAt(left);
                    map.put(leftChar, map.get(leftChar) - 1);

                    if (map.get(leftChar) == 0) {
                        map.remove(leftChar);
                    }
                    left++;
                }

                maxLen = Math.max(maxLen, right - left + 1);
            }

            return maxLen;
        }
    }
}



