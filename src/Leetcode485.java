/**
 * @Description 485.最大连续1的个数
 * @Author 住京华
 * @Date 2022/10/3-下午 07:31
 */
public class Leetcode485 {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int n = 0;
            int res = 0;
            for (int i : nums) {
                if (i == 1) {
                    res = Math.max(res, ++n);
                } else n = 0;
            }
            return res;
        }
    }
}
