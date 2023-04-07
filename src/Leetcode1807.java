import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description 1807.替换字符串中的括号内容
 * @Author 住京华
 * @Date 2023/1/12
 */
public class Leetcode1807 {
    
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> hashMap = new HashMap<>();
        //list转为map
        for (List<String> strings : knowledge) {
            hashMap.put(strings.get(0), strings.get(1));
        }
        StringBuilder stringBuilder = new StringBuilder();
        Matcher matcher = Pattern.compile("(\\()(.*?)(\\))").matcher(s);
        while (matcher.find()) {
            //匹配替换括号中的字符
            matcher.appendReplacement(stringBuilder, hashMap.getOrDefault(matcher.group(2), "?"));
        }
        matcher.appendTail(stringBuilder);
        return stringBuilder.toString();
    }
}
