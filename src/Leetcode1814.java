import java.util.HashMap;

/**
 * @Description 1814.统计一个数组中好对子的数目
 * @Author 住京华
 * @Date 2023/1/17
 */
public class Leetcode1814 {
    public int countNicePairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int num : nums) {
            int i = num;
            int ans = 0;
            while (i != 0) {
                ans = ans * 10 + i % 10;
                i /= 10;
            }
            map.merge(num - ans, 1, Integer::sum);
        }
        long res = 0;
        for (int i : map.values()) {
            res = (res + (long) i * (i - 1) / 2) % 1000000007;
        }
        return (int) res;
    }
}
