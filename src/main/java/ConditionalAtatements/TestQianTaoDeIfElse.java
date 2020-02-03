package ConditionalAtatements;

/**
 * @author Administrator
 *
 * 嵌套的if...else语句
 *
 * 使用嵌套的if...else语句是合法的。也就是说你可以在另一个if或者else if 语句中使用if或者else if 语句
 * 嵌套的if...else语法格式：
 * if(布尔表达式1){
 *     // 如果布尔表达式1的值为true执行代码
 *     if(布尔表达式2){
 *         // 如果布尔表达式2的值为true执行代码
 *     }
 * }
 */
public class TestQianTaoDeIfElse {
    public static void main(String[] args) {
        int x = 30;
        int y = 10;

        if (x == 30) {
            if (y == 10) {
                System.out.println("X = 30 and Y=10");
            }
        }
    }

}
