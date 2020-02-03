package loopStatement;

/**
 * @author Administrator
 *
 * Java增强for循环
 * 语法格式如下：
 * for(声明语句：表达式){ // 代码句子}
 * 声明语句：声明新的局部变量，该变量的类型必须和数组元素的类型匹配。其作用域限定在循环语句块，其值与此时数组元素的值相等。
 * 表达式：表达式是要访问的数组名，或者是返回值为数组的方法
 */
public class TestStrongerFor {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};

        for (int x : numbers) {
            System.out.println(x);
            System.out.println(",");
        }
        System.out.println("\n");
        String [] names ={"James","Larry","Tom","Lacy"};
        for (String name : names) {
            System.out.println(name);
            System.out.println(",");
        }
    }
}
