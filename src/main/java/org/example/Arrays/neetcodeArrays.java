import java.util.HashSet;

class neetcodeArrays{
    public static void main(String[] args) {
        // LeetCode : 217. Contains Duplicate Test Case.
        int[] arr1 = {1,1,1,3,3,4,3,2,4,2};
        print(arr1);
        System.out.println("Does arr1 Contain Duplicate ? : "+ containsDuplicate(arr1));
        System.out.println("\n\n");

        // LeetCode : 242. Valid Anagram
        System.out.println("Input: s = \"anagram\", t = \"nagaram\" \nAre they valid anagram ? : "+ isAnagram("anagram","nagaram"));
        System.out.println("Input s = \"rat\", t = \"car\" \nAre they valid anagram ? : "+ isAnagram("rat","car"));
        System.out.println("\n\n");

        // LeetCode : 1929. Concatenation of Array
        int[] arr2 = {1,2,3,4,5};
        print(arr2);
        System.out.println("Concatenation Of Given Array With Itself :  ");
        print(getConcatenation(arr2));
        System.out.println("\n\n");

        // LeetCode : 1299. Replace Elements with Greatest Element on Right Side
        int[] arr3 = {17,18,5,4,6,1};
        print(arr3);
        System.out.println("After Replacing Elements with Greatest Element on Right Side : ");
        print(replaceElements(arr3));
        System.out.println("\n\n");

        // LeetCode : 392. Is Subsequence
        System.out.println("Input: s = \"abc\", t = \"ahbgdc\" \nIs s subsequence of t ? : "+ new neetcodeArrays().isSubsequence("abc","ahbgdc"));
        System.out.println("Input: s = \"axc\", t = \"ahbgdc\" \nIs s subsequence of t ? : "+ new neetcodeArrays().isSubsequence("axc","ahbgdc"));
        System.out.println("\n\n");


    }

    // Helper Method. (print)
    // print function
    public static void print(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // Date : 24/11/2024
    // LeetCode : 217. Contains Duplicate
    // Time Complexity: O(1)
    // Space Complexity: O(N)
    public static boolean containsDuplicate(int[] arr){
        HashSet<Integer> setOfUniqueNum = new HashSet<>();
        for(int num : arr){
            if(setOfUniqueNum.contains(num)){
                return true;
            }
            setOfUniqueNum.add(num);
        }
        return false;
    }

    // Date : 24/11/2024
    // LeetCode : 242. Valid Anagram
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] charCounter = new int[26];
        for(int i = 0; i < s.length(); i++){
            charCounter[s.charAt(i) - 'a']++;
            charCounter[t.charAt(i) - 'a']--;
        }

        for(int num : charCounter){
            if (num != 0){
                return false;
            }
        }
        return true;
    }

    // Date : 24/11/2024
    // LeetCode : 1929. Concatenation of Array
    // Time Complexity: O(N)
    // Space Complexity: O(2N)
    public static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[n * 2];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[n+i] = nums[i];
        }
        return ans;
    }

    // Date : 26/11/2024
    // LeetCode : 1299. Replace Elements with Greatest Element on Right Side
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;
        for(int i = n-1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }
        return arr;
    }

    // Date : 06/12/2024
    // LeetCode : 392. Is Subsequence
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    // Approach: Two Pointer
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        return i == s.length();
    }


}