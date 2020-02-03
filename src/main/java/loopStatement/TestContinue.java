package loopStatement;

/**
 * @author Administrator
 *
 * continue关键字、
 * continue适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。
 * 在for循环中，continue语句使程序立即跳转到更新语句。
 * 在while或者do...while循环中，程序立刻跳转到布尔表达式的判断语句
 */
public class TestContinue {
    public static void main(String[] args) {
        int [] numbers ={10,20,30,40,50};

        for (int x : numbers) {
            if (x == 30) {
                continue;
            }
            System.out.println(x);
            System.out.println("\n");
        }
    }
}
