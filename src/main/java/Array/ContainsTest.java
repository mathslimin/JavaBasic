package Array;

import java.util.ArrayList;

/**
 * @ClassName ContainsTest
 * @Description Java实例——在数组中查找指定的元素
 * 实例演示了如何使用 contains()方法来查找数组中的指定元素
 *
 * @Author 王小波
 * @Date 2019/11/7 15:42
 * @Version 1.0
 **/
public class ContainsTest {
    public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<String>();
        ArrayList<String> objArray2 = new ArrayList<String>();
        objArray.add(0, "common");
        objArray.add(1, "common1");
        objArray.add(2, "common3");
        objArray.add(3, "common4");
        objArray2.add(0, "common");
        objArray2.add(1, "common1");
        objArray2.add(2, "Jessica");
        objArray2.add(3, "common3");
        System.out.println("objArray 的数组元素：" + objArray);
        System.out.println("objArray2 的数组元素：" + objArray2);
        System.out.println("objArray 的数组元素是否包含 common：" + objArray.contains("common"));
        System.out.println("objArray2 的数组元素是否包含 common：" + objArray2.contains("Jessica"));
    }

}
