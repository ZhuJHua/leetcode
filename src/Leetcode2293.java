/**
 * @Description 2293.极大极小游戏
 * @Author 住京华
 * @Date 2023/1/15
 */
public class Leetcode2293 {
    public int minMaxGame(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] newNums = new int[nums.length / 2];
        for (int i = 0; i < nums.length / 2; ++i) {
            newNums[i] = i % 2 == 0 ? Math.min(nums[2 * i], nums[2 * i + 1]) : Math.max(nums[2 * i], nums[2 * i + 1]);
        }
        return minMaxGame(newNums);
    }
    
}

