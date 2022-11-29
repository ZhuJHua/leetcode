import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 792.匹配子序列的单词数
 * @Author 住京华
 * @Date 2022/11/17-19:35
 */
public class Leetcode792 {
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        Arrays.sort(words);
        int res = 0;
        for (String s1 : words) {
            map.merge(s1, 1, Integer::sum);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (isSon(s, entry.getKey())) res += entry.getValue();
        }
        return res;
    }
    
    public boolean isSon(String s, String word) {
        if (word.length() > s.length()) return false;
        int sp = 0, wp = 0;
        while (sp < s.length() && wp < word.length()) {
            if (s.charAt(sp) == word.charAt(wp)) {
                sp++;
                wp++;
            } else sp++;
        }
        return wp == word.length();
    }
}
