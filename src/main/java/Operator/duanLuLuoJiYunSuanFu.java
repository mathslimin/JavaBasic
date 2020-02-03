package Operator;

public class duanLuLuoJiYunSuanFu {
    public static void main(String[] args) {
        // 定义一个变量
        int a =5;
        boolean b=(a<4)&&(a++<10);
/*
        解析： 该程序使用到了短路逻辑运算符(&&)，
        首先判断 a<4 的结果为 false，则 b 的结果必定是 false，
        所以不再执行第二个操作 a++<10 的判断，所以 a 的值为 5
*/
        System.out.println("使用短路逻辑运算符的结果为" + b);
        System.out.println("a的结果为" + a);
    }
}
