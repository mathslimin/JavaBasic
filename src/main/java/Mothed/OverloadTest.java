package Mothed;

/**
 * @ClassName OverloadTest
 * @Description Java实例——方法重载
 * 方法重载（Overloading）的定义：如果两个方法的方法名相同，但参数不一致，那么可以说一个方法是另一个方法的重载/
 * @Author 王小波
 * @Date 2019/11/7 17:27
 * @Version 1.0
 **/
class MyClass {
    int height;
    MyClass() {
        System.out.println("无参数构造函数");
        height = 4;
    }

    MyClass(int i) {
        System.out.println("房子高度为" + i + "米");
        height = i;
    }
    void info() {
        System.out.println("房子高度为" + height + "米");
    }

    void info(String s) {
        System.out.println(s+":房子高度为"+height+"米");
    }
}
public class OverloadTest {
    public static void main(String[] args) {
        MyClass t = new MyClass(3);
        t.info();
        t.info("重载方法");
        // 重载构造函数
        new MyClass();
    }

}
