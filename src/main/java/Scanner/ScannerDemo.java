package Scanner;

import java.util.Scanner;

/**
 * @author Administrator
 *
 * Java Scanner类
 * java.util.Scanner是Java5的新特征，我们通过Scanner类来获取用户的输入
 * 创建Scanner对象的基本语法：
 * Scanner s = new Scanner(System.in);
 *
 * 实例：使用next方法
 */
public class ScannerDemo {
    /**
     * 第一：接收
     *        Scanner接收数据
     *        sout
     * 第二：输入
     *   scan.hasNext()方法判断你是否输出
     *
     *    关闭 scan
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("next方式接收：");

        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();
    }
}
