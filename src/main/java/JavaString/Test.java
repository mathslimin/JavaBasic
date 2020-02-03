package JavaString;

public class Test {
    public static void main(String[] args) {
        int size = 3;
        double[] myList = new double[size];
        myList[0] = 3.3;
        myList[1] = 4.4;
        myList[2] = 8;
        double total = 0;
        for (int i = 0; i < size ; i++) {
            total += myList[i];
        }
        System.out.println("总和为：" + total);

    }
}
