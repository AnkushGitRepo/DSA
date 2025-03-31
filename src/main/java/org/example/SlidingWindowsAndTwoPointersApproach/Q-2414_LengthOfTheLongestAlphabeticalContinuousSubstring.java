class LengthOfTheLongestAlphabeticalContinuousSubstring{

    // This method finds the length of the longest substring in a given string
    // that consists of continuous alphabetical characters.
    // It uses a two-pointer approach to iterate through the string and
    // keeps track of the length of the longest substring found so far.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // The idea is to use two pointers, one starting from the beginning of the string and the other starting from the second character of the string.
    // We compare the characters at the two pointers and if they are continuous alphabetical characters, we increment the second pointer.
    // If they are not continuous alphabetical characters, we update the first pointer to the second pointer and continue the process.
    // We return the length of the longest substring found so far.
    // The method returns the length of the longest substring found.

    public int longestContinuousSubstring(String s) {
        // If the string is empty, return 0
        int j = 0, res = 1;

        // Iterate through the string starting from the second character
        for (int i = 1; i < s.length(); ++i) {

            // Check if the characters at the two pointers are continuous alphabetical characters
            if (s.charAt(i) != s.charAt(j) + i - j)
                j = i;

            // Update the length of the longest substring found so far
            res = Math.max(res, i - j + 1);
        }

        // Return the length of the longest substring found
        return res;
    }

    public static void main(String[] args) {
        LengthOfTheLongestAlphabeticalContinuousSubstring obj = new LengthOfTheLongestAlphabeticalContinuousSubstring();
        System.out.println(obj.longestContinuousSubstring("abcde")); // Expected output: 5
        System.out.println(obj.longestContinuousSubstring("abacaba")); // Expected output: 2
        System.out.println(obj.longestContinuousSubstring("xyzabcde")); // Expected output: 5
        System.out.println(obj.longestContinuousSubstring("a")); // Expected output: 1
        System.out.println(obj.longestContinuousSubstring("z")); // Expected output: 1
    }
}