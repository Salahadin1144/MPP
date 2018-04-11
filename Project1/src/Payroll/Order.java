package Payroll;

import java.time.LocalDate;

import java.util.List;

public class Order {
    private Commissioned commissioned;
    private int orderNo;
    private LocalDate orderDate;
    private double orderAmount;

    public Order(int orderNo, LocalDate orderDate, double orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }
    
    public void setCommissioned(Commissioned commissioned){
        this.commissioned = commissioned;
    }

    public Commissioned getCommissioned() {
        return commissioned;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}
