class ReverseVowelsOfAString{
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Two pointers approach
    // The idea is to use two pointers, one starting from the left end of the string and the other starting from the right end of the string.
    // We swap the vowels at the left and right pointers if both characters are vowels.
    // We move the left pointer to the right if the character at the left pointer is not a vowel.
    // We move the right pointer to the left if the character at the right pointer is not a vowel.
    // We continue this process until the left pointer is less than the right pointer.
    public static String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();   // Convert the input string to a character array

        // Continue the process until the left pointer is less than the right pointer
        while ( left < right ){

            // Swap the vowels at the left and right pointers if both characters are vowels
            if ( isVowel(chars[left]) && isVowel(chars[right])){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                // Move the left pointer to the right
                left++;
                // Move the right pointer to the left
                right--;
            }

            // Move the left pointer to the right if the character at the left pointer is not a vowel
            if (!isVowel(chars[left])){
                left++;
            }

            // Move the right pointer to the left if the character at the right pointer is not a vowel
            if (!isVowel(chars[right])){
                right--;
            }
        }

        // Convert the character array to a string and return the result
        return new String(chars);
    }

    // Helper function to check if a character is a vowel; Time complexity: O(1) ; Space complexity: O(1)
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
            || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        // Test cases to validate the solution
        System.out.println(reverseVowels("hello")); // Expected output: "holle"
        System.out.println(reverseVowels("leetcode")); // Expected output: "leotcede"
        System.out.println(reverseVowels("aA")); // Expected output: "Aa"
        System.out.println(reverseVowels("ankush")); // Expected output: "unkash"
        System.out.println(reverseVowels("")); // Expected output: ""

    }
}