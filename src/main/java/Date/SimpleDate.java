package Date;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName SimpleDateFormat
 * @Description Java实例——格式化时间（SimpleDateFormat）
 * 实例演示了如何使用SimpleDateFormat类的format(date)方法来格式化时间
 * @Author 王小波
 * @Date 2019/11/7 16:18
 * @Version 1.0
 **/
public class SimpleDate {
    public static void main(String[] args) {
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));

        // 格式化时间
        SimpleDateFormat sdf2 = new SimpleDateFormat();
        // a为am/pm的标记
        sdf2.applyPattern("yyyy-MM-dd HH:mm:ss a");
        // 输出已经格式化的现在时间（24小时制）
        System.out.println("现在时间："+sdf2.format(date));
    }
}
