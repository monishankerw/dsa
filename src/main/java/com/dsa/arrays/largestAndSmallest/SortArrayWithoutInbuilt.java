package com.dsa.arrays.largestAndSmallest;

public  class SortArrayWithoutInbuilt {
        public static void main(String[] args) {
            // Input array
            int[] array = {10, 5, 20, 63, 12, 57, 88, 60};
            int temp, size = array.length;

            // Manual sorting using nested loops
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            // Output sorted array
            System.out.print("Array sorted: ");
            for (int i : array) {
                System.out.print(i + " ");
            }

            // Print the 3rd largest element
            System.out.println("\nThird largest number is: " + array[size - 3]);
        }
    }

