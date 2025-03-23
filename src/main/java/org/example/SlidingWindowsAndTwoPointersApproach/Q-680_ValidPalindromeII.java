class ValidPalindromeII{
    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
        }
        return true;
    }
    public static boolean isPalindrome(String s, int i, int j){
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases to validate the solution
        String s = "aba";
        System.out.println(validPalindrome(s)); // Expected output: true

        s = "abca";
        System.out.println(validPalindrome(s)); // Expected output: true

        s = "abcda";
        System.out.println(validPalindrome(s)); // Expected output: false

        s = "racecar";
        System.out.println(validPalindrome(s)); // Expected output: true

        s = "abccba";
        System.out.println(validPalindrome(s)); // Expected output: true

        s = "abcdba";
        System.out.println(validPalindrome(s)); // Expected output: false
    }
}