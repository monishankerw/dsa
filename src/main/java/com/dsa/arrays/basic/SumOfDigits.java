package com.dsa.arrays.basic;

public  class SumOfDigits {
        public static void main(String[] args) {
            int n = 987; // Input number

            // Without Java 8 (Using While Loop)
            System.out.println("Sum using While Loop: " + sumUsingWhileLoop(n));

            // With Java 8 (Using Streams)
            System.out.println("Sum using Java 8 Streams: " + sumUsingJava8Streams(n));
        }

        // Method 1: Without Java 8 (Using While Loop)
        public static int sumUsingWhileLoop(int n) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10; // Extract last digit and add to sum
                n /= 10; // Remove last digit
            }
            return sum;
        }

        // Method 2: With Java 8 (Using Streams)
        public static int sumUsingJava8Streams(int n) {
            return String.valueOf(n) // Convert number to String
                    .chars() // Convert to IntStream of characters
                    .map(Character::getNumericValue) // Convert char to int
                    .sum(); // Sum up the digits
        }
    }