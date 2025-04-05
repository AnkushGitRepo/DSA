class LongestPalindromicSubstring{
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    // Two pointers approach
    // The idea is to use a dynamic programming approach to find the longest palindromic substring in the input string.
    // We create a dp array to store the length of the longest palindromic substring ending at each index.
    // We initialize the dp array with 0s and set the length of the longest palindromic substring to 1.
    // We iterate through the input string and for each character, we check if it is equal to the character at the corresponding index in the dp array.
    // If it is equal, we increment the length of the longest palindromic substring.
    // We also check if the characters at the two pointers are equal and if they are, we increment the length of the longest palindromic substring.
    // We return the longest palindromic substring found.
    // The method returns the longest palindromic substring found.
    public static String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1;
        String maxStr = s.substring(0, 1);   // Initialize with the first character
        s = "#" + s.replaceAll("", "#") + "#";    // Add separators to handle even-length palindromes

        // Dynamic programming array to store the length of the longest palindromic substring
        int[] dp = new int[s.length()];
        int center = 0;
        int right = 0;

        // Iterate through the string to find the longest palindromic substring
        for (int i = 0; i < s.length(); i++) {

            // Calculate the mirror index
            if (i < right) {
                dp[i] = Math.min(right - i, dp[2 * center - i]);
            }

            // Expand the palindrome around the center
            while (i - dp[i] - 1 >= 0 && i + dp[i] + 1 < s.length() && s.charAt(i - dp[i] - 1) == s.charAt(i + dp[i] + 1)) {
                dp[i]++;
            }

            // Update the center and right boundary if the palindrome expands beyond the current right boundary
            if (i + dp[i] > right) {
                center = i;
                right = i + dp[i];
            }

            // Update the maximum length and corresponding substring if a longer palindrome is found
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                maxStr = s.substring(i - dp[i], i + dp[i] + 1).replaceAll("#", "");
            }
        }

        // Return the longest palindromic substring found
        return maxStr;
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s)); // Output: "bab" or "aba"

        s = "cbbd";
        System.out.println(longestPalindrome(s)); // Output: "bb"

        s = "a";
        System.out.println(longestPalindrome(s)); // Output: "a"

        s = "";
        System.out.println(longestPalindrome(s)); // Output: ""

        s = "ac";
        System.out.println(longestPalindrome(s)); // Output: "a" or "c"

    }

}