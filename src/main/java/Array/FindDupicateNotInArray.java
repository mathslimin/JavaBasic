package Array;

/**
 * @ClassName FindDupicateNotInArray
 * @Description java实例——查找数组中的重复元素
 * @Author 王小波
 * @Date 2019/11/7 15:07
 * @Version 1.0
 **/
public class FindDupicateNotInArray {
    public static void main(String[] args) {
        int[] my_array = {1, 3, 5, 2, 1, 4, 7, 34, 2, 4, 5, 6};
        findDupicateNotInArray(my_array);
    }
    public static void findDupicateNotInArray(int[] a) {
        int count = 0;
        for (int j = 0; j < a.length; j++) {
            for (int k = 0; k <a.length ; k++) {
                if (a[j]==a[k]) {
                    count++;
                }

            }
            if (count==1) {
                System.out.println("不重复元素：" + a[j]);
            }

            count = 0;
        }

    }
}
