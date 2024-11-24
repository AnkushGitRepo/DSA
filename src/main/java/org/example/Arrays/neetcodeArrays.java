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

}