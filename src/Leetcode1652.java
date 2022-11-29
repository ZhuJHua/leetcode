/**
 * @Description 1652.拆炸弹
 * @Author 住京华
 * @Date 2022/9/24-上午 01:52
 */
public class Leetcode1652 {
    class Solution {
        public int[] decrypt(int[] code, int k) {
            int len = code.length;
            int[] result = new int[len];
            boolean p = false;
            if (k == 0) {
                return result;
            } else {
                if (k < 0) {
                    k = -k;
                    p = true;
                }
                for (int i = 0; i < len; ++i) {
                    int tmp = 0;
                    for (int j = 0; j < k; ++j) {
                        if (j + i + 1 >= len) {
                            tmp += code[j + i + 1 - len];
                        } else
                            tmp += code[j + i + 1];
                    }
                    result[i] = tmp;
                }
                if (!p) {
                    return result;
                } else {
                    int t = k + 1;
                    while (t-- != 0) {
                        for (int i = 0; i < len; ++i) {
                            int a = result[len - 1];
                            result[len - 1] = result[i];
                            result[i] = a;
                        }
                    }
                    return result;
                }
            }
        }
    }
    
}
