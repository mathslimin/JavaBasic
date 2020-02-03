package NumberMath;

/**
 * @author Administrator
 *
 * 一般地，当需要使用数字的时候，我们通常使用内置数据类型，如byte,int ,long,double等
 *然而，再实际开发过程中，我们经常会遇到需要使用对象，而不是内置数据类型的情形。为了解决这个问题，java语言为每一个内置数据类型提供了对应的包装类。
 * 所有的包装类（Integer,Long,Double,Float,Short）都是抽象类Number的子类。
 *
 *
 * */
public class TestInteger {
    public static void main(String[] args) {
        Integer x = 5;
        x = x + 10;
        System.out.println(x);
    }
}
