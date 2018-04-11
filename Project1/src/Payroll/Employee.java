package Payroll;

abstract public class Employee {
    private String empId;
    private PayCheck paycheck;

    public void print() {
        System.out.print("Employee "+empId+": ");
        paycheck.print();
    }

    public PayCheck calculateCompensation(int month, int year) {
        double grossPay = calculateGrossPay(month, year);
        paycheck = new PayCheck(grossPay);
        return paycheck.getNetPayment();
    }

    public abstract double calculateGrossPay(int month, int year);
}
