import java.util.Arrays;

class MaximumConsecutiveFloorsWithoutSpecialFloors{
    // 2274. Maximum Consecutive Floors Without Special Floors
    // https://leetcode.com/problems/maximum-consecutive-floors-without-special-floors/
    // Time complexity: O(nlogn)
    // Space complexity: O(1)
    // Two pointers approach
    // The idea is to sort the input array of special floors and then iterate through the sorted array to find the maximum number of consecutive floors without special floors.
    // We keep track of the start and end of the range of floors and calculate the difference between the special floor and the start of the range.
    // We update the maximum number of consecutive floors without special floors if the difference is greater than the current maximum.
    // Finally, we check the difference between the end of the range and the last special floor to get the maximum number of consecutive floors without special floors.
    // The maximum number of consecutive floors without special floors is the result.
    // The input array of special floors is sorted in non-decreasing order to minimize the number of comparisons needed to find the maximum number of consecutive floors without special floors.
    // The time complexity is O(nlogn) due to the sorting step, and the space complexity is O(1) since we are using a constant amount of extra space.
    // The two pointers approach is used to iterate through the sorted array of special floors and find the maximum number of consecutive floors without special floors.

    public static int maxConsecutive(int bottom, int top, int[] special) {

        // If the input array is empty, return the difference between top and bottom
        Arrays.sort(special);
        int start = bottom;
        int end  = top;
        int ans = 0;

        // If the input array is empty, return the difference between top and bottom
        for(int i=0;i<special.length;i++){
            int specialFloorIndex = special[i];   // The index of the special floor
            int diff = specialFloorIndex -  start;  // The difference between the special floor and the start of the range
            ans = Math.max(ans, diff);   // Update the maximum number of consecutive floors without special floors
            end = specialFloorIndex - 1;   // Update the end of the range to be one less than the special floor
            start = specialFloorIndex+1;  // Update the start of the range to be one more than the special floor
        }

        // Check the difference between the end of the range and the last special floor to get the maximum number of consecutive floors without special floors
        ans = Math.max(ans, end - special[special.length-1]);
        return ans;
    }

    public static void main(String[] args) {
        // Test cases to validate the solution
        System.out.println(maxConsecutive(2, 9, new int[]{4, 6})); // Expected output: 2
        System.out.println(maxConsecutive(1, 10, new int[]{2, 3, 5})); // Expected output: 1
        System.out.println(maxConsecutive(1, 10, new int[]{1, 2, 3})); // Expected output: 0
        System.out.println(maxConsecutive(1, 10, new int[]{10})); // Expected output: 9
        System.out.println(maxConsecutive(1, 10, new int[]{1, 10})); // Expected output: 8
    }
}