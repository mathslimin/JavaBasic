package SwitchCase;

/**
 * @author Administrator
 *
 * 如果当前匹配成功的case语句块没有break语句，则从当前case开始，后续所有case的值都会输出，
 * 如果后续的case语句块有break语句则会跳出判断
 */
public class piPeiChengGongYouBreak {
    public static void main(String[] args) {
        int i = 1;
        switch (i) {
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            default:
                System.out.println("default");
        }
    }
}
