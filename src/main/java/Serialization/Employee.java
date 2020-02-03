package Serialization;

/**
 * @ClassName Employee
 * @Description TODO Java序列化
 * 一个类的对象要想序列化成功，必须满足两个条件：
 * 1）该类必须实现java.io.Serializable接口
 * @Author 王小波
 * @Date 2019/11/11 17:20
 * @Version 1.0
 **/
public class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + "" + address);
    }

}
