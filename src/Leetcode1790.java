/**
 * @Description 1790.仅执行一次字符串交换能否使两个字符串相等
 * @Author 住京华
 * @Date 2022/10/11-上午 11:08
 */
public class Leetcode1790 {
    class Solution {
        public boolean areAlmostEqual(String s1, String s2) {
            if (s1.equals(s2)) return true;
            int n = 0;
            int left = 0;
            int right = 0;
            for (int i = 0; i < s1.length(); ++i) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    if (n == 0) left = i;
                    else right = i;
                    ++n;
                }
            }
            return n == 2 && (s1.charAt(left) == s2.charAt(right)) && (s1.charAt(right) == s2.charAt(left));
        }
    }
}
