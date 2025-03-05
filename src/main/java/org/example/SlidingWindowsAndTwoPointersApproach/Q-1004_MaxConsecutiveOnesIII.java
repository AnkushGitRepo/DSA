class MaxConsecutiveOnesIII{
    // Problem:
    // Given an array A of 0s and 1s, we may change up to K values from 0 to 1.
    // Return the length of the longest (contiguous) subarray that contains only 1s.
    // Example 1:
    // Input: A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
    // Output: 6
    // Explanation:
    // [1,1,1,0,0,1,1,1,1,1,1]
    // Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
    // Example 2:
    // Input: A = [1,1,1,0,0,0,1,1,1,1,0], K = 3
    // Output: 9
    // Explanation:
    // [1,1,1,0,0,0,1,1,1,1,1]
    // Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
    // Note:
    // 1 <= A.length <= 20000
    // 0 <= K <= A.length
    // A[i] is 0 or 1
    // Approach:
    // 1. Initialize left and right pointers
    // 2. Increment the right pointer until the number of zeros is less than or equal to K
    // 3. If the number of zeros is greater than K, increment the left pointer until the number of zeros is less than or equal to K
    // 4. Update the max length
    // 5. Repeat the above steps until the right pointer reaches the end of the array
    // 6. Return the max length
    // Note: The number of zeros in the current window should be less than or equal to K
    // Time complexity: O(n), where n is the number of elements in the array
    // Space complexity: O(1)
    public int longestOnes(int[] A, int K) {

        // 1. Initialize left and right pointers
        int left = 0, right = 0;

        int max = 0;   // Max length of the subarray
        int zeroCount = 0;   // Number of zeros in the current window

        // while right pointer is less than the length of the array A
        while(right < A.length){

            // If the element at right pointer is 0, increment zeroCount
            if(A[right] == 0){
                zeroCount++;
            }

            // If the number of zeros is greater than K, increment the left pointer until the number of zeros is less than or equal to K
            while(zeroCount > K){

                // If the element at left pointer is 0, decrement zeroCount
                if(A[left] == 0){
                    zeroCount--;
                }
                // Increment the left pointer
                left++;
            }

            // Update the max length
            max = Math.max(max, right - left + 1);
            right++;   // Increment the right pointer
        }

        // Return the max length
        return max;
    }

    public static void main(String[] args){
        MaxConsecutiveOnesIII obj = new MaxConsecutiveOnesIII();
        int[] A = {1,1,1,0,0,0,1,1,1,1,0};
        int K = 2;
        printArray(A);
        System.out.println("K: "+ K);
        System.out.println(obj.longestOnes(A, K));

        A = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        K = 3;
        printArray(A);
        System.out.println("K: "+ K);
        System.out.println(obj.longestOnes(A, K));

        A = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        K = 4;
        printArray(A);
        System.out.println("K: "+ K);
        System.out.println(obj.longestOnes(A, K));

        A = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        K = 5;
        printArray(A);
        System.out.println("K: "+ K);
        System.out.println(obj.longestOnes(A, K));
    }

    public static void printArray(int[] A){
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}