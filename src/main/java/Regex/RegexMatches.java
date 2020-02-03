package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Administrator
 *
 * 捕获组
 * 捕获组是把多个字符当一个单独单元进行处理的方法，它通过对括号内的字符组来创建。
 * 捕获组是通过从左至右计算其开括号来编号。
 * 例如，在表达式（（A）(B(C))）,有四个这样的组：
 * ((A)(B(C)))
 * (A)
 * (B(C))
 * (C)
 * 通过调用matcher对象的groupCount方法来查看表达式有多少个分组。groupCount方法返回一个int值，表示matcher对象当前有多个捕获组
 * 还有一个特殊的组（group(0)）,它总是代表整个表达式。该组不包括在groupCount的返回值中。
 *
 * 下面的例子说明如何从一个给定的字符串中找到数字串：
 */
public class RegexMatches {
    public static void main(String[] args) {
        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        //现在创建  matter 对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value:" + m.group(0));
            System.out.println("Found value:" + m.group(1));
            System.out.println("Found value:" + m.group(2));
            System.out.println("Found value:" + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }

    }

}
