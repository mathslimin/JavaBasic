package Eight;

/**
 * Java8方法引用
 * 方法引用同各国方法的名字来指向一个方法
 * 方法引用可以使语言的构造更紧凑，减少冗余代码。
 * 方法引用使用一对冒号：：
 * @param <T>
 *    在Car类中定义了4个方法作为例子来区分Java中4中不同的方法引用
 */
@FunctionalInterface
public interface Supplier<T> {
    T get();
}

class Car {
    // Supplier时jdk1.8的接口，这里和lamda一起使用了
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {

        System.out.println("Collided" + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the" + another.toString());
    }

    public void repair() {
        System.out.println("Repaired" + this.toString());
    }
}