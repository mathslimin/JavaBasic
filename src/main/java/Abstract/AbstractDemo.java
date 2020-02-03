package Abstract;

/**
 * @author Administrator
 */
public class AbstractDemo {
    public static void main(String[] args) {
        /* 以下是不允许的，会引发错误 */
        Employee e = new Employee(43, "Houston, TX", "Jessica");
        System.out.println( e+"sfjalf======================================");
        Salary s = new Salary(3, "Ambehta,UP", "Mohd Mohtashim", 3600.00);
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        s.mailCheck();
    }
}
