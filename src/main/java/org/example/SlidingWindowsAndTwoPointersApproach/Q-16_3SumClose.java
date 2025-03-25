import java.util.Arrays;

class ThreeSumClose{
    // Time complexity: O(n^2)
    // Space complexity: O(1)
    // Two pointers approach
    // The idea is to sort the input array and then use two pointers to find the third number for each pair of numbers.
    // We fix the first number using a loop and then use two pointers to find the other two numbers.
    // We move the two pointers towards each other to find the other two numbers.
    // We update the closest sum if the current sum is closer to the target than the closest sum.
    // The closest sum is the result.

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // O(nlogn)

        // Initialize the closest sum to the sum of the first three numbers
        int closesetSum = nums[0] + nums[1] + nums[nums.length - 1];

        // Fix the first number using a loop and then use two pointers to find the other two numbers
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            // Move the two pointers towards each other to find the other two numbers
            while (start < end) {
                int currSum = nums[i] + nums[start] + nums[end];

                // Update the two pointers based on the current sum
                if (currSum > target) {
                    end--;
                } else {
                    start++;
                }

                // Update the closest sum if the current sum is closer to the target than the closest sum
                if (Math.abs(currSum - target) < Math.abs(closesetSum - target)) {
                    closesetSum = currSum;
                }
            }
        }

        // Return the closest sum
        return closesetSum;
    }

    public static void main(String[] args) {
        // Test cases to validate the solution
        System.out.println(threeSumClosest(new int[]{-1, 2, 1, -4}, 1)); // Expected output: 2
        System.out.println(threeSumClosest(new int[]{0, 0, 0}, 1)); // Expected output: 0
        System.out.println(threeSumClosest(new int[]{1, 1, 1, 0}, -100)); // Expected output: 2
        System.out.println(threeSumClosest(new int[]{1, 1, 1, 0}, 100)); // Expected output: 3
        System.out.println(threeSumClosest(new int[]{1, 1, 1, 0}, 0)); // Expected output: 2
    }
}