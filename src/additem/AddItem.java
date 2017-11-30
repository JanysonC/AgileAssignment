package additem;

import java.util.*;

class Item {

    public String name;
    public String price;
    public String halal;
    public String desp;
    public String status;
    public String dec;
    
    public Item(String name, String price, String halal, String desp, String status) {
        this.name = name;
        this.price = price;
        this.halal = halal;
        this.desp = desp;
       this.status = status;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(String Price) {
        this.price = Price;
    }

    public String getPrice() {
        return price;
    }

    public void setHalal(String Halal) {
        this.halal = Halal;
    }

    public String getHalal() {
        return halal;
    }

    public void setDESP(String DESP) {
        this.desp = DESP;
    }

    public String getDESP() {
        return desp;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
   

    public String toString() {
        return "Dish Name = " + this.name + ", Price = " + this.price + ", Halal =" + this.halal + ", Description =" + this.desp+",Status="+this.status;
    }
}

public class AddItem {

    private static String name;
    private static String price;
    private static String halal;
    private static String desp;
    private static String dec1, dec2;
    private static String status;
    private static int choice;
    private static int selection;
    static Scanner scan = new Scanner(System.in);
    private static ArrayList<Item> list = new ArrayList<>();

    public static void main(String[] args) {
//        System.out.println("Enter Item Name: ");
//        name = scan.nextLine();
//        System.out.println("Enter Price: ");
//        price = scan.nextLine();
//        System.out.println("State this item is halal or non-halal: ");
//        halal = scan.nextLine();
//        System.out.println("Enter the description of the item: ");
//        desp =scan.nextLine();
//        list.add(new Item(name, price, halal, desp));
//        
//        for(Item i : list){
//            System.out.println(i);
//        }

        addItem();
    }
    public static void updateItem(){
        System.out.println("Enter your selection to update status: ");
        selection = scan.nextInt();
        System.out.println("1. Availble");
        System.out.println("2. Unavailble");
        System.out.println("Enter your selection: ");
        choice = scan.nextInt();
        selection--;
        if(choice == 1)
            list.get(selection).setStatus("Available");
        else if(choice == 2)
            list.get(selection).setStatus("Unavailable");
        
    }
      
    public static void addItem() {
        System.out.println("Item List");
        list.add(new Item("Fish&Chips", "15.90", "Halal", "Fresh Fish and suitable to any age", "Available"));
        int number;
        do {
            number=1;
            for (int i = 0; i < list.size(); i++) {
                System.out.println("====================================================================================");
                System.out.println(number+".\t" + list.get(i).getName() + "\t" +"RM"+ list.get(i).getPrice() + "\t" + list.get(i).getHalal() + "\t" + list.get(i).getDESP()+"\t"+list.get(i).getStatus());
                System.out.println("====================================================================================");
                number++;
            }
            
              
//                for (int i = 0; i < list.size(); i++) {
//                if (list.get(i).getName() == name) {
//                    System.out.println("Error!");
//                }
            
                  System.out.println("Enter Item Name: ");
                name = scan.next();
                System.out.println("Enter Price: ");
                price = scan.next();
                System.out.println("State this item is halal or non-halal: ");
                halal = scan.next();
                System.out.println("Enter the description of the item: ");
                desp = scan.next();
                list.add(new Item(name, price, halal, desp,"Available"));
                int num =1;
            for (Item i : list) {
                System.out.println(num+"\t" + i);
                num++;
            }
            System.out.println("Do you want to update item?(y/n)");
            dec1=scan.next();
            if(dec1.equals("y"))
                updateItem();
            System.out.println("Do you want to continue?(y/n)");
            dec2 = scan.next();
        } while (dec2.equals("y"));
    }
}
