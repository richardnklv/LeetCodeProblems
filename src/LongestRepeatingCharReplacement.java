public class LongestRepeatingCharReplacement {
    class Solution {
        public int characterReplacement(String s, int k) {
            int maxLength = 0;
            int maxCount = 0;
            int start = 0;
            int[] charCount = new int[26];

            // using only 1 iteration
            for (int end = 0; end < s.length(); end++) {

                // similar to the two pointer, but a sliding window
                // end counts the most repeating char in s
                maxCount = Math.max(maxCount, ++charCount[s.charAt(end) - 'A']);

                // if there are more than k different characters we shorten the window
                if (end - start + 1 - maxCount > k) {
                    charCount[s.charAt(start) - 'A']--;
                    start++;
                }

                // update new max
                maxLength = Math.max(maxLength, end - start + 1);
            }

            return maxLength;
        }
    }
}
