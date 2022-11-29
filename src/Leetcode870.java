import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * @Description 870.优势洗牌
 * @Author 住京华
 * @Date 2022/10/8-上午 11:26
 */
public class Leetcode870 {
    class Solution {
        public int[] advantageCount(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Integer[] index = IntStream.range(0, nums2.length).boxed().toArray(Integer[]::new);
            Arrays.sort(index, Comparator.comparingInt(value -> nums2[value]));
            int left = 0;
            int right = nums1.length - 1;
            for (int i = index.length - 1; i >= 0; --i)
                nums2[index[i]] = (nums1[right] > nums2[index[i]]) ? nums1[right--] : nums1[left++];
            return nums2;
        }
    }
}
