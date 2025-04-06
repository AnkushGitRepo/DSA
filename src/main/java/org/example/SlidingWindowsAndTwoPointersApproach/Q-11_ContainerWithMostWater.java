class ContainerWithMostWater{
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Two pointers approach
    // The idea is to use two pointers, one starting from the beginning of the array and the other starting from the end of the array.
    // We calculate the area formed by the two lines at the two pointers and update the maximum area if the current area is greater than the maximum area.
    // We move the pointer with the smaller height towards the other pointer to find a potentially larger area.
    // We continue this process until the two pointers meet in the middle of the array.
    // The maximum area is the result.
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        // Use two pointers, one starting from the beginning of the array and the other starting from the end of the array
        while (left < right) {

            // Calculate the area formed by the two lines at the two pointers
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);   // Update the maximum area if the current area is greater than the maximum area

            // Move the pointer with the smaller height towards the other pointer to find a potentially larger area
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        // Return the maximum area
        return maxArea;
    }

    public static void main(String[] args) {
        // Test cases to validate the solution
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7})); // Expected output: 49
        System.out.println(maxArea(new int[]{1,1})); // Expected output: 1
        System.out.println(maxArea(new int[]{4,3,2,1,4})); // Expected output: 16
        System.out.println(maxArea(new int[]{1,2,1})); // Expected output: 2
        System.out.println(maxArea(new int[]{2,3,10,5,7})); // Expected output: 14
    }
}