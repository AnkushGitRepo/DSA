
class MinimumLengthOfStringAfterDeletingSimilarEnds{
    // Time complexity: O(n)
    // Space complexity: O(1)
    // Two pointers approach
    // The idea is to use two pointers, one starting from the beginning of the string and the other starting from the end of the string.
    // We compare the characters at the two pointers and if they are equal, we move the two pointers towards each other until the characters at the two pointers are not equal
    // We return the length of the string after deleting the similar characters from the ends

    public static int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;

        // Move the two pointers towards each other until the characters at the two pointers are not equal
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char c = s.charAt(left);

            // Move the two pointers towards each other until the characters at the two pointers are not equal
            while (left <= right && s.charAt(left) == c) {
                left++;
            }

            // Move the two pointers towards each other until the characters at the two pointers are not equal
            while (left <= right && s.charAt(right) == c) {
                right--;
            }
        }

        // Return the length of the string after deleting the similar characters from the ends
        return Math.max(0, right - left + 1);
    }

    public static void main(String[] args) {
        // Test cases to validate the solution
        System.out.println(minimumLength("ca")); // Expected output: 2
        System.out.println(minimumLength("caba")); // Expected output: 1
        System.out.println(minimumLength("aabccabba")); // Expected output: 3
        System.out.println(minimumLength("a")); // Expected output: 1
        System.out.println(minimumLength("ab")); // Expected output: 2
    }
}