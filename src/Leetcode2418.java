import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description 2418.按身高排序
 * @Author 住京华
 * @Date 2022/9/25-上午 11:22
 */
public class Leetcode2418 {
    
    class Solution {
        public String[] sortPeople(String[] names, int[] heights) {
            int len = names.length;
            Student[] stu = new Student[len];
            for (int i = 0; i < stu.length; ++i) {
                stu[i] = new Student();
            }
            for (int i = 0; i < len; ++i) {
                stu[i].name = names[i];
                stu[i].hei = heights[i];
            }
            Comparator<Student> tmp = new Comparator<>() {
                @Override
                public int compare(Student o1, Student o2) {
                    if (o1.hei > o2.hei) {
                        return -1;
                    } else if (o1.hei < o2.hei) {
                        return 1;
                    }
                    return 0;
                }
            };
            
            Arrays.sort(stu, tmp);
            String[] t = new String[len];
            for (int i = 0; i < len; ++i) {
                t[i] = stu[i].name;
            }
            return t;
        }
        
        public static class Student {
            String name;
            int hei;
            
        }
    }
    
}
