/**
 * @Description 125.验证回文串
 * @Author 住京华
 * @Date 2022/11/10-下午 11:50
 */
public class Leetcode125 {
    public boolean isPalindrome(String s) {
        char[] chars = new char[s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i))) {
                chars[count++] = Character.toLowerCase(s.charAt(i));
            }
        }
        count--;
        int left = 0;
        while (left < count) {
            if (chars[left] == chars[count]) {
                left++;
                count--;
            } else return false;
        }
        return true;
    }
}
