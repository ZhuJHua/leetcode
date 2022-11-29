/**
 * @Description 345.反转字符串中的元音字母
 * @Author 住京华
 * @Date 2022/11/11-下午 02:02
 */
public class Leetcode345 {
    public String reverseVowels(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        String aim = "aeiouAEIOU";
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (aim.indexOf(s.charAt(left)) == -1) left++;
            if (aim.indexOf(s.charAt(right)) == -1) right--;
            if (aim.indexOf(s.charAt(left)) >= 0 && aim.indexOf(s.charAt(right)) >= 0) {
                char temp = s.charAt(left);
                stringBuilder.setCharAt(left, s.charAt(right));
                stringBuilder.setCharAt(right, temp);
                left++;
                right--;
            }
        }
        return stringBuilder.toString();
    }
}
