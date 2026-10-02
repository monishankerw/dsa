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
    public static class ReverseString{
        public static void main(String[] args) {
            String str="testing";
           char[] result= reveseString(str.toCharArray());
            System.out.println(result);
        }

        private static char[]  reveseString(char[] str) {
            int left=0,right=str.length-1;
            while (left<right){
                char temp=str[left];
                str[left]=str[right];
                str[right]=temp;
                left++;
                right--;
            }
            return str;
        }
    }

    }