class CountSubarraysWithFixedBounds{
    // Time: O(n), Space: O(1)
    // Sliding Window Approach
    // The idea is to keep track of the last index of the element which is less than minK or greater than maxK.
    // If the current element is less than minK or greater than maxK, then update the jbad index.
    // If the current element is equal to minK, then update the jmin index.
    // If the current element is equal to maxK, then update the jmax index.
    // The number of subarrays ending at the current index is the minimum of jmin and jmax minus jbad.
    // Add this number to the result.
    // Return the result.
    public static long countSubarrays(int[] A, int minK, int maxK) {

        // Initialize the result, jbad, jmin, jmax, and n
        long res = 0, jbad = -1, jmin = -1, jmax = -1, n = A.length;

        // Iterate through the array A from 0 to n - 1 and update the result, jbad, jmin, and jmax accordingly
        for (int i = 0; i < n; ++i) {

            // If the current element is less than minK or greater than maxK, then update the jbad index
            if (A[i] < minK || A[i] > maxK) jbad = i;

            // If the current element is equal to minK, then update the jmin index
            if (A[i] == minK) jmin = i;

            // If the current element is equal to maxK, then update the jmax index
            if (A[i] == maxK) jmax = i;

            // The number of subarrays ending at the current index is the minimum of jmin and jmax minus jbad
            res += Math.max(0L, Math.min(jmin, jmax) - jbad);
        }

        // Return the result
        return res;
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 4, 9, 2, 3, 8, 3, 4};
        int minK = 2, maxK = 8;
        System.out.println(countSubarrays(A, minK, maxK)); // Output: 3

        A = new int[]{2, 1, 4, 9, 2, 3, 8, 3, 4};
        minK = 2;
        maxK = 4;
        System.out.println(countSubarrays(A, minK, maxK)); // Output: 0

        A = new int[]{2, 1, 4, 9, 2, 3, 8, 3, 4};
        minK = 2;
        maxK = 2;
        System.out.println(countSubarrays(A, minK, maxK)); // Output: 2

        A = new int[]{2, 1, 4, 9, 2, 3, 8, 3, 4};
        minK = 4;
        maxK = 4;
        System.out.println(countSubarrays(A, minK, maxK)); // Output: 2

        A = new int[]{2, 1, 4, 9, 2, 3, 8, 3, 4};
        minK = 8;
        maxK = 8;
        System.out.println(countSubarrays(A, minK, maxK)); // Output: 1
    }
}