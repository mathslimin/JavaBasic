package SwitchCase;

/**
 * @author Administrator
 *
 * Java Switch Case语句
 * switch case语句判断一个变量与一系列值中某个值是否相等，每个值都称为一个分支
 * switch case语法格式如下：
 * switch(expression){
 *     case calue:
 *        //语句
 *        break; // 可选
 *     case value:
 *        // 语句
 *        break; // 可选
 *      // 你可以有任意数量的case语句
 *      default： // 可选
 *        // 语句
 * }
 *
 * switch case语句有如下规则：
 * 1）switch 语句中的变量类型可以是：byte、short、int或者char.从Java SE7开始，
 * switch支持字符串String类型了，同时case标签必须为字符串常量或字面量。
 * 2）switch语句可以拥有多个case语句。每个case后面跟一个要比较的量和冒号。
 * 3）case语句中的值的数据类型必须与变量的数据类型相同，而且只能是常量或者字面量常量。
 * 4）当变量的值与case语句的值相等时，那么case语句之后的语句开始执行，知道break语句出现才会跳出switch语句。
 * 5）当遇到break语句时，switch语句终止。程序跳转到switch语句后面的语句执行。case语句不必须要包含break语句。如果没有break语法出现，程序会继续执行下一条case语句，直到出现break语句。
 * 6）switch语句可以包含一个default分支，该分支一般是switch语句的最后一个分支（可以在任何位置，但建议在最后一个）。default在没有case语句的值和变量值星等的时候执行。default分支不需要break.
 *
 *
 * switch case执行时，一定会先进行匹配，匹配成功返回当前case的值，再根据是否有break，判断是否继续输出，或者跳出判断
 *
 */
public class TestSwitchCase {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade)
        {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
                break;
            case 'F':
                System.out.println("你需要再努力努力");
                break;
            default:
                System.out.println("未知等级");
        }
        System.out.println("你的等级是" + grade);
    }
}
