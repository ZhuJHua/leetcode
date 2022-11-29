import java.util.HashMap;
import java.util.Map;

/**
 * @Description 645.错误的集合
 * @Author 住京华
 * @Date 2022/10/14-上午 11:49
 */
public class Leetcode645 {
    class Solution {
        public int[] findErrorNums(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            int sum = 0;
            int temp = ((1 + nums.length) * nums.length) / 2;
            for (int i : nums) {
                sum += i;
                map.merge(i, 1, Integer::sum);
            }
            for (int num : nums) {
                if (map.get(num) == 2) {
                    return new int[]{num, temp - sum + num};
                }
            }
            return null;
        }
    }
}
