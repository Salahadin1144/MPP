package Payroll;

public class Salaried extends Employee {
    private double salary;


    public Salaried(double salary) {
        super();
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double calculateGrossPay(int month, int year) {
        return salary;
    }
}
