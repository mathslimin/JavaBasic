package JavaString;

/**
 * @author Administrator
 * Java实例—字符串替换
 * 使用javaString类的replace方法来替换字符串中的字符
 */
public class StringReplaceEmp {
    public static void main(String[] args) {
        String str = "Good work";
        System.out.println(str.replace('G', 'H'));
        System.out.println(str.replaceFirst("ood", "ell"));
        System.out.println(str.replaceAll("Go", "He"));

    }
}
