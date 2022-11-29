/**
 * @Description 26.删除有序数组中的重复项
 * @Author 住京华
 * @Date 2022/11/10-下午 04:40
 */
public class Leetcode26 {
    public static void main(String[] args) {
        Leetcode26 leetcode26 = new Leetcode26();
        System.out.println(leetcode26.removeDuplicates(new int[]{1, 2, 2}));
    }
    
    
    public int removeDuplicates(int[] nums) {
        int left = 0;
        for (int right = 1; right < nums.length; ++right) {
            if (nums[right] != nums[left]) {
                nums[++left] = nums[right];
            }
        }
        return left + 1;
    }
    
}
