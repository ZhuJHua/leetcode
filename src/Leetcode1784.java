/**
 * @Description 1784.检查二进制字符串
 * @Author 住京华
 * @Date 2022/10/3-上午 01:19
 */
public class Leetcode1784 {
    class Solution {
        public boolean checkOnesSegment(String s) {
            return !s.contains("01");
        }
    }
}
