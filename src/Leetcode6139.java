/**
 * @Description 6139.沙漏的最大总和
 * @Author 住京华
 * @Date 2022/10/2-下午 05:02
 */
public class Leetcode6139 {
    class Solution {
        public static int plus(int x, int y, int[][] matrix) {
            return matrix[x][y] + matrix[x - 1][y - 1] + matrix[x - 1][y] +
                    matrix[x - 1][y + 1] + matrix[x + 1][y - 1] + matrix[x + 1][y] + matrix[x + 1][y + 1];
        }
        
        public int maxSum(int[][] grid) {
            int res = 0;
            for (int i = 0; i < grid.length; ++i) {
                for (int j = 0; j < grid[0].length; ++j) {
                    if (j != 0 && i != 0 && i != grid.length - 1 && j != grid[0].length - 1) {
                        res = Math.max(res, plus(i, j, grid));
                    }
                }
            }
            return res;
        }
    }
    
}
