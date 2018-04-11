package Payroll;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class PayrollApp {
    public PayrollApp() {
        super();
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        Employee hrEmp = new Hourly(20.0, 40);
        Employee salEmp = new Salaried(3500.0);
        Commissioned commEmp = new Commissioned(0.1, 3000.0);
        
        List<Order> orders = new ArrayList<>();
        Order order1 = new Order(1, LocalDate.of(2018, 03, 03), 1500);
        order1.setCommissioned(commEmp);
        Order order2 = new Order(1, LocalDate.of(2018, 03, 03), 2000);
        order2.setCommissioned(commEmp);
        Order order3 = new Order(1, LocalDate.of(2018, 03, 03), 2500);
        order3.setCommissioned(commEmp);
        Order order4 = new Order(1, LocalDate.of(2018, 04, 03), 1200);
        order4.setCommissioned(commEmp);
        Order order5 = new Order(1, LocalDate.of(2018, 04, 03), 1800);
        order5.setCommissioned(commEmp);
        
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);
        
        commEmp.setOrders(orders);
        
        employees.add(hrEmp);
        employees.add(salEmp);
        employees.add(commEmp);
        
        for(Employee emp: employees){
            PayCheck paycheck = emp.calculateCompensation(3, 2018);
            paycheck.print();
        }
    }
}
