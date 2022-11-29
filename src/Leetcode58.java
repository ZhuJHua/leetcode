/**
 * @Description 58.最后一个单词长度
 * @Author 住京华
 * @Date 2022/9/27-上午 00:39
 */
public class Leetcode58 {
    class Solution {
        public int lengthOfLastWord(String s) {
            char[] arr = s.toCharArray();
            int len = s.length();
            int num = 0;
            for (int i = len - 1; i >= 0; --i) {
                
                if (Character.isLetter(arr[i])) {
                    num++;
                }
                if (num != 0 && arr[i] == ' ') {
                    break;
                }
            }
            return num;
        }
    }
    
}
