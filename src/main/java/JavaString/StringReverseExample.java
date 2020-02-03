package JavaString;

/**
 * @author Administrator
 * Java实例—字符串反转
 * 实例：如何使用Java的反转函数reverse()将字符串反转
 */
public class StringReverseExample {
    public static void main(String[] args) {
        String string = "Jessica";
        String reserve = new StringBuffer(string).reverse().toString();
        System.out.println("字符串反转前：" + string);
        System.out.println("字符串反转后：" + reserve);
    }
}
