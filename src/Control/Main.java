package Control;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static MaintainDeli maintainDeliveryClass = new MaintainDeli();
    static DeliPending deliveryPendingClass = new DeliPending();
    static AddItem maintainMenuClass = new AddItem();
    static StaffDuty deliverymanClass = new StaffDuty();
    static Assignment orderFoodClass = new Assignment();
    static CheckDelivery checkDeliveryClass = new CheckDelivery();

    static int selection = 0;

    public static void main(String args[]) {
        do {
            System.out.println("Welcome to FastestDeliveryMann!");
            System.out.println("1. Staff");
            System.out.println("2. Customer");
            System.out.printf("Please choose your selection to continue: ");
            selection = scan.nextInt();
            if (selection == 1) {
                do {
                    System.out.println("");
                    System.out.println("Welcome Back to FastestDeliveryMan");
                    System.out.println("1. Owner");
                    System.out.println("2. HR Manager");
                    System.out.println("3. Delivery Man");
                    System.out.printf("Please choose your selection to continue: ");
                    selection = scan.nextInt();
                    if (selection == 1) {
                        System.out.println("");
                        maintainMenuClass.main(null);
                    } else if (selection == 2) {
                        do {
                            System.out.println("");
                            System.out.println("1. Maintain Delivery Man");
                            System.out.println("2. Retrieve Pending Deliveries");
                            System.out.printf("Please choose your selection to continue: ");
                            selection = scan.nextInt();
                            if (selection == 1) {
                                System.out.println("");
                                maintainDeliveryClass.main(null);
                            } else if (selection == 2) {
                                System.out.println("");
                                deliveryPendingClass.main(null);
                            } else {
                                System.out.println("Please insert the correct selection...");
                                System.out.println("");
                            }
                        } while (selection < 1 || selection > 2);
                    } else if (selection == 3) {
                        System.out.println("");
                        deliverymanClass.main(null);
                    } else {
                        System.out.println("Please insert the correct selection...");
                        System.out.println("");
                    }
                } while (selection < 1 || selection > 3);
            } else if (selection == 2) {
                System.out.println("");
                System.out.println("Welcome Back to FastestDeliveryMan");
                System.out.println("1. Order Food");
                System.out.println("2. Check Remaining Time");
                System.out.printf("Please choose your selection to continue: ");
                selection = scan.nextInt();
                switch (selection) {
                    case 1:
                        System.out.println("");
                        orderFoodClass.main(null);
                    case 2:
                        System.out.println("");
                        checkDeliveryClass.main(null);
                    default:
                        System.out.println("Please choose correct selection.");
                }
            } else {
                System.out.println("Please insert the correct selection...");
                System.out.println("");
            }
        } while (selection < 1 || selection > 2);
    }
}
