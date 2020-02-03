package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Administrator
 * <p>
 * 如何使用迭代器：
 * 1）一般遍历数组都是采用for循环或者增强for
 * 2) 把链表变为数组相关的内容进行遍历
 * 3)迭代器，使我们能够通过循环来得到或删除集合的元素
 */
public class TestAroundArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");
        // 第一种遍历方法使用 for-each遍历list
        for (String str:list
             ) {
            System.out.println(str);

        }



        // 第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);

        }



        // 第三种遍历 使用迭代器进行相关遍历
        Iterator<String> ite = list.iterator();
        // 判断下一个元素之后有值
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }

}
