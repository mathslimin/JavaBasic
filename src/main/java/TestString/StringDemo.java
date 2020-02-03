package TestString;

/**
 * @author Administrator
 *
 * 注意：String类是不可改变的，所以一旦创建了String对象，那它的值就无法改变了。
 *
 */
public class StringDemo {
    public static void main(String[] args) {
        char[] helloArray = {'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
    }
}
