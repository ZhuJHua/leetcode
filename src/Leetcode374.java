/**
 * @Description 374.猜数字大小
 * @Author 住京华
 * @Date 2023/1/25
 */

public abstract class Leetcode374 {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int res = 0;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            res = guess(mid);
            if (res == 0) {
                return mid;
            } else if (res == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
    
    abstract int guess(int num);
}
