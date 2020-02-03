package ObjectOrientedPractice;

/**
 * @ClassName NewAnimal
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/6 16:30
 * @Version 1.0
 **/
public class NewAnimal {
    private String name;
    private int id;
    protected int age = 19;
    public NewAnimal(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void eat() {
        System.out.println("Animal:eat");

    }
    public void call() {
        System.out.println("Animal:Call");

    }
}
