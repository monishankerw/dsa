package com.dsa.dsa;

public class TwoPointer {

    public static class TwoSumInSortedArray {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 9};
            int target = 10;
            int[] result = twoSum(arr, target);
            System.out.println("TwoPointer: " + result[0] + ", " + result[1]);
        }

        private static int[] twoSum(int[] arr, int target) {
            // Two Pointer
            int left = 0;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) {
                    return new int[]{left, right};
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
            return new int[]{-1, -1};
        }
    }

    public static class ReverseArray {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int[] result = reverseArrays(arr);
            for (int num : result) {
                System.out.print(num + " ");
            }
        }

        private static int[] reverseArrays(int[] arr) {
            int left = 0;
            int right = arr.length - 1;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            return arr;
        }
    }

    public static class ReverseString {
        public static void main(String[] args) {
            String str = "testing";
            char[] result = reveseString(str.toCharArray());
            System.out.println(result);
        }

        private static char[] reveseString(char[] str) {
            int left = 0, right = str.length - 1;
            while (left < right) {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
            return str;
        }
    }

    public static class PalindromeString {
        public static void main(String[] args) {
            String str = "madam";
            System.out.println(isPalndrome(str));
        }

        private static boolean isPalndrome(String str) {
            char[] c = str.toLowerCase().toCharArray();
            int left = 0, right = c.length - 1;
            while (left < right) {
                if (c[left] != c[right]) {
                    return false;
                }
                left++;
                right--;

            }
            return true;
        }
    }

    /*
    Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
     */
    public static class ValidPalindromic {
        public static void main(String[] args) {
            String str = "A man, a plan, a canal: Panama";
            System.out.println(isValidPalindromic(str));
        }

        private static boolean isValidPalindromic(String str) {
            int left = 0, right = str.length() - 1;
            while (left < right) {
                // Skip non-alphanumeric from left
                while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                    left++;
                }
/*
isLetterOrDigit()

A-Z → true
a-z → true
0-9 → true

space → false
,     → false
:     → false
@     → false
 */
                // Skip non-alphanumeric from right
                while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                    right--;
                }

                // Compare characters ignoring case
                if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}