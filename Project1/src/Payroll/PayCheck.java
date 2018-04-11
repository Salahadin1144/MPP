package Payroll;

import java.text.DecimalFormat;

final public class PayCheck {
    private double grossPay;

    private static double fica = 0.23;
    private static double state = 0.05;
    private static double local = 0.01;
    private static double medicare = 0.03;
    private static double socialSecurity = 0.075;


    public PayCheck(double grossPay) {
        this.grossPay = grossPay;
    }

    public void print() {
        System.out.println(toString());
    }

    public PayCheck getNetPayment() {
        grossPay = grossPay - grossPay * (fica + state + local + medicare + socialSecurity);
        return this;
    }


    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat(",000.00");
        return "[ PayCheck: " + format.format(grossPay) + "]"; 
    }
}
