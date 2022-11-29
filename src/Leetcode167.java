/**
 * @Description 167.两数之和II
 * @Author 住京华
 * @Date 2022/11/10-下午 11:16
 */
public class Leetcode167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                break;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else left++;
        }
        return new int[]{left + 1, right + 1};
    }
}
