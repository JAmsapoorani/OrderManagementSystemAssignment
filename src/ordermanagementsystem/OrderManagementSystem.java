package ordermanagementsystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Scanner;

public class OrderManagementSystem implements OrderManagement{
    HashSet<Order> hs=new HashSet<Order>();


    public void addOrder(Order order)
    {
        hs.add(order);

    }
    public void viewOrderList(Order order)
    {

    }
    public void viewByOrderId(Order order)
    {

    }

    public static void main(String[] args)
    {
        OrderManagementSystem orderManagementSystem=new OrderManagementSystem();
        while(true) {
            System.out.println("************Order Management System*************");
            System.out.println("1.\tAdd Order\n" +
                    "2.\tView Order List\n" +
                    "3.\tView By Order Id\n" +
                    "4.\tSort Order\n" +
                    "5.\tDelete Order by Id\n" +
                    "6.\tMark as Delivered.\n" +
                    "7.\tGenerate Report.\n" +
                    "8.\tExit\n");
            System.out.println("Choose Option:");
            Scanner sc = new Scanner(System.in);
            HashSet<String> t = new HashSet<>();
            int ch = sc.nextInt();
            int count = 0;
            switch (ch) {
                case 1:

                    do {
                        System.out.print("\n Order id:");
                        String Orderid = sc.next();
                        boolean temp = t.add(Orderid);
                        if (temp == false) {
                            System.out.println("Duplicate Order Id. Please enter unique order id");
                            continue;
                        } else if (temp == true) {
                            System.out.print("\n Order Description :");
                            String OrderDescription = sc.next();
                            System.out.print("\n Delivery Address :");
                            String DeliveryAddress = sc.next();
                            System.out.print("\n Order Date :");
                            String str = sc.next();
                            LocalDateTime OrderDate = LocalDateTime.parse(str);
                            System.out.print("\n Amount :");
                            Double Amount = sc.nextDouble();
                            orderManagementSystem.addOrder(new Order(Orderid, OrderDescription, DeliveryAddress, OrderDate, Amount));
                        }
                        System.out.println("Do you want to enter more order details(Y/N):");
                        String s = sc.next();
                        if (s.equals("Y")) {
                            //t.add(id);
                            continue;

                        } else if (s.equals("N")) {
                            count++;
                            break;
                        }
                    } while (true);
                    if (count == 1) {
                        continue;
                    }
            }
        }

    }
}
