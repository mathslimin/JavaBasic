package GGG;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author 王小波
 * @Date 2019/11/12 21:51
 * @Version 1.0
 **/
class Dog extends Animal {
    private String name;
    private int age;


    @Override
    public void call() {
        System.out.println("狗叫：汪汪");

    }

    @Override
    public void active() {
        System.out.println("狗跑：快");
    }
}
