import java.util.LinkedList;
import java.util.List;

/**
 * @Description 46.全排列
 * @Author 住京华
 * @Date 2022/11/15-19:57
 */
public class Leetcode46 {
    public List<List<Integer>> res = new LinkedList<>();
    public List<Integer> path = new LinkedList<>();
    public boolean[] used;
    
    public void back(int[] nums) {
        if (path.size() == nums.length) {
            res.add(path);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            path.add(nums[i]);
            used[i] = true;
            back(nums);
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        back(nums);
        return res;
    }
}
