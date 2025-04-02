class MinimumSwapsToGroupAll1sTogetherII{
    // https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-ii/
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Two pointers approach
    // The idea is to use a sliding window approach to find the minimum number of swaps required to group all 1s together in a circular array.
    // We create a circular array by duplicating the input array.
    // We count the total number of 1s in the input array.
    // We use two pointers to maintain a sliding window of size equal to the total number of 1s.
    // We count the number of 0s in the sliding window.
    // We slide the window to the right by moving the start and end pointers.
    // We update the minimum number of 0s in the sliding window.
    // The minimum number of swaps required to group all 1s together is equal to the minimum number of 0s in the sliding window.
    // The result is the minimum number of swaps required to group all 1s together.


    public static int minSwaps(int[] nums) {

        int n = nums.length;
        int totalOnes = 0;
        int circular[] = new int[2 * n];

        // Count the total number of 1s in the input array and create a circular array
        for (int i = 0; i <  n; i++) {
            totalOnes += nums[i];
            circular[i] = nums[i];
            circular[n+i] = nums[ i];
        }


        // If the total number of 1s is 0 or 1, return 0
        int start = 0;
        int end = 0;
        int zeroCount = 0;
        int minZero = Integer.MAX_VALUE;

        // Count the number of 0s in the first window of size totalOnes
        for (; end < totalOnes; end++) {
            if(circular[end] == 0){
                zeroCount++;
            }
        }

        // Slide the window to the right and update the minimum number of 0s in the sliding window
        for (; end < circular.length; end++) {

            // Remove the first element of the window
            if(circular[end] == 0){
                zeroCount++;
            }

            // Add the last element of the window
            if (end - start + 1 == totalOnes) {
                zeroCount = Math.min(minZero, zeroCount);
            } else if (end - start + 1 > totalOnes) {
                if(circular[start] == 0){
                    zeroCount--;
                }

                minZero = Math.min(minZero, zeroCount);
                start++;
            }

        }

        // Return the minimum number of swaps required to group all 1s together
        return minZero;
    }

    public static void main(String[] args) {
        // Test cases to validate the solution
        System.out.println(minSwaps(new int[]{1, 0, 1, 0, 1})); // Expected output: 1
        System.out.println(minSwaps(new int[]{0, 0, 0, 0})); // Expected output: 0
        System.out.println(minSwaps(new int[]{1, 1, 1, 0})); // Expected output: 0
        System.out.println(minSwaps(new int[]{1, 1, 1, 0})); // Expected output: 0
        System.out.println(minSwaps(new int[]{1, 0, 0, 1, 0})); // Expected output: 1
    }
}