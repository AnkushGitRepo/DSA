import java.util.HashSet;
import java.util.Set;

class TwoSumIV{

    // 653. Two Sum IV - Input is a BST
    // https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
    // Time complexity: O(n)
    // Space complexity: O(n)
    // Two pointers approach
    // The idea is to use a set to store the elements of the BST.
    // We use a recursive function to traverse the BST in a preorder manner.
    // For each node, we check if the difference between the target and the current node's value is present in the set.
    // If the difference is present, we return true.
    // Otherwise, we add the current node's value to the set and continue the traversal.
    // If we reach the end of the BST without finding a pair of elements that sum up to the target, we return false.

    public static boolean findTarget(TreeNode root, int k) {

        // Initialize a set to store the elements of the BST
        Set<Integer> set = new HashSet<>();

        // Use a recursive function to traverse the BST in a preorder manner and find the pair of elements that sum up to the target
        return preorder(root, set, k);
    }

    // Recursive function to traverse the BST in a preorder manner and find the pair of elements that sum up to the target
    public static boolean preorder(TreeNode root, Set<Integer> set, int k){

        // If the current node is null, return false as we have reached the end of the BST
        if(root == null)  {
            return  false;
        }

        // Calculate the counter element required to sum up to the target
        int counterEl  = k - root.val;

        // If the counter element is present in the set, return true
        if(set.contains(counterEl)) {
            return true;
        }

        // Add the current node's value to the set
        set.add(root.val);

        // Recursively check the left and right subtrees for the pair of elements that sum up to the target
        return preorder(root.left, set, k) || preorder(root.right, set, k);
    }

    // Definition for a binary tree node (given by the problem)
    static class TreeNode {
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

    // Main function to test the solution
    public static void main(String[] args) {
        // Test cases to validate the solution
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        int k = 9;
        System.out.println(findTarget(root, k)); // Expected output: true

        root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        k = 28;
        System.out.println(findTarget(root, k)); // Expected output: false

        root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        k = 4;
        System.out.println(findTarget(root, k)); // Expected output: true

        root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        k = 1;
        System.out.println(findTarget(root, k)); // Expected output: false

        root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        k = 3;
        System.out.println(findTarget(root, k)); // Expected output: true
    }
}

