package SwitchCase;

/**
 * @author Administrator
 *
 * 如果case语句块中没有break语句时，JVM并不会顺序输出每一个case对应的返回值，
 * 而是继续匹配，匹配不成功则返回默认case
 */
public class piPeiBuChengGong {
    public static void main(String[] args) {
        int i=5;
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
