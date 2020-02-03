package Regex;

import java.util.regex.Pattern;

/**
 * @author Administrator
 *
 * 以下例子中使用了正则表达式.*runoob.*用于查找字符串中是否包了runoob子串
 */
public class RegexExample {
    public static void main(String[] args) {
        String content = "I am noob " + "from runoob.com";
        String pattern = ".*runoob.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob'子字符串？" + isMatch);
    }
}
