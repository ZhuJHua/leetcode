import java.util.HashMap;

/**
 * @Description 面试题01.08.零矩阵
 * @Author 住京华
 * @Date 2022/9/30-上午 01:35
 */
public class Leetcode01_08 {
    
    class Solution {
        HashMap<Integer, Long> map = new HashMap<>();
        
        public void setZeroes(int[][] matrix) {
            int h = matrix.length;
            int w = matrix[0].length;
            int n = 0;
            for (int i = 0; i < h; ++i) {
                for (int j = 0; j < w; ++j) {
                    if (matrix[i][j] == 0)
                        map.put(++n, (((long) i << 32) & 0xFFFFFFFF00000000L) | ((long) j & 0xFFFFFFFFL));
                }
            }
            for (Long value : map.values()) {
                int high = (int) ((0xFFFFFFFF00000000L & value) >> 32);
                int low = (int) (0xFFFFFFFFL & value);
                for (int x = 0; x < w; ++x)
                    matrix[high][x] = 0;
                for (int x = 0; x < h; ++x)
                    matrix[x][low] = 0;
            }
        }
    }
    
}
