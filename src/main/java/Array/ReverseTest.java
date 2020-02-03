package Array;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName ReverseTest
 * @Description Java实例——数组反转
 * 我们使用Collections.reverse(ArrayList)将数组进行反转
 * @Author 王小波
 * @Date 2019/11/6 20:10
 * @Version 1.0
 **/
public class ReverseTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("反转前排序：" + arrayList);
        Collections.reverse(arrayList);
        System.out.println("反转后排序：" + arrayList);
    }
}