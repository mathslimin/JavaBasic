package NumberMath;

/**
 * @ClassName ValueOfTest
 * @Description Java ValueOf()方法
 * valueOf()方法用于返回给定参数的原生Number对象值，参数可以是原生数据类型，String等
 * 该方法是静态方法。该方法可以接收两个参数一个是字符串，一个是基数
 *
 * 语法格式：
 * static Integer valueOf(int i)
 * static Integer valueOf(String s)
 * static Integer valueOf(String s, int radix)
 *
 * 参数：
 * i--Integer对象的函数
 * s--Integer对象的字符串
 * radix--在解析字符串s时使用的基数，用于指定使用的进制数
 * @Author 王小波
 * @Date 2019/11/6 15:51
 * @Version 1.0
 **/
public class ValueOfTest {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(9);
        Double c = Double.valueOf(5);
        Float a = Float.valueOf("80");
         // 使用16进制
        Integer b = Integer.valueOf("444", 16);
        System.out.println(x);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

    }

}
