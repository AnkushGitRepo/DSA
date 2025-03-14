import java.util.Deque;
import java.util.LinkedList;

// Time complexity: O(n)
// Space complexity: O(n)
// Sliding window approach
// The idea is to use a deque to store the indices of the elements in the sliding window.
// At each step, we add the current element to the deque and remove the indices of the elements that are no longer in the window.
// We maintain the deque in decreasing order of the elements in the window.
// The maximum element in the window is always at the front of the deque.
// We add the maximum element to the result array when the window size is k.
// We remove the indices of the elements that are no longer in the window from the front of the deque.
// We add the current element to the deque while maintaining the decreasing order of the elements.
// We add the maximum element to the result array when the window size is k.
// We remove the indices of the elements that are no longer in the window from the front of the deque.
// We add the current element to the deque while maintaining the decreasing order of the elements.
// We add the maximum element to the result array when the window size is k.
// We remove the indices of the elements that are no longer in the window from the front of the deque.
// We add the current element to the deque while maintaining the decreasing order of the elements.
// We add the maximum element to the result array when the window size is k.

class SlidingWindowMaximum{
    public static int[] maxSlidingWindow(int[] nums, int k) {
        // If the input array is empty, return an empty array
        if(nums.length == 0) return new int[0];

        int n = nums.length;

        // result array to store the maximum elements in each sliding window of size n - k + 1
        int[] result = new int[n-k+1];

        // Deque to store the indices of the elements in the sliding window
        Deque<Integer> deque = new LinkedList<>();
        int i = 0;

        // Process the first k elements separately to initialize the deque with the indices of the elements in the window and maintain the decreasing order of the elements
        for(; i < k; i++){

            // Remove the indices of the elements that are no longer in the window from the front of the deque
            while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]){
                deque.pollLast();   // Remove the last element from the deque
            }

            // Add the current element to the deque while maintaining the decreasing order of the elements
            deque.offerLast(i);
        }

        // Process the remaining elements in the input array to find the maximum elements in each sliding window of size k
        for(; i < n; i++){

            // Add the maximum element to the result array when the window size is k
            result[i-k] = nums[deque.peekFirst()];

            // Remove the indices of the elements that are no longer in the window from the front of the deque
            while(!deque.isEmpty() && deque.peekFirst() <= i-k){
                deque.pollFirst();
            }

            // Remove the indices of the elements that are no longer in the window from the back of the deque
            while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]){
                deque.pollLast();
            }

            // Add the current element to the deque while maintaining the decreasing order of the elements
            deque.offerLast(i);
        }

        // Add the maximum element to the result array for the last sliding window of size k
        result[i-k] = nums[deque.peekFirst()];

        // Return the result array
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxSlidingWindow(nums, k);
        for(int i : result){
            System.out.print(i + " ");
        }

        // Output: 3 3 5 5 6 7
        System.out.println();

        nums = new int[]{1};
        k = 1;
        result = maxSlidingWindow(nums, k);
        for(int i : result){
            System.out.print(i + " ");
        }

        // Output: 1
        System.out.println();

        nums = new int[]{1, -1};
        k = 1;
        result = maxSlidingWindow(nums, k);
        for(int i : result){
            System.out.print(i + " ");
        }

        // Output: 1 -1
        System.out.println();

        nums = new int[]{9, 11};
        k = 2;
        result = maxSlidingWindow(nums, k);
        for(int i : result){
            System.out.print(i + " ");
        }

        // Output: 11
        System.out.println();

        nums = new int[]{4, -2};
        k = 2;
        result = maxSlidingWindow(nums, k);
        for(int i : result){
            System.out.print(i + " ");
        }

        // Output: 4
        System.out.println();

    }
}