package Mothed;

/**
 * @author Administrator
 *
 * 在一些其他语言中方法指过程和函数.一个返回非void类型返回值的方法称为函数；
 * 一个返回void类型返回值的方法叫做过程。
 *
 * 实例： 下面的方法包含2个参数num1和num2，它返回这两个参数的最大值。
 * 这个程序包含main方法和max方法，main方法是被JVM调用的，除此之外，main方法和其他方法没什么区别。
 * main方法的头部是不变的。如例子所示,带修饰符public和static，返回void类型值，方法名字是main,此外带一个String[]类型的此参数是。
 * String[]表明参数是字符串数组。
 */
public class Mothed {
    /*方法体*/
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println(i + "和" + j + "比较，最大值是：" + k);

    }

    /*返回两个整数变量较大的值*/
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }
}

