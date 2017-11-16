package Main;

import java.util.*;
import java.text.*;

public class StaffDuty {

    public static void main(String[] args) {
        showInfo();
    }

    private static List<DeliveryMan> dmList = new ArrayList<>();
    //private static List<> csList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static Date date;
    static DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
    static String Date;

    private static void personInfo() {
        dmList.add(new DeliveryMan("Flora", "DM1234", "Female", "OFF", "", ""));
        dmList.add(new DeliveryMan("James", "DM5223", "Male", "OFF", "", ""));
        dmList.add(new DeliveryMan("Rock", "DM9198", "Male", "OFF", "", ""));
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
                System.out.println(number + ".\t" + dmList.get(i).getID() + "\t\t" + dmList.get(i).getName() + "\t\t"+ dmList.get(i).getStatus() + "\t\t" + dmList.get(i).getClockIn() + "\t\t\t" + dmList.get(i).getClockOut());
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
            if(dmList.get(no).getClockIn() != ""){
            dmList.get(no).setClockOut(String.format(Date));
            dmList.get(no).setStatus("OFF");
            System.out.println("Your clock out time ----> " + dmList.get(no).getClockOut());
            System.out.println("See You Tommorrow!!!");
            }
            else
                System.out.println("You haven't clock in yet! How you gonna clock out first?! LOL");
        }
    }
}
