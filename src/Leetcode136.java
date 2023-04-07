import java.util.HashMap;
import java.util.Map;

/**
 * @Description 136.只出现一次的数字
 * @Author 住京华
 * @Date 2023/1/15
 */
public class Leetcode136 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : nums) {
            hashMap.merge(i, 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
    
    public int singleNumber2(int[] nums) {
        int res = 0;
        for (int i : nums) {
            res ^= i;
        }
        return res;
    }
}
