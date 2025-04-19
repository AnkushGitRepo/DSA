import java.util.Arrays;

class AssignCookies{
    // 455. Assign Cookies
    // https://leetcode.com/problems/assign-cookies/
    // Time Complexity: O(nlogn)
    // Space Complexity: O(1)
    // Two pointers approach
    // The idea is to sort the input arrays of children and cookies.
    // We use two pointers to iterate through the arrays.
    // We start from the end of both arrays and check if the current cookie can satisfy the current child.
    // If the cookie can satisfy the child, we increment the count of satisfied children and move both pointers to the left.
    // If the cookie cannot satisfy the child, we move the pointer of the cookies array to the left.
    // The process continues until we reach the beginning of either array.
    // The result is the count of satisfied children.
    // The result is the maximum number of children that can be satisfied with the given cookies.
    public static int findContentChildren(int[] g, int[] s) {

        // If the input arrays are empty, return 0
        if(s.length==0){
            return 0;
        }

        // Sort the input arrays
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int i=g.length-1;   // index of the last child
        int j=s.length-1;   // index of the last cookie

        // Use two pointers to iterate through the arrays
        while(i>=0 && j>=0){

            // If the current cookie can satisfy the current child
            if(s[j]>=g[i]){
                count++;
                i--;
                j--;
            }
            else{
                i--;
            }
        }

        // Return the count of satisfied children
        return count;
    }

    // Test cases to validate the solution
    public static void main(String[] args) {
        // Test cases to validate the solution
        System.out.println(findContentChildren(new int[]{1,2,3}, new int[]{1,1})); // Expected output: 1
        System.out.println(findContentChildren(new int[]{1,2}, new int[]{1,2,3})); // Expected output: 2
        System.out.println(findContentChildren(new int[]{1,2,3}, new int[]{3})); // Expected output: 1
        System.out.println(findContentChildren(new int[]{1,2,3}, new int[]{})); // Expected output: 0
        System.out.println(findContentChildren(new int[]{}, new int[]{1,2,3})); // Expected output: 0
    }
}