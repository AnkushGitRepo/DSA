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

        // LeetCode : 20. Valid Parentheses
        System.out.println("Input: s = \"()\" \nIs Parentheses Valid ? : "+ isValidParentheses("()"));
        System.out.println("Input: s = \"()[]{}\" \nIs Parentheses Valid ? : "+ isValidParentheses("()[]{}"));
        System.out.println("Input: s = \"(]\" \nIs Parentheses Valid ? : "+ isValidParentheses("(]"));
        System.out.println("Input: s = \"([)]\" \nIs Parentheses Valid ? : "+ isValidParentheses("([)]"));
        System.out.println("Input: s = \"{[]}\" \nIs Parentheses Valid ? : "+ isValidParentheses("{[]}"));
        System.out.println("\n\n");

        // LeetCode : 118. Pascal's Triangle
        System.out.println("Input: numRows = 5 \nPascal's Triangle : "+ pascalTriangleList(5));
        System.out.println("Input: numRows = 1 \nPascal's Triangle : "+ pascalTriangleList(1));
        System.out.println("\n\n");

        // LeetCode : 27. Remove Element
        int[] arr4 = {3,2,2,3};
        print(arr4);
        System.out.println("After Removing Element 3 : "+ removeElement(arr4,3));
        System.out.println("\n\n");

        // LeetCode : 929. Unique Email Addresses
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println("Input: ");
        print(emails);
        System.out.println("Number of Unique Email Addresses : "+ numUniqueEmails(emails));
        System.out.println("\n\n");

        // LeetCode : 205. Isomorphic Strings
        System.out.println("Input: s = \"egg\", t = \"add\" \nAre they Isomorphic ? : "+ isIsomorphic("egg","add"));
        System.out.println("Input: s = \"foo\", t = \"bar\" \nAre they Isomorphic ? : "+ isIsomorphic("foo","bar"));
        System.out.println("Input: s = \"paper\", t = \"title\" \nAre they Isomorphic ? : "+ isIsomorphic("paper","title"));
        System.out.println("\n\n");

        // LeetCode : 169. Majority Element
        int[] arr5 = {3,2,3};
        print(arr5);
        System.out.println("Majority Element : "+ majorityElement(arr5));
        System.out.println("\n\n");

        // LeetCode : 605. Can Place Flowers
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println("Input: flowerbed = [1,0,0,0,1], n = 1 \nCan Place Flowers ? : "+ canPlaceFlowers(flowerbed,n));
        int[] flowerbed1 = {1,0,0,0,1};
        int n1 = 2;
        System.out.println("Input: flowerbed = [1,0,0,0,1], n = 2 \nCan Place Flowers ? : "+ canPlaceFlowers(flowerbed1,n1));
        System.out.println("\n\n");

        // LeetCode : 496. Next Greater Element I
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println("Input: nums1 = [4,1,2], nums2 = [1,3,4,2] \nNext Greater Element : "+ Arrays.toString(nextGreaterElement(nums1,nums2)));
        int[] nums3 = {2,4};
        int[] nums4 = {1,2,3,4};
        System.out.println("Input: nums1 = [2,4], nums2 = [1,2,3,4] \nNext Greater Element : "+ Arrays.toString(nextGreaterElement(nums3,nums4)));
        System.out.println("\n\n");

        // LeetCode : 724. Find Pivot Index
        int[] nums5 = {1,7,3,6,5,6};
        System.out.println("Input: nums = [1,7,3,6,5,6] \nPivot Index : "+ pivotIndex(nums5));
        int[] nums6 = {1,2,3};
        System.out.println("Input: nums = [1,2,3] \nPivot Index : "+ pivotIndex(nums6));
        System.out.println("\n\n");

        // LeetCode : 303. Range Sum Query - Immutable
        int[] nums7 = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new neetcodeArrays().new NumArray(nums7);
        System.out.println("Input: nums = [-2, 0, 3, -5, 2, -1] \nSum Range : "+ numArray.sumRange(0,2));
        System.out.println("Input: nums = [-2, 0, 3, -5, 2, -1] \nSum Range : "+ numArray.sumRange(2,5));
        System.out.println("Input: nums = [-2, 0, 3, -5, 2, -1] \nSum Range : "+ numArray.sumRange(0,5));
        System.out.println("\n\n");

        // LeetCode : 448. Find All Numbers Disappeared in an Array
        int[] nums8 = {4,3,2,7,8,2,3,1};
        System.out.println("Input: nums = [4,3,2,7,8,2,3,1] \nDisappeared Numbers : "+ findDisappearedNumbers(nums8));
        int[] nums9 = {1,1};
        System.out.println("Input: nums = [1,1] \nDisappeared Numbers : "+ findDisappearedNumbers(nums9));
        System.out.println("\n\n");

        // LeetCode : 1189. Maximum Number of Balloons
        System.out.println("Input: text = \"nlaebolko\" \nMaximum Number of Balloons : "+ maxNumberOBalloons("nlaebolko"));
        System.out.println("Input: text = \"loonbalxballpoon\" \nMaximum Number of Balloons : "+ maxNumberOBalloons("loonbalxballpoon"));
        System.out.println("\n\n");

        // LeetCode : 290. Word Pattern
        System.out.println("Input: pattern = \"abba\", s = \"dog cat cat dog\" \nAre they Word Pattern ? : "+ wordPattern("abba","dog cat cat dog"));
        System.out.println("Input: pattern = \"abba\", s = \"dog cat cat fish\" \nAre they Word Pattern ? : "+ wordPattern("abba","dog cat cat fish"));
        System.out.println("Input: pattern = \"aaaa\", s = \"dog cat cat dog\" \nAre they Word Pattern ? : "+ wordPattern("aaaa","dog cat cat dog"));
        System.out.println("Input: pattern = \"abba\", s = \"dog dog dog dog\" \nAre they Word Pattern ? : "+ wordPattern("abba","dog dog dog dog"));
        System.out.println("\n\n");

        // LeetCode : 202. Happy Number
        System.out.println("Input: n = 19 \nIs n Happy Number ? : "+ isHappy(19));
        System.out.println("Input: n = 2 \nIs n Happy Number ? : "+ isHappy(2));
        System.out.println("\n\n");

    }

    // Helper Method. (print)
    // print function [for integer array]
    public static void print(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // print function [for string array]
    public static void print(String [] arr){
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

    // Date : 09/12/2024
    // LeetCode : 20. Valid Parentheses
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static boolean isValidParentheses(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '{'){
                stack.push('}');
            }
            else if( c == '['){
                stack.push(']');
            }
            else if (c == '('){
                stack.push(')');
            }
            else if ( stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }

    // Date : 09/12/2024
    // LeetCode : 118. Pascal's Triangle
    // Time Complexity: O(N^2)
    // Space Complexity: O(N^2)
    public static List<List<Integer>> pascalTriangleList(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;

        // First row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        if (numRows == 1) return result;

        // Other rows
        for( int i = 1; i < numRows; i++){
            List<Integer> prevRow = result.get(i-1);
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 0; j < i - 1; j++){
                row.add(prevRow.get(j+1) + prevRow.get(j));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }

    // Date : 10/12/2024
    // LeetCode : 27. Remove Element
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int removeElement(int[] nums, int val){
        int pointer = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        return pointer;
    }

    // Date : 10/12/2024
    // LeetCode : 929. Unique Email Addresses
    // Time Complexity: O(N*M)
    // Space Complexity: O(N*M)
    public static int numUniqueEmails(String[] emails){
        // Creating HashSet to store unique email addresses
        HashSet<String> uniqueEmails = new HashSet<>();

        // Iterate through the emails array
        for (String email : emails){
            int split_position = email.indexOf("@");
            String localName = email.substring(0,split_position);
            String domainName = email.substring(split_position);

            if (localName.contains("+")){
                localName = localName.substring(0,localName.indexOf("+"));
            }

            // Remove the dots from the local name
            localName = localName.replaceAll("\\.","");
            uniqueEmails.add(localName + domainName);
        }
        return uniqueEmails.size();
    }

    // Date : 10/12/2024
    // LeetCode : 205. Isomorphic Strings
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static boolean isIsomorphic(String s , String t){
        // Check for the length of the strings
        if(s.length() != t.length()){
            return false;
        }

        // Creating HashMap to store the mapping of the characters
        HashMap<Character,Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            // Check if the character is already mapped
            if (!map.containsKey(original)){
                if(!map.containsValue(replacement)){
                    map.put(original,replacement);
                }
                else{
                    return false;
                }
            }
            else{
                char mapped = map.get(original);
                if(mapped != replacement){
                    return false;
                }
            }
        }
        return true;
    }

    // Date : 11/12/2024
    // LeetCode : 169. Majority Element
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int majorityElement(int[] nums){
        int majorityElement = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++){
            if (count == 0){
                majorityElement = nums[i];
                count++;
            }
            else if ( majorityElement == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return majorityElement;
    }

    // Date : 12/12/2024
    // LeetCode : 605. Can Place Flowers
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean canPlaceFlowers(int[] flowerbed, int n){
        //  Check for the edge case
        if (n == 0) return true;

        // Check for the edge case
        if (flowerbed.length == 1){
            if (flowerbed[0] == 0) return true;
            else return false;
        }

        // iterate through the flowerbed array
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++){
            if (flowerbed[i] == 0){
                if((i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length - 1 || flowerbed[i+1] == 0)){
                    count++;
                    if (count == n) return true;
                    i++;
                }
            }
        }
        return false;
    }

    // Date : 12/12/2024
    // LeetCode : 496. Next Greater Element I
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static int[] nextGreaterElement(int[] nums1, int[] nums2){
        // Stack to store the elements
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums2){
            while(!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = map.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }

    // Date: 13/12/2024
    // LeetCode: 724. Find Pivot Index
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int pivotIndex(int[] nums){
        int rightSum = 0;
        for (int num : nums){
            rightSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++){
            // update the right sum
            rightSum -= nums[i];

            // check if the left sum is equal to the right sum
            if (leftSum == rightSum){
                return i;
            }

            // update the left sum
            leftSum += nums[i];
        }
        return -1;
    }

    // Date: 13/12/2024
    // LeetCode: 303. Range Sum Query - Immutable
    // Time Complexity: O(1)
    // Space Complexity: O(N)
    class NumArray {
        int[] prefixSum;
        public NumArray(int[] nums) {
            prefixSum = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++){
                prefixSum[i+1] = prefixSum[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return prefixSum[right+1] - prefixSum[left];
        }
    }

    // Date: 14/12/2024
    // LeetCode: 448. Find All Numbers Disappeared in an Array
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0){
                continue;
            }
            nums[index] *= -1;
        }

        for (int i = 0 ; i < nums.length; i++){
            if (nums[i] > 0){
                result.add(i+1);
            }
        }
        return result;
    }

    // Date: 14/12/2024
    // LeetCode: 1189. Maximum Number of Balloons
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int maxNumberOBalloons(String text) {
        Map<Character,Integer> map = new HashMap<>();
        for (char ch : text.toCharArray()){
            if (ch == 'b' || ch == 'a' || ch == 'l' || ch == 'o' || ch == 'n') {
                map.put(ch,map.getOrDefault(ch,0) + 1);
            }
        }

        // Check for the minimum frequency of the characters
        int singleCharMin = Math.min(map.getOrDefault('b',0), Math.min(map.getOrDefault('a',0),map.getOrDefault('n',0)));
        int doubleCharMin = Math.min(map.getOrDefault('l',0),map.getOrDefault('o',0));
        return Math.min(singleCharMin,doubleCharMin/2);
    }

    // Date: 15/12/2024
    // LeetCode: 290. Word Pattern
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static boolean wordPattern(String pattern, String s){
        String[] words = s.split(" ");

        // Check for the length of the pattern and words
        if (pattern.length() != words.length){
            return false;
        }

        Map<Character,String> map = new HashMap<>();
        for( int i = 0 ; i < pattern.length() ; i++){
            char ch = pattern.charAt(i);
            String word = words[i];

            if ((map.containsKey(ch) && !map.get(ch).equals(word)) || (!map.containsKey(ch) && map.containsValue(word))){
                return false;
            }
            map.put(ch,word);
        }
        return true;
    }

    // Date: 15/12/2024
    // LeetCode: 202. Happy Number
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean isHappy(int n){
        Set<Integer> set = new HashSet<>();

        while ( true ) {
            int sum = 0;
            while (n != 0){
                sum += Math.pow(n % 10, 2.0);
                n /= 10;
            }

            if (sum == 1) return true;

            n = sum;
            if (set.contains(n)) return false;
            set.add(n);
        }
    }

}