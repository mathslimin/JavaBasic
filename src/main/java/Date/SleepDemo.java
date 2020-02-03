package Date;

import java.util.Date;

/**
 * @author Administrator
 *
 * Java休眠（sleep）
 */
public class SleepDemo {
    public static void main(String[] args) {
        try {
            System.out.println(new Date() + "\n");
            // 让程序休眠3秒
            Thread.sleep(3*1000);
            System.out.println(new Date() + "\n");
        } catch (InterruptedException e) {
            System.out.println("Got an exception!");
        }

    }
}

