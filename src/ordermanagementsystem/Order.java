package ordermanagementsystem;

import java.time.LocalDateTime;

public class Order {
    private String Orderid;
    private String OrderDescription;
    private String DeliveryAddress;
    private LocalDateTime OrderDate;
    private Double Amount;
    private LocalDateTime LocalDateTime;

    public Order(String orderid, String orderDescription, String deliveryAddress, LocalDateTime orderDate, Double amount) {
        Orderid = orderid;
        OrderDescription = orderDescription;
        DeliveryAddress = deliveryAddress;
        OrderDate = orderDate;
        Amount = amount;
    }

    public String getOrderid() {
        return Orderid;
    }

    public void setOrderid(String orderid) {
        Orderid = orderid;
    }

    public String getOrderDescription() {
        return OrderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        OrderDescription = orderDescription;
    }

    public String getDeliveryAddress() {
        return DeliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        DeliveryAddress = deliveryAddress;
    }

    public LocalDateTime getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        OrderDate = orderDate;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public LocalDateTime getLocalDateTime() {
        return LocalDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        LocalDateTime = localDateTime;
    }


}
