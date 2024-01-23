public class ShortestSubarrayToSortList {
    //Given an integer array arr, remove a subarray (can be empty) from arr such that the remaining elements in arr are non-decreasing.
    //
    //Return the length of the shortest subarray to remove.
    //
    //A subarray is a contiguous subsequence of the array.
    //
    //
    //
    //Example 1:
    //
    //Input: arr = [1,2,3,10,4,2,3,5]
    //Output: 3
    //Explanation: The shortest subarray we can remove is [10,4,2] of length 3. The remaining elements after that will be [1,2,3,3,5] which are sorted.
    //Another correct solution is to remove the subarray [3,10,4].
    //Example 2:
    //
    //Input: arr = [5,4,3,2,1]
    //Output: 4
    //Explanation: Since the array is strictly decreasing, we can only keep a single element. Therefore we need to remove a subarray of length 4, either [5,4,3,2] or [4,3,2,1].
    //Example 3:
    //
    //Input: arr = [1,2,3]
    //Output: 0
    //Explanation: The array is already non-decreasing. We do not need to remove any elements.

    public class Solution {
        public int findLengthOfShortestSubarray(int[] arr) {

            // Not to repeat myself
            int n = arr.length;

            // Find the longest non-decreasing subsequence from the left to right
            int left = 0;
            while (left + 1 < n && arr[left] <= arr[left + 1]) {
                left++;
            }

            // If non-decreasing
            if (left == n - 1) {
                return 0;
            }

            // Find the longest non-decreasing from right to left
            int right = n - 1;
            while (right > 0 && arr[right - 1] <= arr[right]) {
                right--;
            }

            // The minimum length to remove is at least the smaller of the two sides
            int minToRemove = Math.min(n - left - 1, right);

            // Check if merging two non-decreasing sequences is possible
            int i = 0, j = right;
            while (i <= left && j < n) {
                if (arr[i] <= arr[j]) {
                    minToRemove = Math.min(minToRemove, j - i - 1);
                    i++;
                } else {
                    j++;
                }
            }

            return minToRemove;
        }
    }

}
