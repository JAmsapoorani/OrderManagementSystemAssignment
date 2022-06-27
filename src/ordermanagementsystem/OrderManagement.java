package ordermanagementsystem;

import java.io.IOException;
import java.util.ArrayList;

public interface OrderManagement {
    public void addOrder(ArrayList<Order> t) throws IOException;
    public void viewOrderList(ArrayList<Order> t);
    public Boolean viewByOrderId(ArrayList<Order> t,String s);
    public void sortOrder(ArrayList<Order> t);
    public  void deleteOrderbyId(ArrayList<Order> t) throws IOException;
    public void markasDelivered(ArrayList<Order> t) throws IOException;
    public void generateReport(ArrayList<Order> t) throws IOException;
}
