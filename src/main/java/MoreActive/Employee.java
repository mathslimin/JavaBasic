package MoreActive;

/**
 * @author Administrator
 *
 * 虚函数
 * 虚函数的存在是为了多态
 * java中其实没有虚函数的概念，它的普通函数就相当于C++的虚函数，动态绑定时Java的默认行为。
 * 如果Java中不希望某个函数具有虚函数特性，可以加上final关键字变成非虚函数。
 *
 */
public class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
        System.out.println("Employee构造函数");
    }
    public void mailCheck() {
        System.out.println("邮寄支票给：" + this.name + "" + this.address);
    }

    @Override
    public String toString() {
        return name + "" + address+""+number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }
}
