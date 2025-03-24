import java.util.Arrays;

class ThreeEqualParts{
    // 927. Three Equal Parts
    // https://leetcode.com/problems/three-equal-parts/
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Two pointers approach
    // The idea is to find the number of 1s in the input array.
    // If the number of 1s is 0, we return the indices of the first and last elements of the array./
    // If the number of 1s is not divisible by 3, we return [-1, -1].
    // We find the number of 1s in each part of the array by dividing the total number of 1s by 3.
    // We find the indices of the first 1s in each part of the array.
    // We compare the elements in the three parts to check if they are equal.
    // If the elements are equal, we increment the indices of the first 1s in each part.
    // We continue this process until the indices of the first 1s in each part reach the end of the array.
    // If the elements in the three parts are equal, we return the indices of the last elements of the first and second parts.

    public int[] threeEqualParts(int[] arr) {
        int[] ans = new int[] {-1,-1};

        // num Of 1 in the array
        int numOf1s = 0;
        for (int el : arr) {
            numOf1s += el;
        }

        // If there are no 1s in the array
        if (numOf1s == 0) {
            return new int[]{0, arr.length-1};
        }

        // If the number of 1s is not divisible by 3
        if (numOf1s % 3 != 0) {
            return ans;
        }

        int noOfOnesInEachPart = numOf1s / 3;
        int indexOfFirst1InPart0 = -1;
        int indexOfFirst1InPart1 = -1;
        int indexOfFirst1InPart2 = -1;
        numOf1s = 0;

        // Find the indices of the first 1s in each part of the array and compare the elements in the three parts
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                numOf1s++;
                if (numOf1s == noOfOnesInEachPart + 1) {
                    indexOfFirst1InPart1 = i;
                } else if (numOf1s == 2 * noOfOnesInEachPart + 1) {
                    indexOfFirst1InPart2 = i;
                } else if (numOf1s == 1) {
                    indexOfFirst1InPart0 = i;
                }
            }
        }

        // Compare the elements in the three parts
        while (indexOfFirst1InPart2 < arr.length) {
            if (arr[indexOfFirst1InPart2] == arr[indexOfFirst1InPart0] && arr[indexOfFirst1InPart2] == arr[indexOfFirst1InPart1]) {
                indexOfFirst1InPart2++;
                indexOfFirst1InPart1++;
                indexOfFirst1InPart0++;
            } else {
                return ans;
            }
        }

        // Return the indices of the last elements of the first and second parts
        return new int[]{indexOfFirst1InPart0 - 1, indexOfFirst1InPart1};
    }

    public static void main(String[] args) {
        // Test cases to validate the solution
        ThreeEqualParts obj = new ThreeEqualParts();
        int[] arr = {1,0,1,0,1};
        System.out.println(Arrays.toString(obj.threeEqualParts(arr))); // Expected output: [0,3]

        arr = new int[]{1,1,0,0,1};
        System.out.println(Arrays.toString(obj.threeEqualParts(arr))); // Expected output: [0,2]

        arr = new int[]{1,1,0,1,1};
        System.out.println(Arrays.toString(obj.threeEqualParts(arr))); // Expected output: [-1,-1]

        arr = new int[]{1,1,1,1,1};
        System.out.println(Arrays.toString(obj.threeEqualParts(arr))); // Expected output: [-1,-1]

        arr = new int[]{1,0,1,1,0,1,1,0,1,1,0,1};
        System.out.println(Arrays.toString(obj.threeEqualParts(arr))); // Expected output: [-1,-1]
    }
}