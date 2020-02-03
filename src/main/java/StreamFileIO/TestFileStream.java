package StreamFileIO;

import java.io.*;

/**
 * @author Administrator
 *
 * 实例：下面是一个演示 InputStream和OutputStream用法的例子
 */
public class TestFileStream {
    public static void main(String[] args) {
        try {
            byte bWrite[] = {11, 21, 3, 40, 5};
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0; x < bWrite.length; x++) {
                // writes the bytes
                os.write(bWrite[x]);

            }
            os.close();
            InputStream is = new FileInputStream("test.txt");
            int size = is.available();
            for (int i = 0; i < size; i++) {
                System.out.println((char) is.read() + "");

            }
            is.close();
        } catch (Exception e) {
            System.out.println("Exception");
        }


    }
}
