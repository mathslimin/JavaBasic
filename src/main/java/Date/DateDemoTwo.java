package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 *
 * 解析字符串为时间
 * SimpleDateFormat类有一些附加的方法，特别是parse(),
 * 它是试图按照给定的SimpleDateFormat对象的格式化存储来解析字符串。
 */
public class DateDemoTwo {
    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "1818-11-11" : args[0];
        System.out.println(input + "Parses as");
        Date t;
        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using" + ft);
        }

    }
}
