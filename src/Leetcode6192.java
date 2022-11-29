/**
 * @Description 6192.公因子的数目
 * @Author 住京华
 * @Date 2022/10/2-下午 04:47
 */
public class Leetcode6192 {
    class Solution {
        public int commonFactors(int a, int b) {
            int n = 0;
            for (int i = 1; i <= Math.max(a, b); ++i) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println(i);
                    ++n;
                }
            }
            return n;
        }
    }
}
