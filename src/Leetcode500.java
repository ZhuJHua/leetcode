import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 500.键盘行
 * @Author 住京华
 * @Date 2023/1/16
 */
public class Leetcode500 {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, 1);
        }
        for (char c : s2.toCharArray()) {
            map.put(c, 2);
        }
        for (char c : s3.toCharArray()) {
            map.put(c, 3);
        }
        List<String> list = new ArrayList<>();
        loop:
        for (String s : words) {
            //确定某个单词第一个字母出现的行号以此为基准
            String temp = s.toLowerCase();
            int index = map.get(temp.charAt(0));
            for (char c : temp.toCharArray()) {
                if (map.get(c) != index) {
                    continue loop;
                }
            }
            list.add(s);
        }
        return list.toArray(new String[0]);
    }
    
}
