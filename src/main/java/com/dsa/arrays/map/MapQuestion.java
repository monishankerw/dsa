package com.dsa.arrays.map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapQuestion {
    public static class EvenOdd {
        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 4, 6, 3);
            Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
            System.out.println("Even::" + map.get(true));
            System.out.println("Odd::" + map.get(false));
        }
    }

    public static class FreqOccString {
        public static void main(String[] args) {
            String str = "tertsrttewrteew";
            Map<Character, Integer> map = freqOccString(str);
            System.out.println("Freq Occ:" + map);
            Map<String, Long> map1 = freqOccStringJava8(str);
            System.out.println("Freq Occ:" + map1);

        }

        private static Map<String, Long> freqOccStringJava8(String str) {
            return Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        }

        private static Map<Character, Integer> freqOccString(String str) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : str.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            return map;
        }
    }

    public static class FreqOcc {
        public static void main(String[] args) {
            int[] arr = {1, 2, 1, 3, 2, 3, 4, 1, 2, 5};
            freqOcc(arr);
            freqOccJava8(arr);
        }

        private static void freqOccJava8(int[] arr) {
            Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
            System.out.println(map);
        }

        private static void freqOcc(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            System.out.println(map);
        }
    }

    public static class MostFreqElements {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 1, 2, 6, 7, 5, 4, 5};
            mostFreqElements(arr);
        }

        private static void mostFreqElements(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int mostFreq = -1, maxCount = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mostFreq = entry.getKey();
                }
            }
            System.out.println(mostFreq);
        }
    }

    public static class ElementAppearingExactlyKTime {
        public static void main(String[] args) {
            int[] arr = {1, 2, 2, 3, 3, 3};
            int k = 2;
            elementAppearingExactlyKTime(arr, k);
            elementAppearingExactlyKTimeJava8(arr, k);
        }

        private static void elementAppearingExactlyKTimeJava8(int[] arr, int k) {
            Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
            List<Integer> list = map.entrySet().stream().filter(e -> e.getValue() == k).map(Map.Entry::getKey).toList();
            System.out.println(list);
        }

        private static void elementAppearingExactlyKTime(int[] arr, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            List<Integer> list = map.entrySet().stream().filter(e -> e.getValue() == k).map(Map.Entry::getKey).toList();
            System.out.println(list);
        }
    }

    public static class FreqOccWords {
        public static void main(String[] args) {
            String str = "Test I Test My Test abc";
            Map<String, Integer> map = frequencyOccWords(str);
            System.out.println("Frequency Occ Words:" + map);
            Map<String, Long> mapJava8 = frequencyOccWordsJava8(str);
            System.out.println("Frequency Occ Words:" + mapJava8);

        }

        private static Map<String, Long> frequencyOccWordsJava8(String str) {
            String[] words = str.split("\\s+");
            Map<String, Long> map = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            return map;
        }

        private static Map<String, Integer> frequencyOccWords(String str) {
            String[] words = str.split("\\s+");
            System.out.println(Arrays.toString(words));
            Map<String, Integer> map = new HashMap<>();
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            return map;
        }
    }

    public static class FreqOccChar {
        public static void main(String[] args) {
            char[] ch = {'a', 'a', 'd', 'w', 't', 't', 'e', 'q'};
            freqOccChar(ch);
            freqOccCharJava8(ch);

        }

        private static void freqOccCharJava8(char[] ch) {
            Map<Character, Long> map = new String(ch).chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            map.forEach((k, v) -> System.out.println(k + ":" + v));
        }


        private static void freqOccChar(char[] ch) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : ch) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.println(entry.getValue() + ":" + entry.getKey());

            }

        }
    }

    public static class Anagram {
        public static void main(String[] args) {
            String s1 = "listen";
            String s2 = "slient";
            boolean isAnagram = anagram(s1, s2);
            System.out.println(isAnagram ? "Anagram" : "Not Anagram");

        }

        private static boolean anagram(String s1, String s2) {
            boolean result = getFreqOcc(s1).equals(getFreqOcc(s2));
            return result;
        }

        private static Map<Character, Long> getFreqOcc(String s1) {
            return s1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        }
    }

    public static class AnagramNumber {
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {2, 3, 1};
            boolean isAnagram = anagramNumber(arr1, arr2);
            System.out.println(isAnagram ? "Anagram.." : "Not Anagram");
        }

        private static boolean anagramNumber(int[] arr1, int[] arr2) {
            if (arr1.length != arr2.length) {
                return false;
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static class FirstRepeatedWords {
        public static void main(String[] args) {
            String str = "Java is fun and java is popular";
            String map = firstRepeatedWords(str);
            System.out.println(map);
            String map1 = firstRepeatedWordsJava8(str);
            System.out.println(map1);
        }

        private static String firstRepeatedWordsJava8(String str) {
            String[] words = str.toLowerCase().split("\\s+");
            Map<String, Long> freqMap = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            return freqMap.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).findFirst().orElse("No Repeated..");
        }


        private static String firstRepeatedWords(String str) {
            String[] words = str.toLowerCase().split("\\s+");
            Map<String, Integer> map = new LinkedHashMap<>();
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    return entry.getKey();
                }

            }
            return "First rep";
        }
    }

    public static class FirstNonRepeatedChars {
        public static void main(String[] args) {
            String str = "swiss";
            String map = firstNonRepeatedChars(str);
            System.out.println("FirstNonRepeatedChars>......" + map);
            String map1 = firstNonRepeatedCharsJava8(str);
            System.out.println("FirstNonRepeatedChars>......" + map1);
        }

        private static String firstNonRepeatedCharsJava8(String str) {
            return str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().map(String::valueOf)     // convert Character → String
                    .orElse("No...");         // fallback string
        }


        private static String firstNonRepeatedChars(String str) {
            Map<Character, Integer> map = new LinkedHashMap<>();
            for (char ch : str.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    return String.valueOf(entry.getKey());
                }
            }
            return "Non Repeated..";
        }
    }


    public static class FirstNonRepeatingNumber {
        public static void main(String[] args) {
            int[] arr = {1, 2, 1, 3, 2, 4, 4, 5, 6};
            firstNonRepeatingNumber(arr);
            firstNonRepeatingNumberJava8(arr);
        }

        private static void firstNonRepeatingNumberJava8(int[] arr) {
            Optional<Map.Entry<Integer, Long>> first = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).findFirst();
            System.out.println(first);
        }

        private static void firstNonRepeatingNumber(int[] arr) {
            Map<Integer, Integer> map = new LinkedHashMap<>();

            // Count frequency
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            // Find first non-repeating
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    System.out.println(entry.getKey());
                    return; // ✅ exit after first non-repeating number
                }
            }

            System.out.println("No non-repeating number found");
        }
    }

    public static class FirstRepeatedWord {
        public static void main(String[] args) {
            String str = "Java is fun and java is popular";
            String map = firstRepeatedWord(str);
            System.out.println(map);
            String map1 = firstRepeatedWordJava8(str);
            System.out.println(map1);

        }

        private static String firstRepeatedWordJava8(String str) {
            String[] words = str.toLowerCase().split("\\s+");
            return Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse("No");
        }

        private static String firstRepeatedWord(String str) {
            String[] words = str.toLowerCase().split("\\s+");
            Map<String, Integer> map = new LinkedHashMap<>();
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) return entry.getKey();
            }
            return "First Repeated Word";
        }
    }

    public static class AllNonRepeatedWord {
        public static void main(String[] args) {
            String str = "hello world java hello code world";
            String result = allNonRepeatedWord(str);
            System.out.println("AllNonRepeatedWord.." + result);
            allNonRepeatedWordJava8(str);

        }

        private static void allNonRepeatedWordJava8(String str) {
            Arrays.stream(str.toLowerCase().split("\\s+")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).forEach(System.out::println);
        }

        private static String allNonRepeatedWord(String str) {
            String[] words = str.toLowerCase().split("\\s+");
            Map<String, Integer> map = new LinkedHashMap<>();
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    System.out.println(entry.getKey());
                }
            }
            return "All Non Repeated Words..";
        }
    }

    public static class AllNonRepeatedChar {
        public static void main(String[] args) {
            String str = "hello world java";

            String result = allNonRepeatedChar(str);
            System.out.println(result);

            List<Character> results = allNonRepeatedCharJava8(str);
            System.out.println(results);
        }

        // Java 8 Approach
        private static List<Character> allNonRepeatedCharJava8(String str) {
            return str.chars().mapToObj(c -> (char) c).filter(c -> c != ' ') // ignore spaces
                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        }

        // Classic Approach
        private static String allNonRepeatedChar(String str) {
            Map<Character, Integer> map = new LinkedHashMap<>();

            for (char ch : str.toCharArray()) {
                if (ch != ' ') map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            List<Character> result = new ArrayList<>();

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) result.add(entry.getKey());
            }

            return result.toString();
        }
    }

    public static class IndexOfFirstNonRepeatedChar {
        public static void main(String[] args) {
            String str = "swiss";

            System.out.println("Classic Approach: " + indexOfFirstNonRepeatedChar(str));
            System.out.println("Java 8 Stream Approach: " + indexOfFirstNonRepeatedCharJava8(str));
        }

        // ✅ Classic Approach
        private static int indexOfFirstNonRepeatedChar(String str) {
            str = str.toLowerCase();
            Map<Character, Integer> map = new LinkedHashMap<>();

            // Step 1: Count frequency
            for (char c : str.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            // Step 2: Find first character with frequency 1
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    return str.indexOf(entry.getKey());  // return the index, NOT the character
                }
            }

            return -1; // Not found
        }


        // ✅ Java 8 Stream Approach
        private static int indexOfFirstNonRepeatedCharJava8(String str) {
            str = str.toLowerCase();

            Map<Character, Long> freqMap = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

            Optional<Character> first = freqMap.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst();

            String finalStr = str;
            return first.map(ch -> finalStr.indexOf(ch)).orElse(-1);
        }
    }

    public static class IndexOfFirstRepeatedChar {
        public static void main(String[] args) {
            String str = "programming";

            System.out.println("Classic Approach: " + indexOfFirstRepeatedChar(str));
            System.out.println("Java 8 Stream Approach: " + indexOfFirstRepeatedCharJava8(str));
        }

        // ✅ Classic Approach
        // ✅ Classic Approach using Map
        private static int indexOfFirstRepeatedChar(String str) {
            str = str.toLowerCase();
            Map<Character, Boolean> map = new HashMap<>();

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (map.containsKey(c)) {
                    return i; // this is the first repeated character index
                }

                map.put(c, true); // mark character as seen
            }

            return -1; // no repeated character found
        }


        // ✅ Java 8 Stream Approach (returns index)
        private static int indexOfFirstRepeatedCharJava8(String str) {
            str = str.toLowerCase();

            // Count character frequencies
            Map<Character, Long> freqMap = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

            // Find first repeated char (freq > 1)
            Optional<Character> firstRepeated = freqMap.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).findFirst();

            String finalStr = str;
            return firstRepeated.map(ch -> finalStr.indexOf(ch, finalStr.indexOf(ch) + 1)).orElse(-1);
        }
    }

    public static class CharWithMinOcc {
        public static void main(String[] args) {
            String str = "successfully";

            System.out.println("Classic Approach: " + charWithMinOcc(str));
            System.out.println("Java 8 Stream Approach: " + charWithMinOccJava8(str));
        }

        // ✅ Classic Map-based approach
        private static char charWithMinOcc(String str) {
            str = str.toLowerCase().replaceAll("\\s+", ""); // normalize input

            Map<Character, Integer> map = new LinkedHashMap<>();
            for (char c : str.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            char minChar = 0;
            int minCount = Integer.MAX_VALUE;

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() < minCount) {
                    minCount = entry.getValue();
                    minChar = entry.getKey();
                }
            }

            return minChar;
        }

        // ✅ Java 8 Stream-based approach
        private static char charWithMinOccJava8(String str) {
            return new String(str.toLowerCase().replaceAll("\\s+", "")).chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().min(Map.Entry.comparingByValue()) // find min by occurrence
                    .map(Map.Entry::getKey).orElse(' ');
        }
    }

    public static class MergeTwoSortedElements {
        public static void main(String[] args) {
            int[] arr1 = {1, 3, 5, 6};
            int[] arr2 = {2, 3, 6, 8};
            mergeTwoSortedElements(arr1, arr2);
            int[] result = mergeTwoSortedElementsJava8(arr1, arr2);
            System.out.println(Arrays.toString(result));
        }

        private static void mergeTwoSortedElements(int[] arr1, int[] arr2) {
            Map<Integer, Integer> map = new TreeMap<>();

            // Count frequencies from arr1
            for (int num : arr1) {
                map.merge(num, 1, Integer::sum);
            }

            // Count frequencies from arr2
            for (int num : arr2) {
                map.merge(num, 1, Integer::sum);
            }

            // Prepare result array
            int[] result = new int[arr1.length + arr2.length];
            int index = 0;

            // Fill result based on sorted keys and their counts
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();

                while (value-- > 0) {
                    result[index++] = key;
                }
            }

            System.out.println(Arrays.toString(result));
        }

    }

    private static int[] mergeTwoSortedElementsJava8(int[] arr1, int[] arr2) {

        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)) // join streams
                .sorted()                                                 // sort values
                .toArray();                                               // convert to array
    }

}
