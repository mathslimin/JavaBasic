package Array;

import java.util.Arrays;

/**
 * @ClassName EqualsTest
 * @Description Java实例—-判断数组是否相等
 * 实例演示了如何使用equals()方法来判断数组是否相等
 * @Author 王小波
 * @Date 2019/11/7 15:52
 * @Version 1.0
 **/
public class EqualsTest {
    public static void main(String[] args) {
        int[] ary = {1, 3, 4, 5, 7, 7};
        int[] ary1 = {1, 3, 4, 5, 7, 7};
        int[] ary2 = {3, 5, 6, 7, 8, 9};
        System.out.println("数组ary是否与数组ary1相等？：" + Arrays.equals(ary, ary1));
        System.out.println("数组ary是否与数组ary2相等？：" + Arrays.equals(ary, ary2));
    }
}
