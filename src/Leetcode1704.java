/**
 * @Description 1704.判断字符串的两半是否相似
 * @Author 住京华
 * @Date 2022/11/11-上午 12:32
 */
public class Leetcode1704 {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        String left = s.substring(0, len / 2);
        String right = s.substring(len / 2, len);
        String aim = "aeiouAEIOU";
        int res1 = 0;
        int res2 = 0;
        for (int i = 0; i < len / 2; ++i) {
            res1 = (aim.indexOf(left.charAt(i)) >= 0) ? (res1 + 1) : res1;
            res2 = (aim.indexOf(right.charAt(i)) >= 0) ? (res2 + 1) : res2;
        }
        return res1 == res2;
    }
}
