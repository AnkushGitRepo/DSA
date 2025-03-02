class MaximumAverageSubarrayI{
    public double findMaxAverage(int[] nums, int k){
        // Calculate the sum of the first k elements
        double maxSum = 0, windowSum = 0;
        int i = 0;

        // Calculate the sum of the first k elements
        while ( i < k ){
            windowSum += nums[i];  // Add the element to the windowSum
            i++;
        }

        // Set maxSum to windowSum
        maxSum = windowSum / k;

        // Calculate the sum of the remaining elements
        while ( i < nums.length ){
            windowSum += nums[i] - nums[i - k];  // Subtract the element going out of the window and add the element coming in the window
            if (windowSum / k > maxSum ) maxSum = windowSum / k;  // Update maxSum if windowSum is greater
            i++;  // Move to the next element
        }

        return maxSum;
    }

    public static void main(String[] args) {
        MaximumAverageSubarrayI obj = new MaximumAverageSubarrayI();
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;
        printArray(arr);
        System.out.println("Maximum average of a subarray of size " + k + " is: " + obj.findMaxAverage(arr, k));

        int[] arr2 = {5};
        int k2 = 1;
        printArray(arr2);
        System.out.println("Maximum average of a subarray of size " + k2 + " is: " + obj.findMaxAverage(arr2, k2));

        int[] arr3 = {0, 4, 0, 3, 2};
        int k3 = 1;
        printArray(arr3);
        System.out.println("Maximum average of a subarray of size " + k3 + " is: " + obj.findMaxAverage(arr3, k3));

        int[] arr4 = {0, 1, 1, 3, 3};
        int k4 = 4;
        printArray(arr4);
        System.out.println("Maximum average of a subarray of size " + k4 + " is: " + obj.findMaxAverage(arr4, k4));

        int[] arr5 = {1, 2, 3, 4, 5};
        int k5 = 2;
        printArray(arr5);
        System.out.println("Maximum average of a subarray of size " + k5 + " is: " + obj.findMaxAverage(arr5, k5));
    }

    // Helper method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}