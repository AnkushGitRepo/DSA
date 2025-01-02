package org.example.Leetcode_Daily.January;

import java.util.*;

public class Jan_02_CountVowelStringsInRanges {
    public static void main(String[] args) {
        System.out.println("Leetcode January Challenge");
        System.out.println("LeetCode 2559. Count Vowel Strings in Ranges");
        String[] words = {"a","e","i","o","u"};
        int[][] queries = {{0,2},{1,3},{2,4},{3,4}};
        int[] result = vowelStrings(words, queries);
        for (int i : result){
            System.out.print(i + " ");
        }
        System.out.println("\n\n");
    }

    // Date : 02/01/2025
    // LeetCode : 2559. Count Vowel Strings in Ranges:
    // Time Complexity: O(n + m)
    // Space Complexity: O(n)
    public static int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = isVowel(words[0]);

        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1] + isVowel(words[i]);
        }

        int m = queries.length;
        int[] ans = new int[m];

        for (int i = 0; i < m; i++){
            int l = queries[i][0];
            int r = queries[i][1];
            int res = prefixSum[r];

            if ( l != 0){
                res -= prefixSum[l-1];
            }
            ans[i] = res;
        }
        return ans;
    }

    public static int isVowel(String word){
        HashSet<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        if (set.contains(first) && set.contains(last)){
            return 1;
        }
        return 0;
    }

}
