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

        // LeetCode : 896. Monotonic Array
        int[] nums10 = {1,2,2,3};
        System.out.println("Input: nums = [1,2,2,3] \nIs Monotonic Array ? : "+ isMonotonicArray(nums10));
        int[] nums11 = {6,5,4,4};
        System.out.println("Input: nums = [6,5,4,4] \nIs Monotonic Array ? : "+ isMonotonicArray(nums11));
        int[] nums12 = {1,3,2};
        System.out.println("Input: nums = [1,3,2] \nIs Monotonic Array ? : "+ isMonotonicArray(nums12));
        int[] nums13 = {1,2,4,5};
        System.out.println("Input: nums = [1,2,4,5] \nIs Monotonic Array ? : "+ isMonotonicArray(nums13));
        System.out.println("\n\n");

        // LeetCode : 705. Design HashSet
        MyHashSet myHashSet = new neetcodeArrays().new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        System.out.println("Is 1 Present in HashSet ? : "+ myHashSet.contains(1));
        System.out.println("Is 3 Present in HashSet ? : "+ myHashSet.contains(3));
        myHashSet.add(2);
        System.out.println("Is 2 Present in HashSet ? : "+ myHashSet.contains(2));
        myHashSet.remove(2);
        System.out.println("Is 2 Present in HashSet ? : "+ myHashSet.contains(2));
        System.out.println("\n\n");

        // LeetCode : 706. Design HashMap
        MyHashMap myHashMap = new neetcodeArrays().new MyHashMap();
        myHashMap.put(1,1);
        myHashMap.put(2,2);
        System.out.println("Value of Key 1 : "+ myHashMap.get(1));
        System.out.println("Value of Key 3 : "+ myHashMap.get(3));
        myHashMap.put(2,1);
        System.out.println("Value of Key 2 : "+ myHashMap.get(2));
        myHashMap.remove(2);
        System.out.println("Value of Key 2 : "+ myHashMap.get(2));
        System.out.println("\n\n");

        // LeetCode : 1512. Number of Good Pairs
        int[] nums14 = {1,2,3,1,1,3};
        System.out.println("Input: nums = [1,2,3,1,1,3] \nNumber of Good Pairs : "+ numIdenticalPairs(nums14));
        int[] nums15 = {1,1,1,1};
        System.out.println("Input: nums = [1,1,1,1] \nNumber of Good Pairs : "+ numIdenticalPairs(nums15));
        System.out.println("\n\n");

        // LeetCode : 119. Pascal's Triangle II
        System.out.println("Input: rowIndex = 3 \nPascal's Triangle : "+ getRow(3));
        System.out.println("Input: rowIndex = 0 \nPascal's Triangle : "+ getRow(0));
        System.out.println("\n\n");

        // LeetCode : 1160. Find Words That Can Be Formed by Characters
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println("Input: words = [\"cat\",\"bt\",\"hat\",\"tree\"], chars = \"atach\" \nNumber of Words That Can Be Formed : "+ countCharacters(words,chars));
        String[] words1 = {"hello","world","leetcode"};
        String chars1 = "welldonehoneyr";
        System.out.println("Input: words = [\"hello\",\"world\",\"leetcode\"], chars = \"welldonehoneyr\" \nNumber of Words That Can Be Formed : "+ countCharacters(words1,chars1));
        System.out.println("\n\n");

        // LeetCode : 2264. Largest 3-Same-Digit Number in String
        System.out.println("Input: s = \"334111\" \nLargest 3-Same-Digit Number : "+ largestGoodInteger("334111"));
        System.out.println("Input: s = \"3341111\" \nLargest 3-Same-Digit Number : "+ largestGoodInteger("3341111"));
        System.out.println("\n\n");

        // LeetCode : LeetCode: 1436. Destination City
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("London","New York"));
        paths.add(Arrays.asList("New York","Lima"));
        paths.add(Arrays.asList("Lima","Sao Paulo"));
        System.out.println("Input: paths = [[\"London\",\"New York\"],[\"New York\",\"Lima\"],[\"Lima\",\"Sao Paulo\"]] \nDestination City : "+ destCity(paths));
        List<List<String>> paths1 = new ArrayList<>();
        paths1.add(Arrays.asList("B","C"));
        paths1.add(Arrays.asList("D","B"));
        paths1.add(Arrays.asList("C","A"));
        System.out.println("Input: paths = [[\"B\",\"C\"],[\"D\",\"B\"],[\"C\",\"A\"]] \nDestination City : "+ destCity(paths1));
        System.out.println("\n\n");

        // LeetCode: 1913. Maximum Product Difference Between Two Pairs
        int[] nums16 = {5,6,2,7,4};
        System.out.println("Input: nums = [5,6,2,7,4] \nMaximum Product Difference : "+ maxProductDifference(nums16));
        int[] nums17 = {4,2,5,9,7,4,8};
        System.out.println("Input: nums = [4,2,5,9,7,4,8] \nMaximum Product Difference : "+ maxProductDifference(nums17));
        System.out.println("\n\n");

        // LeetCode: 1422. Maximum Score After Splitting a String
        String s = "011101";
        System.out.println("Input: s = \"011101\" \nMaximum Score After Splitting : "+ maxScore(s));
        String s1 = "00111";
        System.out.println("Input: s = \"00111\" \nMaximum Score After Splitting : "+ maxScore(s1));
        System.out.println("\n\n");

        // LeetCode: 1496. Path Crossing
        String path = "NES";
        System.out.println("Input: path = \"NES\" \nIs Path Crossing ? : "+ isPathCrossing(path));
        String path1 = "NESWW";
        System.out.println("Input: path = \"NESWW\" \nIs Path Crossing ? : "+ isPathCrossing(path1));
        System.out.println("\n\n");

        // LeetCode: 1758. Minimum Changes To Make Alternating Binary String
        String s2 = "010";
        System.out.println("Input: s = \"010\" \nMinimum Changes To Make Alternating Binary String : "+ minOperations(s2));
        String s3 = "10010001";
        System.out.println("Input: s = \"10010001\" \nMinimum Changes To Make Alternating Binary String : "+ minOperations(s3));
        System.out.println("\n\n");

        // LeetCode: 1897. Redistribute Characters to Make All Strings Equal
        String[] words2 = {"abc","aabc","bc"};
        System.out.println("Input: words = [\"abc\",\"aabc\",\"bc\"] \nCan Redistribute Characters to Make All Strings Equal ? : "+ makeEqual(words2));
        String[] words3 = {"ab","a"};
        System.out.println("Input: words = [\"ab\",\"a\"] \nCan Redistribute Characters to Make All Strings Equal ? : "+ makeEqual(words3));
        System.out.println("\n\n");

        // LeetCode: 1624. Largest Substring Between Two Equal Characters
        String s4 = "aa";
        System.out.println("Input: s = \"aa\" \nLargest Substring Between Two Equal Characters : "+ maxLengthBetweenEqualCharacters(s4));
        String s5 = "abca";
        System.out.println("Input: s = \"abca\" \nLargest Substring Between Two Equal Characters : "+ maxLengthBetweenEqualCharacters(s5));
        System.out.println("\n\n");

        // LeetCode: 645. Set Mismatch
        int[] nums18 = {1,2,2,4};
        System.out.println("Input: nums = [1,2,2,4] \nSet Mismatch : "+ Arrays.toString(findErrorNums(nums18)));
        int[] nums19 = {1,1};
        System.out.println("Input: nums = [1,1] \nSet Mismatch : "+ Arrays.toString(findErrorNums(nums19)));
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

    // Date: 16/12/2024
    // LeetCode: 896. Monotonic Array
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean isMonotonicArray(int[] nums){
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++){
            if (nums[i] > nums[i-1]){
                decreasing = false;
            }
            if (nums[i] < nums[i-1]){
                increasing = false;
            }
        }
        return increasing || decreasing;
    }

    // Date: 17/12/2024
    // LeetCode: 705. Design HashSet
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    class MyHashSet {
        boolean[] hashSet;
        public MyHashSet() {
            hashSet = new boolean[101]; // Assuming the size of the hashSet is 101
        }

        public void add(int key) {
            hashSet[key] = true;
        }

        public void remove(int key) {
            hashSet[key] = false;
        }

        public boolean contains(int key) {
            return hashSet[key];
        }
    }

    // Date: 17/12/2024
    // LeetCode: 706. Design HashMap
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    class MyHashMap {
        int[] map;
        public MyHashMap() {
            map = new int[10]; // Assuming the size of the map is 10
            Arrays.fill(map,-1);
        }

        public void put(int key, int value) {
            map[key] = value;
        }

        public int get(int key) {
            return map[key];
        }

        public void remove(int key) {
            map[key] = -1;
        }
    }

    // Date: 18/12/2024
    // LeetCode: 1512. Number of Good Pairs
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];

        for (int num : nums){
            count[num]++;
        }

        int totalPairs = 0;
        // Logic: nC2 = n*(n-1)/2 => Total Pairs = (n*(n-1))/2 => Total Pairs = (count[num] * (count[num] - 1)) / 2
        for (int num : count){
            totalPairs += (num * (num - 1)) / 2;
        }
        return totalPairs;
    }

    // Date: 18/12/2024
    // LeetCode: 119. Pascal's Triangle II
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 1; i <= rowIndex; i++){
            result.add((int) ((long) result.get(i-1) * (rowIndex - i + 1) / i));
        }
        return result;
    }

    // Date: 19/12/2024
    // LeetCode: 1160. Find Words That Can Be Formed by Characters
    // Time Complexity: O(L+n⋅k)
    // Space Complexity: O(1)
    public static int countCharacters(String[] words, String chars){
        int[] charCount = new int[26];
        for (char ch : chars.toCharArray()){
            charCount[ch - 'a']++;
        }

        int totalLength = 0;

        for (String word : words){
            int[] wordCount = new int[26];
            boolean isPossible = true;
            for (char ch : word.toCharArray()){
                wordCount[ch - 'a']++;
                if (wordCount[ch - 'a'] > charCount[ch - 'a']){
                    isPossible = false;
                    break;
                }
            }
            if (isPossible){
                totalLength += word.length();
            }
        }
        return totalLength;
    }

    // Date: 19/12/2024
    // LeetCode: 2264. Largest 3-Same-Digit Number in String
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static String largestGoodInteger(String num) {
        int result = -1;
        // Iterate through the string
        for (int i = 0; i + 2 < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                result = Math.max(result, num.charAt(i) - '0');
            }
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            builder.append((char)(48 + result));
        }
        return result == -1 ? "" : builder.toString();
    }

    // Date: 20/12/2024
    // LeetCode: 1436. Destination City
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static String destCity(List<List<String>> paths){
        Set<String> set = new HashSet<>();
        for (List<String> path : paths){
            set.add(path.get(0));
        }

        for (List<String> path : paths){
            if(!set.contains(path.get(1))){
                return path.get(1);
            }
        }
        return null;
    }

    // Date: 20/12/2024
    // LeetCode: 1913. Maximum Product Difference Between Two Pairs
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int maxProductDifference(int[] nums){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : nums){
            // Logic to find the largest and second largest
            if (num > largest){
                secondLargest = largest;
                largest = num;
            }
            else{
                secondLargest = Math.max(secondLargest,num);
            }

            // Logic to find the smallest and second smallest
            if (num < smallest){
                secondLargest = smallest;
                smallest = num;
            }
            else{
                secondSmallest = Math.min(secondSmallest,num);
            }
        }
        return (largest * secondLargest) - (smallest * secondSmallest);
    }

    // Date: 22/12/2024
    // LeetCode: 1422. Maximum Score After Splitting a String
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int maxScore(String s){
        int result = Integer.MIN_VALUE;
        int n = s.length();
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i <= n - 2; i++){
            if (s.charAt(i) == '1'){
                ones++;
            }
            else{
                zeros++;
            }
            result = Math.max(result, zeros - ones);
        }

        if (s.charAt(n-1) == '1') ones++;
        return result + ones;
    }

    // Date: 23/12/2024
    // LeetCode: 1496. Path Crossing
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static boolean isPathCrossing(String path){
        Set<String> set = new HashSet<>();
        int x = 0;
        int y = 0;
        set.add(0 + "," + 0);
        for(char c : path.toCharArray()){
            if (c == 'N'){
                y++;
            }
            else if (c == 'W') {
                x--;
            }
            else if (c == 'S'){
                y--;
            }
            else if (c == 'E'){
                x++;
            }

            String coordinates = x + "," + y;
            if (set.contains(coordinates)){
                return true;
            }
            set.add(coordinates);
        }
        return false;
    }

    // Date: 24/12/2024
    // LeetCode: 1758. Minimum Changes To Make Alternating Binary String
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int minOperations(String s){
        int n = s.length();

        int startWithZero = 0;
        int startWithOne = 0;

        for (int i = 0 ; i < n; i++){
            if (i % 2 == 0){
                if (s.charAt(i) == '0'){
                    startWithOne++;
                }
                else{
                    startWithZero++;
                }
            }
            else{
                if (s.charAt(i) == '0'){
                    startWithZero++;
                }
                else{
                    startWithOne++;
                }
            }
        }
        return Math.min(startWithZero,startWithOne);
    }

    // Date: 25/12/2024
    // LeetCode: 1897. Redistribute Characters to Make All Strings Equal
    // Time Complexity: O(N * W)
    // Space Complexity: O(1)
    public static boolean makeEqual(String[] words){
        int[] freq = new int[26];
        for (String word : words){
            for (char ch : word.toCharArray()){
                freq[ch - 'a']++;
            }
        }

        for (int f : freq){
            if (f % words.length != 0){
                return false;
            }
        }

        return true;
    }

    // Date: 26/12/2024
    // LeetCode: 1624. Largest Substring Between Two Equal Characters
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int maxLengthBetweenEqualCharacters(String s){
        int n = s.length();
        int[] firstIndex = new int[26];
        Arrays.fill(firstIndex,-1);
        int result = -1;

        for (int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if (firstIndex[ch - 'a'] == -1){
                firstIndex[ch - 'a'] = i;
            }
            else{
                result = Math.max(result, i - firstIndex[ch - 'a'] - 1);
            }
        }
        return result;
    }

    // Date: 27/12/2024
    // LeetCode: 645. Set Mismatch
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int[] findErrorNums(int[] nums){
        int n = nums.length;
        int duplicate = -1;
        int missing = -1;

        for (int i = 0; i < n; i++){
            if (nums[Math.abs(nums[i] - 1)] < 0){
                duplicate = Math.abs(nums[i]);
            }
            else{
                nums[Math.abs(nums[i]) - 1] *= -1;
            }
        }

        for (int i = 0; i < n; i++){
            if (nums[i] > 0){
                missing = i + 1;
                break;
            }
        }

        return new int[]{duplicate,missing};
    }
}