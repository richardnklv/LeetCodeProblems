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
  
### Strings or Arrays
1. **Push Dominoes** - [Solution](https://github.com/richardnklv/LeetCodeProblems/blob/master/src/PushDominoes.java)
   - A physics simulation of dominoes falling either left or right in a String.
   - Instead of looping multiple times for each falling domino, I run two loops, the first one takes the first "falling to the right" domino, and for each static domino afterwards it adds an int force
     that lowers by 1 as each domino goes further away from the "falling to the right" one. Same for the left. Then depending on which forces are stronger the domino will - either fall to the right, left or stay.
     
#### Linked Lists
1. **Reverse Linked List** - [Solution](link-to-your-code)
   - Problem description.
   - Approach.

### Algorithms
...

