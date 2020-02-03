package Interface;

/**
 * @ClassName MammalInt
 * @Description  接口的实现
 * @Author 王小波
 * @Date 2019/11/11 10:12
 * @Version 1.0
 **/

public class MammalInt implements Ainmal{
    @Override
    public void eat() {
        System.out.println("Mammal eats");

    }

    @Override
    public void traval() {
        System.out.println("Mammal travals");

    }

    public static void main(String[] args) {
        MammalInt m = new MammalInt();
        m.eat();
        m.traval();

    }
}
