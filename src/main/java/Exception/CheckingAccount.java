package Exception;

/**
 * @author Administrator
 *
 * 为了展示如何使用我们自定义的异常类
 *下面的CheckingAccount类中包含一个withdraw()方法抛出一个InsufficientFundsException异常
 *
 */

// 此类模拟银行账户
public class CheckingAccount {
    // balance 为余额，number为卡号
    private double balance;
    private int number;
 // 构造方法

    public CheckingAccount(int number) {

        this.number = number;
    }


    // 方法：存钱 deposit()
public void deposit(double amount) {
    balance += amount;
}
    // 方法：取钱 withdraw()
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }

    }

// 方法：返回余额

    public double getBalance() {
        return balance;
    }

//方法：返回卡号

    public int getNumber() {
        return number;
    }
}