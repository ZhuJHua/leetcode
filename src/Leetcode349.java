import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 349.两个数组的交集
 * @Author 住京华
 * @Date 2022/11/11-下午 03:05
 */
public class Leetcode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] temp;
        List<Integer> list = new ArrayList<>();
        if (nums1.length >= nums2.length) {
            for (int i = 0; i < nums1.length; ++i) {
                map.put(i, nums1[i]);
            }
            temp = nums2.clone();
        } else {
            for (int i = 0; i < nums2.length; ++i) {
                map.put(i, nums2[i]);
            }
            temp = nums1.clone();
        }
        for (int j : temp) {
            if (map.containsValue(j) && !list.contains(j)) {
                list.add(j);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            res[i] = list.get(i);
        }
        return res;
    }
}
