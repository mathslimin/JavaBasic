package Abstract;

/**
 * @author Administrator
 * 抽象类：
 * 1）在面向对象的概念中，所有的对象都是通过类来描绘的，但是反过来，并不是所有的类都是用来描述对象的，
 * 如果一个类中没有包含足够的信息来描绘一个具体的对象，这样的类就是抽象类。（类中没有足够信息来描述一个对象，称抽象类）
 * 2）抽象类不能实例化对象，所以抽象类必须被继承，才能被使用。
 * 3）在Java中抽象类表示的是一种继承关系，一个类只能继承一个抽象类，而一个类却可以实现多个接口。
 *
 */
public class Employee {
    // 定义name,address,number对象
    private int number;
    private String address;
    private String name;

    // 创建Employee构造方法，其中含有以上三个参数

    public Employee(int number, String address, String name) {
        this.number = number;
        this.address = address;
        this.name = name;
        System.out.println("Constructing an Employee");
    }

    //写一个double类型的computePay方法
public double computePay() {
    System.out.println("Inside Employee computePay");
    return 0.0;
}
    // 一个void mailCheck方法
public void mailCheck() {
    System.out.println("Mailing a check to " + this.name + "" + this.address);

}
    // 生成一个toString()方法，并返回以上三个参数



    //上次name,number的get方法，address的get,set方法


    public int getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }
}
