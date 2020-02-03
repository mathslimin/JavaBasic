package NewTest;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/6 18:31
 * @Version 1.0
 **/
public class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("狗叫");

    }
    public static void main(String[] args) {
//        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.shout();
    }
}
