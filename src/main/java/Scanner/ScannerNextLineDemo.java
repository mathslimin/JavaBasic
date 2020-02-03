package Scanner;

import java.util.Scanner;

/**
 * @author Administrator
 *
 * 使用nextLine方法
 */
public class ScannerNextLineDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nextLine方式接收");

        if (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            System.out.println("输入的数据为：" + str);
        }
        scanner.close();
    }
}
