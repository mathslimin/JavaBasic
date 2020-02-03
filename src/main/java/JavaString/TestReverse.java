package JavaString;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName TestReverse
 * @Description TODO
 * @Author 王小波
 * @Date 2019/11/6 21:37
 * @Version 1.0
 **/
public class TestReverse {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        System.out.println("反转前：" + arrayList);
        Collections.reverse(arrayList);
        System.out.println("反转后：" + arrayList);
    }
}
