/**
 * @Description 154.寻找旋转排列数组中的最小值II
 * @Author 住京华
 * @Date 2023/1/25
 */
public class Leetcode154 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[mid] == nums[right]) {
                right--;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
