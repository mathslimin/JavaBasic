package JavaString;

/**
 * @author Administrator
 * Java实例—字符串搜索
 *
 * 实例使用了String 类的indexOf()方法在字符串中查找字符串出现的位置，
 * 如果存在返回字符串出现的位置（第一位为0），如果不存在返回-1
 */

public class SearchStringEmp {
    public static void main(String[] args) {
        String strOrig = "I love you";
        int intIndex = strOrig.indexOf("o");
        if (intIndex == -1) {
            System.out.println("没有找到字符串ove");
        } else {
            System.out.println("ove字符串位置" + intIndex);
        }
    }
}
