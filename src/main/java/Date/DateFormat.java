package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 * SimpleDateFormat格式化日期
 */
public class DateFormat {
    public static void main(String[] args) {
        // 初始化date
        Date dNow = new Date();
        // 将date转化成 yyyy-MM-dd hh-mm:ss的格式
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        // 以format的格式打印dnow
        System.out.println("当前时间为：" + ft.format(dNow));
    }



}
