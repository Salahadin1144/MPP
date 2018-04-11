package Payroll;

import java.util.List;

public class Commissioned extends Employee {
    /**
     * @associates <{Payroll.Order}>
     */
    private List<Order> orders;
    private double commission;
    private double baseSalary;

    public Commissioned(double commission, double baseSalary) {
        super();
        this.commission = commission;
        this.baseSalary = baseSalary;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public double calculateGrossPay(int month, int year) {
        double ordersSales = 0.0;
        for (Order order : orders) {
            if (order.getOrderDate().getMonthValue() == month && order.getOrderDate().getYear() == year) {
                ordersSales += order.getOrderAmount();
            }
        }
        return Math.ceil(baseSalary + (ordersSales * commission));
    }
}
