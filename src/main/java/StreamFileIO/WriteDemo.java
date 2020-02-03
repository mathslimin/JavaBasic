package StreamFileIO;

/**
 * @author Administrator
 *
 * 实例：下面的例子用write()把字符"A"和紧跟着的换行符输出到屏幕：
 */
public class WriteDemo {
    public static void main(String[] args) {
        int b;
        b = 'A';
        System.out.write(b);
        System.out.write('\n');
        System.out.println(b);

    }
}
