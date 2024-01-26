# LeetCode Solutions to problems I have done.

## Repository Organization
The solutions in this repository are categorized by problem type, such as "Data Structures", "Algorithms", "Dynamic Programming", etc.

## Table of Contents
- [Data Structures](#data-structures)
  - [Arrays](#arrays)
  - [Linked Lists](#linked-lists)
- [Algorithms](#algorithms)
  - [Sorting](#sorting)
  - [Searching](#searching)
- [Dynamic Programming](#dynamic-programming)
- [Others](#others)

## Solutions
### Data Structures
#### Arrays
1. **4Sum** - [Solution](https://github.com/richardnklv/LeetCodeProblems/blob/master/src/FourSum.java)
   - Given an array nums: nums[a] + nums[b] + nums[c] + nums[d] == target
   - Two for loops, and 2-pointer approach.
  
2. **Move Zeroes** - [Solution](https://github.com/richardnklv/LeetCodeProblems/blob/master/src/MoveZeroes.java)
   - Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
   - Example 1:
        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]
   - In a for loop I switch the place of each 0, with the closest non-0 element.
3. **3Sum Closest** - [Solution](https://github.com/richardnklv/LeetCodeProblems/blob/master/src/ThreeSumClosest.java)
   - Given an array nums and a target, find the sum of 3 ints that are closest to the target.
   - First I sort the array. Then a for loop through all without the last 2, then a left(i + 1) and right(nums.length - 1) pointer, then a while that checks if the currentSum < closestSum, it also pushes pointers left++, and right--; because the array is sorted, if the currentSum > target, I push the right--; thus the currentSum will get smaller, the same goes for the left, as the list is sorted.
  
4. **Shortest Subarray to be Removed to Make the Array Sorted** - [Solution](https://github.com/richardnklv/LeetCodeProblems/blob/master/src/ShortestSubarrayToSortList.java)
   - Given an integer array arr, remove a subarray (can be empty) from arr such that the remaining elements in arr are non-decreasing. Return the length of the shortest subarray to remove.
   - I just find the longest sorted part from the left to right, then from right to left, then using to pointers I find the smallest sequence to remove from the middle to get a sorted array.
  
5. **Find K Closest Elements** - [Solution](https://github.com/richardnklv/LeetCodeProblems/blob/master/src/FindKClosestElement.java)
   - Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.
   - A for loop to find the nearest element to x, then a while loop using two-pointers (left = nearest; right = nearest + 1) I compare the closest k elements to nearest.
  
6. **Sort Colors** - [Solution](https://github.com/richardnklv/LeetCodeProblems/blob/master/src/SortColors.java)
   - Given an integer array nums[], with three "colors" - 0, 1, 2. Sort it.
   - I tried using two-pointers left and right for 0's and 1's, got stuck on some edge cases that couldn't solve. Found out there is a Dutch National Flag algorithm. Same thing as my solution, but with 3-pointers.
  
### Strings or Arrays
1. **Push Dominoes** - [Solution](https://github.com/richardnklv/LeetCodeProblems/blob/master/src/PushDominoes.java)
   - A physics simulation of dominoes falling either left or right in a String.
   - Instead of looping multiple times for each falling domino, I run two loops, the first one takes the first "falling to the right" domino, and for each static domino afterwards it adds an int force
     that lowers by 1 as each domino goes further away from the "falling to the right" one. Same for the left. Then depending on which forces are stronger the domino will - either fall to the right, left or stay.

2. **Is Valid Polindrome II** - [Solution](https://github.com/richardnklv/LeetCodeProblems/blob/master/src/isValidPalindromeII.java)
   - Check if a String s, could be a polindrome after removing at most one element anywhere.
   - private isPolindrome method, a while loop with 2 pointers (left and right), then while loop with 2 pointers that when reaches a different character, checks if the rest of the String is a polindrome.
     
#### Linked Lists
1. **Sort Linked List** - [Solution](https://github.com/richardnklv/LeetCodeProblems/blob/master/src/SortLinkedList.java)
   - Given the head of a linked list, return the list after sorting it in ascending order.
   - Merge Sort... Two recursive functions.

### Algorithms
...

