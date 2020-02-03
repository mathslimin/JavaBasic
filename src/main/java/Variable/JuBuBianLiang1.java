package Variable;

public class JuBuBianLiang1 {
    public void pupAge() {
        int age = 12;
        age = age +7;
        System.out.println("小狗的年龄是：" + age);
    }

    public static void main(String[] args) {
        /*创建一个对象*/
        JuBuBianLiang1 JuBuBianLiang1 = new JuBuBianLiang1();
        /*调用pupAge方法
        * 这个怎么理解，真的是调用方法吗？*/
        JuBuBianLiang1.pupAge();

    }
}
