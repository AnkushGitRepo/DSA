import java.util.Arrays;

class SquaresOfASortedArray{
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Two pointers approach
    // The idea is to use two pointers, one starting from the beginning of the array and the other starting from the end of the array.
    // We compare the absolute values of the elements at the two pointers and square the larger absolute value.
    // We store the squared value in the result array at the current index and move the pointer of the larger absolute value towards the center of the array.
    // We continue this process until the two pointers meet in the middle of the array.
    // Finally, we return the result array.
    // The result array will contain the squares of the elements in sorted order.
    public static int[] sortedSquares(int[] A) {

        // Check if the input array is null or empty
        int n = A.length;
        // If the input array is empty, return an empty array
        int[] result = new int[n];

        // Use two pointers, one starting from the beginning of the array and the other starting from the end of the array
        int i = 0, j = n - 1;

        // Iterate through the array and compare the absolute values of the elements at the two pointers
        for (int p = n - 1; p >= 0; p--) {
            // Compare the absolute values of the elements at the two pointers and square the larger absolute value
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];  // Square the element at the left pointer
                i++;  // Move the pointer of the smaller absolute value towards the center of the array
            } else {
                result[p] = A[j] * A[j];  // Square the element at the right pointer
                j--;   // Move the pointer of the larger absolute value towards the center of the array
            }
        }

        // Return the result array containing the squares of the elements in sorted order
        return result;
    }

    // Test cases to validate the solution
    public static void main(String[] args) {
        // Test cases to validate the solution
        int[] A = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(A);
        System.out.println(Arrays.toString(result)); // Expected output: [0, 1, 9, 16, 100]

        A = new int[]{-7, -3, 2, 3, 11};
        result = sortedSquares(A);
        System.out.println(Arrays.toString(result)); // Expected output: [4, 9, 9, 49, 121]

        A = new int[]{-1, 0, 1};
        result = sortedSquares(A);
        System.out.println(Arrays.toString(result)); // Expected output: [0, 1, 1]

        A = new int[]{-5, -4, -3, -2, -1};
        result = sortedSquares(A);
        System.out.println(Arrays.toString(result)); // Expected output: [1, 4, 9, 16, 25]

        A = new int[]{1, 2, 3, 4, 5};
        result = sortedSquares(A);
        System.out.println(Arrays.toString(result)); // Expected output: [1, 4, 9, 16, 25]

    }
}