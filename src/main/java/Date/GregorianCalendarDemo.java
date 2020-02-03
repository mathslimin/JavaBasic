package Date;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Administrator
 */
public class GregorianCalendarDemo {
    public static void main(String[] args) {
        String months[] ={
                "Jan","Feb","Mar","Apr",
                "May","Jun","Jul","Aug",
                "Sep","Oct","Nov","Dec"
        };
        int year;
        // 初始化Gregorian日历
        // 使用当前时间和日期
        // 默认为本地时间和时区
        GregorianCalendar gcalender = new GregorianCalendar();
        // 显示当前时间和日期的信息
        System.out.println("Date:");
        System.out.println(months[gcalender.get(Calendar.MONTH)]);
        System.out.println(" " + gcalender.get(Calendar.DATE) + "");
        System.out.println(year = gcalender.get(Calendar.YEAR));
        System.out.println("Time:");
        System.out.println(gcalender.get(Calendar.HOUR) + "");
        System.out.println(gcalender.get(Calendar.MINUTE) + ":");
        System.out.println(gcalender.get(Calendar.SECOND));

        // 测试当前年份是否为闰年
        if (gcalender.isLeapYear(year)) {
            System.out.println("当前年份是闰年");
        } else {
            System.out.println("当前年份不是闰年");
        }
    }
}
