/**
 * @Description 1694.重新格式化电话号码
 * @Author 住京华
 * @Date 2022/10/1-下午 03:07
 */
public class Leetcode1694 {
    class Solution {
        public String reformatNumber(String number) {
            number = number.replace(" ", "").replace("-", "");
            int len = number.length();
            if (len < 4) return number;
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < len; ++i) {
                result.append(number.charAt(i));
                if ((i + 1) % 3 == 0 && i != len - 1)
                    result.append('-');
            }
            int len2 = result.length();
            if (result.charAt(len2 - 2) == '-') {
                result.deleteCharAt(len2 - 2);
                result.insert(len2 - 3, '-');
            }
            return result.toString();
        }
    }
    
}
