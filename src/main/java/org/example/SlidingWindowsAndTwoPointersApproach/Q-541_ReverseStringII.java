class ReverseStringII{
    // Time complexity: O(n)
    // Space complexity: O(n)
    // Sliding window approach
    // The idea is to reverse every 2k characters in the string.
    // We use a sliding window of size 2k to reverse the characters in the window.
    // We start at the beginning of the string and reverse the characters in the window of size 2k.
    // We move the window by 2k characters at a time until we reach the end of the string.
    // If the remaining characters in the string are less than 2k, we reverse the remaining characters.
    // We return the reversed string.

    public String reverseStr(String s, int k) {

        // Convert the string to a character array
        char[] arr = s.toCharArray();

        // Reverse every 2k characters in the string
        for(int i=0; i<arr.length; i+=2*k){
            int start = i;
            int end = Math.min(i+k-1, arr.length-1);

            // Reverse the characters in the window of size k
            while(start<end){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // Convert the character array to a string and return the result
        return new String(arr);
    }

    public static void main(String[] args) {
        ReverseStringII obj = new ReverseStringII();
        String s = "abcdefg";
        int k = 2;
        System.out.println(obj.reverseStr(s, k)); // Expected output: "bacdfeg"

        s = "abcd";
        k = 2;
        System.out.println(obj.reverseStr(s, k)); // Expected output: "bacd"

        s = "abcdefg";
        k = 8;
        System.out.println(obj.reverseStr(s, k)); // Expected output: "gfedcba"

        s = "abcdefg";
        k = 1;
        System.out.println(obj.reverseStr(s, k)); // Expected output: "abcdefg"

        s = "abcdefg";
        k = 3;
        System.out.println(obj.reverseStr(s, k)); // Expected output: "cbadefg"
    }
}