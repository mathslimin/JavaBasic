package AccessModifier;

public class TestFinal {
    int value = 10;
//    final int value = 10;
    // 下面是声明常量的实例
    public static final int BOXWIDTH = 6;
    static final String TITLE = "Manger";

    public void changeValue() {
        // 将输出一个错误
        value =12;
    }
}
