class MaxSubarraySum {
    public static int maxSumSubarray(int[] arr, int k) {
        if (arr == null || arr.length < k) {
            throw new IllegalArgumentException("Invalid input: Array is null or its length is less than k.");
        }

        // Calculate the sum of the first k elements
        int maxSum = 0, windowSum = 0, i = 0;

        // Calculate the sum of the first k elements
        while ( i < k ){
            windowSum += arr[i];  // Add the element to the windowSum
            i++;
        }

        // Set maxSum to windowSum
        maxSum = windowSum;

        // Calculate the sum of the remaining elements
        while ( i < arr.length ){
            windowSum += arr[i] - arr[i - k];  // Subtract the element going out of the window and add the element coming in the window
            if (windowSum > maxSum ) maxSum = windowSum;  // Update maxSum if windowSum is greater
            i++;  // Move to the next element
        }

        return maxSum;
    }

    // Helper method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        printArray(arr);
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSumSubarray(arr, k));

        int[] arr2 = {2, 3, 4, 1, 5};
        int k2 = 2;
        printArray(arr2);
        System.out.println("Maximum sum of a subarray of size " + k2 + " is: " + maxSumSubarray(arr2, k2));

        int[] arr3 = {2, 1, 5, 2, 3, 2};
        int k3 = 2;
        printArray(arr3);
        System.out.println("Maximum sum of a subarray of size " + k3 + " is: " + maxSumSubarray(arr3, k3));

        int[] arr4 = {3, 4, 1, 1, 6};
        int k4 = 3;
        printArray(arr4);
        System.out.println("Maximum sum of a subarray of size " + k4 + " is: " + maxSumSubarray(arr4, k4));

        int[] arr5 = {1, 2, 3, 4, 5};
        int k5 = 2;
        printArray(arr5);
        System.out.println("Maximum sum of a subarray of size " + k5 + " is: " + maxSumSubarray(arr5, k5));
    }
}
