import java.util.*;

class neetcodeArraysAndHashingMedium{
    public static void main(String[] args) {
        System.out.println("Neetcode Arrays and Hashing Medium");

        // LeetCode 912. Sort an Array
        System.out.println("LeetCode 912. Sort an Array");
        int[] nums = {5, 2, 3, 1};
        System.out.println("Input Array: ");
        printArray(nums);
        int[] sortedArray = sortArray(nums);
        printArray(sortedArray);
        int[] nums1 = {5, 1, 1, 2, 0, 0};
        System.out.println("Input Array: ");
        printArray(nums1);
        int[] sortedArray1 = sortArray(nums1);
        printArray(sortedArray1);
        System.out.println("\n\n");

        // LeetCode 347. Top K Frequent Elements
        System.out.println("LeetCode 347. Top K Frequent Elements");
        int[] nums2 = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println("Top " + k + " Frequent Elements");
        System.out.println("Input Array: ");
        printArray(nums2);
        int[] topK = topKFrequent(nums2, k);
        printArray(topK);
        int[] nums3 = {1};
        int k1 = 1;
        System.out.println("Top " + k1 + " Frequent Elements");
        System.out.println("Input Array: ");
        printArray(nums3);
        int[] topK1 = topKFrequent(nums3, k1);
        printArray(topK1);
        System.out.println("\n\n");

        // LeetCode 238. Product of Array Except Self
        System.out.println("LeetCode 238. Product of Array Except Self");
        int[] nums4 = {1, 2, 3, 4};
        System.out.println("Input Array: ");
        printArray(nums4);
        int[] result = productExceptSelf(nums4);
        printArray(result);
        int[] nums5 = {-1, 1, 0, -3, 3};
        System.out.println("Input Array: ");
        printArray(nums5);
        int[] result1 = productExceptSelf(nums5);
        printArray(result1);
        System.out.println("\n\n");

    }

    // Helper Method for printing array
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Date : 01/01/2025
    // LeetCode : 912. Sort an Array
    // Time Complexity: O(nlogn)
    // Space Complexity: O(n)
    public static int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(nums, 0, n - 1);
        return nums;
    }

    // Helper Method for merge sort
    public static void mergeSort(int[] nums, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
    }

    // Helper Method for merge sort
    public static void merge(int[] nums, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = nums[low + i];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = nums[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                nums[k] = left[i];
                i++;
            } else {
                nums[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            nums[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            nums[k] = right[j];
            j++;
            k++;
        }
    }

    // Date : 02/01/2025
    // LeetCode : 347. Top K Frequent Elements
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int[] topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        List<Integer> topK = new ArrayList<>();
        for (int pos = bucket.length - 1;pos >= 0 && topK.size() < k; pos--) {
            if (bucket[pos] != null) {
                topK.addAll(bucket[pos]);
            }
        }

        return topK.stream().mapToInt(i -> i).toArray();

    }

    // Date: 05/01/2025
    // LeetCode: 238. Product of Array Except Self
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] result = new int[nums.length];

        left[0] = 1;
        for (int i = 1; i < nums.length; i++){
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i > -1; i--){
            right[i] = right[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++){
            result[i] = left[i] * right[i];
        }

        return result;
    }
}