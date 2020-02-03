package ObjectOrientedPractice;

import java.util.ArrayList;

/**
 * @ClassName NewCat
 * @Description 本例子实现继承、重写、多态
 * @Author 王小波
 * @Date 2019/12/6 16:32
 * @Version 1.0
 **/

public class NewCat extends NewAnimal {
    private Animal[] arrayAnimal;
    ArrayList<NewAnimal> arrayList = new ArrayList<NewAnimal>();
    public NewCat(String name, int id) {
        super(name, id);
    }
@Override
public void eat() {
    System.out.println("猫吃：鱼");

}

public static void main(String[] args) {
    NewCat cat = new NewCat("Water", 8);
    cat.call();
    cat.eat();
    System.out.println(cat.age);

}

}
