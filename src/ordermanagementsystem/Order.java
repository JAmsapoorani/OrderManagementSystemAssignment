package ordermanagementsystem;

import java.time.LocalDateTime;

public class Order  {
    private String orderid;
    private String orderdescription;
    private String deliveryaddress;
    private LocalDateTime orderdate;
    private double amount;
    private LocalDateTime deliverydatetime;
    private String deliverystatus;

    public String getDeliverystatus() {
        return deliverystatus;
    }

    public void setDeliverystatus(String deliverystatus) {
        this.deliverystatus = deliverystatus;
    }

    @Override
    public String toString() {
        return orderid + "," + orderdescription + "," + deliveryaddress + ","+ orderdate + ","+amount +
                "," + deliverydatetime +","+ deliverystatus;
    }

    public Order(String orderid, String orderdescription, String deliveryaddress, LocalDateTime orderdate, Double amount, LocalDateTime deliverydatetime, String deliverystatus) {
        this.orderid = orderid;
        this.orderdescription = orderdescription;
        this.deliveryaddress = deliveryaddress;
        this.orderdate = orderdate;
        this.amount = amount;
        this.deliverydatetime = deliverydatetime;
        this.deliverystatus = deliverystatus;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOrderdescription() {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription) {
        this.orderdescription = orderdescription;
    }

    public String getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(String deliveryaddress) {
        this.deliveryaddress = deliveryaddress;
    }

    public LocalDateTime getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(LocalDateTime orderdate) {
        this.orderdate = orderdate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDeliverydatetime() {
        return deliverydatetime;
    }

    public void setDeliverydatetime(LocalDateTime deliverydatetime) {
        this.deliverydatetime = deliverydatetime;
    }


}
