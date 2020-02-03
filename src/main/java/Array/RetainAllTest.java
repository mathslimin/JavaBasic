package Array;

import java.util.ArrayList;

/**
 * @ClassName RetainAllTest
 * @Description Java实例——数组交集
 * 实例演示了如何使用retainAll()方法来计算两个数组的交集
 * @Author 王小波
 * @Date 2019/11/7 15:31
 * @Version 1.0
 **/
public class RetainAllTest {
    public static void main(String[] args) {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray.add(0, "common1");
        objArray.add(1, "common2");
        objArray.add(2, "common3");
        objArray.add(3, "common4");
        objArray2.add(0, "common1");
        objArray2.add(1, "commont2");
        objArray2.add(2, "comment3");
        System.out.println("Array1 数组元素：" + objArray);
        System.out.println("Array2 数组元素：" + objArray2);
        objArray.retainAll(objArray2);
        System.out.println("Array1 与Array2 求交集:" + objArray);
    }
}
