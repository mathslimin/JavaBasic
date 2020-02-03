package AccessModifier;

public abstract class SuperClass {
    abstract void m(); // 抽象方法

}

class SubClass extends SuperClass {
    @Override
    /*实现抽象方法*/
    void m() {

    }
}
