package Array;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @ClassName TestTwo
 * @Description TODO
 * 在一个数组里面放几个日期，不重复
 * 然后将他们打印出来，获取其中一个日期，并将这个日期拆分成 2019 11 7 的格式放到另一个数组中，最后从这两个数组中分别拿出一个值，用instanceOf进行比较是否相同
 *
 * @Author 王小波
 * @Date 2019/11/7 21:07
 * @Version 1.0
 **/
public class TestTwo {
    public static void main(String[] args) {
        ArrayList<Date> dates1 = new ArrayList<Date>();

        for (int i = 0; i <3 ; i++) {

            Date date = new Date();
            dates1.add(date);
        }
        System.out.println("输出日期：" + dates1);
        String ad = "yyyy-MM-dd";

        SimpleDateFormat sdf = new SimpleDateFormat(ad);
        System.out.println(sdf.format(dates1.get(1)));

        // 定义一个String类型的
        String str = sdf.format(dates1.get(1));
        ArrayList<String> integers = new ArrayList<String>();
        String[] temp;
        String delimeter = "-";  // 指定分割字符
        temp = str.split(delimeter); // 分割字符串
        for (int i = 0; i <temp.length ; i++) {
            integers.add(temp[i]);
        }
        System.out.println(integers);



    }
}
