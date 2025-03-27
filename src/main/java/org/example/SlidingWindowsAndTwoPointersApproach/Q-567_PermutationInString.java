class PermutationInString{
    // Approach: Sliding Window
    // Time complexity: O(n)
    // Space complexity: O(1)
    // The idea is to use two arrays to store the frequency of characters in the two strings.
    // We use a sliding window of size equal to the length of the first string to check if the second string contains a permutation of the first string.
    // We initialize two arrays to store the frequency of characters in the two strings.
    // We iterate through the first string and update the frequency of characters in the first array.
    // We iterate through the second string using a sliding window of size equal to the length of the first string.
    // We update the frequency of characters in the second array for the characters in the sliding window.
    // We compare the frequency of characters in the two arrays and if they match, we return true.
    // We move the sliding window by one character at a time and update the frequency of characters in the second array.
    // We return false if we do not find a permutation of the first string in the second string.

    public boolean checkInclusion(String s1, String s2) {

        // If the length of the first string is greater than the length of the second string, return false
        if (s1.length() > s2.length()) return false;
        int [] hash1 = new int[26];
        int [] hash2 = new int[26];

        // Initialize the frequency of characters in the first string
        for (char ch : s1.toCharArray()) {
            hash1[(int)ch-97] += 1;  // Increment the frequency of the character in the first string
        }

        // Initialize the frequency of characters in the sliding window of size equal to the length of the first string
        int sublen = s1.length();
        int matlen = 0;

        // Update the frequency of characters in the sliding window
        for (int i = 0; i < sublen; i++) {
            hash2[(int)s2.charAt(i)-97] += 1;
            if (hash1[(int)s2.charAt(i)-97] >= hash2[(int)s2.charAt(i)-97]) matlen += 1;
        }

        // Compare the frequency of characters in the two arrays
        if (matlen == sublen) return true;
        int biglen = s2.length();

        // Move the sliding window by one character at a time and update the frequency of characters in the second array
        for (int i = sublen ; i < biglen; i++) {

            // Update the frequency of characters in the sliding window by removing the character at the beginning of the window and adding the character at the end of the window
            if (hash1[(int)s2.charAt(i-sublen)-97] >= hash2[(int)s2.charAt(i-sublen)-97]) {
                matlen -= 1;
            }

            // Update the frequency of characters in the sliding window by removing the character at the beginning of the window and adding the character at the end of the window
            hash2[(int)s2.charAt(i-sublen)-97] -= 1;
            hash2[(int)s2.charAt(i)-97] += 1;

            // Update the length of the matching characters if the frequency of characters in the two arrays match
            if (hash1[(int)s2.charAt(i)-97] >= hash2[(int)s2.charAt(i)-97]) {
                matlen += 1;
            }

            // Compare the frequency of characters in the two arrays
            if (matlen == sublen) return true;
        }

        // Return false if we do not find a permutation of the first string in the second string
        return false;
    }

    public static void main(String[] args) {
        // Test cases to validate the solution
        PermutationInString obj = new PermutationInString();
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(obj.checkInclusion(s1, s2)); // Expected output: true

        s1 = "ab";
        s2 = "eidboaoo";
        System.out.println(obj.checkInclusion(s1, s2)); // Expected output: false

        s1 = "abc";
        s2 = "ccccbbbbaaaa";
        System.out.println(obj.checkInclusion(s1, s2)); // Expected output: false

        s1 = "abc";
        s2 = "ccccbbbbaaa";
        System.out.println(obj.checkInclusion(s1, s2)); // Expected output: false

        s1 = "abc";
        s2 = "ccccbbbbaaaabc";
        System.out.println(obj.checkInclusion(s1, s2)); // Expected output: true

        s1 = "abc";
        s2 = "ccccbbbbaaaab";
        System.out.println(obj.checkInclusion(s1, s2)); // Expected output: false
    }
}