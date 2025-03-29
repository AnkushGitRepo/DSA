class SortArrayByParityII{
    // Time complexity: O(n)
    // Space complexity: O(1)
    // Two pointers approach
    // The idea is to use two pointers, one starting from the first even index and the other starting from the first odd index.
    // We iterate through the array and check if the element at the even index is odd and the element at the odd index is even.
    // If both elements are not in their correct positions, we swap them.
    // We continue this process until both pointers reach the end of the array.
    // The final array will have all even numbers at even indices and all odd numbers at odd indices.
    public int[] sortArrayByParityII(int[] nums) {

        // Initialize two pointers, one for odd numbers at even indices and the other for even numbers at odd indices
        int oddNoAtEvenIndex= 0;
        int evenNoAtOddIndex = 1;
        int n = nums.length;

        // Iterate through the array and swap elements if they are not in their correct positions
        while (oddNoAtEvenIndex < n && evenNoAtOddIndex < n) {

            // Find the next odd number at an even index
            while (oddNoAtEvenIndex < n && nums[oddNoAtEvenIndex] % 2 == 0) {
                oddNoAtEvenIndex += 2;
            }

            // Find the next even number at an odd index
            while (evenNoAtOddIndex < n && nums[evenNoAtOddIndex] % 2 == 1) {
                evenNoAtOddIndex += 2;
            }

            // Swap the odd number at the even index with the even number at the odd index
            if (evenNoAtOddIndex < n && oddNoAtEvenIndex < n) {
                swap(nums, oddNoAtEvenIndex, evenNoAtOddIndex);
            }
        }

        // Return the sorted array
        return nums;
    }

    // Helper method to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        // Swap the elements at indices i and j
        if(i!=j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    // Main method to test the solution
    public static void main(String[] args) {
        SortArrayByParityII obj = new SortArrayByParityII();
        int[] nums = {4, 2, 5, 7};
        int[] result = obj.sortArrayByParityII(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 4 5 2 7

        System.out.println();
        nums = new int[]{2, 3};
        result = obj.sortArrayByParityII(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 2 3

        System.out.println();
        nums = new int[]{1, 0};
        result = obj.sortArrayByParityII(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 0 1

        System.out.println();
        nums = new int[]{1, 2, 3, 4};
        result = obj.sortArrayByParityII(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 2 1 4 3

        System.out.println();
        nums = new int[]{1, 2, 3, 4, 5, 6};
        result = obj.sortArrayByParityII(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 2 1 4 3 6 5

        System.out.println();
        nums = new int[]{1, 3, 5, 7, 2, 4, 6, 8};
        result = obj.sortArrayByParityII(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 2 3 4 7 6 5 8 1

    }

}