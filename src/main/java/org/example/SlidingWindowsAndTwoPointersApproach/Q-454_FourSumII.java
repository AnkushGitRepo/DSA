import java.util.HashMap;
import java.util.Map;

class FourSumII{

    // Time complexity: O(n^2)
    // Space complexity: O(n)
    // The idea is to use a hash map to store the sums of the first two arrays and their counts.
    // We iterate through the third and fourth arrays and check if the negative of their sum exists in the hash map.
    // If it exists, we add the count of that sum to the result.
    // This approach reduces the time complexity from O(n^4) to O(n^2).
    // This is a more efficient solution for the 4Sum II problem.
    // The algorithm works as follows:
    // 1. Create a hash map to store the sums of the first two arrays and their counts.
    // 2. Iterate through the first two arrays and calculate their sums.
    // 3. For each sum, store it in the hash map with its count.
    // 4. Iterate through the third and fourth arrays and calculate their sums.
    // 5. For each sum, check if the negative of that sum exists in the hash map.
    // 6. If it exists, add the count of that sum to the result.
    // 7. Return the result.

    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        // Create a hash map to store the sums of the first two arrays and their counts
        Map<Integer, Integer> map  = new HashMap<>();

        // Iterate through the first two arrays and calculate their sums
        for(int i=0;i<A.length;i++){
            // Iterate through the second array and calculate the sum with the first array
            for(int j=0;j<B.length;j++){

                // Calculate the sum of the first two arrays
                int sum_AB = A[i]+B[j];

                // Store the sum in the hash map with its count
                map.put(sum_AB, map.getOrDefault(sum_AB,0)+1);
            }
        }

        // Iterate through the third and fourth arrays and calculate their sums
        int ans =0;
        for(int i=0;i<C.length;i++){
            // Iterate through the fourth array and calculate the sum with the third array
            for(int j=0;j<D.length;j++){
                int sum_CD = C[i]+D[j];    // Calculate the sum of the third and fourth arrays
                int sum_AB = -sum_CD;      // Calculate the negative of the sum of the third and fourth arrays
                ans += map.getOrDefault(sum_AB,0);   // Check if the negative of the sum exists in the hash map
            }
        }

        // Return the result
        return ans;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};

        // Call the fourSumCount method and print the result
        System.out.println(fourSumCount(A, B, C, D)); // Expected output: 2

        A = new int[]{0};
        B = new int[]{0};
        C = new int[]{0};
        D = new int[]{0};

        // Call the fourSumCount method and print the result
        System.out.println(fourSumCount(A, B, C, D)); // Expected output: 1

        A = new int[]{1, 1, 1, 1};
        B = new int[]{1, 1, 1, 1};
        C = new int[]{1, 1, 1, 1};
        D = new int[]{1, 1, 1, 1};

        // Call the fourSumCount method and print the result
        System.out.println(fourSumCount(A, B, C, D)); // Expected output: 0

        A = new int[]{1, 2, 3};
        B = new int[]{4, 5, 6};
        C = new int[]{7, 8, 9};
        D = new int[]{10, 11, 12};

        // Call the fourSumCount method and print the result
        System.out.println(fourSumCount(A, B, C, D)); // Expected output: 0

        A = new int[]{1, 2, 3, 4};
        B = new int[]{5, 6, 7, 8};
        C = new int[]{9, 10, 11, 12};
        D = new int[]{13, 14, 15, 16};

        // Call the fourSumCount method and print the result
        System.out.println(fourSumCount(A, B, C, D)); // Expected output: 0
    }
}