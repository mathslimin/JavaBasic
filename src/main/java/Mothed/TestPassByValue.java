package Mothed;

/**
 * @author Administrator
 *
 * 通过值传递参数
 * 调用一个方法时候需要提供参数，你必须按照参数指定的顺序提供
 *
 * 示例：
 * 下面的例子演示按值传递的效果
 * 该程序创建一个方法，该方法用于交换两个变量
 *
 */
public class TestPassByValue {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println("交换前num1的值为：" + num1 + ",num2的值为：" + num2);

        // 调用swap方法
        swap(num1, num2);
        System.out.println("交换后 num1的值为：" + num1 + ", num2的值为：" + num2);

    }

    /*交换两个变量的方法*/
    public static void swap(int n1, int n2) {
        System.out.println("\t进入swap方法");
        System.out.println("\t\t交换前n1的值为：" + n1 + ",n2的值：" + n2);
        // 交换n1与n2的值
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("\t\t交换后n1的值为:" + n1 + ",n2的值：" + n2);
    }


}
