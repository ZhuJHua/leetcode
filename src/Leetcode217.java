import java.util.HashSet;
import java.util.Set;

/**
 * @Description 217.存在重复元素
 * @Author 住京华
 * @Date 2023/1/16
 */
public class Leetcode217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        return set.size() != nums.length;
    }
}
