package MoreActive;

/**
 * @author Administrator
 */
public class VirtualDemo {
    public static void main(String[] args) {
        Salary s = new Salary("员工 A", "北京", 3, 3600.00);
        Employee e = new Salary("员工 B", "上海", 2, 2400.00);
        System.out.println("使用Salary的引用调用mailCheck--");
        s.mailCheck();
        System.out.println("\n使用Employee的引用调用mailCheck--");
        e.mailCheck();
    }
}
