/**
 * @Description 11.盛水最多的容器
 * @Author 住京华
 * @Date 2022/9/30-下午 06:04
 */
public class Leetcode11 {
    class Solution {
        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int result = 0;
            while (left != right) {
                result = Math.max(result, (right - left) * Math.min(height[left], height[right]));
                if (height[left] < height[right]) {
                    ++left;
                } else --right;
            }
            return result;
        }
    }
    
}
