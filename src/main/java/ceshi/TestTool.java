package ceshi;

import Mothed.Mothed;

import java.lang.reflect.Method;

/**
 * @ClassName TestTool
 * @Description TODO  写自定义注解的步骤：
 * 1、在同一个包下定义一个注解
 * 2、定义一个NoBug.Java 文件，在这里面写加、减、乘、除方法，并输出相应的式子。
 * 3、再编写一个测试类TestTool,去测试NoBug相应的方法
 * @Author 王小波
 * @Date 2019/12/9 10:22
 * @Version 1.0
 **/
public class TestTool {
    public static void main(String[] args) {
        // TODO Auto-generated method stud
        NoBug testobj = new NoBug();
        Class clazz = testobj.getClass();
        Method[] method = clazz.getDeclaredMethods();
        // 用来记录测试产生的log信息
        StringBuilder log = new StringBuilder();
        // 记录异常的次数
        int errornum = 0;
        for (Method m: method) {
            // 只有被@Jiecha 标注过的方法才进行测试
            if (m.isAnnotationPresent(Jiecha.class)) {
                try {
                    m.setAccessible(true);
                    m.invoke(testobj, null);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                   // e.printStackTrace();
                    errornum++;
                    log.append(m.getName());
                    log.append(" ");
                    log.append("has error");
                    log.append("\n\r caused by ");
                    // 记录测试过程中，发生的异常的名称
                    log.append(e.getCause().getClass().getSimpleName());
                    log.append("\n\r");
                    // 记录测试过程中，发生的异常的具体信息
                    log.append(e.getCause().getMessage());
                    log.append("\n\r");
                }
            }

        }
        log.append(clazz.getSimpleName());
        log.append("has");
        log.append(errornum);
        log.append("error.");
        // 生成测试报告
//        System.out.println(log.toString());
        System.out.println(log.toString());

    }
}
