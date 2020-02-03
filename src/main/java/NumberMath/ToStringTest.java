package NumberMath;

/**
 * @ClassName ToStringTest
 * @Description toString()方法用于返回以一个字符串表示的Number对象值。
 * 如果方法使用了原生的数据类型作为参数，返回原生数据类型的String对象值
 * 如果方法有两个参数，返回用第二个参数指定基数表示的第一个参数的字符串表示形式
 * @Author 王小波
 * @Date 2019/11/6 16:09
 * @Version 1.0
 **/
public class ToStringTest {
    public static void main(String[] args) {
        Integer x = 5;
        System.out.println(x.toString());
        System.out.println(Integer.toString(12));
    }

}
