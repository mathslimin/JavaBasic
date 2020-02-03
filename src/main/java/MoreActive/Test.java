package MoreActive;

/**
 * @author Administrator
 * Java多态:
 * 多态是同一个行为具有多个不同表现形式或形态的能力。
 * 多态就是同一个接口，使用不同的实例而执行不同操作
 */

abstract class Animal {
    abstract void eat();
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    public void work() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("啃骨头");
    }

    public void work() {
        System.out.println("看家");
    }
}


public class Test {
    public static void main(String[] args) {
        // 以Cat对象调用show方法
        show(new Cat());
        // 以Dog对象调用show方法
        show(new Dog());

        // 向上转型
        Animal a = new Cat();

        // 调用的是Cat的eat
        a.eat();
        // 向下转型
        Cat c = (Cat) a;
        // 调用的是Cat的work
        c.work();
    }

    public static void show(Animal a) {
        a.eat();
        // 类型判断
        if (a instanceof Cat) {
            // 猫做的事情
            Cat c = (Cat) a;
            c.work();
        } else if (a instanceof Dog) {
            //
            // 狗做的事情
            Dog c = (Dog) a;
            c.work();
        }


    }

}
