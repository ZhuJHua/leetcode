/**
 * @Description 764.最大加号标志
 * @Author 住京华
 * @Date 2022/11/9-下午 12:11
 */
public class Leetcode764 {
    
    int[][] matrix;
    int res = 0;
    
    
    public static void main(String[] args) {
        Leetcode764 leetcode764 = new Leetcode764();
        System.out.println(leetcode764.orderOfLargestPlusSign(1, new int[][]{{0, 0}}));
    }
    
    
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        if (mines.length == n * n) return 0;
        matrix = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = 1;
            }
        }
        for (int[] mine : mines) {
            matrix[mine[0]][mine[1]] = 0;
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] == 1) {
                    res = Math.max(res, Math.min(X(i, j, n, matrix) + 1, Y(i, j, n, matrix) + 1));
                }
            }
        }
        return res;
    }
    
    public int X(int x, int y, int n, int[][] matrix) {
        int temp;
        int count = 1;
        //往右寻找
        for (int i = x + 1; i < n; ++i) {
            if (matrix[i][y] == matrix[x][y]) {
                count++;
            } else break;
        }
        temp = count;
        //往左寻找
        for (int i = x - 1; i >= 0; --i) {
            if (matrix[i][y] == matrix[x][y]) {
                count++;
            } else break;
        }
        return Math.min(temp - 1, count - temp);
    }
    
    public int Y(int x, int y, int n, int[][] mines) {
        int temp2;
        int count = 1;
        //往下寻找
        for (int i = y + 1; i < n; ++i) {
            if (mines[x][i] == mines[x][y]) {
                count++;
            } else break;
        }
        temp2 = count;
        //往上寻找
        for (int i = y - 1; i >= 0; --i) {
            if (mines[x][i] == mines[x][y]) {
                count++;
            } else break;
        }
        return Math.min(temp2 - 1, count - temp2);
    }
}