/**
 * @Description 775.全局倒置与局部倒置
 * @Author 住京华
 * @Date 2022/11/16-20:49
 */
public class Leetcode775 {
    public boolean isIdealPermutation(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i] - i) > 1) return false;
        }
        return true;
    }
}
