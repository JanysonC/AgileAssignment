package Main;

import Objects.CustomerOB;
import Main.StaffDuty;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class CheckDelivery {

    public static void main(String[] args) {
        login();
    }
    private static String name, password;
    private static List<CustomerOB> cusList = new ArrayList<>();
    //private static List<CustomerOB> orderList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void cusInfo() {
        cusList.add(new CustomerOB("C001", "Maria", "1234", "O001", "On Delivering", "01-12-2017 9:00:00"));
        cusList.add(new CustomerOB("C002", "Long", "123", "", "", ""));
        cusList.add(new CustomerOB("C003", "Hulk", "12345", "", "", ""));
    }

    public static void calculateRemainTime(String ordered_date) {
        final long ONE_MINUTE_IN_MILLIS = 60000;//millisecs
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        java.util.Date orderDate;
        java.util.Date afterDate;
        try {
            orderDate = format.parse(ordered_date);
            long millis = orderDate.getTime();
            Date addMins = new Date(millis + (30 * ONE_MINUTE_IN_MILLIS));
            String afterAdd = format.format(addMins.getTime());
            afterDate = format.parse(afterAdd);
            long remainMillis = millis - afterDate.getTime();
            long remainTime = TimeUnit.MINUTES.convert(remainMillis, TimeUnit.MILLISECONDS);
            System.out.println("Remaining time is " + Math.abs(remainTime) + "mins. Please be passion...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void login() {
        cusInfo();

        System.out.println("Customer Account");
        System.out.println("-----------------");
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Enter your password:");
        password = scan.nextLine();
        int error = 0;
        for (int i = 0; i < cusList.size(); i++) {
            if (cusList.get(i).getName().equals(name) && cusList.get(i).getPassword().equals(password)) {
                checkTime(i);
                break;
            } else {
                error = 1;
            }
        }
        if (error == 1) {
            System.out.println("Incorrect Name or Password! Please Try Again!");
        }
    }

    public static void checkTime(int a) {
        if (cusList.get(a).getOrderID().isEmpty()) {
            System.out.println("You don't have any order!");
        } else {
            System.out.println("Your order is " + cusList.get(a).getStatus());
            String ordered_date = cusList.get(a).getOrderDate();
            calculateRemainTime(ordered_date);
        }
    }
}
