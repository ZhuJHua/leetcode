/**
 * @Description 42.接雨水
 * @Author 住京华
 * @Date 2022/11/11-21:23
 */
public class Leetcode42 {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftTag = 0;
        int rightTag = 0;
        int res = 0;
        while (left < right) {
            leftTag = Math.max(leftTag, height[left]);
            rightTag = Math.max(rightTag, height[right]);
            if (leftTag < rightTag) {
                res += leftTag - height[left];
                left++;
            } else {
                res += rightTag - height[right];
                right--;
            }
        }
        return res;
    }
}
