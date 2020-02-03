package Exception;

/**
 * @author Administrator
 *
 * 下面的BankDemo程序示范了如何调用CheckingAccout类的deposit和withdraw()方法
 */
public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Depositing $500");
         c.deposit(500);
        System.out.println("您存了：" + c.getNumber());

        try {
            System.out.println("\nWithdrawing $100");
            c.withdraw(100.00);
            System.out.println("\nWithdrawing $600");
            c.withdraw(400.00);
        } catch (InsufficientFundsException e) {
            System.out.println("对不起你的余额少:" + e.getAmount());
            e.printStackTrace();
        }
    }
}
