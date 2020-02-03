package JavaString;

/**
 * @author Administrator
 * Java实例—字符串小写转大写
 * 实例使用：StringtoUpperCase()方法将字符串从小写转为大写：
 */
public class StringToUpperCaseEmp {
    public static void main(String[] args) {
        String str = "string runoob";
        String strUpper = str.toUpperCase();
        System.out.println("原始字符串：" + str);
        System.out.println("转换为大写：" + strUpper);
    }

}
