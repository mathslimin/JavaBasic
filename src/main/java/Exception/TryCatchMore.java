package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName TryCatchMore
 * @Description TODO
 * @Author 王小波
 * @Date 2019/11/9 15:05
 * @Version 1.0
 **/
public class TryCatchMore {
    /**
     * 1、创建一个文件，名为filename
     * 2、用file.read()方法去读取文件
     *
     * @return
     */

    /*public static int main(String[] args) throws IOException {
        try {
            FileInputStream file = new FileInputStream("C:/Exception.txt");
            byte x = (byte) file.read();
        } catch (FileNotFoundException f) {
            f.printStackTrace();
            System.out.println(-1);
            return -1;
        } catch (IOException i) {
            i.printStackTrace();
            return -1; 
        }

        return 0;
    }*/
    public static void main(String[] args) throws Exception {
        test();
    }
    public static int test() throws Exception{
        try {
            // 读文件
            FileInputStream file = new FileInputStream("D:/mThe Installation path1");
            // 读文件内容
            byte x = (byte) file.read();
        } catch (FileNotFoundException f) {
            f.printStackTrace();
            System.out.println(-1);
            return -1;
        } catch (IOException i) {
            i.printStackTrace();
            return -1;
        }

        return 0;
    }
}
