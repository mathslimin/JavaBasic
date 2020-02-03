package Variable;

public class Test {
    public void pupAge() {
        /*定义局部变量age，并进行初始化
        * 局部变量在使用前，要进行初始化，否者编译时会报错
        * */
        int age = 0;
        age = age +7;
        System.out.println("小狗的年龄是：" + age);
    }

    public static void main(String[] args) {
        /*创建对象*/
        Test test = new Test();
        /*调用pupAge方法*/
        test.pupAge();
    }
}
