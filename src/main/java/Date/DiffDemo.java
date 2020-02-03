package Date;

import java.util.Date;

/**
 * @author Administrator
 *
 * 测量时间
 * System.currentTimeMillis( ) 返回毫秒为单位的当前时间
 */
public class DiffDemo {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
            Thread.sleep(3*1000);
            System.out.println(new Date() + "\n");
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Difference is :"+ diff);

        } catch (InterruptedException e) {
            System.out.println("Got an exception!");
        }


    }
}
