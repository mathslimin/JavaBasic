package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName SimpleDateAndFormat
 * @Description Java实例——时间戳转换成时间
 * @Author 王小波
 * @Date 2019/11/7 16:29
 * @Version 1.0
 **/
public class SimpleDateAndFormat {
    public static void main(String[] args) {
        // 获取当前时间戳
        Long timeStamp = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 时间戳转换成时间
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println("格式化结果：" + sd);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒");
        String sd2 = sdf2.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println("格式化结果：" + sd2);

    }

}
