package JavaString;

/**
 * @author Administrator
 * Java实例—字符串性能比较测试
 *
 * 总结模型：
 * 1、在main()方法里面，声明一个long型变量startTime，并给它赋初始值System.currentTimeMillis()
 * 2、写一个for循环，i<50000,并在for循环体中定义两个参数
 * 3、在声明一个long型变量startTime，并给它赋初始值System.currentTimeMillis()
 * 4、最后输出endTime -startTime
 */
public class StringComparePerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            String s1 = "hello";
            String s2 = "hello";


        }
        long endTime = System.currentTimeMillis();
        System.out.println("通过 String 关键字创建字符串" + ":" + (endTime - startTime)+"毫秒");

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            String s3 = new String("hello");
            String s4 = new String("hello");

        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("通过 String 对象创建字符串" + ":" + (endTime1 - startTime1) + "毫秒");


    }
}
