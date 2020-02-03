package Array;

import java.util.ArrayList;

/**
 * @ClassName RemoveTest
 * @Description java实例——删除数组元素
 * 实例演示了如何使用remove()方法来删除数组元素
 *
 * @Author 王小波
 * @Date 2019/11/7 15:16
 * @Version 1.0
 **/
public class RemoveTest {
    public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<String>();
        objArray.clear();
        objArray.add(0, "第0个元素");
        objArray.add(1, "第1个元素");
        objArray.add(2, "第2个元素");
        System.out.println("数组删除元素前：" + objArray);
        objArray.remove(1);
        objArray.remove("第0个元素");
        System.out.println("数组删除元素后：" + objArray);
    }

}
