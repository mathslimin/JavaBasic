package ObjectOrientedPractice;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/6 17:05
 * @Version 1.0
 **/
abstract class NewTwoAnimal {
    abstract void eat();
}

class NewTwoCat extends NewTwoAnimal {
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }
    public void work() {
        System.out.println("抓老鼠");
    }
}

class NewTwoDog extends NewTwoAnimal {
    @Override
    public void eat() {
        System.out.println("吃骨头");

    }
    public void work() {
        System.out.println("看家");
    }
}

public class Test {
    public static void show(NewTwoAnimal a) {
        a.eat();
        // 判断类型
        if (a instanceof NewTwoCat) {
            NewTwoCat c=(NewTwoCat)a;
            c.work();
        } else if (a instanceof NewTwoDog) {
            NewTwoDog c = (NewTwoDog) a;
            c.work();
        }

    }

    public static void main(String[] args) {
        show(new NewTwoCat());
        show(new NewTwoDog());
        NewTwoAnimal a = new NewTwoCat();
        a.eat();               // 调用的是 Cat 的 eat
        NewTwoCat c = (NewTwoCat) a;        // 向下转型
        c.work();        // 调用的是 Cat 的 work
    }

}

