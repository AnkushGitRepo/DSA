class NextPermutation{
    // Given an array of integers, find the next lexicographical permutation of the array.
    // The next permutation is the next greater permutation of the array in lexicographical order.
    // If such arrangement is not possible, it must be rearranged as the lowest possible order (i.e., sorted in ascending order).
    // The algorithm follows these steps:
    // 1. Find the largest index i such that nums[i] < nums[i + 1]. If no such index exists, the permutation is the last permutation.
    // 2. Find the largest index j such that nums[j] > nums[i]. Swap the values at indices i and j.
    // 3. Reverse the sequence from nums[i + 1] to the end of the array.
    // 4. Return the modified array.
    // Time complexity: O(n)
    // Space complexity: O(1)
    public static void nextPermutation(int[] nums) {
        int ind1=-1;   // breaking point
        int ind2=-1;   // next greater element
        // step 1 find breaking point
        for(int i=nums.length-2;i>=0;i--){
            // find the first decreasing element from the end
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
        // if there is no breaking  point
        if(ind1==-1){
            reverse(nums,0);   // reverse the whole array
        }
        else{
            // step 2 find next greater element and swap with ind2
            for(int i=nums.length-1;i>=0;i--){
                // find the first greater element from the end
                if(nums[i]>nums[ind1]){
                    ind2=i;
                    break;
                }
            }

            // swap the breaking point with the next greater element
            swap(nums,ind1,ind2);
            // step 3 reverse the rest right half
            reverse(nums,ind1+1);
        }
    }
    static void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    static void reverse(int[] nums, int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Expected output: 1 3 2
        System.out.println();

        nums = new int[]{3, 2, 1};
        nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Expected output: 1 2 3
        System.out.println();

        nums = new int[]{1, 5, 1};
        nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Expected output: 5 1 1
        System.out.println();

        nums = new int[]{1, 3, 2};
        nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Expected output: 2 1 3
        System.out.println();

        nums = new int[]{1, 2, 3, 4};
        nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Expected output: 1 2 4 3
        System.out.println();
    }
}