package NumberMath;

/**
 * @author Administrator
 *
 * Math的floor,round和ceil方法实例比较
 * ceil()
 * 返回大于等于（>=）给定参数的最小整数，类型为双精度浮点型。
 *
 * floor()
 * 返回小于等于（<=）给定参数的最大整数
 *
 * round()
 * 它表示四舍五入，算法为Math.floor(x+0.5)，即将原来的数字加上0.5后再向下取整，
 * 所以，Math.round(11.5)的结果为12，Mathl.round(-11.5)的结果为-11
 *
 *
 */
public class TestMathFloorRoundCeil {
    public static void main(String[] args) {
        double[] nums = {1.4, 1.5, 1.6, -1.4, -1.5, -1.6};
        // 增强型for循环
        for (double num : nums) {
            test(num);
        }
    }
    private static void test(double num) {
        System.out.println("Math.floor(" + num + ")=" + Math.floor(num));
        System.out.println("Math.round(" + num + ")=" + Math.round(num));
        System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));

    }
}
