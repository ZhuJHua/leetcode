/**
 * @Description 229.多数元素II
 * @Author 住京华
 * @Date 2023/1/21
 */
public class Leetcode229 {
    public static void majorityElement(int[] nums) {
        int count = 0;
        int res = 0;
        for (int i : nums) {
            if (count == 0) {
                count = i;
            } else {
                res = i;
                count = (count == res) ? count++ : count--;
            }
        }
        System.out.println(res);
    }
    
    public static void main(String[] args) {
        majorityElement(new int[]{1, 2, 3, 4, 4, 3, 2, 1, 3});
    }
}
