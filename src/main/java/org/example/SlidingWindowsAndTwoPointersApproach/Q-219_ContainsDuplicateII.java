import java.util.HashSet;

class ContainsDuplicateII{
    // Time Complexity: O(n)
    // Space Complexity: O(k)
    // Sliding Window Approach
    // The idea is to use a sliding window of size k and keep track of the elements in the window using a HashSet
    // If the window size exceeds k, remove the element at the start of the window
    // Check if the current element is already present in the HashSet
    // If the current element is present in the HashSet, return true
    // If the current element is not present in the HashSet, add it to the HashSet
    // Continue this process until the end of the array
    // If no duplicates are found, return false
    // The window size is k, so the time complexity is O(n)
    // The space complexity is O(k) for the HashSet
    // The space complexity can be reduced to O(1) by using a HashMap instead of a HashSet
    // The HashMap can store the element and its index
    // If the current element is already present in the HashMap and the difference between the current index and the index of the element in the HashMap is less than or equal to k, return true
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;

        // Create a HashSet to store the elements in the window
        HashSet<Integer> set = new HashSet<>();

        int i = 0, j = 0;   // i is the start index of the window, j is the end index of the window

        // Slide the window over the array and keep track of the elements in the window using the HashSet
        while (j < n) {
            // Step-1: Check if the current window size exceeds k
            if (j - i > k) {
                set.remove(nums[i]);
                i++; // Shrink the window
            }

            // Check if we have already seen nums[j]
            if (set.contains(nums[j])) {
                return true;
            }

            // Add nums[j] to the set
            set.add(nums[j]);
            j++;
        }

        // If no duplicates are found, return false
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        printResult(nums, k);
        System.out.println("Contains nearby duplicate within " + k + " indices: " + containsNearbyDuplicate(nums, k));

        nums = new int[]{1, 0, 1, 1};
        k = 1;
        printResult(nums, k);
        System.out.println("Contains nearby duplicate within " + k + " indices: " + containsNearbyDuplicate(nums, k));

        nums = new int[]{1, 2, 3, 1, 2, 3};
        k = 2;
        printResult(nums, k);
        System.out.println("Contains nearby duplicate within " + k + " indices: " + containsNearbyDuplicate(nums, k));

        nums = new int[]{99, 99};
        k = 2;
        printResult(nums, k);
        System.out.println("Contains nearby duplicate within " + k + " indices: " + containsNearbyDuplicate(nums, k));

        nums = new int[]{1, 2, 3, 1};
        k = 0;
        printResult(nums, k);
        System.out.println("Contains nearby duplicate within " + k + " indices: " + containsNearbyDuplicate(nums, k));
    }

    // Helper method to print the result
    private static void printResult(int[] nums, int k) {
        System.out.print("Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("k: " + k);
    }
}