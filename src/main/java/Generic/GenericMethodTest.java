package Generic;

/**
 * @author Administrator
 *
 * 实例：如何使用泛型方法打印不同字符串的元素
 */
public class GenericMethodTest {
    // 泛型方法 printArray
    public static <E> void printArray(E[] inputArray) {
        // 输出数组元素
        for (E element:inputArray
             ) {
            System.out.printf("%s",element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 创建不同类型数组：Integer,Double 和 Character
        Integer[] integers = {1, 2, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.3, 3.3, 5.5, 6.6};
        Character[] charArrays = {'H','E','L','L','O'};

        System.out.println("整型数组元素为：");
        printArray(integers);
        System.out.println("\n双精度型数组元素为：");
        printArray(doubleArray);
        System.out.println("\n字符型数组元素为：");
        printArray(charArrays);
    }


}
