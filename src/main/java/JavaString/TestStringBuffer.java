package JavaString;

/**
 * @ClassName TestStringBuffer
 * @Description TODO
 * @Author 王小波
 * @Date 2019/11/6 21:46
 * @Version 1.0
 **/
public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Java实例");
        stringBuffer.append("菜鸟教程");
        stringBuffer.append("王小波");

        System.out.println("字符串拼接:" + stringBuffer);

    }

}
