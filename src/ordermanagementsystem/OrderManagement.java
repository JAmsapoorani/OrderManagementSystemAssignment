package ordermanagementsystem;

import java.io.IOException;
import java.util.ArrayList;

public interface OrderManagement {
    public void addOrder() throws IOException;
    public void viewOrderList();
    public Boolean viewByOrderId(String s);
    public void sortOrder();
    public  void deleteOrderbyId() throws IOException;
    public void markasDelivered() throws IOException;
    public void generateReport() throws IOException;
}
