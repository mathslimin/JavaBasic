package Array;

import java.util.ArrayList;

/**
 * @ClassName RemoveAllTest
 * @Description Java实例——数组差集
 * 实例演示了如何使用removeAll()方法来计算两个数组的差集
 * @Author 王小波
 * @Date 2019/11/7 15:23
 * @Version 1.0
 **/
public class RemoveAllTest {
    public static void main(String[] args) {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray.add(0, "common1");
        objArray.add(1, "comment2");
        objArray.add(2, "notcomment");
        objArray.add(3, "notcomment1");
        objArray2.add(0, "comment1");
        objArray2.add(1, "comment2");
        objArray2.add(2, "notcommont1");
        System.out.println("array1的元素：" + objArray);
        System.out.println("array2的元素：" + objArray2);
        objArray.removeAll(objArray2);
        System.out.println("array1 与 array2数组差集为：" + objArray);

    }
}
