/**
 * @Description 33.搜索旋转排序数组
 * @Author 住京华
 * @Date 2023/1/25
 */
public class Leetcode33 {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int res = -1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[left] < nums[mid]) {
                
            }
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        search(new int[]{5, 1, 3}, 5);
    }
}
