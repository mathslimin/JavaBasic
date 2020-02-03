package Interface;

/**
 * @ClassName Hockey
 * @Description TODO
 * @Author 王小波
 * @Date 2019/11/11 10:25
 * @Version 1.0
 **/
public interface Hockey extends Sports{
    public void homeGoalScored();

    public void visitingGoalScored();

    public void endOfPeriod(int period);

    public void overtimePeriod(int ot);
}
