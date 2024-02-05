public class JumpGameVI {
    class Solution {
        public int maxResult(int[] nums, int k) {
            int jumpIdx = 0;
            int i = 0;
            int max = 0;
            int temp = 0;
            int tempIdx = 0;
            int result = 0;
            while (jumpIdx < nums.length) {
                while (i < k) {
                    temp = nums[i + jumpIdx];
                    if (temp > max) {
                        max = temp;
                        tempIdx = i + jumpIdx;
                    }

                    i++;
                }
                i = 0;
                result += max;
                jumpIdx = tempIdx;

            }
            return Math.max(0, result);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, -1, -2, 4, -7, 3};
        int k = 2;
        Solution sol = new JumpGameVI().new Solution();
        System.out.println(sol.maxResult(nums, k));
    }
}
