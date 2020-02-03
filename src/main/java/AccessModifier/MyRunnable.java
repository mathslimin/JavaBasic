package AccessModifier;

public class MyRunnable implements Runnable {
    private volatile boolean active;
    public void run() {
        // 第一行
        while (active)
        {
            // 代码
        }
    }
    public void stop() {
        // 第二行
        active = false;
    }
}
