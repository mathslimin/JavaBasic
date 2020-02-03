package Scanner;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class ScannerInputIntAndFloat {

    public static void main(String[] args) {
        // 声明 Scanner 类
        Scanner scanner = new Scanner(System.in);
        // 定义int ,float类型并赋值
//        int i = 0;
//        float f = 0.0f;
        System.out.println("输入整数:");
        // 判断hasNextInt方法是否是整数
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println("整数数据是:"+i);
        } else {
            System.out.println("输入的不是整数");
        }


        // 判断float类型的hasNextFloat,是输出，否则错误
        System.out.println("输入小数：");
        if (scanner.hasNextFloat()) {
           float f = scanner.nextFloat();
            System.out.println("小数数据是：" + f);
        } else {
            System.out.println("输入的不是小数据");
        }
scanner.close();

        // 关闭
    }
}
