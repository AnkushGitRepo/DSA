class MaximumNumberOfVowelsInASubstringOfGivenLength{
    // 1456. Maximum Number of Vowels in a Substring of Given Length
    // https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
    // Time: O(n), Space: O(1)
    // Sliding Window Approach
    // The idea is to keep track of the number of vowels in the current window.
    // If the current character is a vowel, then increment the count.
    // If the window size is equal to k, then update the maximum number of vowels.
    // If the character at the start of the window is a vowel, then decrement the count.
    // Increment the start and end of the window.
    // Return the maximum number of vowels.

    public static int maxVowels(String s, int k) {
        int n = s.length();
        int maxV = 0;   // maximum number of vowels
        int count = 0;  // number of vowels in the current window
        int i = 0, j = 0;   // start and end of the window

        // Iterate through the string s from 0 to n - 1 and update the count, maxV, i, and j accordingly
        while (j < n) {

            // If the current character is a vowel, then increment the count
            if (isVowel(s.charAt(j))) {
                count++;
            }

            // If the window size is equal to k, then update the maximum number of vowels
            if (j - i + 1 == k) {
                maxV = Math.max(maxV, count);

                // If the character at the start of the window is a vowel, then decrement the count
                if (isVowel(s.charAt(i))) {
                    count--;
                }
                i++;   // Increment the start of the window
            }

            // Increment the end of the window
            j++;
        }

        // Return the maximum number of vowels
        return maxV;
    }

    // Helper function to check if the character ch is a vowel
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k)); // Output: 3

        s = "aeiou";
        k = 2;
        System.out.println(maxVowels(s, k)); // Output: 2

        s = "leetcode";
        k = 3;
        System.out.println(maxVowels(s, k)); // Output: 2

        s = "rhythms";
        k = 4;
        System.out.println(maxVowels(s, k)); // Output: 0

        s = "tryhard";
        k = 4;
        System.out.println(maxVowels(s, k)); // Output: 1
    }
}