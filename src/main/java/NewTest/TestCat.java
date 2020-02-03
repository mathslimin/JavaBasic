package NewTest;

/**
 * @ClassName TestCat
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/6 17:53
 * @Version 1.0
 **/
public class TestCat {

    public static void main(String[] args) {
        Cat testCat = new Cat("小龙", 20);
        testCat.setAge(12);
        testCat.setName("罚进了");
        testCat.call();
        Cat testCat1 = new Cat();
        testCat.shout();
        Dog dog = new Dog();
        dog.shout();


    }

}
