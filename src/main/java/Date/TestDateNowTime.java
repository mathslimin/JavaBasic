package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 *
 * SimpleDateFormat是一个语言环境敏感的方式来格式化和分析日期的类。
 * SimpleDateFormat允许你选择任何用户定义日期时间格式来运行
 */
public class TestDateNowTime {
    public static void main(String[] args) {
        // 初始化Date对象
        Date dNow = new Date();
        // 格式转换成 SimpleDateFormat格式
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        // 输出日志
        System.out.println("当前时间为：" + ft.format(dNow));
    }

}
