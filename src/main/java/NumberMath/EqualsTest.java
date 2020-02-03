package NumberMath;

/**
 * @ClassName EqualsTest
 * @Description equals()方法用于判断Number对象与方法的参数进是否相等
 * 语法： public boolean equals(Object o)
 * @Author 王小波
 * @Date 2019/11/6 15:46
 * @Version 1.0
 **/
public class EqualsTest {
    public static void main(String[] args) {
        Integer x = 5;
        Integer y = 10;
        Integer z = 5;
        Short q = 5;
        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        System.out.println(x.equals(q));
    }
}
