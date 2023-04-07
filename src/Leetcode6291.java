/**
 * @Description 6291.数组元素和与数字和的绝对差
 * @Author 住京华
 * @Date 2023/1/15
 */
public class Leetcode6291 {
    public int differenceOfSum(int[] nums) {
        int total = 0;
        int total2 = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : nums) {
            total += i;
            stringBuilder.append(i);
        }
        int[] digits = new int[stringBuilder.length()];
        for (int i = 0; i < stringBuilder.length(); ++i) {
            digits[i] = stringBuilder.charAt(i) - '0';
        }
        for (int i : digits) {
            total2 += i;
        }
        return Math.abs(total - total2);
    }
}
