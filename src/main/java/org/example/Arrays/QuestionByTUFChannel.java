import java.util.*;

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

        System.out.println("Before Intersection of two unsorted arrays");
        int [] arr3 = {1, 2, 4, 5, 6};
        int [] arr4 = {2, 3, 5, 7};
        print(arr3);
        print(arr4);
        int [] intersectionUnsorted = intersection(arr3, arr4);
        System.out.print("Intersection of two unsorted arrays: ");
        print(intersectionUnsorted);

        System.out.println("Missing Number in Array");
        int [] arr5 = {3, 0, 1};
        print(arr5);
        System.out.println("Missing Number: " + missingNumber(arr5));

        System.out.println("Single Number in Array");
        int [] arr6 = {4, 1, 2, 1, 2};
        print(arr6);
        System.out.println("Single Number: " + singleNumberInArray(arr6));

        System.out.println("Maximum Consecutive Ones in Array");
        int [] arr7 = {1, 1, 0, 1, 1, 1};
        print(arr7);
        System.out.println("Maximum Consecutive Ones: " + findMaxConsecutiveOnes(arr7));

        System.out.println("Basic Example: Subarray Sum Equals K");
        int [] arr8 = {1, 1, 1};
        int k = 2;
        print(arr8);
        System.out.println("Number of Subarrays with Sum Equal to K: " + subarraySum(arr8, k));

        System.out.println("Complex Example: Subarray Sum Equals K");
        int [] arr9 = {1, 2, 3, 4, 5};
        int k1 = 10;
        print(arr9);
        System.out.println("Number of Subarrays with Sum Equal to K: " + subarraySum(arr9, k1));

        System.out.println("Two Sum Problem");
        int [] arr10 = {2, 7, 11, 15};
        int target = 9;
        print(arr10);
        System.out.println("Indices of Two Numbers that Sum to Target (9) : " + Arrays.toString(twoSum(arr10, target)));

        System.out.println("Sort an array of 0's 1's and 2's");
        int [] arr11 = {2, 0, 2, 1, 1, 0};
        print(arr11);
        sortColors(arr11);
        System.out.println("Sorted Array: ");
        print(arr11);

        System.out.println("Majority Element");
        int [] arr12 = {2, 2, 1, 1, 1, 2, 2};
        print(arr12);
        System.out.println("Majority Element: " + majorityElement(arr12));

        System.out.println("Maximum Subarray Sum");
        int [] arr13 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        print(arr13);
        System.out.println("Maximum Subarray Sum: " + maxSubArray(arr13));

        System.out.println("Intersection of Two Arrays II");
        int [] arr14 = {2, 0, 2, 1, 1, 0};
        int [] arr15 = {2, 2, 1, 1, 1, 2, 2};
        print(arr14);
        print(arr15);
        System.out.println("Intersection of both the arrays: ");
        print(intersectionOf2Arrays(arr14,arr15));

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
     * Time Complexity: O(n + m)
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
    // Intersection of two sorted arrays
    // Time Complexity: O(n + m)
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

    // Date: 30/09/2024
    // Intersection of two unsorted arrays
    // Time Complexity: O(n + m)
    // Space Complexity: O(n)
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> st = new HashSet<>();
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i<nums1.length; i++){
            st.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            if(st.contains(nums2[i])){
                li.add(nums2[i]);
                st.remove(nums2[i]);
            }
        }
        int [] ans = new int[li.size()];
        for(int i=0; i<li.size(); i++){
            ans[i] = li.get(i);
        }
        return ans;
    }


        // Date: 30/09/2024
        /**
     * Finds the missing number in an array containing n distinct numbers taken from 0, 1, 2, ..., n.
     *
     * @param nums the input array containing n distinct numbers
     * @return the missing number in the array
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int missingNumber(int[] nums) {
        // Initialize sum to 0, which will store the sum of elements in the array
        int sum = 0;

        // Get the length of the array
        int n = nums.length;

        // Calculate the sum of the first n natural numbers using the formula n * (n + 1) / 2
        int orgsum = n * (n + 1) / 2;

        // Iterate through the array and calculate the sum of its elements
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        // The missing number is the difference between the expected sum (orgsum) and the actual sum (sum)
        return orgsum - sum;
    }

    // Date: 30/09/2024
    /**
     * Finds the single number in an array where every other number appears twice.
     *
     * @param arr the input array containing numbers
     * @return the single number that appears only once
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int singleNumberInArray(int[] arr) {
        // Initialize xor to 0, which will store the result of XOR operations
        int xor = 0;

        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // XOR the current element with xor
            xor = xor ^ arr[i];
        }

        // Return the result, which is the single number
        return xor;
    }

    // Date: 30/09/2024
    /**
     * Finds the maximum number of consecutive 1s in the given array.
     *
     * @param arr the input array containing binary values (0s and 1s)
     * @return the maximum number of consecutive 1s in the array
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int findMaxConsecutiveOnes(int[] arr) {
        // Initialize max to store the maximum count of consecutive 1s found
        int max = 0;
        // Initialize count to keep track of the current streak of consecutive 1s
        int count = 0;
        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is 1, increment the count
            if (arr[i] == 1) {
                count++;
                // Update max if the current count is greater than max
                max = Math.max(count, max);
            } else {
                // If the current element is not 1, reset the count to 0
                count = 0;
            }
        }
        // Return the maximum count of consecutive 1s found
        return max;
    }

    // Date: 01/10/2024
    /**
     * Finds the number of subarrays with a sum equal to a given value k.
     *
     * @param nums the input array of integers
     * @param k the target sum for the subarrays
     * @return the number of subarrays with a sum equal to k
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int subarraySum(int[] nums, int k) {
        // Create a HashMap to store the cumulative sum and its frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initialize count to store the number of subarrays with sum equal to k
        int count = 0;
        // Initialize sum to store the cumulative sum of elements
        int sum = 0;
        // Add a base case to the map: sum 0 has one occurrence
        map.put(0, 1);
        // Iterate through each element in the array
         for (int i = 0; i < nums.length; i++) {
             // Add the current element to the cumulative sum
             sum += nums[i];
             // Check if there is a subarray (ending at the current index) whose sum is k
             if (map.containsKey(sum - k)) {
                 // If found, add the frequency of that sum to the count
                 count += map.get(sum - k);
             }
             // Update the frequency of the current cumulative sum in the map
             if (map.containsKey(sum)) {
                 map.put(sum, map.get(sum) + 1);
             } else {
                 map.put(sum, 1);
             }
         }
         // Return the total count of subarrays with sum equal to k
         return count;
    }

    // Date: 02/10/2024
    // Two Sum Problem
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }

    // Date: 03/10/2024
    // Sort an array of 0's 1's and 2's
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = nums.length - 1;

        while (white <= blue) {
            if (nums[white] == 0) {
                int temp = nums[white];
                nums[white] = nums[red];
                nums[red] = temp;
                red++;
                white++;
            } else if (nums[white] == 1) {
                white++;
            } else {
                int temp = nums[white];
                nums[white] = nums[blue];
                nums[blue] = temp;
                blue--;
            }
        }
    }

    // Date: 04/10/2024
    // Find the Majority Element that occurs more than N/2 times
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int majorityElement(int[] v) {
        int n = v.length;
        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i]) cnt++;
            else cnt--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }

    // Date: 05/10/2024
    // Find the Maximum Subarray Sum
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int total = 0;

        for (int n : nums) {
            if (total < 0) {
                total = 0;
            }

            total += n;
            res = Math.max(res, total);
        }

        return res;
    }

    // Date: 19/11/2024
    // Intersection of Two Arrays II
    // Time Complexity:
    // Space Complexity:
    public static int[] intersectionOf2Arrays(int [] arr1, int [] arr2){
        int[]  frequencyArray = new int[1001];
        for(int num : arr1){
            frequencyArray[num]++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr2){
            if(frequencyArray[num] > 0){
                list.add(num);
                frequencyArray[num]--;
            }
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
}