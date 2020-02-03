package NewTest;

import java.util.Scanner;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/6 17:34
 * @Version 1.0
 **/
public class Cat extends Animal{
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

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }
public Cat() {
    System.out.println("我是无名");

}
    public void call() {
        System.out.println("猫叫");
        System.out.println("猫的名字："+name  +"年龄："+age);

    }
    @Override
    public void shout() {
        System.out.println("猫叫");
    }
    public static void main(String[] args) {
        Cat cat = new Cat("小龙",1);
        cat.call();
        cat.setAge(12);
        cat.setName("小红");
//        System.out.println("我的新名字："+cat.setName("小龙")+"和年龄"+cat.setAge(12));
        // 通过特殊的方法得到它的名字和年龄:get 和set方法
//        Animal animal = new Animal();
//
//        animal.shout();
        cat.shout();
        cat.change();
    }
}
