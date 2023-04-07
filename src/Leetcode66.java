/**
 * @Description 66.加一
 * @Author 住京华
 * @Date 2023/1/16
 */
public class Leetcode66 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; --i) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}
