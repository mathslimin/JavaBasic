package Mothed;

/**
 * @author Administrator
 *
 * finalize()方法
 * java允许定义这样的方法，它在对象被垃圾收集器析构（回收）之前调用，这个方法叫做finalize(),它用来清除回收对象
 * 例如： 你可以使用finalize()来确保一个对象打开的文件被关闭了
 * 在finalize()方法里，你必须顶i一i在对象销毁的时候要执行的操作
 *
 * 关键字protected是一个限定符，它确保finalize()方法不会被该类意外的方法调用
 * Java的内存回收可以由JVM来自动完成。
 */
public class FinalizationDemo {
    public static void main(String[] args) {
        Cake c1 = new Cake(1);
        Cake c2 = new Cake(2);
        Cake c3 = new Cake(3);

        c2 = c3 = null;
        // 调用Java垃圾收集器
        System.gc();
    }
    static class Cake extends Object {
        private int id;

        public Cake(int id) {
            this.id = id;
            System.out.println("Cake Object " + id + "is created");

        }
        @Override
        protected  void finalize() throws java.lang.Throwable {

            super.finalize();
            System.out.println("Cake Object " + id + "is disposed");
        }

    }


}
