package Payroll;

public class Hourly extends Employee {
    private double hourlyWage;
    private int hoursPerWeek;


    public Hourly(double hourlyWage, int hoursPerWeek) {
        super();
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    @Override
    public double calculateGrossPay(int month, int year) {
        return 4 * hoursPerWeek * hourlyWage;
    }
}
