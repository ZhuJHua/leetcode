import java.util.Arrays;

/**
 * @Description 1710.卡车上的最大单元数
 * @Author 住京华
 * @Date 2022/11/15-21:45
 */
public class Leetcode1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int res = 0;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        for (int i = 0, cnt = 0; i < boxTypes.length && cnt < truckSize; i++) {
            int a = boxTypes[i][0];
            int b = boxTypes[i][1];
            cnt += Math.min(a, truckSize - cnt);
            res += Math.min(a, truckSize - cnt) * b;
        }
        return res;
    }
}
