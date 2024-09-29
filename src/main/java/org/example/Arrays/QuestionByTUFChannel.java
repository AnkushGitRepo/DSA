import java.util.ArrayList;

class QuestionByTUFChannel {
    public static void main(String[] args) {
        System.out.println("Before Moving Zeroes To End");
        int [] arr = {0,1,9,8,4,0,0,2,7,0,6,0,9};
        print(arr);
        moveZeroesToEndOfArray(arr);
        System.out.println("After Moving Zeroes To End");
        print(arr);

        System.out.println("Before Union of two arrays");
        int [] arr1 = {1, 2, 4, 5, 6};
        int [] arr2 = {2, 3, 5, 7};
        print(arr1);
        print(arr2);
        ArrayList<Integer> union = findUnionOf2Arrays(arr1, arr2);
        System.out.println("Union of two arrays: " + union);

        System.out.println("Before Intersection of two arrays");
        print(arr1);
        print(arr2);
        ArrayList<Integer> intersection = findIntersectionOf2Arrays(arr1, arr2);
        System.out.println("Intersection of two arrays: " + intersection);

    }

    // print function
    public static void print(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void moveZeroesToEndOfArray(int [] arr){
        // Initialize j to -1, which will be used to track the first zero found
        int j = -1;

        // Find the first zero in the array
         for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
         }

        // If a zero was found
        if(j != -1){
        // Iterate through the array starting from the position after the first zero
            for(int i = j + 1; i < arr.length; i++){
            // If the current element is not zero, swap it with the element at position j
                if(arr[i] != 0) {
                    swap(arr, i, j);
                    j++;
                }
            }
        }
    }

    // swap function
    public static void swap(int [] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    /**
     *
     * Date: 29/09/2024
     * Move zeroes to end
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * let's break down the `findUnionOf2Arrays` method step by step.
     *
     * ## Method Signature
     *
     * public static ArrayList<Integer> findUnionOf2Arrays(int [] arr1, int [] arr2)
     *
     * Purpose: To find the union of two sorted arrays.
     * Parameters:
     *   - `arr1`: First sorted array.
     *   - `arr2`: Second sorted array.
     *   -Returns: An `ArrayList<Integer>` containing the union of the two arrays.
     *
     * ## Step-by-Step Explanation
     *
     * 1. Initialization:
     *     int i = 0 , j = 0;
     *     ArrayList<Integer> union = new ArrayList<>();
     *     - `i` and `j` are pointers for `arr1` and `arr2` respectively, both initialized to 0.
     *     - `union` is an `ArrayList` to store the union of the two arrays.
     *
     * 2. Main Loop:
     *     while (i < arr1.length && j < arr2.length) {
     *         if (arr1[i] <= arr2[j]) {
     *             if (union.size() == 0 || union.get(union.size()-1) != arr1[i])
     *                 union.add(arr1[i]);
     *             i++;
     *         } else {
     *             if (union.size() == 0 || union.get(union.size()-1) != arr2[j])
     *                 union.add(arr2[j]);
     *             j++;
     *         }
     *     }
     *
     *     - Condition: The loop runs as long as both `i` and `j` are within the bounds of their respective arrays.
     *     - Comparison:
     *         - If `arr1[i]` is less than or equal to `arr2[j]`:
     *             - Check if `union` is empty or the last element in `union` is not equal to `arr1[i]`.
     *             - If true, add `arr1[i]` to `union`.
     *             - Increment `i`.
     *         - If `arr1[i]` is greater than `arr2[j]`:
     *             - Check if `union` is empty or the last element in `union` is not equal to `arr2[j]`.
     *             - If true, add `arr2[j]` to `union`.
     *             - Increment `j`.
     *
     * 3. Remaining Elements in `arr1`:
     *     while (i < arr1.length) {
     *         if (union.get(union.size()-1) != arr1[i])
     *             union.add(arr1[i]);
     *         i++;
     *     }
     *     - After the main loop, if there are any remaining elements in `arr1`, add them to `union` if they are not duplicates.
     *
     * 4. Remaining Elements in `arr2`:
     *     while (j < arr2.length) {
     *         if (union.get(union.size()-1) != arr2[j])
     *             union.add(arr2[j]);
     *         j++;
     *     }
     *
     *     - Similarly, if there are any remaining elements in `arr2`, add them to `union` if they are not duplicates.
     *
     * 5. Return Statement:
     *     return union;
     *     - Return the `union` list containing the union of the two arrays.
     *
     * ## Example
     *
     * Let's consider two sorted arrays:
     * - `arr1 = {1, 2, 4, 5, 6}`
     * - `arr2 = {2, 3, 5, 7}`
     *
     * **Step-by-Step Execution**:
     * 1. Initialize `i = 0`, `j = 0`, and `union = []`.
     * 2. Compare `arr1[0]` (1) and `arr2[0]` (2):
     *     - 1 <= 2, add 1 to `union`, increment `i`.
     *     - `union = [1]`
     * 3. Compare `arr1[1]` (2) and `arr2[0]` (2):
     *     - 2 <= 2, add 2 to `union`, increment `i`.
     *     - `union = [1, 2]`
     * 4. Compare `arr1[2]` (4) and `arr2[1]` (3):
     *     - 4 > 3, add 3 to `union`, increment `j`.
     *     - `union = [1, 2, 3]`
     * 5. Compare `arr1[2]` (4) and `arr2[2]` (5):
     *     - 4 <= 5, add 4 to `union`, increment `i`.
     *     - `union = [1, 2, 3, 4]`
     * 6. Compare `arr1[3]` (5) and `arr2[2]` (5):
     *     - 5 <= 5, add 5 to `union`, increment `i`.
     *     - `union = [1, 2, 3, 4, 5]`
     * 7. Compare `arr1[4]` (6) and `arr2[3]` (7):
     *     - 6 <= 7, add 6 to `union`, increment `i`.
     *     - `union = [1, 2, 3, 4, 5, 6]`
     * 8. `i` reaches the end of `arr1`, add remaining elements of `arr2` to `union`:
     *     - Add 7 to `union`.
     *     - `union = [1, 2, 3, 4, 5, 6, 7]`
     *
     * Final `union` list: `[1, 2, 3, 4, 5, 6, 7]`.
     *
     * This method ensures that the union of two sorted arrays is returned without duplicates and in sorted order.
     *
     */


    public static ArrayList<Integer> findUnionOf2Arrays(int [] arr1, int [] arr2){
        int i = 0 , j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (union.size() == 0 || union.get(union.size()-1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (union.size() == 0 || union.get(union.size()-1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            }
        }
        while (i < arr1.length) // IF any element left in arr1
        {
            if (union.get(union.size()-1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) // If any elements left in arr2
        {
            if (union.get(union.size()-1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }
        return union;
    }

    // Date: 29/09/2024
    // Intersection of two arrays
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Note: This method assumes that the input arrays are sorted.
    public static ArrayList<Integer> findIntersectionOf2Arrays(int [] arr1, int [] arr2){
        int i = 0 , j = 0;
        ArrayList<Integer> intersection = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) // Case 1
            {
                i++;
            } else if (arr1[i] > arr2[j]) // Case 2
            {
                j++;
            } else // Case 3
            {
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        return intersection;
    }

}