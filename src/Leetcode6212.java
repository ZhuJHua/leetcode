import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 6212.删除字符使频率相同
 * @Author 住京华
 * @Date 2022/10/2-上午 00:18
 */
public class Leetcode6212 {
    class Solution {
        public boolean equalFrequency(String word) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < word.length(); ++i) {
                char tmp = word.charAt(i);
                map.merge(tmp, 1, Integer::sum);
            }
            ArrayList<Integer> arr = new ArrayList<>(map.values());
            Collections.sort(arr);
            int len = arr.size();
            if (arr.get(len - 1) == 1 || len == 1) return true;
            if (arr.get(0).equals(arr.get(len - 1)) && arr.get(0) > 1) return false;
            for (int i = 0; i < len; ++i) {
                int tmp = arr.get(i);
                arr.set(i, tmp - 1);
                ArrayList<Integer> temp = new ArrayList<>(arr);
                Collections.sort(temp);
                if ((temp.get(len - 1).equals(temp.get(0))) || temp.get(len - 1).equals(temp.get(1)) && temp.get(0) == 0)
                    return true;
                else arr.set(i, tmp);
            }
            return false;
        }
    }
    
}
