import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FourSum{
    // Time complexity: O(n^3)
    // Space complexity: O(1)
    // Two pointers approach
    // The idea is to sort the input array and then use two pointers to find the other two numbers for each pair of numbers.
    // We fix the first number and the second number using two nested loops and then use two pointers to find the other two numbers.
    // We move the two pointers towards each other to find the other two numbers.
    // If the sum of the four numbers is equal to the target, we add the quadruplet to the result list.
    // We avoid duplicates by skipping the same numbers for the first and second numbers.

    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Initialize the result list
        List<List<Integer>> result = new ArrayList<>();

        // If the input array does not have enough elements to form a quadruplet, return an empty list
        if (nums.length < 4) {
            return result; // Not enough elements to form a quadruplet
        }

        // Sort the input array to use the two pointers approach
        Arrays.sort(nums); // Sort the array

        // Use two pointers to find the other two numbers for each pair of numbers
        for (int i = 0; i < nums.length - 3; i++) {
            // Avoid duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                // Avoid duplicates for the second number
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = nums.length - 1;

                // Use two pointers to find the other two numbers
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    // If the sum of the four numbers is equal to the target, add the quadruplet to the result list
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        // Move left and right to the next different numbers to avoid duplicates
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases to validate the solution
        FourSum obj = new FourSum();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(obj.fourSum(nums, target)); // Expected output: [[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]

        nums = new int[]{2, 2, 2, 2, 2};
        target = 8;
        System.out.println(obj.fourSum(nums, target)); // Expected output: [[2, 2, 2, 2]]

        nums = new int[]{1, 2, 3, 4, 5};
        target = 10;
        System.out.println(obj.fourSum(nums, target)); // Expected output: [[1, 2, 3, 4]]

        nums = new int[]{1, 2, 3, 4, 5};
        target = 15;
        System.out.println(obj.fourSum(nums, target)); // Expected output: []

        nums = new int[]{1, 2, 3, 4, 5};
        target = 20;
        System.out.println(obj.fourSum(nums, target)); // Expected output: []
    }
}