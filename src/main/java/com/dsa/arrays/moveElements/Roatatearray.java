package com.dsa.arrays.moveElements;

//16.rotates arrays
    public  class Roatatearray {
        public static void main(String[] args) {
            int[] arr = new int[]{1, 2, 3, 4, 5};
            int n = 3, j;
            for (int i = 0; i < n; i++) {
                int first = arr[0];
                for (j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }

                arr[j] = first;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }