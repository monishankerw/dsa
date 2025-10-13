package com.dsa.arrays.basic;

//23. subarrays
        public  class Subarrays {
            static int arr[] = {1, 2, 3, 4};

            // Method to print all subarrays
            public static void subArray(int n) {
                // Pick starting point
                for (int i = 0; i < n; i++) {
                    // Pick ending point
                    for (int j = i; j < n; j++) {
                        // Print subarray between i and j
                        for (int k = i; k <= j; k++) {
                            System.out.print(arr[k] + " ");
                        }
                        System.out.println(); // New line after each subarray
                    }
                }
            }

            public static void main(String[] args) {
                System.out.println("All Non-empty Subarrays:");
                subArray(arr.length);
            }
        }