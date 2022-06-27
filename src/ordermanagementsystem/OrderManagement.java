package ordermanagementsystem;

import java.io.IOException;

public interface OrderManagement {
    public void addOrder() throws IOException;
    public void viewOrderList();
    public String viewByOrderId();
    public Boolean sortOrder();
    public  boolean deleteOrderbyId() throws IOException;
    public Boolean markasDelivered() throws IOException;
    public void generateReport();
}
