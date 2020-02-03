package Operator;

public class selfAddMinus1 {
    public static void main(String[] args) {
        // 定义一个变量
        int a =5;
        int b=5;
        int x = 2*++a;
        int y= 2*b++;
        System.out.println("自增运算符前缀运算后 a=" + a + ",x=" + x);
        System.out.println("自增运算符后缀运算后 b=" + b + ",y=" + y);
    }
}
