class MinimumSizeSubarraySum{
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Sliding Window Approach
    // Idea:
    // 1. We will use two pointers low and high to maintain the window.
    // 2. We will keep on increasing the window size by moving high pointer to right.
    // 3. If the sum of the window is greater than or equal to target, we will try to minimize the window size by moving low pointer to right.
    // 4. We will keep track of the minimum window size.
    // 5. We will return the minimum window size.

    public static int minSubArrayLen(int target, int[] nums){
        // minLenWindow will store the minimum window size
        int minLenWindow = Integer.MAX_VALUE;
        int sum = 0;   // sum will store the sum of the window

        // low and high pointers to maintain the window size
        int low = 0, high = 0;

        // We will keep on increasing the window size by moving high pointer to right
        while ( high < nums.length ){

            // sum will store the sum of the window size from low to high pointer index in the array
            sum += nums[high];
            high++;   // moving high pointer to right

            // If the sum of the window is greater than or equal to target, we will try to minimize the window size by moving low pointer to right
            while ( sum >= target ){

                // We will keep track of the minimum window size
                minLenWindow = Math.min(minLenWindow, high - low);

                // We will try to minimize the window size by moving low pointer to right
                sum -= nums[low];

                // low pointer is moved to right
                low++;
            }
        }

        // We will return the minimum window size
        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
    }

    public static void main(String[] args){
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        printArray(nums);
        System.out.println(minSubArrayLen(target, nums));

        int[] nums2 = {1,4,4};
        int target2 = 4;
        printArray(nums2);
        System.out.println(minSubArrayLen(target2, nums2));

        int[] nums3 = {1,1,1,1,1,1,1,1};
        int target3 = 11;
        printArray(nums3);
        System.out.println(minSubArrayLen(target3, nums3));

        int[] nums4 = {1,2,3,4,5};
        int target4 = 11;
        printArray(nums4);
        System.out.println(minSubArrayLen(target4, nums4));

        int[] nums5 = {1,1,1,1,1,1,1,1};
        int target5 = 1;
        printArray(nums5);
        System.out.println(minSubArrayLen(target5, nums5));

    }

    // Helper function to print array
    public static void printArray(int[] nums){
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}