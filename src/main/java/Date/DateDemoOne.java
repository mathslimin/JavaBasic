package Date;

import java.util.Date;

/**
 * @author Administrator
 */
public class DateDemoOne {
    public static void main(String[] args) {
        // 初始化Date对象
        Date date = new Date();

        // 使用toString()显示日期和时间
        System.out.printf("%1$s %2$tB %2$td, %2$tY",
                "Due date:", date);
    }

}
