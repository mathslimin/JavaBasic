package Eight;

import java.util.ArrayList;
import java.util.List;

/**
 * @param $
 * @ClassName Java8TesterTwo
 * @Description TODO
 * @Author 王小波
 * @Date 2019/11/6 15:01
 * @Version 1.0
 **/

public class Java8TesterTwo {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");
        names.forEach(System.out::println);
    }
}
