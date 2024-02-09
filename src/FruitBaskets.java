import java.util.HashMap;

public class FruitBaskets {
    class Solution {
        public int totalFruit(int[] fruits) {
            int start = 0;
            int max = 0;
            // hashmap because thats what works ...
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int end = 0; end < fruits.length; end++) {
                // update
                map.put(fruits[end], end);

                // more than 2 fruits move the window to the right
                while (map.size() > 2) {
                    if (map.get(fruits[start]) == start) {
                        map.remove(fruits[start]);
                    }
                    start++;
                }

                // standard update
                max = Math.max(max, end - start + 1);
            }

            return max;
        }
    }

}
