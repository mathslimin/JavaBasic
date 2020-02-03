package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Administrator
 *
 * appendReplacement和appendTail方法
 * Matcher类提供了appendReplacement和appendTail方法用于文本体换
 */
public class RegexMatchesAppendReplacementAndAppendTail {
    private static String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoobkkk";
    private static String REPLACE = "-";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        // 获取matcher对象
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, REPLACE);

        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}

