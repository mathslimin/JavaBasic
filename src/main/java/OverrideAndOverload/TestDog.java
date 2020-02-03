package OverrideAndOverload;

/**
 * @author Administrator
 * <p>
 * 重写（Override）
 * 重写是子类对父类的允许访问的方法的实现过程进行重新编写，返回值和形参都不能改变。即外壳不变，核心重写。
 */
class Animal {
    public void move() {
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        // 应用super类的方法
        super.move();
        System.out.println("狗可以移动");
    }
    /*public void brak() {
        System.out.println("狗可以吠叫");
    }*/
}

public class TestDog {
    public static void main(String[] args) {
      /*  // Animal对象
        Animal a = new Animal();
        // Dog对象
        Dog b = new Dog();
        // 执行Animal类的方法
        a.move();
        // 执行Dog类的方法
        b.move();
        b.brak();*/
      // Dog对象
        Animal b = new Dog();
        // 执行Dog类的方法
        b.move();

    }


}
