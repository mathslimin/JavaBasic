package ObjectOrientedPractice;

/**
 * @ClassName Animal
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/5 16:28
 * @Version 1.0
 **/
public class Animal {
    private String name;
    private int id;

    public Animal(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void eat() {
        System.out.println(name + "正在吃");
    }
    public void sleep() {
        System.out.println(name + "正在睡");
    }
    public void introduction() {
        System.out.println("Hello, everyone! My id is " + id + "my name is " + name);
    }
}
