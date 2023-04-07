/**
 * @Description 1813.句子相似性III
 * @Author 住京华
 * @Date 2023/1/16
 */
public class Leetcode1813 {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] strings1 = sentence1.split(" ");
        String[] strings2 = sentence2.split(" ");
        int left = 0;
        int right = 0;
        while (left < strings1.length && left < strings2.length && strings1[left].equals(strings2[left])) {
            left++;
        }
        while (right < strings1.length - left && right < strings2.length - left && strings1[strings1.length - right - 1].equals(strings2[strings2.length - right - 1])) {
            right++;
        }
        return left + right == Math.min(strings1.length, strings2.length);
    }
}
