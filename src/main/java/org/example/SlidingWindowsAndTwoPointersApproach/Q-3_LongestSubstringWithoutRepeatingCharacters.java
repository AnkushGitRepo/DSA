import java.util.*;

class LongestSubstringWithoutRepeatingCharacters{

    // Time complexity: O(n)
    // Space complexity: O(min(n, m)) where m is the size of the charset
    // Approach: Sliding window
    // 1. Use two pointers i and j to represent the current substring
    // 2. Use a set to store the characters in the current substring
    // 3. If the character at j is not present in the set, add it to the set and update the max length
    // 4. If the character at j is present in the set, remove the character at i from the set and increment i
    // 5. Repeat the above steps until j reaches the end of the string
    // 6. Return the max length
    // Note: The set stores the characters in the current substring. If a character is repeated, remove the character at i from the set and increment i
    public int lengthOfLongestSubstring(String s) {


        int n = s.length();
        int i = 0, j = 0;
        int max = 0;

        // Set to store the characters in the current substring
        Set<Character> set = new HashSet<>();

        // Sliding window
        while(j < n){

            // If the character at j is not present in the set, add it to the set and update the max length
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                max = Math.max(max, j-i+1);  // Update the max length
                j++;
            }
            // If the character at j is present in the set, remove the character at i from the set and increment i
            else{
                set.remove(s.charAt(i));    // Remove the character at i from the set
                i++;
            }
        }

        // Return the max length
        return max;
    }

    public static void main(String[] args){
        LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
        String s = "abcabcbb";
        System.out.println("String 1: " + s);
        System.out.println(obj.lengthOfLongestSubstring(s));

        s = "bbbbb";
        System.out.println("String 2: " + s);
        System.out.println(obj.lengthOfLongestSubstring(s));

        s = "pwwkew";
        System.out.println("String 3: " + s);
        System.out.println(obj.lengthOfLongestSubstring(s));

        s = "";
        System.out.println("String 4: " + s);
        System.out.println(obj.lengthOfLongestSubstring(s));

        s = " ";
        System.out.println("String 5: " + s);
        System.out.println(obj.lengthOfLongestSubstring(s));

        s = "au";
        System.out.println("String 6: " + s);
        System.out.println(obj.lengthOfLongestSubstring(s));

    }
}