package Scanner;

import java.util.Scanner;

/**
 * @author Administrator
 *
 * 以下实例我们可以输入多个数字，并求其总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果
 */
 class ScannerMoreNumberCountTotal {
    /**
     *
     * @param args
     * 1、声明 Scanner
     * 2、声明变量
     * 3、while判断hasNextDouble()
     * 4、输出m个数总和sun,m个数的平均数
     * 5、关闭程序
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        double x;
        while(scanner.hasNextDouble()) {
             x = scanner.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.println(m + "个数的和为:" + sum);
        System.out.println(m+"个数的平均值是：" + (sum / m));
        scanner.close();

    }

}
