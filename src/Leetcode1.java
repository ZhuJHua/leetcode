import java.util.HashMap;

/**
 * @Description 1.两数之和
 * @Author 住京华
 * @Date 2022/9/9-上午 00:25
 */
public class Leetcode1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; ++i) {
                if (!map.containsKey(target - nums[i])) {
                    map.put(nums[i], i);
                } else {
                    return new int[]{map.get(target - nums[i]), i};
                }
            }
            return null;
        }
    }
    
}
