import java.util.HashMap;
import java.util.Map;

/**
 * @Description 594.最长子序列
 * @Author 住京华
 * @Date 2023/1/21
 */
public class Leetcode594 {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.merge(i, 1, Integer::sum);
        }
        int ans = 0;
        for (int i : nums) {
            if (map.containsKey(i + 1)) {
                ans = Math.max(ans, map.get(i) + map.get(i - 1));
            }
        }
        return ans;
    }
}
