package org.example.Leetcode_Daily.January;

import java.util.*;

class Jan_04_UniqueLength3PalindromicSubsequences {
    public static void main(String[] args) {
        System.out.println("Leetcode January Challenge");
        System.out.println("LeetCode 1930. Unique Length-3 Palindromic Subsequences");
        String s = "aabca";
        System.out.println("Unique Length-3 Palindromic Subsequences: ");
        System.out.println("Input String: " + s);
        int result = countPalindromicSubsequence(s);
        System.out.println("Unique Length-3 Palindromic Subsequences: " + result);
        String s1 = "adc";
        System.out.println("Unique Length-3 Palindromic Subsequences: ");
        System.out.println("Input String: " + s1);
        int result1 = countPalindromicSubsequence(s1);
        System.out.println("Unique Length-3 Palindromic Subsequences: " + result1);
        System.out.println("\n\n");
    }


    // Date : 04/01/2025
    // LeetCode :  1930. Unique Length-3 Palindromic Subsequences
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int countPalindromicSubsequence(String s) {
        int first[] = new int[26];
        Arrays.fill(first, Integer.MAX_VALUE);
        int last[] = new int[26];

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            first[ch-'a'] = Math.min(first[ch-'a'], i);
            last[ch-'a'] = i;
        }

        int res = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<26; i++) {
            if(first[i] != Integer.MAX_VALUE && (last[i]-first[i]) > 1) {
                set.clear();
                for(int j=first[i]+1; j<last[i]; j++) set.add(s.charAt(j));
                res += set.size();
            }
        }

        return res;
    }
}
