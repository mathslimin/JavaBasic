package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ListAddAllTest
 * @Description Java实例——数组合并
 * 通过List类的 Arrays.toString()方法和List类的list.AddAll(array1.asList(array2))方法将两个数组合并为一个数组
 * @Author 王小波
 * @Date 2019/11/7 10:18
 * @Version 1.0
 **/
public class ListAddAllTest {
    public static void main(String[] args) {
        String[] a = {"A", "F", "T"};
        String[] b = {"A", "D", "F"};
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
    }
}
