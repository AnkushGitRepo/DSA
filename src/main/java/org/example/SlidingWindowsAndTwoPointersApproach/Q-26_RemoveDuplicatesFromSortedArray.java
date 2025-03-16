class RemoveDuplicatesFromSortedArray{
    // Two pointers approach
    // The idea is to use two pointers, one starting from the beginning of the array and the other starting from the second element of the array.
    // We compare the elements at the two pointers and if they are not equal, we increment the first pointer and update the element at the first pointer with the element at the second pointer.
    // We continue this process until the second pointer reaches the end of the array.
    // The length of the array without duplicates is equal to the first pointer + 1.
    // Time complexity: O(n)
    // Space complexity: O(1)
    public static int removeDuplicates( int[] nums) {
        int i = 0;

        // Iterate through the array using the second pointer
        for ( int j = 0; j < nums.length; j++){
            // If the elements at the two pointers are not equal, increment the first pointer and update the element at the first pointer with the element at the second pointer
            if (nums[j] != nums[i]){
                // Increment the first pointer and update the element at the first pointer with the element at the second pointer
                nums[++i] = nums[j];
            }
        }

        // The length of the array without duplicates is equal to the first pointer + 1
        return i + 1;
    }

    public static void main(String[] args) {
        // Test cases to validate the solution
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums)); // Expected output: 2

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums)); // Expected output: 5

        nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(removeDuplicates(nums)); // Expected output: 1

        nums = new int[]{1, 2, 3, 4, 5};
        System.out.println(removeDuplicates(nums)); // Expected output: 5

        nums = new int[]{1, 1, 1, 2, 2, 3, 3, 4, 4, 5};
        System.out.println(removeDuplicates(nums)); // Expected output: 5
    }
}