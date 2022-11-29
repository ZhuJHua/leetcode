/**
 * @Description 169.多数元素
 * @Author 住京华
 * @Date 2022/11/10-下午 10:17
 */
public class Leetcode169 {
    public int majorityElement(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums[nums.length / 2];
    }
    
    public void quickSort(int[] q, int l, int r) {
        if (l >= r) return;
        int x = q[(l + r) / 2];
        int i = l - 1;
        int j = r + 1;
        while (i < j) {
            do i++; while (q[i] < x);
            do j--; while (q[j] > x);
            if (i < j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }
        quickSort(q, l, j);
        quickSort(q, j + 1, r);
    }
    
    
}
