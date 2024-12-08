import java.util.*;

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

        // LeetCode : 58. Length of Last Word
        System.out.println("Input: s = \"Hello World\" \nLength of Last Word : "+ lengthOfLastWordInString("Hello World"));
        System.out.println("Input: s = \" \" \nLength of Last Word : "+ lengthOfLastWordInString(" "));
        System.out.println("Input: s = \"a \" \nLength of Last Word : "+ lengthOfLastWordInString("a "));
        System.out.println("\n\n");

        // LeetCode : 14. Longest Common Prefix
        String[] strs = {"flower","flow","flight"};
        System.out.println("Input: [\"flower\",\"flow\",\"flight\"] \nLongest Common Prefix : "+ longestCommonPrefix(strs));
        System.out.println("Input: [\"dog\",\"racecar\",\"car\"] \nLongest Common Prefix : "+ longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println("\n\n");

        // LeetCode : 49. Group Anagrams
        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("Input: [\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\"] \nGroup Anagrams : "+ groupAnagrams(strs1));
        String[] strs2 = {""};
        System.out.println("Input: [\"\"] \nGroup Anagrams : "+ groupAnagrams(strs2));
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

    // Date : 07/12/2024
    // LeetCode : 58. Length of Last Word
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int lengthOfLastWordInString(String s){
        int count = 0;
        int i = s.length() - 1;
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }

        while(i >= 0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }

    // Date : 08/12/2024
    // LeetCode : 14. Longest Common Prefix
    // Time Complexity: O(NlogN)
    // Space Complexity: O(1)
    public static String longestCommonPrefix(String[] strs){
        StringBuilder result = new StringBuilder();

        // Sort the array of strings
        Arrays.sort(strs);

        // Get the first and last string array
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        // Compare the first and last string array
        for(int i = 0; i < first.length; i++){
            if( first[i] != last[i]){
                break;
            }
            result.append(first[i]);
        }

        return result.toString();
    }

    // Date : 08/12/2024
    // LeetCode : 49. Group Anagrams
    // Time Complexity: O(N * K)
    // Space Complexity: O(N * K)
    public static List<List<String>> groupAnagrams(String[] strs){
        // Check for empty array or null array
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        // Create a hashmap to store the sorted string as key and the list of anagrams as value
        HashMap<String, List<String>> map = new HashMap<>();
        // Iterate through the array of strings
        for (String str : strs){
            String frequencyString = getFrequencyString(str);
            if(map.containsKey(frequencyString)){
                map.get(frequencyString).add(str);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(frequencyString,list);
            }
        }

        return new ArrayList<>(map.values());
    }

    // Helper Method for groupAnagrams method to get the frequency of the string. [LeetCode : 49. Group Anagrams]
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static String getFrequencyString(String str){
        int[] frequency = new int[26];
        for(char ch : str.toCharArray()){
            frequency[ch - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        char ch = 'a';
        for(int freq : frequency){
            sb.append(ch);
            sb.append(freq);
            ch++;
        }
        return sb.toString();
    }

}