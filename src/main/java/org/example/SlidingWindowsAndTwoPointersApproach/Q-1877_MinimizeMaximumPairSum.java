import java.util.Arrays;

class MinimizeMaximumPairSum{
    // Time complexity: O(nlogn)
    // Space complexity: O(1)
    // Two pointers approach
    // The idea is to sort the input array and then use two pointers, one starting from the beginning of the array and the other starting from the end of the array.
    // We calculate the sum of the elements at the two pointers and update the maximum sum if the current sum is greater than the maximum sum.
    // We continue this process until the two pointers meet in the middle of the array.
    // The maximum sum is the result.

    public int minPairSum(int[] nums) {

        // Sort the input array in non-decreasing order to minimize the maximum pair sum
        Arrays.sort(nums);
        int n = nums.length;
        int max = 0;   // Initialize the maximum sum to 0

        // Use two pointers, one starting from the beginning of the array and the other starting from the end of the array
        for(int i=0; i<n/2; i++){
            // Update the maximum sum if the current sum is greater than the maximum sum
            max = Math.max(max, nums[i] + nums[n-i-1]);
        }

        // Return the maximum sum
        return max;
    }

    public static void main(String[] args) {
        // Test cases to validate the solution
        MinimizeMaximumPairSum obj = new MinimizeMaximumPairSum();
        int[] nums = {3, 5, 2, 3};
        System.out.println(obj.minPairSum(nums)); // Expected output: 7

        nums = new int[]{3, 5, 4, 2, 4, 6};
        System.out.println(obj.minPairSum(nums)); // Expected output: 8

        nums = new int[]{5, 6, 2, 7, 4};
        System.out.println(obj.minPairSum(nums)); // Expected output: 10

        nums = new int[]{4, 1, 5, 1, 2, 5, 1, 5, 5, 4};
        System.out.println(obj.minPairSum(nums)); // Expected output: 8

        nums = new int[]{3, 5, 2, 3};
        System.out.println(obj.minPairSum(nums)); // Expected output: 7
    }

}