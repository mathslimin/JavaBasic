package Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 * 类型通配符
 * 1、类型通配符一般是使用？代替具体的类型参数。
 * 例如：List<?>在逻辑上是List<String>,List<Integer>等所有List<具体类型实参>的父类
 *
 * 解析：因为getData()方法的参数是List类型的，所有name,age,number都可以作为这个方法的实参 ，这就是通配符的作用。
 * 2、类型通配符上限通过形如List来定义就是通配符泛型接收Number及其下层类类型。
 */
public class GenericTest {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("Jessica");
        age.add(18);
        number.add(45454);

        getDate(name);
        getDate(age);
        getDate(number);


//        getUperNumber(name);
        getUperNumber(age);
        getUperNumber(number);

    }

    public static void getDate(List<?> date) {
        System.out.println("data:" + date.get(0));
    }
    // List<? extends Number> 读作：具有任何从number继承的类型的列表
    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data:" + data.get(0));
    }

}
