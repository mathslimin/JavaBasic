package loopStatement;

/**
 * @author Administrator
 *
 * break关键字
 * break主要用在循环语句或switch语句中，用来跳出整个语句块
 * break跳出最里层的循环，并且继续执行该循环下面的语句
 */
public class TestBreak {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};
        for (int x : numbers) {
            // x等于30时跳出循环
            if (x == 30) {
                break;
            }
            System.out.println(x);
            System.out.println("\n");
        }
    }
}
