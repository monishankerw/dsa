package com.dsa.arrays.map.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapQuestion {
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
            return Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet()
                    .stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse("No");
        }

        private static String firstRepeatedWord(String str) {
            String[] words = str.toLowerCase().split("\\s+");
            Map<String, Integer> map = new LinkedHashMap<>();
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1)
                    return entry.getKey();
            }
            return "First Repeated Word";
        }
    }
}
