package OverrideAndOverload;

/**
 * @author Administrator
 * 重载（Overload）
 * 重载（overlonding）是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。
 * 每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表
 */

public class Overloading {
    public int test() {
        System.out.println("test1");
        return 1;

    }
    public void test(int a) {
        System.out.println("test2");
    }
    // 以下两个参数类型顺序不同
    public String test(int a,String s) {
        System.out.println("test3");
        return "returntest3";
    }

    public String test(String s, int a) {
        System.out.println("test4");
        return "returntest4";
    }




    public static void main(String[] args) {
        Overloading o = new Overloading();
        System.out.println(o.test());
        o.test(1);
        System.out.println(o.test(1, "test3"));
        System.out.println(o.test("test4", 1));


    }
}
