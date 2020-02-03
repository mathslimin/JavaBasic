package JavaString;

/**
 * @author Administrator
 * Java实例-测试两个字符串区域是否相等
 * 实例使用了regionMatches()方法测试两个字符串区域是否相等
 */
public class StringRegionMatch {
    public static void main(String[] args) {
        String first_str = "I love you";
        String second_str = "I Love you";
        boolean match1 = first_str.
                regionMatches(2, second_str, 2, 3);
        boolean match2 = first_str.
                regionMatches(true, 1, second_str, 2, 3);
        //第一个参数 true 表示忽略大小写区别
        System.out.println("区分大小写返回值：" + match1);
        System.out.println("不区分大小写返回值：" + match2);
    }
}
