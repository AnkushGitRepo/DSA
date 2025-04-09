class RemoveDuplicatesFromSortedArrayII{
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Two pointers approach
    public static int removeDuplicates(int[] nums) {
        // If the array is empty or has only one element, return its length
        int i = 0;

        // Iterate through the array and check if the current element is greater than the element two positions back
        for (int n : nums)
            // If the current element is less than or equal to the element two positions back, we can keep it
            if (i < 2 || n > nums[i-2])
                nums[i++] = n;   // Store the current element in the array

        // Return the length of the modified array
        return i;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Test cases to validate the solution
        int[] nums = {1, 1, 1, 2, 2, 3};
        int length = removeDuplicates(nums);
        System.out.println("Length of modified array: " + length);
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        // Expected output: Length of modified array: 5
        // Modified array: 1 1 2 2 3
        System.out.println();

        nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        length = removeDuplicates(nums);
        System.out.println("Length of modified array: " + length);
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        // Expected output: Length of modified array: 7
        // Modified array: 0 0 1 1 2 3 3

        System.out.println();
        nums = new int[]{1, 2, 3, 4, 5};
        length = removeDuplicates(nums);
        System.out.println("Length of modified array: " + length);
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        // Expected output: Length of modified array: 5
        // Modified array: 1 2 3 4 5
        System.out.println();

        nums = new int[]{1, 1, 2, 2, 3, 3, 4, 4};
        length = removeDuplicates(nums);
        System.out.println("Length of modified array: " + length);
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        // Expected output: Length of modified array: 8
        // Modified array: 1 1 2 2 3 3 4 4
        System.out.println();

        nums = new int[]{1, 1, 1, 1, 1, 1};
        length = removeDuplicates(nums);
        System.out.println("Length of modified array: " + length);
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        // Expected output: Length of modified array: 2
        // Modified array: 1 1

    }
}