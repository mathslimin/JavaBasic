package Encapsulation;

/**
 * @author Administrator
 *
 * 采用this关键字是为了解决实例变量（private String name）和
 * 局部变量（setName(String name)中的name变量）之间发生的同名的冲突。
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
