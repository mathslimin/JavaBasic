package Encapsulation;

public class RunEncap {
    public static void main(String[] args) {
        EncapTest emcap = new EncapTest();
        emcap.setName("Jessica");
        emcap.setAge(20);
        emcap.setIdNum("1323ms");
        System.out.println("Name:" + emcap.getName() + "Age:" + emcap.getAge());
    }
}
