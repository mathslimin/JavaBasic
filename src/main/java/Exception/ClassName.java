package Exception;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @ClassName ClassName
 * @Description TODO
 * @Author 王小波
 * @Date 2019/11/9 15:46
 * @Version 1.0
 **/
public class ClassName {
    public static void main(String[] args) throws IOException {
        deposit(23.3);

    }

    public static void deposit(double amount) throws RemoteException {
        throw new RemoteException();
    }

    public void withdraw(double amount)throws RemoteException ,InsufficientFundsException{

    }
}
