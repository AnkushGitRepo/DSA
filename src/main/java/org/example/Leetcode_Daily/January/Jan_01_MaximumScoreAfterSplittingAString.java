package org.example.Leetcode_Daily.January;

public class Jan_01_MaximumScoreAfterSplittingAString {
    public static void main(String[] args) {
        System.out.println("Leetcode January Challenge");
        System.out.println("LeetCode 1422. Maximum Score After Splitting a String");
        String s = "011101";
        System.out.println(maxScore(s));
        String s1 = "00111";
        System.out.println(maxScore(s1));
        String s2 = "1111";
        System.out.println(maxScore(s2));
        String s3 = "00";
        System.out.println(maxScore(s3));
        System.out.println("\n\n");
    }

    // Date : 01/01/2025
    // LeetCode : 1422. Maximum Score After Splitting a String
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int maxScore(String s) {
        int n = s.length();
        int result = Integer.MIN_VALUE;
        int ones= 0;
        int zeros = 0;
        for (int i = 0; i <= n - 2; i++){
            if (s.charAt(i) == '1'){
                ones++;
            }
            else{
                zeros++;
            }
            result = Math.max(result,zeros - ones);
        }
        if (s.charAt(n-1) == '1') ones++;
        return result+ones;
    }
}
