/**
 * @Description 326.3的幂
 * @Author 住京华
 * @Date 2023/1/16
 */
public class Leetcode326 {
    public boolean isPowerOfThree(int n) {
        return (int) (Math.log10(n) / Math.log10(3)) == (Math.log10(n) / Math.log10(3));
    }
}
