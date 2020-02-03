package StreamFileIO;

import java.io.File;

/**
 * @author Administrator
 *
 * Java中的目录
 *
 * 创建目录：
 * File类中由两个方法可以用来创建文件夹
 * 1）mkdir()方法创建一个文件夹，成功则返回true，失败则返回false。失败表明File对象指定的路径已经存在，或者由于整个路径还不存在，该文件夹不能被创建
 * 2）mkdirs()方法创建一个文件夹和它的所有父文件夹
 */
public class CreateDir {
    public static void main(String[] args) {
        String dirname ="D:/The Installation path1";
        File f = new File("a.txt");
        File d = new File(dirname);
        // 现在创建目录
        d.mkdirs();
    }
}
