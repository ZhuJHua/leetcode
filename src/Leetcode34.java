import java.util.Arrays;

/**
 * @Description 34.在排序数组中查找第一个和最后一个位置
 * @Author 住京华
 * @Date 2023/1/25
 */
public class Leetcode34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        if (nums.length == 0) {
            return res;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[left] == target) {
            res[0] = left;
            res[1] = res[0];
        }
        if (res[0] != -1) {
            left = 0;
            right = nums.length - 1;
            while (left < right) {
                int mid = (left + right + 1) >>> 1;
                if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid;
                }
            }
            res[1] = left;
            return res;
        }
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{1}, 1)));
    }
}
