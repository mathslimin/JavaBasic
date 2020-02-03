package Array;

/**
 * @ClassName FindDupicateInArray
 * @Description Java实例——查找数组中的重复元素
 *
 * @Author 王小波
 * @Date 2019/11/7 14:39
 * @Version 1.0
 **/
public class FindDupicateInArray {
    public static void main(String[] args) {
        int[] my_array = {1, 2, 3, 4, 5, 6, 7, 4, 2, 3, 9, 9, 8};
        findDupicateInArray(my_array);
    }

    public static void findDupicateInArray(int[] a) {
        int count = 0;
        for (int j = 0; j <a.length ; j++) {
            for (int k = j+1; k <a.length ; k++) {
                if (a[j]==a[k]) {
                    count++;
                }

            }
            if (count==1) {
                System.out.println("重复元素：" + a[j]);
                count = 0;
            }

        }
    }
}
