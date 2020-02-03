package ConditionalAtatements;

/**
 * @author Administrator
 * if语句后面可以跟eles if...else语句，这种语句可以检测到多种可能的情况
 * 使用if, else if , else语句的时候，需要注意下面几点：
 * 1）if语句至多有1个else语句，else语句在所有的else if语句之后
 * 2）if语句可以有若干个else if 语句，他们必须在else语句之前
 * 3）一旦其中一个else if 语句检测为true，其他的else if 以及else语句都将跳过执行。
 *
 * if...else语法格式如下：
 * if(布尔表达式1){
 *     // 如果布尔表达式1的值为true执行代码
 * }else if (布尔表达式2){
 *     // 如果布尔表达式2的值为true执行代码
 * }else if (布尔表达式3){
 *     // 如果布尔表达式3的值为true执行代码
 * }else{
 *     // 如果以上布尔表达式都不为true执行代码
 * }
 */
public class TestIfElseIfElse {
    public static void main(String[] args) {
        // 定义一个变量x，并进行初始化
        int x =30;

        if (x == 10) {
            System.out.println("Value of x is 10");
        } else if (x==20) {
            System.out.println("Value of x is 20");
        } else if (x == 30) {
            System.out.println("Value of x is 30");
        } else {
            System.out.println("这是else语句");
        }
    }
}
