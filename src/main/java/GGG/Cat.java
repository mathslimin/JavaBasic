package GGG;

/**
 * @ClassName Cat
 * @Description TODO
 * @Author 王小波
 * @Date 2019/11/12 21:52
 * @Version 1.0
 **/
class Cat extends Animal {
    private String name;
    private int age;
    /*public static void main(String[] args) {
        Animal a = new Animal();
        a.call();
        a.active();
        System.out.println("猫叫：喵喵");
        System.out.println("跑：猫跑");

    }*/

    @Override
    public void active() {
//        super.active();
        System.out.println("跑：猫跑");
    }

    @Override
    public void call() {
//        super.call();
        System.out.println("猫叫：喵喵");
    }
}




