package loopStatement;

/**
 * @author Administrator
 *
 * for循环
 *  虽然所有循环结构都可以用while和do...while表示，但java提供了另一种语句for循环，使一些循环结构变得更加简单。
 *  for循环执行的次数是在执行之前就确定的。语法格式如下：
 *  for(初始化；布尔表达式；更新){//代码语句}
 *
 *  关于for循环有以下几点说明：
 *  1）最先执行初始化步骤。可以声明一种类型，但可初始化一个或多个循环控制变量，也可以是空语句
 *  2）然后，检测布尔表达式的值。如果true,循环体被执行。如果为false，循环终止，开始执行循环体后面的语句。
 *  3）执行一次循环后，更新循环控制变量
 *  4）再次检测布尔表达式。循环执行上面的过程。
 */

public class TestFor {
    public static void main(String[] args) {
        for (int i = 10; i < 20; i ++) {
            System.out.println("value of x :" + i);
            System.out.println("\n");

        }
    }


}
