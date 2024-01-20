public class MoveZeroes {
    // Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    //
    //Note that you must do this in-place without making a copy of the array.
    //
    //
    //
    //Example 1:
    //
    //Input: nums = [0,1,0,3,12]
    //Output: [1,3,12,0,0]
    //Example 2:
    //
    //Input: nums = [0]
    //Output: [0]
    class Solution {
        public void moveZeroes(int[] nums) {
            for (int j = 0; j < nums.length - 1; j++){
                if (nums[j] == 0) {
                    int i = j + 1;
                    while (nums[i] == 0 && i < nums.length - 1) {
                        i++;
                    }
                    int temp = nums[j]; // temp = 0
                    nums[j] = nums[i]; // 1st el = 1
                    nums[i] = temp; // 2nd el = 0
                }
            }
        }
    }
}
