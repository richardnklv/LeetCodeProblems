public class MaxConsecutiveOnesIII {
    class Solution {
        public int longestOnes(int[] nums, int k) {

            // sliding window technique with a start and end
            // I count the zeroes and based on them shrink the window
            int start = 0, end = 0;
            int maxLength = 0;
            int zeroes = 0;

            while (end < nums.length) {

                // expanding the window
                if (nums[end] == 0) {
                    zeroes++;
                }
                end++;

                // shrink the window as zeroes > k
                while (zeroes > k) {
                    if (nums[start] == 0) {
                        zeroes--;
                    }
                    start++;
                }

                // update length at the end otherwise it mismatched start and end
                maxLength = Math.max(maxLength, end - start);

            }
            return maxLength;

        }

    }
}
