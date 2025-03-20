import java.util.Arrays;

class ValidTriangleNumber{
    // Time complexity: O(n^2)
    // Space complexity: O(1)
    // Two pointers approach
    // The idea is to sort the input array and then use three pointers, one starting from the end of the array and the other two starting from the beginning of the array.
    // We fix the largest side of the triangle using the pointer at the end of the array and then use two pointers to find the other two sides of the triangle.
    // We move the two pointers towards each other to find the other two sides of the triangle.
    // If the sum of the two sides is greater than the largest side, we increment the count of valid triangles.
    // We continue this process until the two pointers meet in the middle of the array.
    // The count of valid triangles is the result.

    public static int triangleNumber( int [] nums){
        if ( nums == null || nums.length < 3){
            return 0;
        }

        int ans = 0;
        Arrays.sort(nums);

        // Fix the largest side of the triangle using the pointer at the end of the array and then use two pointers to find the other two sides of the triangle
        for ( int i = 2; i < nums.length; i++){
            int left = 0;
            int right = i - 1;

            // Move the two pointers towards each other to find the other two sides of the triangle and increment the count of valid triangles if the sum of the two sides is greater than the largest side
            while ( left < right){
                // Increment the count of valid triangles if the sum of the two sides is greater than the largest side
                if ( nums[left] + nums[right] > nums[i]){
                    ans += right - left;
                    right--;
                } else{
                    left++;
                }
            }
        }

        // Return the count of valid triangles
        return ans;
    }

    public static void main(String[] args) {
        // Test cases to validate the solution
        System.out.println(triangleNumber(new int[]{2, 2, 3, 4})); // Expected output: 3
        System.out.println(triangleNumber(new int[]{4, 2, 3, 4})); // Expected output: 4
        System.out.println(triangleNumber(new int[]{3, 2, 3, 4})); // Expected output: 4
        System.out.println(triangleNumber(new int[]{3, 2, 3, 4, 5})); // Expected output: 8
        System.out.println(triangleNumber(new int[]{3, 2, 3, 4, 5, 6})); // Expected output: 14
    }
}