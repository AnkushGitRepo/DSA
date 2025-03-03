class ValidAnagram{
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean isAnagram(String s, String t) {
        // If the lengths of the strings are not equal, they can't be anagrams
        if(s.length() != t.length()) return false;

        // Create an array to store the count of each character
        int[] count = new int[26];

        // Increment the count of the character in the first string and decrement the count of the character in the second string
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;    // Increment the count of the character in the first string
            count[t.charAt(i) - 'a']--;    // Decrement the count of the character in the second string
        }

        // If the strings are anagrams, the count of each character should be 0
        for(int i=0; i<26; i++){
            if(count[i] != 0) return false;   // If the count of any character is not 0, return false
        }

        // If the count of each character is 0, return true
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram obj = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println("Is " + t + " an anagram of " + s + ": " + obj.isAnagram(s, t));

        s = "rat";
        t = "car";
        System.out.println("Is " + t + " an anagram of " + s + ": " + obj.isAnagram(s, t));

        s = "a";
        t = "ab";
        System.out.println("Is " + t + " an anagram of " + s + ": " + obj.isAnagram(s, t));

        s = "a";
        t = "a";
        System.out.println("Is " + t + " an anagram of " + s + ": " + obj.isAnagram(s, t));

        s = "a";
        t = "b";
        System.out.println("Is " + t + " an anagram of " + s + ": " + obj.isAnagram(s, t));

        s = "a";
        t = "a";
        System.out.println("Is " + t + " an anagram of " + s + ": " + obj.isAnagram(s, t));

    }
}