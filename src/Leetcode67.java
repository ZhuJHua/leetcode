/**
 * @Description 67.二进制求和
 * @Author 住京华
 * @Date 2023/1/16
 */
public class Leetcode67 {
    public String addBinary(String a, String b) {
        return String.valueOf(add(Integer.parseInt(a), Integer.parseInt(b)));
    }
    
    public int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return add(sum, carry);
    }
}
