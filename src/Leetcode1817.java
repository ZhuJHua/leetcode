import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Description 1817.查找用户活跃分钟数
 * @Author 住京华
 * @Date 2023/1/20
 */
public class Leetcode1817 {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        int[] res = new int[k];
        for (int[] log : logs) {
            map.computeIfAbsent(log[0], key -> new HashSet<>()).add(log[1]);
//            int id = log[0];
//            if (!map.containsKey(id)) {
//                Set<Integer> hashSet = new HashSet<>();
//                hashSet.add(log[1]);
//                map.put(id, hashSet);
//            }
//            map.get(id).add(log[1]);
        }
        for (int i : map.keySet()) {
            res[map.get(i).size() - 1]++;
        }
        return res;
    }
}
