public class RotateArray {
    // Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
    //
    //
    //
    //Example 1:
    //
    //Input: nums = [1,2,3,4,5,6,7], k = 3
    //Output: [5,6,7,1,2,3,4]
    //Explanation:
    //rotate 1 steps to the right: [7,1,2,3,4,5,6]
    //rotate 2 steps to the right: [6,7,1,2,3,4,5]
    //rotate 3 steps to the right: [5,6,7,1,2,3,4]
    //Example 2:
    //
    //Input: nums = [-1,-100,3,99], k = 2
    //Output: [3,99,-1,-100]
    //Explanation:
    //rotate 1 steps to the right: [99,-1,-100,3]
    //rotate 2 steps to the right: [3,99,-1,-100]
    class Solution {
        public void rotate(int[] nums, int k) {
            // while (nums.length < k) {
            //     k = k - nums.length;
            // }
            // int[] left = Arrays.copyOfRange(nums, nums.length - k, nums.length);
            // int[] right = Arrays.copyOfRange(nums, 0, nums.length - k);
            // for (int i = 0; i < nums.length; i++) {
            //     if (i < k) {
            //         nums[i] = left[i];
            //     } else {
            //         nums[i] = right[i - k];
            //     }
            // }

            if (nums.length <= 1 || nums == null) {
                return;
            }
            k %= nums.length;
            if (k == 0) {
                return;
            }

            //reverse first half
            reverse(nums, 0, nums.length - k - 1, (nums.length - k - 1) / 2);
            //second half
            reverse(nums, nums.length - k, nums.length - 1, (2 * nums.length - k - 1) / 2);
            //whole list
            reverse(nums, 0, nums.length - 1, (nums.length - 1) / 2);

        }

        // two pointer reverse
        private void reverse(int[] nums, int first, int last, int mid) {
            while (first <= mid) {
                int temp = nums[first]; // temp = 1
                nums[first] = nums[last]; // first = 4
                nums[last] = temp; // last = 1
                first++;
                last--;
            }
        }
    }
}
