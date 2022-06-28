package ordermanagementsystem;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

import static java.lang.System.exit;

public class OrderManagementSystem implements OrderManagement,Runnable  {
    ArrayList<Order> t;
    public OrderManagementSystem(ArrayList<Order> t) {

        this.t = t;
    }
    Scanner sc = new Scanner(System.in);
    File file=new File("C:\\Users\\Amsapoorani\\IdeaProjects\\OrderManagementSystemAssignment\\src\\ordermanagementsystem\\OrderManagement.txt");
    public void addOrder() throws IOException {
        BufferedWriter writer=new BufferedWriter(new FileWriter(file));
        int size=t.size();
        for(int i=0;i<size;i++)
        {
            writer.write(t.get(i).toString()+"\n");
        }
        writer.close();
    }
    public void viewOrderList()
    {
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("\tOrder Id" + "\t|\t" +
                "Order Desc" + "\t|\t" +
                "Delivery Address" + "\t|\t" +
                "Order Date" + "\t|\t" +
                "Amount" + "\t|\t" +
                "Delivery Datetime" + "\t|\t"+
                "Delivery status"+"\t|\t");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
    }
    public void viewOrderList(ArrayList<Order> al) {
        Iterator<Order> itr=al.iterator();
        while (itr.hasNext())
        {
            Order o=(Order)itr.next();
            System.out.println("\t "+o.getOrderid()+"\t\t|\t"+o.getOrderDescription()+"\t \t|\t"+o.getDeliveryAddress()+"\t|\t"
                    +o.getOrderDate()+"\t|\t"+o.getAmount()+"\t|\t"+o.getDeliveryDatetime()+"\t|\t"+o.getDeliveryStatus()+"\t|\t" );
        }
    }
    public String viewByOrderId() {
        System.out.println("Enter the Order id");
        String str=sc.next();
        return str;
    }
    public Boolean viewByOrderId(String id)
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
                System.out.println("Delivery Status:"+o.getDeliveryStatus());
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
    public void sortOrder() {
        int i = 0;
        Boolean flag = true;
        while (flag) {
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
                            "Delivery Datetime" + "\t|\t" +
                            "Delivery status" + "\t|\t");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    Collections.sort(t, new Comparator<Order>() {
                        @Override
                        public int compare(Order o1, Order o2) {
                            return o1.getOrderid().compareTo(o2.getOrderid());
                        }
                    });
                    Iterator iterator = t.iterator();
                    while (iterator.hasNext()) {
                        Order o = (Order) iterator.next();
                        System.out.println("\t " + o.getOrderid() + "\t\t|\t" + o.getOrderDescription() + "\t \t|\t" + o.getDeliveryAddress() + "\t|\t"
                                + o.getOrderDate() + "\t|\t" + o.getAmount() + "\t|\t" + o.getDeliveryDatetime() + "\t|\t" + o.getDeliveryStatus() + "\t|\t");
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
                            "Delivery Datetime" + "\t|\t" +
                            "Delivery status" + "\t|\t");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    Collections.sort(t, new Comparator<Order>() {
                        @Override
                        public int compare(Order o1, Order o2) {
                            return o1.getOrderDescription().compareTo(o2.getOrderDescription());
                        }
                    });
                    Iterator iterator1 = t.iterator();
                    while (iterator1.hasNext()) {
                        Order o = (Order) iterator1.next();
                        System.out.println("\t " + o.getOrderid() + "\t\t|\t" + o.getOrderDescription() + "\t \t|\t" + o.getDeliveryAddress() + "\t|\t"
                                + o.getOrderDate() + "\t|\t" + o.getAmount() + "\t|\t" + o.getDeliveryDatetime() + "\t|\t" + o.getDeliveryStatus() + "\t|\t");
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
                            "Delivery Datetime" + "\t|\t" +
                            "Delivery status" + "\t|\t");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    Collections.sort(t, new Comparator<Order>() {
                        @Override
                        public int compare(Order o1, Order o2) {
                            return o1.getDeliveryAddress().compareTo(o2.getDeliveryAddress());
                        }
                    });
                    Iterator iterator3 = t.iterator();
                    while (iterator3.hasNext()) {
                        Order o = (Order) iterator3.next();
                        System.out.println("\t " + o.getOrderid() + "\t\t|\t" + o.getOrderDescription() + "\t \t|\t" + o.getDeliveryAddress() + "\t|\t"
                                + o.getOrderDate() + "\t|\t" + o.getAmount() + "\t|\t" + o.getDeliveryDatetime() + "\t|\t" + o.getDeliveryStatus() + "\t|\t");
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
                            "Delivery Datetime" + "\t|\t" +
                            "Delivery status" + "\t|\t");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    Collections.sort(t, new Comparator<Order>() {
                        @Override
                        public int compare(Order o1, Order o2) {
                            return o1.getOrderDate().compareTo(o2.getOrderDate());
                        }
                    });
                    Iterator iterator4 = t.iterator();
                    while (iterator4.hasNext()) {
                        Order o = (Order) iterator4.next();
                        System.out.println("\t " + o.getOrderid() + "\t\t|\t" + o.getOrderDescription() + "\t \t|\t" + o.getDeliveryAddress() + "\t|\t"
                                + o.getOrderDate() + "\t|\t" + o.getAmount() + "\t|\t" + o.getDeliveryDatetime() + "\t|\t" + o.getDeliveryStatus() + "\t|\t");
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
                            "Delivery Datetime" + "\t|\t" +
                            "Delivery status" + "\t|\t");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    Collections.sort(t, new Comparator<Order>() {
                        @Override
                        public int compare(Order o1, Order o2) {
                            return o1.getAmount().compareTo(o2.getAmount());
                        }
                    });
                    Iterator iterator5 = t.iterator();
                    while (iterator5.hasNext()) {
                        Order o = (Order) iterator5.next();
                        System.out.println("\t " + o.getOrderid() + "\t\t|\t" + o.getOrderDescription() + "\t \t|\t" + o.getDeliveryAddress() + "\t|\t"
                                + o.getOrderDate() + "\t|\t" + o.getAmount() + "\t|\t" + o.getDeliveryDatetime() + "\t|\t" + o.getDeliveryStatus() + "\t|\t");
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
                            "Delivery Datetime" + "\t|\t+" +
                            "Delivery status" + "\t|\t");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    Collections.sort(t, new Comparator<Order>() {
                        @Override
                        public int compare(Order o1, Order o2) {
                            return o1.getDeliveryDatetime().compareTo(o2.getDeliveryDatetime());
                        }
                    });
                    Iterator iterator6 = t.iterator();
                    while (iterator6.hasNext()) {
                        Order o = (Order) iterator6.next();
                        System.out.println("\t " + o.getOrderid() + "\t\t|\t" + o.getOrderDescription() + "\t \t|\t" + o.getDeliveryAddress() + "\t|\t"
                                + o.getOrderDate() + "\t|\t" + o.getAmount() + "\t|\t" + o.getDeliveryDatetime() + "\t|\t" + o.getDeliveryStatus() + "\t|\t");
                    }
                    System.out.println("Successfully Sorted by Delivery Date time");
                    break;
                case 7:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong  choice!!!!");
            }
        }
    }

    @Override
    public void deleteOrderbyId() throws IOException {
        boolean f=true;
        while(f) {
            System.out.println("enter order id:");
            String id = sc.next();
            Iterator iterator = t.iterator();
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
            System.out.println("Do you want to delete another order(Y/N):");
            String str = sc.next();
            if (str.equals("Y")) {
                continue;
            } else {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                int size = t.size();
                for (int i = 0; i < size; i++) {
                    writer.write(t.get(i).toString() + "\n");
                }
                writer.close();
                f = false;
            }
        }
    }

    @Override
    public void markasDelivered() throws IOException {
        boolean f=true;
        while(f) {
            System.out.println("enter order id:");
            String id = sc.next();
            ListIterator iterator = t.listIterator();
            int count=0;
            while (iterator.hasNext())
            {
                Order o = (Order) iterator.next();
                if (id.equals(o.getOrderid())&&o.getDeliveryStatus().equals("Inprogress") )
                {
                    o.setDeliveryDatetime(LocalDateTime.now());
                    o.setDeliveryStatus("Delivered");
                    System.out.println("Order delivered Successfully");
                    count++;
                }
                else if(id.equals(o.getOrderid())&&o.getDeliveryStatus().equals("Delivered"))
                {
                    System.out.println("Order is already delivered on <" + o.getDeliveryDatetime() + ">");
                    count++;
                }
                else
                {
                    continue;
                }
            }
            if(count==0)
            {
                System.out.println("Order Id is not available");
            }
            System.out.println("Do you want to update another order(Y/N):");
            String str = sc.next();
            if (str.equals("Y"))
            {
                continue;
            } else
            {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                int size = t.size();
                for (int i = 0; i < size; i++) {
                    writer.write(t.get(i).toString() + "\n");
                }
                writer.close();
                f = false;
            }
        }
    }
    public static String getFileWithDate(String fileName, String fileSaperator, String dateFormat) {
        String FileNamePrefix = fileName.substring(0, fileName.lastIndexOf(fileSaperator));
        String FileNameSuffix = fileName.substring(fileName.lastIndexOf(fileSaperator)+1, fileName.length());
        String newFileName = new SimpleDateFormat("'"+FileNamePrefix+"_'"+dateFormat+"'"+fileSaperator+FileNameSuffix+"'").format(new Date());
        return newFileName;
    }
    @Override
    public void generateReport() throws IOException {
        Iterator it=t.iterator();
        ArrayList<Order> al=new ArrayList<>();
        while(it.hasNext())
        {
            Order o=(Order) it.next();
            if(o.getDeliveryStatus().equals("Delivered"))
            {
                al.add(o);
            }
            if(o.getDeliveryStatus().equals("Inprogress"))
            {
                continue;
            }
        }
        String fileSaperator = ".", format = "yyyyMMMdd_HHmm";
        String filename=getFileWithDate("Order_Report_.txt", fileSaperator, format);
        File file1 = new File("C:\\Users\\Amsapoorani\\IdeaProjects\\OrderManagementSystemAssignment\\src\\ordermanagementsystem\\"+filename);
        file1.createNewFile();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file1));
        int size=al.size();
        for(int i=0;i<size;i++)
        {
            writer.write(al.get(i).toString()+"\n");
        }
        writer.close();

    }
    @Override
    public void run() {
        try {
            generateReport();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Order> t = new ArrayList<>();
        OrderManagementSystem orderManagementSystem=new OrderManagementSystem(t);
        String line ;
        File file=new File("C:\\Users\\Amsapoorani\\IdeaProjects\\OrderManagementSystemAssignment\\src\\ordermanagementsystem\\OrderManagement.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        Order order=null ;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(" ");
                order = new Order(fields[0], fields[1], fields[2], LocalDateTime.parse(fields[3]), Double.parseDouble(fields[4]), LocalDateTime.parse(fields[5]),fields[6]);
                t.add(order);
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
                        if(temp==false ) {
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
                            LocalDateTime Deliverydate = OrderDate.plusDays(2);
                            String Deliverystatus="Inprogress";
                            order=new Order(Orderid, OrderDescription, DeliveryAddress, OrderDate, Amount, Deliverydate,Deliverystatus);
                            t.add(order);
                            System.out.println("Order Added Successfully");
                        }
                        System.out.println("Do you want to enter more order details(Y/N)");
                        String s = sc.next();
                        if (s.equals("Y")) {

                            continue;

                        } else if (s.equals("N")) {
                            orderManagementSystem.addOrder();
                            break;
                        }
                    } while (true);
                    continue;
                case 2:
                    if(t.isEmpty()) {
                        continue;
                    }
                    else
                    {
                        orderManagementSystem.viewOrderList();
                    }
                    orderManagementSystem.viewOrderList(t);
                    continue;
                case 3:
                    do {
                        String s = orderManagementSystem.viewByOrderId();
                        boolean b = orderManagementSystem.viewByOrderId(s);
                        if (b == true) {
                            break;
                        } else {
                            continue;
                        }
                    } while(true);
                    continue;
                case 4:
                    orderManagementSystem.sortOrder();
                    continue;
                case 5:
                    orderManagementSystem.deleteOrderbyId();
                    continue;
                case 6:
                    orderManagementSystem.markasDelivered();
                    continue;
                case 7:
                    Thread thread=new Thread(new OrderManagementSystem(t));
                    thread.start();
                    System.out.println("Report Generated Successfully");
                    continue;
                case 8:
                    exit(0);
                default:
                    System.out.println("wrong choice!");
                    continue;

            }
        }
    }
}

