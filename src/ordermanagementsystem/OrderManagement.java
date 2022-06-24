package ordermanagementsystem;

import ordermanagementsystem.Order;

public interface OrderManagement {
    public void addOrder(Order order);
    public void viewOrderList(Order order);
    public void viewByOrderId(Order order);
}
