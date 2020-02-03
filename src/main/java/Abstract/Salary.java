package Abstract;
// 通过一般方法继承Employee类
public class Salary extends Employee {
    private double salary;

    public Salary(int number, String address, String name, double salary) {
        super(number, address, name);
        this.salary = salary;
    }

    @Override
    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class");
        System.out.println("Mailing check to " + getName() +"with salary"+salary);

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary>=0.0) {

              salary = newSalary;
        }

    }

    @Override
    public double computePay() {
        System.out.println("Computing salary pay for" + getName());
        return salary / 52;
    }
}
