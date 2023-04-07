/**
 * @Description 6292.子矩阵元素加1
 * @Author 住京华
 * @Date 2023/1/15
 */
public class leetcode6292 {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j) {
                arr[i][j] = 0;
            }
        }
        long[][] coordinate = new long[queries.length][2];
        for (int i = 0; i < queries.length; ++i) {
            coordinate[i][0] =
                    ((long) queries[i][0] << 32) & 0xFFFFFFFF00000000L | ((long) queries[i][1] & 0xFFFFFFFFL);
            coordinate[i][1] =
                    ((long) queries[i][2] << 32) & 0xFFFFFFFF00000000L | ((long) queries[i][3] & 0xFFFFFFFFL);
        }
        for (long[] longs : coordinate) {
            fill(arr, longs[0], longs[1]);
        }
        return arr;
    }
    
    public void fill(int[][] arr, long xy1, long xy2) {
        int x1 = (int) ((0xFFFFFFFF00000000L & xy1) >> 32);
        int y1 = (int) (0xFFFFFFFFL & xy1);
        int x2 = (int) ((0xFFFFFFFF00000000L & xy2) >> 32);
        int y2 = (int) (0xFFFFFFFFL & xy2);
        for (int i = x1; i <= x2; ++i) {
            for (int j = y1; j <= y2; ++j) {
                arr[i][j] += 1;
            }
        }
    }
}
