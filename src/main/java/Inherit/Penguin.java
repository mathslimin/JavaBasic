package Inherit;

/**
 * @author Administrator
 * 继承是Java面向对象编程技术的一块基石，因为它允许创建分等级层次的类
 * 继承就是子类继承父类的特征和行为，使得子类对象（实例）具有父类的实例域和方法，或子类从父类继承方法，使得子类具有父类相同的行为
 *
 */
public class Penguin {
    private String name;
    private int id;

    public Penguin(String myName, int myid) {
        this.name = myName;
        this.id = myid;

    }
    public void eat() {
        System.out.println(name + "正在吃");
    }
    public void sleep() {
        System.out.println(name + "正在睡");
    }
    public void introduction() {
        System.out.println("大家好！我是" + id + "号" + name + ".");
    }
}
