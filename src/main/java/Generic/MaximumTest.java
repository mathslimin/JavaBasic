package Generic;

/**
 * @author Administrator
 */
public class MaximumTest {
    // 比较三个值并返回最大值
    public static <T extends Comparable<T>> T maximun(T x, T y, T z) {
        T max = x;
        // 假设x是初始最大值
        if (y.compareTo(max)>0) {
            max = y;
            //y更大
        }
        if (z.compareTo(max)>0) {
            max = z;
            //现在z更大
        }
        return max;
        // 返回最大对象
    }

    public static void main(String[] args) {
        System.out.printf("", "%d,%d和%d中最大的数为%d\n\b",3,4,5,maximun(3,4,5));
        System.out.printf( "%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
                6.6, 8.8, 7.7, maximun( 6.6, 8.8, 7.7 ) );

        System.out.printf( "%s, %s 和 %s 中最大的数为 %s\n","pear",
                "apple", "orange", maximun( "pear", "apple", "orange" ) );

    }
}
