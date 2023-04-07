import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 599.两个列表的最小索引总和
 * @Author 住京华
 * @Date 2023/1/21
 */
public class Leetcode599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int min = 2000;
        for (int i = 0; i < list2.length; ++i) {
            if (!map.containsKey(list2[i])) {
                continue;
            }
            if (i + map.get(list2[i]) < min) {
                list.clear();
                list.add(list2[i]);
                min = i + map.get(list2[i]);
            } else if (i + map.get(list2[i]) == min) {
                list.add(list2[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}
