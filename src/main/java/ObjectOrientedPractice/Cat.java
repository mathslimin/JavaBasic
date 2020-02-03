package ObjectOrientedPractice;

/**
 * @ClassName Cat
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/5 15:43
 * @Version 1.0
 **/
public class Cat {
    public String name = "";
    public int shoutNum = 3;
    public int getShoutNum() {
        return shoutNum;
    }

    public void setShoutNum(int shoutNum) {
        this.shoutNum = shoutNum;
        if (shoutNum <= 10) {
            shoutNum = shoutNum;

        } else {
            shoutNum = 10;
        }


    }
    public void Shout() {
        String call = "";
        for (int i = 0; i <shoutNum ; i++) {
            call += "喵";

        }
        System.out.println("猫叫的次数："+call);
//        return "我的名字叫" + name + "" + result;
    }

    // 这个构造器仅有一个参数。 构造方法的名称必须与类名相同，一个类可以有多个构造方法。
    public Cat(String name) {
        this.name = name;
        System.out.println("猫咪的名字：" + name);
    }
// 即将构造方法重载
    public Cat() {
        this.name = "Bady";

    }

    public static void main(String[] args) {
        Cat mycat = new Cat("Blue");
        mycat.shoutNum = 5;
        mycat.Shout();
    }

}
