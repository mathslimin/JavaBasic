package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @ClassName SortTest
 * @Description Java实例——数组排序及元素查找
 * 实例展示了如何使用sort()方法对Java数组进行排序，及如何使用binarySearch()方法来查找数组中的元素
 * 定义了printArray()方法打印数组
 * @Author 王小波
 * @Date 2019/11/6 16:14
 * @Version 1.0
 **/
public class SortTest {
    public static void main(String[] args) {
        int array[] = {2,5,-2,6,-3,8,0,-7,-9,4};
        Arrays.sort(array);
        printArray("数组排序结果为",array);
    }

    private static void printArray(String message, int array[]) {
        System.out.println(message+":[length"+array.length+"]");
        for (int i = 0; i < array.length ; i++) {
            if (i!=0) {
                System.out.println(",");

            }
            System.out.print(array[i]);

        }
        System.out.println();
    }
}
