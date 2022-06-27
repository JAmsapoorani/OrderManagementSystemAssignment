package ordermanagementsystem;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

import static java.lang.System.exit;

public class OrderManagementSystem implements OrderManagement  {
   ArrayList<Order> al=new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    File file=new File("C:\\Users\\Amsapoorani\\IdeaProjects\\OrderManagementSystemAssignment\\src\\ordermanagementsystem\\OrderManagement.txt");
    String str=" ";
 public void writeOperation(Order order)  {
    al.add(order);
 }
    public void addOrder() throws IOException {
    BufferedWriter writer=new BufferedWriter(new FileWriter(file));
        int size=al.size();
        for(int i=0;i<size;i++)
        {
            writer.write(al.get(i).toString()+"\n");
        }
    writer.close();
    }
    public Boolean viewOrderList(ArrayList t)
    {
       if(t.isEmpty())
       {
           return false;
       }
       else {
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println("\tOrder Id" + "\t|\t" +
                   "Order Desc" + "\t|\t" +
                   "Delivery Address" + "\t|\t" +
                   "Order Date" + "\t|\t" +
                   "Amount" + "\t|\t" +
                   "Delivery Datetime" + "\t|\t");
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
       }
       return true;
    }
    public void viewOrderList() {
        Iterator<Order> itr=al.iterator();
        while (itr.hasNext())
        {
            Order o=(Order)itr.next();
            System.out.println("\t "+o.getOrderid()+"\t\t|\t"+o.getOrderDescription()+"\t \t|\t"+o.getDeliveryAddress()+"\t|\t"
                    +o.getOrderDate()+"\t|\t"+o.getAmount()+"\t|\t"+o.getDeliveryDatetime()+"\t|\t");
        }
    }
    public String viewByOrderId() {
        System.out.println("Enter the Order id");
        String str=sc.next();
        return str;
    }



    public Boolean viewByOrderId(ArrayList t,String id)
    {
        System.out.println(id);
        int count=0;
        Iterator<Order> itr=t.iterator();
        while (itr.hasNext()) {
            Order o = (Order) itr.next();
            if (id.equals(o.getOrderid())) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Order Details :");
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Order Id:"+o.getOrderid());
                System.out.println("Order Desc:"+o.getOrderDescription());
                System.out.println("Delivery Address:"+o.getOrderDescription());
                System.out.println("Order Date:"+o.getOrderDate());
                System.out.println("Amount:"+o.getAmount());
                System.out.println("Delivery Datetime:"+o.getDeliveryDatetime());
            }
            else
            {
                count++;
            }
        }
        if(count>0) {
            return true;
        }
        return false;
    }
    @Override
    public Boolean sortOrder() {
         int i=0;
         Boolean flag=true;
         while (flag)
         {
             System.out.println("******** Choose Sort Order Property*********");
             System.out.println("1.\tOrderId\n" +
                     "2.\tOrder Desc\n" +
                     "3.\tDeliveryAddress\n" +
                     "4.\tOrder Date\n" +
                     "5.\tAmount\n" +
                     "6.\tDelivery Datetime\n" +
                     "7.\tExit\n");
             System.out.println("enter your choice:");
             i = sc.nextInt();
             switch (i) {
                 case 1:
                     System.out.println("-----------------------------------------------------------------------------------------------------------------");
                     System.out.println("\tOrder Id" + "\t|\t" +
                             "Order Desc" + "\t|\t" +
                             "Delivery Address" + "\t|\t" +
                             "Order Date" + "\t|\t" +
                             "Amount" + "\t|\t" +
                             "Delivery Datetime" + "\t|\t");
                     System.out.println("-----------------------------------------------------------------------------------------------------------------");
                     Collections.sort(al, new Comparator<Order>() {
                         @Override
                         public int compare(Order o1, Order o2) {
                             return o1.getOrderid().compareTo(o2.getOrderid());
                         }
                     });
                     Iterator iterator = al.iterator();
                     while (iterator.hasNext()) {
                         Order o = (Order) iterator.next();
                         System.out.println("\t " + o.getOrderid() + "\t\t|\t" + o.getOrderDescription() + "\t \t|\t" + o.getDeliveryAddress() + "\t|\t"
                                 + o.getOrderDate() + "\t|\t" + o.getAmount() + "\t|\t" + o.getDeliveryDatetime() + "\t|\t");
                     }
                     System.out.println("Successfully Sorted by Orderid");
                     break;
                 case 2:
                     System.out.println("-----------------------------------------------------------------------------------------------------------------");
                     System.out.println("\tOrder Id" + "\t|\t" +
                             "Order Desc" + "\t|\t" +
                             "Delivery Address" + "\t|\t" +
                             "Order Date" + "\t|\t" +
                             "Amount" + "\t|\t" +
                             "Delivery Datetime" + "\t|\t");
                     System.out.println("-----------------------------------------------------------------------------------------------------------------");
                     Collections.sort(al, new Comparator<Order>() {
                         @Override
                         public int compare(Order o1, Order o2) {
                             return o1.getOrderDescription().compareTo(o2.getOrderDescription());
                         }
                     });
                     Iterator iterator1 = al.iterator();
                     while (iterator1.hasNext()) {
                         Order o = (Order) iterator1.next();
                         System.out.println("\t " + o.getOrderid() + "\t\t|\t" + o.getOrderDescription() + "\t \t|\t" + o.getDeliveryAddress() + "\t|\t"
                                 + o.getOrderDate() + "\t|\t" + o.getAmount() + "\t|\t" + o.getDeliveryDatetime() + "\t|\t");
                     }
                     System.out.println("Successfully Sorted by Order description");
                     break;
                 case 3:
                     System.out.println("-----------------------------------------------------------------------------------------------------------------");
                     System.out.println("\tOrder Id" + "\t|\t" +
                             "Order Desc" + "\t|\t" +
                             "Delivery Address" + "\t|\t" +
                             "Order Date" + "\t|\t" +
                             "Amount" + "\t|\t" +
                             "Delivery Datetime" + "\t|\t");
                     System.out.println("-----------------------------------------------------------------------------------------------------------------");
                     Collections.sort(al, new Comparator<Order>() {
                         @Override
                         public int compare(Order o1, Order o2) {
                             return o1.getDeliveryAddress().compareTo(o2.getDeliveryAddress());
                         }
                     });
                     Iterator iterator3 = al.iterator();
                     while (iterator3.hasNext()) {
                         Order o = (Order) iterator3.next();
                         System.out.println("\t " + o.getOrderid() + "\t\t|\t" + o.getOrderDescription() + "\t \t|\t" + o.getDeliveryAddress() + "\t|\t"
                                 + o.getOrderDate() + "\t|\t" + o.getAmount() + "\t|\t" + o.getDeliveryDatetime() + "\t|\t");
                     }
                     System.out.println("Successfully Sorted by Delivery Address");
                     break;
                 case 4:
                     System.out.println("-----------------------------------------------------------------------------------------------------------------");
                     System.out.println("\tOrder Id" + "\t|\t" +
                             "Order Desc" + "\t|\t" +
                             "Delivery Address" + "\t|\t" +
                             "Order Date" + "\t|\t" +
                             "Amount" + "\t|\t" +
                             "Delivery Datetime" + "\t|\t");
                     System.out.println("-----------------------------------------------------------------------------------------------------------------");
                     Collections.sort(al, new Comparator<Order>() {
                         @Override
                         public int compare(Order o1, Order o2) {
                             return o1.getOrderDate().compareTo(o2.getOrderDate());
                         }
                     });
                     Iterator iterator4 = al.iterator();
                     while (iterator4.hasNext()) {
                         Order o = (Order) iterator4.next();
                         System.out.println("\t " + o.getOrderid() + "\t\t|\t" + o.getOrderDescription() + "\t \t|\t" + o.getDeliveryAddress() + "\t|\t"
                                 + o.getOrderDate() + "\t|\t" + o.getAmount() + "\t|\t" + o.getDeliveryDatetime() + "\t|\t");
                     }
                     System.out.println("Successfully Sorted by Order Date");
                     break;
                 case 5:
                     System.out.println("-----------------------------------------------------------------------------------------------------------------");
                     System.out.println("\tOrder Id" + "\t|\t" +
                             "Order Desc" + "\t|\t" +
                             "Delivery Address" + "\t|\t" +
                             "Order Date" + "\t|\t" +
                             "Amount" + "\t|\t" +
                             "Delivery Datetime" + "\t|\t");
                     System.out.println("-----------------------------------------------------------------------------------------------------------------");
                     Collections.sort(al, new Comparator<Order>() {
                         @Override
                         public int compare(Order o1, Order o2) {
                             return o1.getAmount().compareTo(o2.getAmount());
                         }
                     });
                     Iterator iterator5 = al.iterator();
                     while (iterator5.hasNext()) {
                         Order o = (Order) iterator5.next();
                         System.out.println("\t " + o.getOrderid() + "\t\t|\t" + o.getOrderDescription() + "\t \t|\t" + o.getDeliveryAddress() + "\t|\t"
                                 + o.getOrderDate() + "\t|\t" + o.getAmount() + "\t|\t" + o.getDeliveryDatetime() + "\t|\t");
                     }
                     System.out.println("Successfully Sorted by Amount");
                     break;
                 case 6:
                     System.out.println("-----------------------------------------------------------------------------------------------------------------");
                     System.out.println("\tOrder Id" + "\t|\t" +
                             "Order Desc" + "\t|\t" +
                             "Delivery Address" + "\t|\t" +
                             "Order Date" + "\t|\t" +
                             "Amount" + "\t|\t" +
                             "Delivery Datetime" + "\t|\t");
                     System.out.println("-----------------------------------------------------------------------------------------------------------------");
                     Collections.sort(al, new Comparator<Order>() {
                         @Override
                         public int compare(Order o1, Order o2) {
                             return o1.getDeliveryDatetime().compareTo(o2.getDeliveryDatetime());
                         }
                     });
                     Iterator iterator6= al.iterator();
                     while (iterator6.hasNext()) {
                         Order o = (Order) iterator6.next();
                         System.out.println("\t " + o.getOrderid() + "\t\t|\t" + o.getOrderDescription() + "\t \t|\t" + o.getDeliveryAddress() + "\t|\t"
                                 + o.getOrderDate() + "\t|\t" + o.getAmount() + "\t|\t" + o.getDeliveryDatetime() + "\t|\t");
                     }
                     System.out.println("Successfully Sorted by Delivery Date time");
                     break;
                 case 7:
                     i++;
                     flag=false;
                      break;
                 default:
                     System.out.println("Wrong  choice!!!!");
             }
         }
     if(i==0)
     {
         return false;
     }
     return true;
    }

    @Override
    public boolean deleteOrderbyId() throws IOException {
     boolean f=true;
     while(f) {
         System.out.println("enter order id:");
         String id = sc.next();
         Iterator iterator = al.iterator();
         int count=0;
         while (iterator.hasNext()) {
             Order o = (Order) iterator.next();
             if (id.equals(o.getOrderid())) {
                 iterator.remove();
                 System.out.println("Order deleted Successfully");
                 count++;
             }
         }
         if(count==0)
         {
             System.out.println("Order Id is not available");
         }
         //System.out.println(count);
         System.out.println("Do you want to delete another order(Y/N):");
         String str = sc.next();
         if (str.equals("Y")) {
             continue;
         } else {
             BufferedWriter writer = new BufferedWriter(new FileWriter(file));
             int size = al.size();
             for (int i = 0; i < size; i++) {
                 writer.write(al.get(i).toString() + "\n");
             }
             writer.close();
             f = false;
         }
         }

        return true;
    }

    @Override
    public Boolean markasDelivered() throws IOException {
        boolean f=true;
        while(f) {
            System.out.println("enter order id:");
            String id = sc.next();
            ListIterator iterator = al.listIterator();
            int count=0;
            while (iterator.hasNext()) {
                Order o = (Order) iterator.next();
                if (id.equals(o.getOrderid())) {
                  o.setDeliveryDatetime(LocalDateTime.now());
                    System.out.println("Order delivered Successfully");
                    count++;
                }

            }
            System.out.println(al);
            if(count==0)
            {
                System.out.println("Order Id is not available");
            }
                System.out.println("Do you want to update another order(Y/N):");
                String str = sc.next();
                if (str.equals("Y")) {
                    continue;
                } else {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    int size = al.size();
                    for (int i = 0; i < size; i++) {
                        writer.write(al.get(i).toString() + "\n");
                    }
                    writer.close();
                    f = false;
                }
            }
        return true;
    }

    @Override
    public void generateReport() {

    }

    public static void main(String[] args) throws IOException {

        OrderManagementSystem orderManagementSystem=new OrderManagementSystem();
        String line ;
        ArrayList<Order> t = new ArrayList<>();
        HashSet hs=new HashSet(t);
        File file=new File("C:\\Users\\Amsapoorani\\IdeaProjects\\OrderManagementSystemAssignment\\src\\ordermanagementsystem\\OrderManagement.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        Order order=null ;
        try {

            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(" ");
               /* for (String i : fields) {
                    System.out.println(i);
                }*/
                order = new Order(fields[0], fields[1], fields[2], LocalDateTime.parse(fields[3]), Double.parseDouble(fields[4]), LocalDateTime.parse(fields[5]));
                t.add(order);
                orderManagementSystem.writeOperation(order);
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {

        }

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
            int ch = sc.nextInt();
            int count = 0;
            switch (ch) {
                case 1:
                    do {
                        System.out.print("\n Order id:");
                        String Orderid = sc.next();
                        Iterator it=t.iterator();
                        boolean temp=true;
                        while (it.hasNext()) {
                            Order o = (Order) it.next();
                            if (o.getOrderid().equals(Orderid)) {
                                temp=false;
                            }
                        }
                        if(temp==false || hs.add(Orderid) == false) {
                            System.out.println("Duplicate Order Id. Please enter unique order id");
                            continue;
                        }
                       else {
                                System.out.print("\n Order Description :");
                                String OrderDescription = sc.next();
                                System.out.print("\n Delivery Address :");
                                String DeliveryAddress = sc.next();
                                LocalDateTime OrderDate = LocalDateTime.now();
                                System.out.print("\n Amount :");
                                Double Amount = sc.nextDouble();
                                LocalDateTime Deliverydate = LocalDateTime.now();
                                order=new Order(Orderid, OrderDescription, DeliveryAddress, OrderDate, Amount, Deliverydate);
                                t.add(order);
                                orderManagementSystem.writeOperation(order);
                                System.out.println("Order Added Successfully");
                            }
                        System.out.println("Do you want to enter more order details(Y/N)");
                        String s = sc.next();
                        if (s.equals("Y")) {

                            continue;

                        } else if (s.equals("N")) {
                            orderManagementSystem.addOrder();
                            count++;
                            break;
                        }
                    } while (true);
                    if (count == 1) {
                        continue;
                    }
                    break;
                case 2:

                  boolean value=orderManagementSystem.viewOrderList(t);
                   if(value==true) {
                       orderManagementSystem.viewOrderList();
                   }
                   else
                   {
                       continue;
                   }
                   break;
                case 3:
                    int count1=0;
                 do {
                      String s = orderManagementSystem.viewByOrderId();
                      boolean b = orderManagementSystem.viewByOrderId(t, s);
                      if (b == true) {
                          count1++;
                         break;
                      } else {
                          continue;
                      }
                  } while(true);
                 if(count1==1)
                 {
                     continue;
                 }
                    break;
                case 4:
                    boolean temp=orderManagementSystem.sortOrder();
                    if(temp==true)
                    {
                        continue;
                    }
                    break;
                case 5:
                   boolean d= orderManagementSystem.deleteOrderbyId();
                   if(d==true)
                   {
                       continue;
                   }
                   break;
                case 6:
                    boolean m= orderManagementSystem.markasDelivered();
                    if(m==true)
                    {
                        continue;
                    }
                    break;
                case 7:
                    break;
                case 8:
                    exit(0);
                default:
                    System.out.println("wrong choice!");
                    continue;

            }
        }

    }
}
