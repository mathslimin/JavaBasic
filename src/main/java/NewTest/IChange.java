package NewTest;

public interface IChange {
    default void change(){
        System.out.println("变");
    }
}
