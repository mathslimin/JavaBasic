package JavaString;

/**
 * @ClassName TestCompareTo
 * @Description TODO
 * @Author 王小波
 * @Date 2019/11/6 21:30
 * @Version 1.0
 **/
public class TestCompareTo {
    public static void main(String[] args) {
        String str = "你好";
        String anotherString = "Hello";
        Object object = str;

        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareTo(anotherString));
        System.out.println(anotherString.compareTo(str));
    }
}
