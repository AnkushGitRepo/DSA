import java.util.Arrays;

class KRadiusSubarrayAvearges{
    // Time complexity: O(n)
    // Space complexity: O(n)
    // Sliding window approach
    // The idea is to calculate the sum of the first 2k + 1 elements and then slide the window to the right by one
    // element at a time. At each step, we calculate the average of the current window and store it in the result array.
    // The window sum is updated by subtracting the element that is no longer part of the window and adding the new element that is included in the window
    // The average of the current window is calculated by dividing the window sum by 2k + 1
    // The result array is filled from index k + 1 to n - k - 1
    // The result array is initialized with -1 and the elements at index k and n - k are calculated separately

    public static int[] getAverages(int[] nums, int k) {

        int n = nums.length;

        // If k is 0, return the input array
        if (k == 0) {
            return nums;
        }

        // Initialize the result array with -1
        int[] result = new int[n];
        Arrays.fill(result, -1);

        // If the input array has less than 2k + 1 elements, return the result array with -1 values
        if (n < 2 * k + 1) {
            return result;
        }

        // Calculate the average of the first k elements
        long windowSum = 0;

        // Calculate the initial window sum
        for (int i = 0; i <= 2 * k; i++) {
            windowSum += nums[i];
        }

        // Calculate the average of the first k elements and store it in the result array
        result[k] = (int) (windowSum / (2 * k + 1));

        // Slide the window to the right and calculate the average of each window of size 2k + 1
        int left = 0;
        int right = 2 * k;
        int i = k + 1; // Start filling results from index k + 1

        // Slide the window to the right
        while (right + 1 < n) {
            left++;
            right++;

            // Update the window sum by subtracting the element that is no longer part of the window and adding the new element that is included in the window
            windowSum = windowSum - nums[left - 1] + nums[right];

            // Calculate the average of the current window and store it in the result array
            result[i] = (int) (windowSum / (2 * k + 1));
            i++;
        }

        // Calculate the average of the last k elements
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 1;
        int[] result = getAverages(nums, k);
        System.out.println(Arrays.toString(result)); // Output: [-1, 2, 3, 4, -1]

        nums = new int[]{1, 2, 3, 4, 5};
        k = 2;
        result = getAverages(nums, k);
        System.out.println(Arrays.toString(result)); // Output: [-1, -1, 3, -1, -1]

        nums = new int[]{1, 2, 3, 4, 5};
        k = 0;
        result = getAverages(nums, k);
        System.out.println(Arrays.toString(result)); // Output: [1, 2, 3, 4, 5]

        nums = new int[]{1, 2, 3, 4, 5};
        k = 3;
        result = getAverages(nums, k);
        System.out.println(Arrays.toString(result)); // Output: [-1, -1, -1, -1, -1]

        nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        k = 2;
        result = getAverages(nums, k);
    }
}