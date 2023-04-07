/**
 * @Description 35.搜索插入位置
 * @Author 住京华
 * @Date 2023/1/25
 */
public class Leetcode35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int mid = 0;
        while (left < right) {
            mid = (left + right) >>> 1;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
