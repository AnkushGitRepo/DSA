import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindAllAnagramsInAString{
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Sliding Window Approach
    // The idea is to use a sliding window of size n (length of the string p) and keep track of the count of each character in the window
    // If the count of each character in the window is equal to the count of each character in the string p, then the window is an anagram of the string p
    // If the window is an anagram of the string p, add the starting index of the window to the result list
    // Move the window by incrementing the start index and decrementing the end index
    // Continue this process until the end index reaches the end of the string s
    public List<Integer> findAnagrams(String s, String p) {

        // Create an array to store the count of each character in the string p
        int[] arr = new int[26];

        int m = s.length();
        int n = p.length();

        // Increment the count of each character in the string p in the array
        for (char ch : p.toCharArray())
            arr[ch - 'a']++;

        int i = 0, j = 0;   // i is the start index of the window, j is the end index of the window

        // Create a list to store the starting index of the anagrams of the string p
        List<Integer> result = new ArrayList<>();

        // Slide the window over the string s and keep track of the count of each character in the window using the array
        while (j < m) {
            arr[s.charAt(j) - 'a']--;    // Decrement the count of the character in the window in the array

            // If the length of the window is equal to the length of the string p (anagram)
            if (j - i + 1 == n) {

                // Check if the count of each character in the window is equal to the count of each character in the string p
                if (Arrays.equals(arr, new int[26])) {
                    result.add(i);
                }

                // Increment the count of the character at the start index of the window
                arr[s.charAt(i) - 'a']++;
                i++;    // Increment the start index of the window
            }

            // Increment the end index of the window
            j++;
        }

        // Return the list of starting indices of the anagrams of the string p
        return result;
    }

    public static void main(String[] args) {
        FindAllAnagramsInAString obj = new FindAllAnagramsInAString();
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println("Starting indices of the anagrams of " + p + " in " + s + ": " + obj.findAnagrams(s, p));

        s = "abab";
        p = "ab";
        System.out.println("Starting indices of the anagrams of " + p + " in " + s + ": " + obj.findAnagrams(s, p));

        s = "aaaaaaaaaa";
        p = "a";
        System.out.println("Starting indices of the anagrams of " + p + " in " + s + ": " + obj.findAnagrams(s, p));

        s = "ab";
        p = "a";
        System.out.println("Starting indices of the anagrams of " + p + " in " + s + ": " + obj.findAnagrams(s, p));

        s = "ab";
        p = "b";
        System.out.println("Starting indices of the anagrams of " + p + " in " + s + ": " + obj.findAnagrams(s, p));

    }
}