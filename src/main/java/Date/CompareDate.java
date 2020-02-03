package Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 *
 * Java中比较两个日期Date的大小
 */
public class CompareDate {
    public static void main(String[] args) {
        int i = compare_date("2019-10-20 15:21", "2019-10-23 16:26)");
        System.out.println("i==" + i);

    }

    private static int compare_date(String DATE1, String DATE2) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        try {
            Date dt1 = df.parse(DATE1);
            Date dt2 = df.parse(DATE2);
            if (dt1.getTime()<dt2.getTime()) {
                System.out.println("dt1 在dt2前");
                return 1;
            } else if (dt1.getTime() < dt2.getTime()) {
                System.out.println("dt1在dt2后");
                return -1;
            } else {
                return 0;
            }
        } catch (ParseException exception) {
            exception.printStackTrace();
        }
        return 0;
    }

}
