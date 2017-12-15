package Control;

import Objects.CustomerOB;
import Objects.*;
import java.util.*;
import java.text.*;

public class StaffDuty {

    public static void main(String[] args) {
        orderInfo();
        showInfo();
    }

    private static List<DeliveryMan> dmList = new ArrayList<>();
    private static List<OrderOB> orderList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static Date date;
    static DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
    static String Date;
    CustomerOB cust = new CustomerOB();
    static CheckDelivery checkDeliverys = new CheckDelivery();

    public static void personInfo() {
        dmList.add(new DeliveryMan("Flora", "DM1234", "Female", "OFF", "", "", ""));
        dmList.add(new DeliveryMan("James", "DM5223", "Male", "OFF", "", "", ""));
        dmList.add(new DeliveryMan("Rock", "DM9198", "Male", "OFF", "", "", ""));
    }

    public static void orderInfo() {
        String orderID;
        String cusID;
        String foodID;
        String destination;
        //***Lack Food Info

        CheckDelivery.cusInfo();
        List<CustomerOB> cusList = checkDeliverys.getCusList();

        for (int i = 0; i < cusList.size(); i++) {
            if (cusList.get(i).getStatus().equals("PENDING")) {
                cusID = cusList.get(i).getCusID();
                orderID = cusList.get(i).getOrderID();
                orderList.add(new OrderOB(cusID, orderID, "", ""));
            }
        }
    }

    public static void showInfo() {
        int choose;
        int decide;
        int number = 1;
        personInfo();
        do {
            System.out.println("\nDelivery Man List");
            System.out.println("********************************************************************************************************************");
            System.out.println("No.\tStaff_ID\tStaff_Name\tStatus\t\t\tClock_In\t\t\tClock_Out");
            for (int i = 0; i < dmList.size(); i++) {
                System.out.println(number + ".\t" + dmList.get(i).getID() + "\t\t" + dmList.get(i).getName() + "\t\t" + dmList.get(i).getStatus() + "\t\t" + dmList.get(i).getClockIn() + "\t\t\t" + dmList.get(i).getClockOut());
                number++;
            }
            System.out.println("********************************************************************************************************************");
            System.out.println("Choose your account: ");
            choose = scan.nextInt() - 1;
            System.out.println("\nWelcome Back " + dmList.get(choose).getName());
            selectMenu(choose);
            System.out.println("Do you wish to continue? [0 to exit/ 1 to continue]");
            decide = scan.nextInt();
            number = 1;

        } while (decide == 1);
    }

    public static void selectMenu(int no) {

        System.out.println("*****************************");
        System.out.println("1.\t Clock In");
        System.out.println("2.\t Clock Out");
        System.out.println("3.\t Get Job");
        System.out.println("*****************************");
        System.out.println("Choose your action: ");

        int choose = scan.nextInt();
        if (choose == 1) {
            date = new Date();
            Date = dateFormat.format(date);
            dmList.get(no).setClockIn(String.format(Date));
            dmList.get(no).setStatus("AVAILABLE");
            System.out.println("Your clock in time ----> " + dmList.get(no).getClockIn());
        } else if (choose == 2) {
            date = new Date();
            Date = dateFormat.format(date);
            if (dmList.get(no).getClockIn() != "") {
                dmList.get(no).setClockOut(String.format(Date));
                dmList.get(no).setStatus("OFF");
                System.out.println("Your clock out time ----> " + dmList.get(no).getClockOut());
                System.out.println("See You Tommorrow!!!");
            } else {
                System.out.println("You haven't clock in yet! How you gonna clock out first?! LOL");
            }
        } else if (choose == 3) {
            if (dmList.get(no).getClockIn().isEmpty()) {
                System.out.println("Please Clock In First!");
            } else if(dmList.get(no).getStatus().equals("ON DELIVERING")){
                System.out.println("Please done your job first!");
            }else {
                if (orderList.isEmpty()) {
                    System.out.println("No Order Now! Please Wait...");
                } else {
                    int random = new Random().nextInt(orderList.size());
                    dmList.get(no).setOrderID(orderList.get(random).getOrderID());
                    dmList.get(no).setStatus("ON DELIVERING");
                    orderList.remove(random);
                }
            }
        }
    }
}
