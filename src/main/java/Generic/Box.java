package Generic;

public class Box<T> {
    // 声明泛型变量t
    private T t;

    // 写一个泛型add(T t)方法
    public void add(T t) {
        this.t = t;

    }
    // 生成T的get方法

    public T getT() {
        return t;
    }

    public static void main(String[] args) {
        // 1）定义一个Integer及String类型的泛型变量
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();
        // “插入”数据
        integerBox.add(new Integer(10));
        stringBox.add(new String("菜鸟教程"));

        System.out.printf( "整型值为：%d\n\n",integerBox.getT());
        System.out.printf("字符串为：%s\n",stringBox.getT());

    }
    // main方法




      // 输出
}
