import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindKClosestElement {

    // Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.
    //
    //An integer a is closer to x than an integer b if:
    //
    //|a - x| < |b - x|, or
    //|a - x| == |b - x| and a < b
    //
    //
    //Example 1:
    //
    //Input: arr = [1,2,3,4,5], k = 4, x = 3
    //Output: [1,2,3,4]
    //Example 2:
    //
    //Input: arr = [1,2,3,4,5], k = 4, x = -1
    //Output: [1,2,3,4]
    //
    class Solution {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            int nearest = 0;
            List<Integer> answer = new ArrayList<>();

            // Find the closest element to x
            for (int i = 0; i < arr.length; i++) {
                if (Math.abs(arr[i] - x) < Math.abs(x - arr[nearest])) {
                    nearest = i;
                }
            }

            // Left and right pointers, as it is a sorted list
            int left = nearest;
            int right = nearest + 1;
            while (answer.size() < k) {
                if (left >= 0 && right < arr.length) {
                    if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                        answer.add(arr[left--]);
                    } else {
                        answer.add(arr[right++]);
                    }
                } else if (left >= 0) {
                    answer.add(arr[left--]);
                } else if (right < arr.length) {
                    answer.add(arr[right++]);
                }
            }
            Collections.sort(answer);
            return answer;
        }
    }
}
