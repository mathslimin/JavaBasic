package JavaString;

import java.util.StringTokenizer;

/**
 * @author Administrator
 * Java实例——字符串分隔（StringTokenizer）
 * Java中我们可以使用StringTokennizer设置不同分隔字符串，默认的分隔符是：空格、制表符
 */
public class Main {
    public static void main(String[] args) {

        String str = "This is String,split by StringTokenizer,created by runoob";
        StringTokenizer st = new StringTokenizer(str);

        System.out.println("-------通过空格分隔----------");
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
        System.out.println("-----通过逗号分隔----------");
        StringTokenizer st2 = new StringTokenizer(str, ",");


    }
}

