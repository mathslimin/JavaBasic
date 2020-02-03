package Array;

import java.util.Arrays;

/**
 * @ClassName FillTest
 * @Description Java实例——数组填充
 * 通过Java Util类的Arrays.fill(arrayname,value)方法
 * 和Arrays.fill(arrayname,starting index,ending index,value)
 * @Author 王小波
 * @Date 2019/11/7 10:34
 * @Version 1.0
 **/
public class FillTest {
    public static void main(String[] args) {
        int array[] = new int[6];
        Arrays.fill(array ,100);
        for (int i = 0,n=array.length; i < n; i++) {
            System.out.println(array[i]);

        }
        System.out.println();
        Arrays.fill(array,3,6,50);
        for (int i = 0,n=array.length; i < n; i++) {
            System.out.println(array[i]);

        }
    }

}
