package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Administrator
 *
 * 实例：下面的例子中声明了两个元素的一个数组，当代码试图访问数组的第三个元素的时候就会抛出一个异常
 */
public class ExcepTest {
   // 定义有两个元素的数组

    //然后试图抛出第三个数组，然后抛出异常
    public static void main(String[] args) {
        /*try{
            int a[] = new int[4];
            System.out.println("Access element three :" + a[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
        }*/
        try {
            int a[] = new int[2];
            System.out.println("抛出第三个数组元素："+a[3]);
        } catch (Exception e) {
            System.out.println("抛出异常：" + e);
        }
        System.out.println("内存泄露");
    }

   /* public static void main(String[] args) throws Exception {
        test();
    }
    public static int test() throws Exception{
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
}
