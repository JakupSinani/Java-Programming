package comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Order implements Comparable<Order> {
    public String orderNo;
    public int value;

    @Override
    public int compareTo(Order o) {
        return orderNo.compareTo(o.orderNo);
    }

    public Order() {
    }

    public Order(String orderNo, int value) {
        this.orderNo = orderNo;
        this.value = value;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Order [orderno = " + this.orderNo + ", value = " + value + " ]";
    }

    public static void main(String[] args) {
        List<Order> list = Arrays.asList(
                new Order("A55dszx8v6", 320),
                new Order("saa8cdsu", 251),
                new Order("fa0die", 225),
                new Order("dfiqm8", 199)
        );
        System.out.println("Before sort: ");
        list.forEach(order -> System.out.println(order));

        Collections.sort(list, Comparator.comparingInt(Order::getValue));
        System.out.println("\nAfter Sort: ");
        list.forEach(order -> System.out.println(order));
    }
}

