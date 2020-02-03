package JavaString;

/**
 * @author Administrator
 *
 * Java实例-字符串比较
 * 通过字符串函数compareTo(string),compareToIgnoreCase(String)及compareTo(object string)来比较两个字符串，
 * 并返回字符串中第一个字母ASCII
 */
public class StringCompareEmp {
    public static void main(String[] args) {
        String str = "Hello World";
        String anotherString = "hello world";
        Object object = str;

        System.out.println(str.compareTo(anotherString));
        // 忽略大小写
        System.out.println(str.compareToIgnoreCase(anotherString));
        System.out.println(str.compareTo(object.toString()));
    }

}
