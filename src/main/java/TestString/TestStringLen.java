package TestString;

/**
 * @author Administrator
 *
 * 字符串长度：
 * 用于获取有关对象的信息的方法称为访问器方法
 * String类的一个访问器方法是length（）方法，它返回字符串对象包含的字符数
 *
 */
public class TestStringLen {
    public static void main(String[] args) {
        String site = "www.runoob.com";
        String name = "王小波";
        int len = site.length();
        int lenName = name.length();
        System.out.println("菜鸟教程网址长度：" + len);
        System.out.println("王小波的长度：" + lenName);
    }
}
