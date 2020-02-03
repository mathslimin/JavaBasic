package Exception;

/**
 * @ClassName TryCatchFinally
 * @Description TODO
 * @Author 王小波
 * @Date 2019/11/9 15:59
 * @Version 1.0
 **/
public class TryCatchFinally {
    // 定义一个有两个元素的数组
    // 用try catch finally 抛出异常
    public static void main(String[] args) {
        int a[] = new int[2];
        try {
            System.out.println("输出第三个数组元素：" + a[3]);
        } catch (Exception e) {
            System.out.println("抛出异常：" + e);
        } finally {
            // 用Finally去清理，是如何回收资源的？？？
            a[0] = 7;
            System.out.println("输出第0个数组：" + a[0]);
            System.out.println("The finally statement is executed");
        }
    }

}
