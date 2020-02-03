package Exception;

/**
 * @author Administrator
 *
 * 实例：以下实例是一个银行账户的模拟，通过银行的号码完成识别，可以进行存钱和取钱的操作
 *
 */

// 自定义异常类，继承Exception类
public class InsufficientFundsException extends Exception{
     /*此处的amount用来存储当出现异常（取出钱多于余额时）所缺乏的钱*/

    private double amount;

    public double getAmount() {
        return amount;
    }

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }



}
