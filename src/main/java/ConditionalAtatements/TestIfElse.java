package ConditionalAtatements;

/**
 * @author Administrator
 *
 * if...else语句
 * if 语句后面可以跟else语句，当if语句的布尔表达式值为false时，else语句块会被执行
 *
 * if...else的用法：
 * if(布尔表达shi){
 *     // 如果布尔表达式的值为true
 * }else{
 *     // 如果布尔表达式的值为false
 * }
 */
public class TestIfElse {
    public static void main(String[] args) {
        // 定义一个变量x，并给x进行初始化x=30;
        int x = 30;
        if (x < 20) {
            System.out.println("这个if语句");
        } else {
            System.out.println("这是else语句");

        }
    }
}
