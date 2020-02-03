package JavaString;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author Administrator
 * Java实例——字符串分割
 * 实例使用了split(string)方法通过指定分隔符将字符串分割为数组
 */
public class JavaStringSplitEmp {
    public static void main(String[] args) {
        String str = "www-runoob-com";
        String[] temp;
        // 指定分割字符
        String delimeter = "-";
        // 分割字符串
        temp = str.split(delimeter);
        // 普通for循环
        for (int i = 0; i <temp.length ; i++) {
            System.out.println(temp[i]);
            System.out.println("");

        }
        System.out.println("------------Java for each循环输出的方法------------");
        String str1 = "www.runoob.com";
        String[] temp1;
        // 指定分割字符串，.号需要转移
        String delimeter1 = "\\.";
        // 分割字符串
        temp1 = str1.split(delimeter1);
        for (String x:temp1
             ) {
            System.out.println(x);
            System.out.println("");

        }

    }
}
