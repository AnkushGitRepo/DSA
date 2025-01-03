package org.example.Leetcode_Daily.January;

import java.util.*;

public class Jan_03_NumberOfWaysToSplitArray {
    public static void main(String[] args) {
        System.out.println("Leetcode January Challenge");
        System.out.println("LeetCode 2570. Number of Ways to Split an Array");
        int[] nums = {1, 1, 1};
        System.out.println("Number of Ways to Split an Array: ");
        System.out.println("Input Array: ");
        printArray(nums);
        int result = waysToSplit(nums);
        System.out.println("Number of Ways to Split an Array: " + result);
        int[] nums1 = {1, 2, 2, 2, 5, 0};
        System.out.println("Number of Ways to Split an Array: ");
        System.out.println("Input Array: ");
        printArray(nums1);
        int result1 = waysToSplit(nums1);
        System.out.println("Number of Ways to Split an Array: " + result1);
        System.out.println("\n\n");
    }

    // Helper Method for printing array
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Date : 03/01/2025
    // LeetCode : 2570. Number of Ways to Split an Array
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int waysToSplit(int[] nums){
        long right = 0;
        long left = 0;

        for (int num : nums){
            right += num;
        }

        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++){
            left += nums[i];
            right -= nums[i];
            if (left >= right) count++;
        }

        return count;
    }

}
