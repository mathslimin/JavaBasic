package GGG;

import java.util.ArrayList;

/**
 * @ClassName TestActive
 * @Description TODO
 *   封装 +继承 +多态
 *   1、父类   动物
 *               叫，跑的动作
 *   2、子类   猫和狗
 *  属性：名字，年龄        叫声---猫叫：喵喵          狗  叫：旺旺
 *   集合 + 泛型  + 类型判断  +  条件语句   + 循环结构
 *   3、main 方法  ： 将猫狗放进ArrayList里，循环判断猫狗 类型，猫叫三声，狗跑三下
 * @Author 王小波
 * @Date 2019/11/12 21:53
 * @Version 1.0
 **/
public class TestActive {
    public static void main(String[] args) {
       Animal animalCat= new Cat() ;
       Animal animalDog = new Dog();
//        animalCat.call();
//        animalCat.active();

//        animalDog.call();
        ArrayList<Animal> arrayList = new ArrayList<Animal>();
        arrayList.add(animalDog);
        arrayList.add(animalCat);

        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i) instanceof  Cat) {
                for (int j = 0; j < 3; j++) {
//                    System.out.println(111);
                    animalCat.call();
                }


            }
            else {
                for (int j = 0; j < 3; j++) {

                    animalDog.active();
                }

            }

        }
    }
}
