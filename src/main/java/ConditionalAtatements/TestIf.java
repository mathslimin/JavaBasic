package ConditionalAtatements;

/**
 * @author Administrator
 *
 * 一个if语句包含一个布尔表达是和一条或多条语句
 * if语句的语法
 * if(布尔表达式){ // 如果布尔表达式为true将执行的语句 }
 * 如果布尔表达式的值为true，则执行if语句中的代码块，否则执行if语句块后面的代码
 *
 *
 */
public class TestIf {
    public static void main(String[] args) {
        // 定义变量x,并对x进行初始化
        int x = 10;

        if (x < 20) {
            System.out.println("这是if语句");
        }
    }
}
