package JavaString;

/**
 * @author Administrator
 * Java实例—删除字符串中的一个字符
 * 通过字符串函数substring()函数来删除字符串中的一个字符，我们将功能封装在removeCharAt函数中
 */
public class StringRemove {

    public static void main(String[] args) {
        String str = "I am Jessica";
        System.out.println(removeCharAt(str, 2));

    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring( pos+1);
    }
}
