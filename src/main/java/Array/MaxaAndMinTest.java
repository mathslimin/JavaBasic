package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * @ClassName MaxaAndMinTest
 * @Description java实例——数组获取最大和最小值
 * 通过Collections类的Collections.max()和Collections.min()方法查找数组中最大和最小的值
 * @Author 王小波
 * @Date 2019/11/7 9:36
 * @Version 1.0
 **/
public class MaxaAndMinTest {
    public static void main(String[] args) {
        Integer[] numbers = {12, 3, 4, 5, 754, 7, 1};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.println("最小值：" + min);
        System.out.println("最大值：" + max);
    }

}
