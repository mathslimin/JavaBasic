package ceshi;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/9 20:36
 * @Version 1.0
 **/
public class NoBug {
    @Jiecha
    public void jiafa() {
        System.out.println("1+1=" +( 1 + 1));
    }
    @Jiecha
    private void jianfa() {
        System.out.println("1-1=" + (1 - 1));
    }
    @Jiecha
    public void chengfa() {
        System.out.println("3 x 5=" + 3 * 5);
    }
    @Jiecha
    public void chufa() {
        System.out.println("6 / 0=" +6 / 0);
    }
    public void test1() {
        System.out.println("输出没有错误");
    }
}
