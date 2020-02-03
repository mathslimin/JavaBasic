package MoreActive;

public class Salary extends Employee {
    // 全年工资
    private double salary;
    public Salary(String name ,String address,int number,double salary) {
        super(name, address, number);
        setSalary(salary);
    }

 @Override
 public void mailCheck() {
     System.out.println("Salary类的mailCheck方法");
     System.out.println("邮寄支票给：" + getName()+",工资为："+ salary);
 }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double computePay() {
        System.out.println("计算工资，付给：" + getName());
        return salary / 52;
    }
}
