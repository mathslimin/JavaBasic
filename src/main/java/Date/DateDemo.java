package Date;


import java.util.Date;

/**
 * @author Administrator
 *
 * java.util包提供了Date类来封装当前的日期和时间。Date类提供两个构造函数来实例化Dated对象
 *第一个构造函数使用当前日期和时间来初始化对象。
 * Date()
 * 第二个构造函数接收一个参数，该参数是从1970年1月1日起的毫秒数
 * Date(long millisec)
 *
 * java中获取当前日期和时间很简单，使用Date对象的toString()方法来打印当前日期和时间
 *
 */
public class DateDemo {
    public static void main(String[] args) {
        // 初始化date对象
        Date date = new Date();
        // 使用toString()方法显示日期
        System.out.println(date.toString());
    }

}
