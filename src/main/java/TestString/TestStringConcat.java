package TestString;

/**
 * @author Administrator
 * 连接字符串：
 * String类提供了连接两个字符串的方法：
 * string1.concat(string2);
 * 1)返回string2连接string1的新字符串。也可以对字符串常量使用concat()方法，如：
 * “我的名字是”.concat("Runoob");
 *2)更常用的是使用‘+’操作符来连接字符串，如：
 * "Hello,"+"runoob"+"!"
 * 结果如下：
 * "Hello,"+"runoob"+"!"
 */
public class TestStringConcat {
    public static void main(String[] args) {
        String string1 = "菜鸟教程网址：";
        System.out.println("1、" + string1 + "www.runoob.com");
        System.out.println(string1.concat("www.runoob.com"));
    }



}
