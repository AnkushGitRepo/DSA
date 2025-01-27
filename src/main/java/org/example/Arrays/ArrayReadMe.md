# Data Structures and Algorithms (DSA) - Arrays

This folder contains solutions to various array-related problems, demonstrating the use of data structures and algorithms in Java. The code is organized into different files, each tackling specific problems and concepts related to arrays.

## Contents

### 1. [ArrayBasics.java](https://github.com/AnkushGitRepo/DSA/blob/main/src/main/java/org/example/Arrays/ArrayBasics.java)
This file covers the fundamentals of arrays in Java, including:
- **Array Initialization**
- **Accessing and Modifying Elements**
- **Traversing Arrays**
- **Basic Operations** such as insertion, deletion, and searching

The file serves as an introduction to the basics of arrays, providing examples to help beginners understand how arrays work and how to manipulate them.

### 2. [TwoDArrayBasicsAndSomeQuestion.java](https://github.com/AnkushGitRepo/DSA/blob/main/src/main/java/org/example/Arrays/TwoDArrayBasicsAndSomeQuestion.java)
This file focuses on two-dimensional arrays (2D arrays) and includes:
- **Basics of 2D Arrays**: How to declare, initialize, and traverse 2D arrays in Java.
- **Matrix Operations**: Examples of matrix manipulation, including row-wise and column-wise traversal.
- **Questions and Solutions**:
    - Matrix Sum
    - Matrix Multiplication
    - Transpose of a Matrix
    - Matrix Rotation (90 degrees)
    - Pascal Triangle
    - Finding the sum of elements in a matrix
    - Print Spiral Matrix
    - Generate a n*n matrix filled with elements 1 to n^2 in spiral order.
    - Prefix Sum 2D Array

This file is useful for understanding multidimensional arrays and solving problems that involve matrix manipulation.

### 3. [MiscProblems.java](https://github.com/AnkushGitRepo/DSA/blob/main/src/main/java/org/example/Arrays/MiscProblems.java)
This file includes various miscellaneous array problems and their solutions, such as:
- **Rearranging Arrays**: Sorting arrays and rearranging elements under certain conditions.
- **Prefix Sum Problem**: Efficiently solving problems related to cumulative sums of array elements.
- **Kadane's Algorithm**: Finding the maximum sum subarray (useful for solving dynamic programming problems).

These problems are a bit more complex and provide a solid understanding of algorithmic problem-solving using arrays.

### 4. [TwoSumAndThreeSum.java](https://github.com/AnkushGitRepo/DSA/blob/main/src/main/java/org/example/Arrays/TwoSumAndThreeSum.java)
This file covers the classic array problems of finding pairs or triplets that sum up to a target value:
- **Two Sum Problem**: Finding two numbers in an array that add up to a specific target.
- **Three Sum Problem**: Finding three numbers in an array that add up to a specific target.

### 5. [ArrayListBasics.java](https://github.com/AnkushGitRepo/DSA/blob/main/src/main/java/org/example/Arrays/ArrayListBasics.java)
This file demonstrates the use of `ArrayList` in Java, covering:
- **ArrayList Initialization**: Creating and initializing ArrayLists.
- **ArrayList Operations**: Adding, removing, and updating elements in ArrayLists.
- **ArrayList Methods**: Common methods used with ArrayLists.
- **ArrayList vs. Arrays**: Comparing the features and use cases of ArrayLists and arrays.

### 6. [QuestionByTUFChannel.java](https://github.com/AnkushGitRepo/DSA/blob/main/src/main/java/org/example/Arrays/QuestionByTUFChannel.java)
This file contains solutions to array problems from the YouTube channel "Take U Forward" (TUF). The problems include:
- **Find the Duplicate Number**: Given an array of integers, find the duplicate number in it.
- **Move Zeroes**: Move all zeroes to the end of the array while maintaining the relative order of non-zero elements.
- **Union and Intersection of Two Arrays**: Find the union and intersection of two arrays.
- **Finds the missing number**: Finds the missing number in an array containing n distinct numbers taken from 0, 1, 2, ..., n.
- **Finds the single number**: Finds the single number in an array where every element appears twice except for one.
- **Maximum consecutive ones**: Finds the maximum number of consecutive 1s in an array with at most one 0 allowed to flip.
- **Subarray with sum K**: Finds the subarray with a given sum K in an array.
- **Majority Element**: Finds the majority element in an array (element that appears more than n/2 times).
- **Maximum Subarray Sum**: Finds the maximum sum of a contiguous subarray within an array.
- **Intersection of Two Arrays II**: Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
- **Max Consecutive Ones III**: Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

### 7. [neetcodeArrays.java](https://github.com/AnkushGitRepo/DSA/blob/main/src/main/java/org/example/Arrays/neetcodeArrays.java)
- **Contains Duplicate**: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
- **Valid Anagram**: Given two strings s and t, return true if t is an anagram of s, and false otherwise.
- **Concatenation of Array** : Given an integer array nums of length n, you want to create an array ans of length `2n` where `ans[i] == nums[i]` and `ans[i + n] == nums[i]` for `0 <= i < n` `(0-indexed)`.
- **Replace Elements with Greatest Element on Right Side**: Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
- **Is Subsequence**: Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
- **Length of Last Word**: Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string. A word is a maximal substring consisting of non-space characters only.
- **Longest Common Prefix**: Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string `""`.
- **Group Anagrams**: Given an array of strings `strs`, group the anagrams together. You can return the answer in any order.
- **Valid Parentheses**: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
- **Pascal's Triangle**: Given an integer `numRows`, return the first numRows of Pascal's triangle.
- **Remove Element**: Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` in-place. The relative order of the elements may be changed.
- **Unique Email Addresses**: Every valid email consists of a local name and a domain name, separated by the '@' sign. Besides lowercase letters, these emails may contain '.'s or '+'s.
- **Isomorphic Strings**: Given two strings `s` and `t`, determine if they are isomorphic. Two strings are isomorphic if the characters in `s` can be replaced to get `t`.
- **Majority Element**: Given an array `nums` of size `n`, return the majority element. The majority element is the element that appears more than `n / 2` times. You may assume that the majority element always exists in the array.
- **Can Place Flowers**: You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots. Given an integer array `flowerbed` containing `0's` and `1's`, where `0` means empty and `1` means not empty, and an integer `n`, return if `n` new flowers can be planted in the `flowerbed` without violating the no-adjacent-flowers rule.
- **Next Greater Element I**: The next greater element of some element `x` in an array is the first greater element that is to the right of `x` in the same array. You are given two distinct 0-indexed integer arrays `nums1` and `nums2`, where `nums1` is a subset of `nums2`. For each `0 <= i < nums1.length`, find the index `j` such that `nums1[i] == nums2[j]` and determine the next greater element of `nums2[j]` in `nums2`. If there is no next greater element, then the answer for this query is `-1`.
- **Find Pivot Index**: Given an array of integers `nums`, calculate the pivot index of this array. The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right. If the index is on the left edge of the array, then the left sum is `0` because there are no elements to the left. This also applies to the right edge of the array.
- **Range Sum Query - Immutable**: Given an integer array `nums`, handle multiple queries of the following type:
    - Calculate the sum of the elements of `nums` between indices `left` and `right` inclusive where `left <= right`.
- **Find All Numbers Disappeared in an Array**: Given an array `nums` of `n` integers where `1 <= nums[i] <= n`, return an array of all the integers in the range `[1, n]` that do not appear in `nums`.
- **Maximum Number of Balloons**: Given a string `text`, you want to use the characters of `text` to form as many instances of the word "balloon" as possible. You can use each character in `text` at most once. Return the maximum number of instances that can be formed.
- **Word Pattern**: Given a pattern and a string `s`, find if `s` follows the same pattern. Here, "follows" means a full match, such that there is a one-to-one correspondence between a letter in `pattern` and a non-empty word in `s`.
- **Happy Number**: Write an algorithm to determine if a number `n` is happy. A happy number is a number defined by the following process:
    - Starting with any positive integer, replace the number by the sum of the squares of its digits.
    - Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle that does not include 1.
    - Those numbers for which this process ends in 1 are happy.
- **Monotonic Array**: An array is monotonic if it is either monotone increasing or monotone decreasing. An array `nums` is monotone increasing if for all `i <= j`, `nums[i] <= nums[j]`. An array `nums` is monotone decreasing if for all `i <= j`, `nums[i] >= nums[j]`. Return `true` if and only if the given array `nums` is monotonic.
- **Design HashSet**: Design a HashSet without using any built-in hash table libraries. Implement `MyHashSet` class:
    - `void add(key)`: Insert a key into the HashSet.
    - `void remove(key)`: Remove a key in the HashSet. If the key does not exist in the HashSet, do nothing.
    - `boolean contains(key)`: Return whether the key exists in the HashSet.
- **Design HashMap**: Design a HashMap without using any built-in hash table libraries. Implement the `MyHashMap` class:
    - `MyHashMap()`: Initializes the object with an empty map.
    - `void put(int key, int value)`: Inserts a `(key, value)` pair into the HashMap. If the `key` already exists in the map, update the corresponding `value`.
    - `int get(int key)`: Returns the `value` to which the specified `key` is mapped, or `-1` if this map contains no mapping for the `key`.
    - `void remove(key)`: Removes the `key` and its corresponding `value` if the map contains the mapping for the `key`.
- **Number of Good Pairs**: Given an array of integers `nums`, a pair `(i, j)` is called good if `nums[i] == nums[j]` and `i < j`. Return the number of good pairs.
- **Pascal's Triangle II**: Given an integer `rowIndex`, return the `rowIndexth` (0-indexed) row of the Pascal's triangle.
- **Find Words That Can Be Formed by Characters**: You are given an array of strings `words` and a string `chars`. A string is good if it can be formed by characters from `chars` (each character can only be used once). Return the sum of lengths of all good strings in `words`.
- **Largest 3-Same-Digit Number in String**: Given a string `s`, return the size of the largest substring containing the same character that contains at most three characters.
- **Destination City**: You are given an array of strings `paths`, where `paths[i] = [cityAi, cityBi]` means there exists a direct path going from `cityAi` to `cityBi`. Return the destination city, that is, the city without any path outgoing to another city.
- **Maximum Product Difference Between Two Pairs**: The product difference between two pairs `(a, b)` and `(c, d)` is defined as `(a * b) - (c * d)`. Given an integer array `nums`, choose four distinct indices `w`, `x`, `y`, and `z` such that the product difference between pairs `(nums[w], nums[x])` and `(nums[y], nums[z])` is maximized. Return the maximum such product difference.
- **Maximum Score After Splitting a String**: You are given a string `s` of zeros and ones. You can choose any two adjacent indices and swap their values. Return the maximum score after splitting the string into two non-empty substrings (i.e., left substring and right substring).
- **Path Crossing**: Given a string `path`, where `path[i]` is the `ith` character of the path, you need to determine if your path crosses itself, resulting in a cycle. For example, if `path = "NES"`, then `path[0] = 'N'`, `path[1] = 'E'`, and `path[2] = 'S'`. Then `path` crosses itself because the path will go back to the starting point.
- **Minimum Changes To Make Alternating Binary String**: You are given a string `s` consisting only of the characters `'0'` and `'1'`. In one operation, you can change any `'0'` to `'1'` or vice versa. The string is called alternating if no two adjacent characters are equal. For example, the string `"010"` is alternating, while the string `"0100"` is not. Return the minimum number of operations needed to make `s` alternating.
- **Redistribute Characters to Make All Strings Equal**: You are given an array of strings `words` and a string `s`. A string is good if it can be formed by characters from `s` (each character can only be used once). Return `true` if all the strings in the array `words` are good, otherwise, return `false`.
- **Largest Substring Between Two Equal Characters**: Given a string `s`, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return `-1`.
- **Set Mismatch**: You have a set of integers `s`, which originally contains all the numbers from `1` to `n`. Unfortunately, due to some error, one of the numbers in `s` got duplicated to another number in the set, which results in repetition of one number and loss of another number. You are given an integer array `nums` representing the data status of this set after the error. Find the number that occurs twice and the number that is missing and return them in the form of an array.
- **First Unique Character in a String**: Given a string `s`, return the first non-repeating character in it and return its index. If it does not exist, return `-1`.
- **Number of Students Unable to Eat Lunch**: The school cafeteria offers circular and square sandwiches at lunchtime, referred to by numbers `0` and `1` respectively. The number of sandwiches in the cafeteria is equal to the number of students. The sandwiches are placed in a stack. At each step:
    - If the students are eating sandwich `0`, they will eat the top sandwich on the stack.
    - If the students are eating sandwich `1`, they will remove the top sandwich from the stack and move it to the bottom of the stack.
    - This process will continue until there are no sandwiches in the stack. Return the number of students that are unable to eat.
- **Time Needed to Buy Tickets**: There are `n` people standing in line to buy movie tickets. Due to social distancing rules, the cinema only sells tickets every other seat starting from the first seat in the row. Return the number of seconds needed to buy the tickets.
- **Special Array With X Elements Greater Than or Equal X**: You are given an array `nums` of non-negative integers. A special array is an array where the number of elements (values) that are greater than or equal to the array is equal to the array's length. Return the number of special arrays.

### 8. [neetcodeArraysAndHashingMedium.java](https://github.com/AnkushGitRepo/DSA/blob/main/src/main/java/org/example/Arrays/neetcodeArraysAndHashingMedium.java)
This file contains solutions to medium-level array and hashing problems from the YouTube channel "neetcode":
- **Sort an Array**: Given an array of integers `nums`, sort the array in ascending order.
- **Top K Frequent Elements**: Given an integer array `nums` and an integer `k`, return the `k` most frequent elements. You may return the answer in any order.
- **Product of Array Except Self**: Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.
- **Valid Sudoku**: Determine if a `9 x 9` Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
    - Each row must contain the digits `1-9` without repetition.
    - Each column must contain the digits `1-9` without repetition.
    - Each of the nine `3 x 3` sub-boxes of the grid must contain the digits `1-9` without repetition.
- **Longest Consecutive Sequence**: Given an unsorted array of integers `nums`, return the length of the longest consecutive elements sequence.
- **Majority Element II**: Given an integer array `nums`, return all elements that appear more than `⌊n / 3⌋` times. You may return the answer in any order.
- **Reverse Integer**: Given a signed 32-bit integer `x`, return `x` with its digits reversed. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-2^31, 2^31 - 1]`, then return `0`.
- **String to Integer atoi**: Implement the `myAtoi(string s)` function, which converts a string to a 32-bit signed integer (similar to C/C++'s `atoi` function).
- **Roman to Integer**: Given a string `s` representing a Roman numeral, return the integer value of the Roman numeral.
- **Integer to Roman**: Given an integer `num`, convert it to a Roman numeral.
- **Merge Two Sorted Lists**: Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
- **Search Insert Position**: Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
- **Find the Index of the First Occurrence in a String**: Given a string `s` and a character `c`, return the index of the first occurrence of `c` in `s`. If there is no occurrence of `c` in `s`, return `-1`.
- **Plus One**: Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
- **Sqrt(x)**: Given a non-negative integer `x`, compute and return the square root of `x`.
- **Binary Tree Inorder Traversal**: Given the `root` of a binary tree, return the inorder traversal of its nodes' values.
- **Valid Palindrome**: Given a string `s`, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
- **Implement Stack using Queues**: Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
- **Count Complete Tree Nodes**: Given the `root` of a complete binary tree, return the number of the nodes in the tree.
- **Reverse Linked List**: Given the `head` of a singly linked list, reverse the list, and return its head.
- **Remove Linked List Elements**: Given the `head` of a linked list and an integer `val`, remove all the nodes of the linked list that has `Node.val == val`, and return the new head.
- **Same Tree**: Given the roots of two binary trees `p` and `q`, write a function to check if they are the same or not. Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
- **Intersection of Two Linked Lists**: Given the heads of two singly linked-lists `headA` and `headB`, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return `null`.
- **Linked List Cycle**: Given `head`, the head of a linked list, determine if the linked list has a cycle in it. There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer.


## How to Use
- Browse through each Java file to understand the code structure and problem-solving techniques.
- Each file is well-commented to guide you through the thought process behind solving the problems.
- Try modifying the code and solving the problems yourself to enhance your understanding.

## Contribution
If you'd like to contribute more array-related problems or solutions, feel free to  start a discussion and post your question and solution.

Happy coding! 🚀
=======
