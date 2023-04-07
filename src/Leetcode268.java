import java.util.HashMap;
import java.util.Map;

/**
 * @Description 268.丢失的数字
 * @Author 住京华
 * @Date 2023/1/15
 */
public class Leetcode268 {
    public int missingNumber(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i : nums) {
            hashMap.put(i, 1);
        }
        for (int i = 0; i <= nums.length; ++i) {
            if (!hashMap.containsKey(i)) {
                return i;
            }
        }
        return 0;
    }
}
