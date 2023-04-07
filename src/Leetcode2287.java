import java.util.HashMap;
import java.util.Map;

/**
 * @Description 2287.重排字符形成目标字符串
 * @Author 住京华
 * @Date 2023/1/13
 */
public class Leetcode2287 {
    public int rearrangeCharacters(String s, String target) {
        Map<Character, Integer> hashMap = new HashMap<>();
        Map<Character, Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < target.length(); ++i) {
            hashMap.merge(target.charAt(i), 1, Integer::sum);
        }
        for (int i = 0; i < s.length(); ++i) {
            hashMap2.merge(s.charAt(i), 1, Integer::sum);
        }
        if (hashMap2.size() < hashMap.size()) {
            return 0;
        }
        int min = s.length();
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (hashMap2.containsKey(entry.getKey())) {
                min = Math.min(min, hashMap2.get(entry.getKey()) / entry.getValue());
            } else min = 0;
        }
        return min;
    }
}
