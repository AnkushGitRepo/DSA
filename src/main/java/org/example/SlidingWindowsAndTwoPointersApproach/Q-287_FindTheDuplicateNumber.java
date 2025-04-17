class FindTheDuplicateNumber{
    public static int findDuplicate(int[] nums) {
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        // Two pointers approach
        // The idea is to use the input array as a linked list where the value at each index points to the next index.
        // We use two pointers, slow and fast, to find the duplicate number.
        // The slow pointer moves one step at a time, while the fast pointer moves two steps at a time.
        // If there is a cycle in the linked list, the fast pointer will eventually meet the slow pointer.
        // Once the two pointers meet, we can find the starting point of the cycle by moving one pointer to the head of the list
        // and moving both pointers one step at a time until they meet again.
        // The duplicate number is the value at the meeting point of the two pointers.
        // Using Floyd's Tortoise and Hare algorithm to find the duplicate number
        int slow = nums[0];
        int fast = nums[0];
        do { // we are sure that at least one duplicate is there
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        // find the head of loop
        fast = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }

    public static void main(String[] args) {
        // Test cases to validate the solution
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums)); // Expected output: 2

        nums = new int[]{3, 1, 3, 4, 2};
        System.out.println(findDuplicate(nums)); // Expected output: 3

        nums = new int[]{1, 1};
        System.out.println(findDuplicate(nums)); // Expected output: 1

        nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5};
        System.out.println(findDuplicate(nums)); // Expected output: 5

        nums = new int[]{2, 2, 2, 2, 2};
        System.out.println(findDuplicate(nums)); // Expected output: 2
    }
}