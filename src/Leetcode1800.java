/**
 * @Description 1800.最大升序子数组和
 * @Author 住京华
 * @Date 2022/10/7-下午 11:25
 */
public class Leetcode1800 {
    class Solution {
        public int maxAscendingSum(int[] nums) {
            int temp = nums[0];
            int count = nums[0];
            int len = nums.length;
            for (int i = 1; i < len; ++i) {
                if (nums[i - 1] < nums[i]) {
                    count += nums[i];
                } else {
                    count = nums[i];
                }
                temp = Math.max(temp, count);
            }
            return temp;
        }
    }
}
