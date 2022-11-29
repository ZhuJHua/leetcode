import java.util.Arrays;

/**
 * @Description 628.三个数的最大乘积
 * @Author 住京华
 * @Date 2022/10/10-下午 08:29
 */
public class Leetcode628 {
    class Solution {
        public int maximumProduct(int[] nums) {
            int len = nums.length;
            if (len == 3) return nums[0] * nums[1] * nums[2];
            Arrays.sort(nums);
            return Math.max(nums[0] * nums[1] * nums[len - 1],
                    nums[len - 1] * nums[len - 2] * nums[len - 3]);
        }
    }
}
