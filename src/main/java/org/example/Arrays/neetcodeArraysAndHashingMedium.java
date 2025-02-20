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

        // LeetCode 36. Valid Sudoku
        System.out.println("LeetCode 36. Valid Sudoku");
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println("Is Valid Sudoku: " + isValidSudoku(board));
        char[][] board1 = {
            {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println("Is Valid Sudoku: " + isValidSudoku(board1));
        System.out.println("\n\n");

        // LeetCode 128. Longest Consecutive Sequence
        System.out.println("LeetCode 128. Longest Consecutive Sequence");
        int[] nums6 = {100, 4, 200, 1, 3, 2};
        System.out.println("Input Array: ");
        printArray(nums6);
        System.out.println("Longest Consecutive Sequence: " + longestConsecutive(nums6));
        int[] nums7 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("Input Array: ");
        printArray(nums7);
        System.out.println("Longest Consecutive Sequence: " + longestConsecutive(nums7));
        System.out.println("\n\n");

        // LeetCode 122. Best Time to Buy and Sell Stock II
        System.out.println("LeetCode 122. Best Time to Buy and Sell Stock II");
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Input Array: ");
        printArray(prices);
        System.out.println("Max Profit: " + maxProfit(prices));
        int[] prices1 = {1, 2, 3, 4, 5};
        System.out.println("Input Array: ");
        printArray(prices1);
        System.out.println("Max Profit: " + maxProfit(prices1));
        System.out.println("\n\n");

        // LeetCode 229. Majority Element II
        System.out.println("LeetCode 229. Majority Element II");
        int[] nums8 = {3, 2, 3};
        System.out.println("Input Array: ");
        printArray(nums8);
        List<Integer> result2 = majorityElement(nums8);
        System.out.println("Majority Elements: ");
        for (int num : result2){
            System.out.print(num + " ");
        }
        System.out.println();
        int[] nums9 = {1};
        System.out.println("Input Array: ");
        printArray(nums9);
        List<Integer> result3 = majorityElement(nums9);
        System.out.println("Majority Elements: ");
        for (int num : result3){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("\n\n");

        // LeetCode 7. Reverse Integer
        System.out.println("LeetCode 7. Reverse Integer");
        int x = 123;
        System.out.println("Input: " + x);
        System.out.println("Reverse: " + reverse(x));
        int x1 = -123;
        System.out.println("Input: " + x1);
        System.out.println("Reverse: " + reverse(x1));
        System.out.println("\n\n");

        // LeetCode 8. String to Integer atoi
        System.out.println("LeetCode 8. String to Integer atoi");
        String s = "42";
        System.out.println("Input: " + s);
        System.out.println("Output: " + myAtoi(s));
        String s1 = "   -425332";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + myAtoi(s1));
        System.out.println("\n\n");

        // LeetCode 13. Roman to Integer
        System.out.println("LeetCode 13. Roman to Integer");
        String s2 = "III";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + romanToInt(s2));
        String s3 = "IV";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + romanToInt(s3));
        System.out.println("\n\n");

        // LeetCode 12. Integer to Roman
        System.out.println("LeetCode 12. Integer to Roman");
        int num = 3;
        System.out.println("Input: " + num);
        System.out.println("Output: " + intToRoman(num));
        int num1 = 4;
        System.out.println("Input: " + num1);
        System.out.println("Output: " + intToRoman(num1));
        System.out.println("\n\n");

        // LeetCode 21. Merge Two Sorted Lists
        System.out.println("LeetCode 21. Merge Two Sorted Lists");
        // ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        // ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        // ListNode result4 = mergeTwoLists(l1, l2);
        // System.out.println("Merged List: ");
        // while (result4 != null){
        //     System.out.print(result4.val + " ");
        //     result4 = result4.next;
        // }
        System.out.println("\n\n");

        // LeetCode 35. Search Insert Position
        System.out.println("LeetCode 35. Search Insert Position");
        int[] nums10 = {1, 3, 5, 6};
        int target = 5;
        System.out.println("Input Array: ");
        printArray(nums10);
        System.out.println("Target: " + target);
        System.out.println("Insert Position: " + searchInsert(nums10, target));
        int[] nums11 = {1, 3, 5, 6};
        int target1 = 2;
        System.out.println("Input Array: ");
        printArray(nums11);
        System.out.println("Target: " + target1);
        System.out.println("Insert Position: " + searchInsert(nums11, target1));
        System.out.println("\n\n");

        // LeetCode 28. Find the Index of the First Occurrence in a String
        System.out.println("LeetCode 28. Find the Index of the First Occurrence in a String");
        String haystack = "hello";
        String needle = "ll";
        System.out.println("Input: " + haystack + " " + needle);
        System.out.println("Index: " + strStr(haystack, needle));
        String haystack1 = "aaaaa";
        String needle1 = "bba";
        System.out.println("Input: " + haystack1 + " " + needle1);
        System.out.println("Index: " + strStr(haystack1, needle1));

        // LeetCode 66. Plus One
        System.out.println("LeetCode 66. Plus One");
        int[] digits = {1, 2, 3};
        System.out.println("Input Array: ");
        printArray(digits);
        int[] result5 = plusOne(digits);
        System.out.println("Output Array: ");
        printArray(result5);
        int[] digits1 = {4, 3, 2, 1};
        System.out.println("Input Array: ");
        printArray(digits1);
        int[] result6 = plusOne(digits1);
        System.out.println("Output Array: ");
        printArray(result6);
        System.out.println("\n\n");

        // LeetCode 69. Sqrt(x)
        System.out.println("LeetCode 69. Sqrt(x)");
        int x2 = 4;
        System.out.println("Input: " + x2);
        System.out.println("Output: " + mySqrt(x2));
        int x3 = 8;
        System.out.println("Input: " + x3);
        System.out.println("Output: " + mySqrt(x3));
        System.out.println("\n\n");

        // LeetCode 94. Binary Tree Inorder Traversal
        System.out.println("LeetCode 94. Binary Tree Inorder Traversal");
        // TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        // List<Integer> result7 = inorderTraversal(root);
        // System.out.println("Inorder Traversal: ");
        // for (int num : result7){
        //     System.out.print(num + " ");
        // }
        System.out.println("\n\n");

        // LeetCode 125. Valid Palindrome
        System.out.println("LeetCode 125. Valid Palindrome");
        String p1 = "A man, a plan, a canal: Panama";
        System.out.println("Input: " + p1);
        System.out.println("Is Palindrome: " + isPalindrome(p1));
        String p2 = "race a car";
        System.out.println("Input: " + p2);
        System.out.println("Is Palindrome: " + isPalindrome(p2));
        System.out.println("\n\n");

        // LeetCode 225. Implement Stack using Queues
        System.out.println("LeetCode 225. Implement Stack using Queues");
        MyStack stack = new neetcodeArraysAndHashingMedium().new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Empty: " + stack.empty());
        System.out.println("\n\n");

        // LeetCode 222. Count Complete Tree Nodes
        System.out.println("LeetCode 222. Count Complete Tree Nodes");
        // TreeNode root1 = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), null));
        // System.out.println("Count: " + countNodes(root1));
        System.out.println("\n\n");

        // LeetCode 206. Reverse Linked List
        System.out.println("LeetCode 206. Reverse Linked List");
        // ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        // ListNode result8 = reverseList(head);
        // System.out.println("Reversed List: ");
        // while (result8 != null){
        //     System.out.print(result8.val + " ");
        //     result8 = result8.next;
        // }
        System.out.println("\n\n");

        // LeetCode 203. Remove Linked List Elements
        System.out.println("LeetCode 203. Remove Linked List Elements");
        // ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        // int val = 6;
        // ListNode result9 = removeElements(head1, val);
        // System.out.println("Removed List: ");
        // while (result9 != null){
        //     System.out.print(result9.val + " ");
        //     result9 = result9.next;
        // }
        System.out.println("\n\n");

        // LeetCode 100. Same Tree
        System.out.println("LeetCode 100. Same Tree");
        TreeNode a = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode b = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println("Is Same Tree: " + new neetcodeArraysAndHashingMedium().isSameTree(a, b));
        TreeNode a1 = new TreeNode(1, new TreeNode(2), null);
        TreeNode b1 = new TreeNode(1, null, new TreeNode(2));
        System.out.println("Is Same Tree: " + new neetcodeArraysAndHashingMedium().isSameTree(a1, b1));
        System.out.println("\n\n");

        // LeetCode 160. Intersection of Two Linked Lists
//        System.out.println("LeetCode 160. Intersection of Two Linked Lists");
//        ListNode headA = new ListNode(4, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5)))));
//        ListNode headB = new ListNode(5, new ListNode(0, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5))))));
//        System.out.println("Intersection Node: " + getIntersectionNode(headA, headB).val);
//        ListNode headA1 = new ListNode(2, new ListNode(6, new ListNode(4)));
//        ListNode headB1 = new ListNode(1, new ListNode(5));
//        System.out.println("Intersection Node: " + getIntersectionNode(headA1, headB1));
//        System.out.println("\n\n");

        // LeetCode 141. Linked List Cycle
        System.out.println("LeetCode 141. Linked List Cycle");
        // ListNode head2 = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4)));
        // head2.next.next.next.next = head2.next;
        // System.out.println("Has Cycle: " + hasCycle(head2));
        // ListNode head3 = new ListNode(1, new ListNode(2));
        // head3.next.next = head3;
        // System.out.println("Has Cycle: " + hasCycle(head3));
        System.out.println("\n\n");

        // LeetCode 219. Contains Duplicate II
        System.out.println("LeetCode 219. Contains Duplicate II");
        int[] nums12 = {1, 2, 3, 1};
        int k2 = 3;
        System.out.println("Input Array: ");
        printArray(nums12);
        System.out.println("Contains Duplicate: " + containsNearbyDuplicate(nums12, k2));
        int[] nums13 = {1, 0, 1, 1};
        int k3 = 1;
        System.out.println("Input Array: ");
        printArray(nums13);
        System.out.println("Contains Duplicate: " + containsNearbyDuplicate(nums13, k3));
        System.out.println("\n\n");

        // LeetCode 144. Binary Tree Preorder Traversal
        System.out.println("LeetCode 144. Binary Tree Preorder Traversal");
        TreeNode root2 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> result10 = preorderTraversal(root2);
        System.out.println("Preorder Traversal: ");
        for (int temp1 : result10){
            System.out.print(temp1 + " ");
        }
        System.out.println("\n\n");

        // LeetCode 145. Binary Tree Postorder Traversal
        System.out.println("LeetCode 145. Binary Tree Postorder Traversal");
        TreeNode root3 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> result11 = postorderTraversal(root3);
        System.out.println("Postorder Traversal: ");
        for (int temp2 : result11){
            System.out.print(temp2 + " ");
        }
        System.out.println("\n\n");

        // LeetCode 191. Number of 1 Bits
        System.out.println("LeetCode 191. Number of 1 Bits");
        int n = 00000000000000000000000000001011;
        System.out.println("Input: " + n);
        System.out.println("Number of 1 Bits: " + hammingWeight(n));
        int n1 = 00000000000000000000000010000000;
        System.out.println("Input: " + n1);
        System.out.println("Number of 1 Bits: " + hammingWeight(n1));
        System.out.println("\n\n");

        // LeetCode 3151. Special Array I
        System.out.println("LeetCode 3151. Special Array I");
        int[] nums14 = {3, 5};
        System.out.println("Input Array: ");
        printArray(nums14);
        System.out.println("Special Array: " + isArraySpecial(nums14));
        int[] nums15 = {0, 0};
        System.out.println("Input Array: ");
        printArray(nums15);
        System.out.println("Special Array: " + isArraySpecial(nums15));
        System.out.println("\n\n");

        // LeetCode 83. Remove Duplicates from Sorted List
        System.out.println("LeetCode 83. Remove Duplicates from Sorted List");
        ListNode head4 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        System.out.println("Input List: ");
        printList(head4);
        ListNode result12 = deleteDuplicates(head4);
        System.out.println("Output List: ");
        printList(result12);
        ListNode head5 = new ListNode(1, new ListNode(1, new ListNode(2)));
        System.out.println("Input List: ");
        printList(head5);
        ListNode result13 = deleteDuplicates(head5);
        System.out.println("Output List: ");
        printList(result13);
        System.out.println("\n\n");

        // LeetCode 3105. Longest Strictly Increasing or Strictly Decreasing Subarray.
        System.out.println("LeetCode 3105. Longest Strictly Increasing or Strictly Decreasing Subarray");
        int[] nums16 = {1, 2, 2, 3};
        System.out.println("Input Array: ");
        printArray(nums16);
        System.out.println("Length of Longest Strictly Increasing or Strictly Decreasing Subarray: " + longestMonotonicSubarray(nums16));
        int[] nums17 = {1, 2, 3, 4};
        System.out.println("Input Array: ");
        printArray(nums17);
        System.out.println("Length of Longest Strictly Increasing or Strictly Decreasing Subarray: " + longestMonotonicSubarray(nums17));
        System.out.println("\n\n");

        // LeetCode 1800. Maximum Ascending Subarray Sum
        System.out.println("LeetCode 1800. Maximum Ascending Subarray Sum");
        int[] nums18 = {10, 20, 30, 5, 10, 50};
        System.out.println("Input Array: ");
        printArray(nums18);
        System.out.println("Maximum Ascending Subarray Sum: " + maxAscendingSum(nums18));
        int[] nums19 = {10, 20, 30, 40, 50};
        System.out.println("Input Array: ");
        printArray(nums19);
        System.out.println("Maximum Ascending Subarray Sum: " + maxAscendingSum(nums19));
        System.out.println("\n\n");

        // LeetCode: 1790. Check if One String Swap Can Make Strings Equal
        System.out.println("LeetCode: 1790. Check if One String Swap Can Make Strings Equal");
        String s4 = "bank";
        String t = "kanb";
        System.out.println("Input: " + s4 + " " + t);
        System.out.println("Can Make Equal: " + areAlmostEqual(s4, t));
        String s5 = "attack";
        String t1 = "defend";
        System.out.println("Input: " + s5 + " " + t1);
        System.out.println("Can Make Equal: " + areAlmostEqual(s5, t1));
        System.out.println("\n\n");

        // LeetCode: 1726. Tuple with Same Product
        System.out.println("LeetCode: 1726. Tuple with Same Product");
        int[] nums20 = {2, 3, 4, 6};
        System.out.println("Input Array: ");
        printArray(nums20);
        System.out.println("Number of Tuples with Same Product: " + tupleSameProduct(nums20));
        int[] nums21 = {1, 2, 4, 5, 10};
        System.out.println("Input Array: ");
        printArray(nums21);
        System.out.println("Number of Tuples with Same Product: " + tupleSameProduct(nums21));
        System.out.println("\n\n");

        // LeetCode: 110. Balanced Binary Tree
        System.out.println("LeetCode: 110. Balanced Binary Tree");
        TreeNode root4 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println("Is Balanced: " + isBalanced(root4));
        TreeNode root5 = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2));
        System.out.println("Is Balanced: " + isBalanced(root5));
        System.out.println("\n\n");

        // LeetCode: 104. Maximum Depth of Binary Tree
        System.out.println("LeetCode: 104. Maximum Depth of Binary Tree");
        TreeNode root6 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println("Maximum Depth: " + maxDepth(root6));
        TreeNode root7 = new TreeNode(1, new TreeNode(2), null);
        System.out.println("Maximum Depth: " + maxDepth(root7));
        System.out.println("\n\n");

        // LeetCode: 168. Excel Sheet Column Title
        System.out.println("LeetCode: 168. Excel Sheet Column Title");
        int n2 = 1;
        System.out.println("Input: " + n2);
        System.out.println("Output: " + convertToTitle(n2));
        int n3 = 28;
        System.out.println("Input: " + n3);
        System.out.println("Output: " + convertToTitle(n3));
        System.out.println("\n\n");

        // LeetCode: 171. Excel Sheet Column Number
        System.out.println("LeetCode: 171. Excel Sheet Column Number");
        String s6 = "A";
        System.out.println("Input: " + s6);
        System.out.println("Output: " + titleToNumber(s6));
        String s7 = "AB";
        System.out.println("Input: " + s7);
        System.out.println("Output: " + titleToNumber(s7));
        System.out.println("\n\n");

        // LeetCode: 190. Reverse Bits
        System.out.println("LeetCode: 190. Reverse Bits");
        int n4 = 43261596;
        System.out.println("Input: " + n4);
        System.out.println("Output: " + reverseBits(n4));
        int n5 = 429496729;
        System.out.println("Input: " + n5);
        System.out.println("Output: " + reverseBits(n5));
        System.out.println("\n\n");

        // LeetCode: 112. Path Sum
        System.out.println("LeetCode: 112. Path Sum");
        TreeNode root8 = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        int sum = 22;
        System.out.println("Input: " + sum);
        System.out.println("Has Path Sum: " + hasPathSum(root8, sum));
        TreeNode root9 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        int sum1 = 5;
        System.out.println("Input: " + sum1);
        System.out.println("Has Path Sum: " + hasPathSum(root9, sum1));
        System.out.println("\n\n");

        // LeetCode: 108. Convert Sorted Array to Binary Search Tree
        System.out.println("LeetCode: 108. Convert Sorted Array to Binary Search Tree");
        int[] nums22 = {-10, -3, 0, 5, 9};
        System.out.println("Input Array: ");
        printArray(nums22);
        TreeNode result14 = sortedArrayToBST(nums22);
        System.out.println("Inorder Traversal: ");
        List<Integer> result15 = inorderTraversal(result14);
        for (int num12 : result15){
            System.out.print(num + " ");
        }
        System.out.println();
        int[] nums23 = {1, 3};
        System.out.println("Input Array: ");
        printArray(nums23);
        TreeNode result16 = sortedArrayToBST(nums23);
        System.out.println("Inorder Traversal: ");
        List<Integer> result17 = inorderTraversal(result16);
        for (int num12 : result17){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("\n\n");

        // LeetCode: 101. Symmetric Tree
        System.out.println("LeetCode: 101. Symmetric Tree");
        TreeNode root10 = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        System.out.println("Is Symmetric: " + isSymmetric(root10));
        TreeNode root11 = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3)));
        System.out.println("Is Symmetric: " + isSymmetric(root11));
        System.out.println("\n\n");

        // Leetcode: 70. Climbing Stairs
        System.out.println("LeetCode: 70. Climbing Stairs");
        int n6 = 2;
        System.out.println("Input: " + n6);
        System.out.println("Output: " + climbStairs(n6));
        int n7 = 3;
        System.out.println("Input: " + n7);
        System.out.println("Output: " + climbStairs(n7));
        System.out.println("\n\n");

        // LeetCode: 67. Add Binary
        System.out.println("LeetCode: 67. Add Binary");
        String a2 = "11";
        String b2 = "1";
        System.out.println("Input: " + a2 + " " + b2);
        System.out.println("Output: " + addBinary(a2, b2));
        String a3 = "1010";
        String b3 = "1011";
        System.out.println("Input: " + a3 + " " + b3);
        System.out.println("Output: " + addBinary(a3, b3));
        System.out.println("\n\n");

        // LeetCode: 111. Minimum Depth of Binary Tree
        System.out.println("LeetCode: 111.Minimum Depth of Binary Tree");
        TreeNode root12 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println("Minimum Depth: " + minDepth(root12));
        TreeNode root13 = new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))));
        System.out.println("Minimum Depth: " + minDepth(root13));
        System.out.println("\n\n");

        // LeetCode: 2375. Construct Smallest Number From DI String
        System.out.println("LeetCode: 2375. Construct Smallest Number From DI String");
        String s8 = "DIDIDID";
        System.out.println("Input: " + s8);
        System.out.println("Output: " + smallestNumber(s8));
        String s9 = "III";
        System.out.println("Input: " + s9);
        System.out.println("Output: " + smallestNumber(s9));
        System.out.println("\n\n");

        // LeetCode: 121. Best Time to Buy and Sell Stock
        System.out.println("LeetCode: 121. Best Time to Buy and Sell Stock");
        int[] prices2 = {7, 1, 5, 3, 6, 4};
        System.out.println("Input Array: ");
        printArray(prices2);
        System.out.println("Max Profit: " + maxProfit1(prices2));
        int[] prices3 = {7, 6, 4, 3, 1};
        System.out.println("Input Array: ");
        printArray(prices3);
        System.out.println("Max Profit: " + maxProfit1(prices3));
        System.out.println("\n\n");

        // LeetCode: 226. Invert Binary Tree
        System.out.println("LeetCode: 226. Invert Binary Tree");
        TreeNode root14 = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        System.out.println("Inorder Traversal: ");
        List<Integer> result18 = inorderTraversal(invertTree(root14));
        for (int num12 : result18){
            System.out.print(num12 + " ");
        }
        System.out.println();
        TreeNode root15 = new TreeNode(2, new TreeNode(1, new TreeNode(4), null), new TreeNode(3, new TreeNode(7), null));
        System.out.println("Inorder Traversal: ");
        List<Integer> result19 = inorderTraversal(invertTree(root15));
        for (int num12 : result19){
            System.out.print(num12 + " ");
        }
        System.out.println();
        System.out.println("\n\n");

    }

    // Helper Method for printing list
    private static void printList(ListNode result13) {
        while (result13 != null){
            System.out.print(result13.val + " ");
            result13 = result13.next;
        }
        System.out.println();
    }

    // Helper Method for printing array
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Helper Method for inorderTraversal
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()){
            while (current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        return result;
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

    // Date: 06/01/2025
    // LeetCode: 36. Valid Sudoku
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                char number = board[i][j];
                if (number != '.'){
                    if (!seen.add(number + " in row " + i) ||
                            !seen.add(number + " in column " + j) ||
                            !seen.add(number + " in block " + i/3 + "-" + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // Date: 07/01/2025
    // LeetCode: 128. Longest Consecutive Sequence
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int longestConsecutive(int[] nums) {
        int longestStreak = 0;
        Map<Integer, Boolean> numMap = new HashMap<>();

        for (int num : nums){
            numMap.put(num, Boolean.FALSE);
        }

        for (int num : nums){
            int currentLength = 1;

            // Checking for next numbers
            int nextNum = num + 1;
            while(numMap.containsKey(nextNum) && numMap.get(nextNum) == Boolean.FALSE){
                currentLength++;
                numMap.put(nextNum, Boolean.TRUE);        // Marking the number as visited
                nextNum++;                                // Moving to next number

            }

            // Checking for previous numbers
            int prevNum = num - 1;
            while(numMap.containsKey(prevNum) && numMap.get(prevNum) == Boolean.FALSE){
                currentLength++;
                numMap.put(prevNum, Boolean.TRUE);        // Marking the number as visited
                prevNum--;                                // Moving to previous number
            }

            longestStreak = Math.max(longestStreak, currentLength);     // Updating the longest streak
        }
        return longestStreak;
    }

    // Date: 08/01/2025
    // LeetCode: 122. Best Time to Buy and Sell Stock II
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i - 1]){
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    // Date: 09/01/2025
    // LeetCode: 229. Majority Element II
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (mpp.containsKey(nums[i])) {
                mpp.put(nums[i], mpp.get(nums[i]) + 1);
            } else {
                mpp.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            if (entry.getValue() > n / 3) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    // Date: 10/01/2025
    // LeetCode: 7. Reverse Integer
    // Time Complexity: O(log(x))
    // Space Complexity: O(1)
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    // Date: 11/01/2025
    // LeetCode: 8. String to Integer atoi
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int myAtoi(String s) {
        int index = 0, total = 0, sign = 1;
        if (s.length() == 0) return 0;
        while (index < s.length() && s.charAt(index) == ' ') index++;
        if (index == s.length()) return 0;
        if (s.charAt(index) == '+' || s.charAt(index) == '-'){
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        while (index < s.length()){
            int digit = s.charAt(index) - '0';
            if (digit < 0 || digit > 9) break;
            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = 10 * total + digit;
            index++;
        }
        return total * sign;
    }

    // Date: 12/01/2025
    // LeetCode: 13. Roman to Integer
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            if (i > 0 && romanToInt(s.charAt(i)) > romanToInt(s.charAt(i - 1))){
                result += romanToInt(s.charAt(i)) - 2 * romanToInt(s.charAt(i - 1));
            } else {
                result += romanToInt(s.charAt(i));
            }
        }
        return result;
    }

    // Helper Method for roman to integer
    public static int romanToInt(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    // Date: 13/01/2025
    // LeetCode: 12. Integer to Roman
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++){
            while (num >= values[i]){
                num -= values[i];
                result.append(symbols[i]);
            }
        }
        return result.toString();
    }

    // Date: 14/01/2025
    // LeetCode: 21. Merge Two Sorted Lists
    // Time Complexity: O(n)
    // Space Complexity: O(1)
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
//        if(l1 == null) return l2;
//        if(l2 == null) return l1;
//        if(l1.val < l2.val){
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        } else{
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }
//    }

    // Date: 15/01/2025
    // LeetCode: 35. Search Insert Position
    // Time Complexity: O(logn)
    // Space Complexity: O(1)
    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    // Date: 16/01/2025
    // LeetCode: 28. Find the Index of the First Occurrence in a String
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        for (int i = 0; i < haystack.length(); i++){
            if (i + needle.length() > haystack.length()) return -1;
            for (int j = 0; j < needle.length(); j++){
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
                if (j == needle.length() - 1) return i;
            }
        }
        return -1;
    }

    // Date: 17/01/2025
    // LeetCode: 66. Plus One
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i > -1; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    // Date: 18/01/2025
    // LeetCode: 69. Sqrt(x)
    // Time Complexity: O(logn)
    // Space Complexity: O(1)
    public static int mySqrt(int x) {
        if (x == 0) return 0;
        int low = 1, high = x;
        while (low < high){
            int mid = low + (high - low) / 2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) return mid;
            if (mid > x / mid) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    // Date: 19/01/2025
    // LeetCode: 94. Binary Tree Inorder Traversal
    // Time Complexity: O(n)
    // Space Complexity: O(n)
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode current = root;
//        while (current != null || !stack.isEmpty()){
//            while (current != null){
//                stack.push(current);
//                current = current.left;
//            }
//            current = stack.pop();
//            result.add(current.val);
//            current = current.right;
//        }
//        return result;
//    }

    // Date: 20/01/2025
    // LeetCode: 125. Valid Palindrome
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static boolean isPalindrome(String s){
        int p1 = 0, p2 = s.length() - 1;
        s = s.toLowerCase();

        while (p1 < p2){
            char ch1 = s.charAt(p1);
            char ch2 = s.charAt(p2);

            if (!(ch1 >= 'a' && ch1 <= 'z' || ch1 >= '0' && ch1 <= '9')){
                p1++;
                continue;
            }
            if (!(ch2 >= 'a' && ch2 <= 'z' || ch2 >= '0' && ch2 <= '9')){
                p2--;
                continue;
            }

            if (ch1 != ch2){
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }

    // Date: 21/01/2025
    // LeetCode: 225. Implement Stack using Queues
    // Time Complexity: O(1)
    // Space Complexity: O(N)
    class MyStack{
        Queue<Integer> queue;
        public MyStack() {
            queue = new LinkedList();
        }

        public void push(int x) {
            int size = queue.size();
            queue.add(x);
            while(size --> 0){
                queue.add(queue.poll());
            }
        }

        public int pop() {
            return queue.poll();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }

    // Date: 22/01/2025
    // LeetCode: 222. Count Complete Tree Nodes
    // Time Complexity: O(log(n)^2)
    // Space Complexity: O(1)
//    public int countNodes(TreeNode root) {
//        if (root == null) return 0;
//        int leftHeight = 0, rightHeight = 0;
//        TreeNode left = root, right = root;
//        while (left != null){
//            leftHeight++;
//            left = left.left;
//        }
//        while (right != null){
//            rightHeight++;
//            right = right.right;
//        }
//        if (leftHeight == rightHeight) return (int)Math.pow(2, leftHeight) - 1;
//        return 1 + countNodes(root.left) + countNodes(root.right);
//    }

    // Date: 23/01/2025
    // LeetCode: 206. Reverse Linked List
    // Time Complexity: O(n)
    // Space Complexity: O(n)
//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null ){
//            return head;
//        }
//
//        ListNode a = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return a;
//    }

    // Date: 24/01/2025
    // LeetCode: 203. Remove Linked List Elements
    // Time Complexity: O(n)
    // Space Complexity: O(1)
//    public ListNode removeElements(ListNode head, int val) {
//        ListNode dummy = new ListNode(-1);
//        dummy.next = head;
//
//        ListNode curr = dummy;
//        while( curr.next != null){
//            if (curr.next.val == val){
//                curr.next = curr.next.next;
//            }
//            else{
//                curr = curr.next;
//            }
//
//
//        }
//        return dummy.next;
//    }

    // Date: 25/01/2025
    // LeetCode: 100. Same Tree
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean isSameTree(TreeNode a, TreeNode b) {
        if ( a == null && b == null ) return true;
        if ( a == null || b == null ) return false;
        if ( a.val != b.val ) return false;

        boolean leftAnswer = isSameTree(a.left,b.left);
        boolean rightAnswer = isSameTree(a.right,b.right);

        return leftAnswer && rightAnswer;
    }

    // Date: 26/01/2025
    // LeetCode: 160. Intersection of Two Linked Lists
    // Time Complexity: O(n)
    // Space Complexity: O(1)
//    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode tempA = headA;
//        ListNode tempB = headB;
//        while(tempA != tempB) {
//            tempA = tempA != null ? tempA.next : headB;
//            tempB = tempB != null ? tempB.next : headA;
//        }
//        return tempA;
//    }

    // Date: 27/01/2025
    // LeetCode: 141. Linked List Cycle
    // Time Complexity: O(n)
    // Space Complexity: O(1)
//    public static boolean hasCycle(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while (fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if ( slow == fast ){
//                return true;
//            }
//        }
//        return false;
//    }

    // Date: 28/01/2025
    // LeetCode: 219. Contains Duplicate II
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    // Date: 29/01/2025
    // LeetCode: 144. Binary Tree Preorder Traversal
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public  static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        helper(res,root);
        return res;
    }

    // Helper Method for preorder traversal
    private static void helper(List<Integer> res, TreeNode root){
        if ( root == null ){
            return;
        }
        res.add(root.val);
        helper(res,root.left);
        helper(res,root.right);
    }

    // Date: 30/01/2025
    // LeetCode: 145. Binary Tree Postorder Traversal
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traverse(res,root);
        return res;
    }

    public static void traverse(List<Integer> res, TreeNode node){
        if ( node == null ) return;
        traverse(res,node.left);
        traverse(res,node.right);
        res.add(node.val);
    }

    // Date: 31/01/2025
    // LeetCode: 191. Number of 1 Bits
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static int hammingWeight(int n) {
        int result = 0;
        int helper = 1;
        for (int i = 1; i <= 32; i++){
            if (( helper & n) != 0 ){
                result++;
            }
            helper = helper << 1;
        }
        return result;
    }

    // Date: 01/02/2025
    // LeetCode: 3151. Special Array I
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public  static boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; ++i){
            if ((nums[i] % 2) == (nums[i - 1] % 2)){
                return false;
            }
        }
        return true;
    }

    // Date: 02/02/2025
    // LeetCode: 83. Remove Duplicates from Sorted List
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return head;
        }

        ListNode curr = head;
        while (curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }

    // Date: 03/02/2025
    // LeetCode: 3105. Longest Strictly Increasing or Strictly Decreasing Subarray
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int dec = 1;
        int maxLen = 1;

        for ( int i = 1; i < nums.length; i++ ){
            if (nums[i] > nums[i - 1]){
                inc++;
                dec = 1;
            }
            else if (nums[i] < nums[i - 1]){
                dec++;
                inc = 1;
            }
            else{
                inc = 1;
                dec = 1;
            }
            maxLen = Math.max(maxLen,Math.max(inc,dec));
        }
        return maxLen;
    }

    // Date: 04/02/2025
    // LeetCode: 1800. Maximum Ascending Subarray Sum
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int maxAscendingSum(int[] nums){
        int n = nums.length;
        int maxSum = 0;
        int sum = nums[0];

        for (int i = 1; i < n; i++ ){
            if (nums[i] > nums[i - 1]){
                sum += nums[i];
            }
            else{
                maxSum = Math.max(maxSum,sum);
                sum = nums[i];
            }
        }
        return Math.max(maxSum,sum);
    }

    // Date: 05/02/2025
    // LeetCode: 1790. Check if One String Swap Can Make Strings Equal
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int count = 0;
        int [] arr = new int[26];

        for (int i = 0; i < n; i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if (ch1 != ch2) count++;
            arr[ch1 - 'a']++;
            arr[ch2 - 'a']--;
        }
        for ( int i = 0; i < 26; i++){
            if ( arr[i] != 0 ) return false;
        }

        return count == 0 || count == 2;
    }

    // Date: 06/02/2025
    // LeetCode: 1726. Tuple with Same Product
    // Time Complexity: O(n^2)
    // Space Complexity: O(n^2)
    public static int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> productMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                int res = nums[i] * nums[j];
                productMap.put(res,productMap.getOrDefault(res,0)+1);
            }
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : productMap.entrySet() ){
            int product = entry.getKey();
            int count = entry.getValue();
            if (count >= 2){
                int comb = (count * (count - 1))/2;
                ans += comb * 8;
            }
        }
        return ans;
    }

    // Date: 07/02/2025
    // LeetCode: 110. Balanced Binary Tree
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    // Helper Method for height of tree
    public static int height(TreeNode root){
        if (root == null) return 0;
        int left = height(root.left);
        if (left == -1) return -1;
        int right = height(root.right);
        if (right == -1) return -1;
        if (Math.abs(left - right) > 1) return -1;
        return 1 + Math.max(left,right);
    }

    // Date: 08/02/2025
    // LeetCode: 104. Maximum Depth of Binary Tree
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left,right);
    }

    // Date: 09/02/2025
    // LeetCode: 168. Excel Sheet Column Title
    // Time Complexity: O(logn)
    // Space Complexity: O(1)
    public static String convertToTitle(int col) {
        StringBuilder sb = new StringBuilder();

        while (col > 0){
            int r = ( col - 1 ) % 26;
            sb.append((char)(r + 'A'));
            col = ( col - 1 ) / 26;
        }
        return sb.reverse().toString();
    }

    // Date: 10/02/2025
    // LeetCode: 171. Excel Sheet Column Number
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int titleToNumber(String col) {
        int sum = 0, p = 0;
        int n = col.length();

        for (int i = n - 1; i >= 0; i-- ){
            int temp = col.charAt(i) - 64;
            sum = sum + (int)Math.pow(26,p++) * temp;
        }
        return sum;
    }

    // Date: 11/02/2025
    // LeetCode: 190. Reverse Bits
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static int reverseBits(int n) {
        boolean isSigned = false;
        if(n < 0)
            isSigned = true;
        int result = 0;
        int i = 0;
        while (i < 31) {
            result = result | (n & 1);
            n = n >> 1;
            result = result << 1;
            i++;
        }
        return isSigned ? result | 1 : result;
    }

    // Date: 12/02/2025
    // LeetCode: 112. Path Sum
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    static int target;
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        target = targetSum;
        return helper(root,0);
    }

    private static boolean helper(TreeNode root, int sum){
        if ( root == null ) return false;
        sum += root.val;
        if (root.left == null && root.right == null ) return sum == target;
        boolean leftAns = helper(root.left,sum);
        boolean rightAns = helper(root.right,sum);
        return leftAns || rightAns;
    }

    // Date: 13/02/2025
    // LeetCode: 108. Convert Sorted Array to Binary Search Tree
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static TreeNode sortedArrayToBST(int[] nums) {
        if ( nums.length == 0 ) return null;
        return createTree(nums,0,nums.length - 1);
    }

    public static TreeNode createTree(int[] nums, int start, int end){
        if ( start > end ) return null;
        int mid = (start + end ) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = createTree(nums,start,mid - 1);
        node.right = createTree(nums,mid + 1,end);
        return node;
    }

    // Date: 14/02/2025
    // LeetCode: 101. Symmetric Tree
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }

    public static boolean isMirror(TreeNode a, TreeNode b){
        if ( a == null && b == null ) return true;
        if ( a == null || b == null ) return false;
        return (a.val == b.val) && isMirror(a.left,b.right) && isMirror(a.right,b.left);
    }

    // Date: 15/02/2025
    // Leetcode: 70. Climbing Stairs
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int climbStairs(int n) {
        if ( n == 1 ) return 1;
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++){
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    // Date: 16/02/2025
    // LeetCode: 67. Add Binary
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static String addBinary(String a, String b) {
        int n1 = a.length() - 1;
        int n2 = b.length() - 1;
        int c = 0, base = 2;

        StringBuilder res = new StringBuilder();
        while ( n1 >= 0 || n2 >= 0) {
            int t1 = 0, t2 = 0, sum;
            if ( n1 >= 0 ){
                t1 = a.charAt(n1--) - '0';
            }
            if ( n2 >= 0){
                t2 = b.charAt(n2--) - '0';
            }
            sum = t1 + t2 + c;
            if ( sum >= base ){
                c = 1;
                sum -= base;
            }
            else{
                c = 0;
            }
            res.append(sum);
        }
        if ( c == 1 ) res.append(c);
        return res.reverse().toString();
    }

    // Date: 17/02/2025
    // LeetCode: 111. Minimum Depth of Binary Tree
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int minDepth(TreeNode root) {
        if ( root == null ) return 0;
        if ( root.left == null && root.right == null ) return 1;

        int ld = root.left == null ? Integer.MAX_VALUE : minDepth(root.left);
        int rd = root.right == null ? Integer.MAX_VALUE : minDepth(root.right);

        return Math.min(ld,rd) + 1;
    }

    // Date: 18/02/2025
    // LeetCode: 2375. Construct Smallest Number From DI String
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static String smallestNumber(String pattern) {
        int size = pattern.length();
        int[] ans = new int[size+1];
        for(int i=0;i<size+1;i++){
            ans[i]=i+1;
        }

        for(int i=0;i<size;i++){
            int t=i;
            while(t<size && pattern.charAt(t)=='D'){
                t++;
            }

            int left=i,right=t;
            while(left<right){
                int temp = ans[left];
                ans[left]=ans[right];
                ans[right]=temp;
                left++;
                right--;
            }

            if(t!=i) i = t-1;

        }

        return Arrays.toString(ans).replaceAll("\\[|\\]|,|\\s", "");
    }

    // Date: 19/02/2025
    // LeetCode: 121. Best Time to Buy and Sell Stock
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int maxProfit1(int[] prices) {
        int buy_price = prices[0];
        int profit = 0;

        for ( int i = 1; i < prices.length; i++ ){
            if ( prices[i] < buy_price ){
                buy_price = prices[i];
            }
            else{
                int current_profit = prices[i] - buy_price;
                profit = Math.max(current_profit, profit);
            }
        }
        return profit;
    }

    // Date: 20/02/2025
    // LeetCode: 226. Invert Binary Tree
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static TreeNode invertTree(TreeNode root) {
        if ( root == null ) return null;

        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}