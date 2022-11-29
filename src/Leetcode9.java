/**
 * @Description 9.回文数
 * @Author 住京华
 * @Date 2022/9/30-下午 04:45
 */
public class Leetcode9 {
    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) return false;
            int tmp = x;
            int result = 0;
            while (tmp != 0) {
                int t = tmp % 10;
                result = result * 10 + t;
                tmp /= 10;
            }
            return result == x;
        }
    }
    
}
