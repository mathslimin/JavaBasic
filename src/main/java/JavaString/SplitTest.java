package JavaString;

/**
 * @ClassName SplitTest
 * @Description TODO
 * @Author 王小波
 * @Date 2019/11/6 21:56
 * @Version 1.0
 **/
public class SplitTest {
    public static void main(String[] args) {
        String str = "www-baidu-com";
        String[] temp ;
        String meter = "-";

        temp = str.split(meter);


        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
