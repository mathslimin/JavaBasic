package SwitchCase;

/**
 * @author Administrator
 *
 * 如果case语句块中没有break语句时，匹配成功后，
 * 从当前case开始，后续所有case的值都会输出。
 *
 */
public class piPeiChengGong {
    public static void main(String[] args) {
        int i = 1;
        switch (i) {
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            default:
                System.out.println("default");
        }
    }
}
