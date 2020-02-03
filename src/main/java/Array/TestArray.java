package Array;

/**
 * @author Administrator
 * Java 数组
 * 数组对于每一门编程语言来说都是重要的数据结构之一，当然不同语言对数组的实现及处理也不尽相同。
 * Java语言中提供的数组是用来存储固定大小的同类型元素。
 *
 * 本教程将主要介绍了Java数组的声明、创建和初始化，并给出其对应的代码
 *
 * 声明数组变量：{
 * 首先必须声明数组变量，才能在程序中使用数组。下面是声明数组变量的语法：
 * dataType[] arrayRefVar; //首选的方法
 * 或
 * dataType arrayRefVar[]; // 效果相同，但不是首选方法
 * }
 * 注意: 建议使用 dataType[] arrayRefVar 的声明风格声明数组变量。 dataType arrayRefVar[] 风格是来自 C/C++ 语言 ，
 * 在Java中采用是为了让 C/C++ 程序员能够快速理解java语言
 *
 * 创建数组：{
 *     Java语言使用new操作符来创建数组，语句如下：
 *     arrayRefVar = new dataType[arraySize];
 *   上面的语法语句做了两件事：
 *     一、使用dataType[arraySize]创建了一个数组。
 *     二、把新创建的数组的引用赋值给变量arrayRefVar。
 *
 *     1)数组变量的声明，和创建数组可以用一条语句完成，如下所示：
 *     dataType[] arrayRefVar = new dataType[arraySize];
 *     2)另外，你还可以使用如下的方式创建数组
 *     dataType[] arrayRefVar = {value0, value1, ..., valuek};
 *     数组的元素是通过索引访问的。数组索引的从0开始，所以索引值从0到arrayRefVar.length-1
 *
 *     实例
 * 下面的语句首先声明了一个数组变量myList，接着创建了一个包含10个double类型元素的数组，
 *         并且把它的引用赋值给myList变量
 * }
 */

public class TestArray {
    public static void main(String[] args) {
        // 数组大小
        int size =10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < size; i++) {
//            total += myList[i];
            total = total + myList[i];


        }
        System.out.println("总和为：" + total);

    }

}
