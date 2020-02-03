package StreamFileIO;

import com.sun.scenario.effect.impl.state.AccessHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Administrator
 *
 * 从控制台读取字符串：
 * 从标准输入读取一个字符串需要使用BufferedReader的readLine()方法
 * 下面的程序读取和显示字符串直到输入了单词"end"
 */
public class BRReadLines {
    public static void main(String[] args) throws IOException {
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }


}
