/**
 * @Description 680.验证回文串II
 * @Author 住京华
 * @Date 2022/11/11-下午 12:38
 */
public class Leetcode680 {
    public static void main(String[] args) {
        Leetcode680 leetcode680 = new Leetcode680();
        System.out.println(leetcode680.validPalindrome("eeccccbebaeeabebccceea"));
    }
    
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
                continue;
            } else {
                return isYes(s, left++, right) || isYes(s, left, right--);
            }
        }
        return true;
    }
    
    public boolean isYes(String s, int left, int right) {
        for (int i = left, j = right; i < j; ++i, --j) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}
