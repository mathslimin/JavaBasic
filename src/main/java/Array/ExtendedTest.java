package Array;

import java.util.ArrayList;

/**
 * @ClassName ExtendedTest
 * @Description Java实例——数组扩容
 * 演示如何在数组初始化后对数组进行扩容,用System.arraycopy对数组进行扩容
 *
 * public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 * src: 原数组
 * srcPos:原数组要复制的起始位置
 * dest:目的数组
 * destPos:目的 数组放置的起始位置
 * length:复制的长度
 * 注意：src和dest都必须是同类型或者可以进行转换类型的数组。
 *
 * @Author 王小波
 * @Date 2019/11/7 11:59
 * @Version 1.0
 **/
public class ExtendedTest {
    public static void main(String[] args) {
        String[] names = new String[]{"A", "B", "C", "D"};
        String[] extended = new String[5];

        extended[3] = "F";
        extended[4] = "G";
        System.arraycopy(names,0,extended,0,names.length);
        for (String str:
             extended) {
            System.out.println(str);

        }

    }

}
