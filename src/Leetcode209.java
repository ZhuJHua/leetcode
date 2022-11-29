/**
 * @Description 209.快乐数
 * @Author 住京华
 * @Date 2022/11/14-19:40
 */
public class Leetcode209 {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getRes(n);
        while (slow != fast) {
            slow = getRes(slow);
            fast = getRes(getRes(fast));
        }
        return fast == 1;
        
    }
    
    public int getRes(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            n /= 10;
            res += temp * temp;
        }
        return res;
    }
    
}
