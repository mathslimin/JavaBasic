package loopStatement;

/**
 * @author Administrator
 *
 * While 是最基本的循环，它的结构为
 * while(布尔表达式){ // 循环内容}
 * 只要布尔条件表达式为true,循环就会一直执行下去
 */
public class TestWhile {
    public static void main(String[] args) {
        // 定义变量x，并进行初始化
        int x = 10;
        while (x < 20) {
            System.out.println("value of x :" + x);
            x ++;
            System.out.println("\n");
        }
    }

}
