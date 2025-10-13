package com.dsa.arrays.basic;

//22. trappping rainwater
    public  class TrappingRainwater {
    public static void main(String[] args) {
        int arr[] = {6, 9, 9};
        System.out.println("Maximum Trapped Water: " + maxTrappingWater(arr));
    }

    private static int maxTrappingWater(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0; // No trapping possible with less than 3 elements

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Fill leftMax array
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        // Fill rightMax array
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        // Calculate total water trapped
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        return totalWater;
    }
}
