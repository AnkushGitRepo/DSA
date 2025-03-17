class ReverseWordsInAString{
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Two pointers approach
    // The idea is to reverse the entire string and then reverse each word in the reversed string.
    // We use two pointers, one starting from the beginning of the string and the other starting from the end of the string.
    // We skip the leading and trailing spaces by moving the two pointers towards the center of the string.
    // We reverse each word in the string by moving the two pointers towards each other and swapping the characters at the two pointers.
    // We continue this process until the two pointers meet.

    public String reverseWords(String s) {
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        // Test cases to validate the solution
        ReverseWordsInAString obj = new ReverseWordsInAString();
        System.out.println(obj.reverseWords("the sky is blue")); // Expected output: "blue is sky the"
        System.out.println(obj.reverseWords("  hello world  ")); // Expected output: "world hello"
        System.out.println(obj.reverseWords("a good   example")); // Expected output: "example good a"
        System.out.println(obj.reverseWords("  Bob    Loves  Alice   ")); // Expected output: "Alice Loves Bob"
        System.out.println(obj.reverseWords("Alice does not even like bob")); // Expected output: "bob like even not does Alice"
    }
}