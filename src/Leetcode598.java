/**
 * @Description 598.范围求和II
 * @Author 住京华
 * @Date 2023/1/16
 */
public class Leetcode598 {
    public int maxCount(int m, int n, int[][] ops) {
        for (int[] op : ops) {
            m = Math.min(m, op[0]);
            n = Math.min(n, op[1]);
        }
        return m * n;
    }
    
}
