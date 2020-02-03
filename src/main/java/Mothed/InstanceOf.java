package Mothed;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @ClassName InstanceOf
 * @Description Java实例——instanceof 关键字用法
 * 1)instanceOf是Java的一个二元操作符，类似于==，>,<等操作符
 * 2）instanceOf是Java的保留关键字。它的作用是测试它左边的对象是否是它右边的类的实例，返回boolean的数据类型
 *
 * 以下实例创建了displayObjectClass()方法来演示Java instanceOf关键字
 * @Author 王小波
 * @Date 2019/11/7 19:54
 * @Version 1.0
 **/
public class InstanceOf {

    public static void displayOjectClass(Object o) {
        if (o instanceof Vector) {
            System.out.println("对象是java.util.Vector 类的实例");
        } else if (o instanceof ArrayList) {
            System.out.println("对象是java.util.ArrayList 类的实例");
        } else {
            System.out.println("对象是" + o.getClass() + "类的实例");
        }

    }

    public static void main(String[] args) {
        Object testObject = new ArrayList();
        displayOjectClass(testObject);
    }
}
