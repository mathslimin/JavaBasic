package Array;

/**
 * @author Administrator
 *
 * 数组作为函数的参数:
 *数组可以作为参数传递给方法
 *
 * 例如，下面的例子就是一个打印int数组中元素的方法
 *
 *
 */
public class printArray {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");

        }

    }

    public static void main(String[] args) {

    }
}
