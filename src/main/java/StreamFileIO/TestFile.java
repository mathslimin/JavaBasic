package StreamFileIO;

import java.io.*;

/**
 * @ClassName TestFile
 * @Description 验收题   2019年11月8日
 *
 * 创建一个未text.txt,把6，8，10写进该文件，同时输出到控制台
 *
 * @Author 王小波
 * @Date 2019/11/8 20:34
 * @Version 1.0
 **/
public class TestFile {
    public static void main(String args[]) {
        try {
            byte bWrite[] = { 11, 21, 3, 40, 5 };
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]);
                 // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }

}
