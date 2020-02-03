package Date;

import java.util.Date;

/**
 * @author Administrator
 *利用一个格式化字符串指出要被格式化的参数索引
 * 索引必须紧跟在%后面，而且必须以$结束
 *
 */
public class DateParameterIndex {
    public static void main(String[] args) {
        // 初始化Date对象
        Date date = new Date();

        // 使用toString()显示日期和时间
        System.out.printf( "%1$s %2$tB %2$td %2$tY",
                "Due date:",date);

        System.out.printf( "%s %tB %<te , %<tY","Due date:",date);
    }

}
