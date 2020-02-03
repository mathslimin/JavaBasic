package JavaString;

import java.util.Locale;

/**
 * @author Administrator
 * Java实例——字符串格式化
 *
 * 以下实例通过format()方法来格式化字符串，还可以指定地区来格式化：
 */
public class StringFormat {
    public static void main(String[] args) {
        double e = Math.E;
        System.out.format("%f%n", e);
        // 指定本地为中国
        System.out.format(Locale.CANADA, "%-10.4f%n%n", e);
    }

}
