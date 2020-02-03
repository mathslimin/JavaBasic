package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Administrator
 *
 * 遍历Map
 *
 * 1）一般遍历数组都是采用for循环或者增强for
 * 2) 把链表变为数组相关的内容进行遍历
 * 3)迭代器，使我们能够通过循环来得到或删除集合的元素
 * 4)
 */
public class TestAroundMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        // 第一种：普通使用，二次取值
        System.out.println("通过Map.keySet遍历key和value:");
        for (String key:map.keySet()
             ) {
            System.out.println("Key=" + key + "and value=" + map.get(key));

        }

        // 第二种方式
        System.out.println("通过Map.entrySet使用iterator遍历key和value:");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("Key=" + entry.getKey() + "and value=" + entry.getValue());
        }

        // 第三种：推荐，尤其使容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String,String> entry:map.entrySet()
             ) {
            System.out.println("key=" + entry.getKey() + "and value=" + entry.getValue());

        }

        // 第四种
        System.out.println("通过Map.values()遍历所有的value.但不能遍历key");
        for (String v: map.values()
             ) {
            System.out.println("value=" + v);

        }
    }

}
