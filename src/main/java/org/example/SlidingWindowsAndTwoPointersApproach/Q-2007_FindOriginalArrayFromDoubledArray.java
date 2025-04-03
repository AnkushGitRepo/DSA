import java.util.Map;
import java.util.TreeMap;

class FindOriginalArrayFromDoubledArray{
    // Time complexity: O(n log n)
    // Space complexity: O(n)
    // The idea is to use a map to count the occurrences of each element in the array.
    // We iterate through the map and for each element, we check if its double exists in the map.
    // If it does, we add the element to the result array and decrement the count of the double in the map.
    // If the count of the double becomes zero, we remove it from the map.
    // If we find an element whose double does not exist in the map, we return an empty array.
    // Finally, we return the result array.
    public static int[] findOriginalArray(int[] A) {

        // If the input array is empty, return an empty array
        int n = A.length, i = 0;

        // If the length of the input array is odd, return an empty array
        if (n % 2 == 1) return new int[0];

        // Sort the input array to use the map to count the occurrences of each element
        int[] res = new int[n / 2];

        // Sort the input array to use the map to count the occurrences of each element
        Map<Integer, Integer> count = new TreeMap<>();

        // Count the occurrences of each element in the input array
        for (int a : A)
            count.put(a, count.getOrDefault(a, 0) + 1);

        // Iterate through the map and for each element, check if its double exists in the map
        for (int x : count.keySet()) {

            // If the count of the double is less than the count of the element, return an empty array
            if (count.get(x) > count.getOrDefault(x + x, 0))
                return new int[0];

            // If the count of the double is greater than or equal to the count of the element, add the element to the result array
            for (int j = 0; j < count.get(x); ++j) {
                res[i++] = x;
                count.put(x + x, count.get(x + x) - 1);
            }
        }

        // Return the result array
        return res;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Test cases to validate the solution
        int[] A = {1, 2, 3, 4};
        int[] result = findOriginalArray(A);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Expected output: [1, 2]

        System.out.println();

        A = new int[]{6, 3, 0, 1, 5};
        result = findOriginalArray(A);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Expected output: []

        System.out.println();

        A = new int[]{0, 0, 0, 0};
        result = findOriginalArray(A);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Expected output: [0, 0]

        System.out.println();

        A = new int[]{1, 2, 3, 4, 5, 6};
        result = findOriginalArray(A);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Expected output: [1, 2, 3]

        System.out.println();

        A = new int[]{2, 4, 6, 8};
        result = findOriginalArray(A);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Expected output: [2, 4]

        System.out.println();
    }
}