import java.util.Arrays;

/**
 * @Description 831.隐藏个人信息
 * @Author 住京华
 * @Date 2023/4/1
 */
public class Leetcode831 {
    public static String maskPII(String s) {
        String res = null;
        if (s.contains("@")) {
            String[] mailStr = s.split("@");
            res = mailStr[0].toLowerCase().charAt(0) + "*****" +
                    mailStr[0].toLowerCase().charAt(mailStr[0].length() - 1) + "@" + mailStr[1].toLowerCase();
        } else {
            StringBuilder temp = new StringBuilder();
            for (Character c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    temp.append(c);
                }
            }
            String end = temp.substring(temp.length() - 4);
            String head = temp.substring(0, temp.length() - 10);
            if (temp.length() > 10) {
                switch (head.length()) {
                    case 1 -> res = "+*-***-***-" + end;
                    case 2 -> res = "+**-***-***-" + end;
                    case 3 -> res = "+***-***-***-" + end;
                }
            } else {
                res = "***-***-" + end;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(maskPII("JackAndJill@Gmail.Com"));
    }
}
