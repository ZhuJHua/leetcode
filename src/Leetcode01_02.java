import java.util.Arrays;

/**
 * @Description 面试题01.02.判定是否为字符重排
 * @Author 住京华
 * @Date 2022/9/27-上午 00:17
 */
public class Leetcode01_02 {
    class Solution {
        public boolean CheckPermutation(String s1, String s2) {
            char[] arrStr = s1.toCharArray();
            char[] arrStr2 = s2.toCharArray();
            Arrays.sort(arrStr);
            Arrays.sort(arrStr2);
            return Arrays.equals(arrStr, arrStr2);
        }
    }
    
    
}
