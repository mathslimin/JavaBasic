package Test;

public class Puppy {
    int puppyAge;
    public Puppy(String name) {
     // 这个构造方法只有一个参数name
        System.out.println("小狗的名字是：" + name);

    }

    public int getAge() {
        System.out.println("小狗的年龄为：" + puppyAge);
        return puppyAge;

    }

    public void setAge(int age) {
        this.puppyAge = puppyAge;
    }

    public static void main(String[] args) {
        // 下面的语句将创建一个Puppy对象

        Puppy myPuppy = new Puppy("tommy");
        /*通过方法来定义age*/
        myPuppy.setAge(2);
        /*调用另一个方法获取age*/
        myPuppy.getAge();
        /*你可以像下面这样访问成员变量*/
        System.out.println("变量的值：" + myPuppy.puppyAge);
    }
}
