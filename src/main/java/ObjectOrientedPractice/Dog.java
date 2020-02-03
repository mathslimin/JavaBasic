package ObjectOrientedPractice;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/6 15:47
 * @Version 1.0
 **/
public class Dog {
    public int shoutNum;
    public String name;

    public Dog(int shoutNum, String name) {
        this.shoutNum = shoutNum;
        this.name = name;
        System.out.println("狗的名字：" + name);
    }

    public Dog(String name) {
        this.name = name;
        System.out.println("狗的名字:"+name);
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void Shout() {
        String call = "";
        for (int i = 0; i <shoutNum ; i++) {
            call += "汪汪";

        }
        System.out.println("猫叫的次数："+call);
    }

    public static void main(String[] args) {
        Dog NewDogName = new Dog("GG");
        NewDogName.shoutNum = 12;
        NewDogName.Shout();
    }
}
