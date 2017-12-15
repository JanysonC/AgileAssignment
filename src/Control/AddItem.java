package Control;

import Objects.Item;
import java.util.*;

public class AddItem {

    private static String name;
    private static String price;
    private static String halal;
    private static String desp;
    private static String dec1, dec2, dec3;
    private static String status;
    private static int choice;
    private static int selection;
    static Scanner scan = new Scanner(System.in);
    private static ArrayList<Item> list = new ArrayList<>();

    public static void main(String[] args) {
MainMenu();
    }
    
    public static void MainMenu(){
        do{
        System.out.println("Please Select the option: 1. Add Item. 2. Update Item Status.  3. Remove Item");
        selection = scan.nextInt();
        if(selection == 1){
            addItem();
        }
        else if(selection == 2){
            updateItem();
        }
        else if(selection == 3){
            Deleteitem();
        }
}while(selection > 3);
       
    }
     public static void Deleteitem() {
        int num = 1;
        int number = 1;
        System.out.println("Item List");
        list.add(new Item("Fish", "15.90", "Halal", "Fresh Fish and suitable to any age", "Available"));
        list.add(new Item("Chips", "15.90", "Halal", "Fresh Fish and suitable to any age", "Available"));
        list.add(new Item("Fish&Chips", "15.90", "Halal", "Fresh Fish and suitable to any age", "Available"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(number + list.get(i).getName() + "\t" + "RM" + list.get(i).getPrice() + "\t" + list.get(i).getHalal() + "\t" + list.get(i).getDESP() + "\t" + list.get(i).getStatus());
            number++;   
        }
        System.out.println("Please key in the ID item you want to remove:");
        selection = Integer.parseInt(scan.next());
        selection--;
        try{
        list.remove(selection);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(num + list.get(i).getName() + "\t" + "RM" + list.get(i).getPrice() + "\t" + list.get(i).getHalal() + "\t" + list.get(i).getDESP() + "\t" + list.get(i).getStatus());
            num++;
        }
        }catch(Exception e){
            System.out.println("Error! Please choose the exist ID number.");
        }

        System.out.println("Do you want to continue?(y/n)");
         dec1 = scan.next(); 
          if(dec1.equals("y"))
                Deleteitem();
            else if(dec1.equals("n"))
                MainMenu();
     }
     
    public static void updateItem(){
        int num =1;
        int number =1;
           System.out.println("Item List");
        list.add(new Item("Fish", "15.90", "Halal", "Fresh Fish and suitable to any age", "Available"));
        list.add(new Item("Chips", "15.90", "Halal", "Fresh Fish and suitable to any age", "Available"));
        list.add(new Item("Fish&Chips", "15.90", "Halal", "Fresh Fish and suitable to any age", "Available"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(number + list.get(i).getName() + "\t" + "RM" + list.get(i).getPrice() + "\t" + list.get(i).getHalal() + "\t" + list.get(i).getDESP() + "\t" + list.get(i).getStatus());
            number++;
        }
        
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
        else if(choice>2){
            System.out.println("Error! Selection does not exist!");
        }
          for (Item i : list) {
                System.out.println(num+"\t" + i);
                num++;
            }
         System.out.println("Do you want to update item?(y/n)");
            dec2=scan.next();
            if(dec2.equals("y"))
                updateItem();
            else if(dec2.equals("n"))
                MainMenu();
    }
      
    public static void addItem() {
        System.out.println("Item List");
        list.add(new Item("Fish&Chips", "15.90", "Halal", "Fresh Fish and suitable to any age", "Available"));
        int number;
       
            number=1;
            for (int i = 0; i < list.size(); i++) {
                System.out.println("====================================================================================");
                System.out.println(number+".\t" + list.get(i).getName() + "\t" +"RM"+ list.get(i).getPrice() + "\t" + list.get(i).getHalal() + "\t" + list.get(i).getDESP()+"\t"+list.get(i).getStatus());
                System.out.println("====================================================================================");
                number++;
            }
             boolean error = false;
            do{
                  System.out.println("Enter Item Name: ");
                name = scan.next();
                for(int i=0; i<list.size();i++){
                    if(list.get(i).getName().equals(name)){
                        System.out.println("Item name already exist. Please try again.");
                        error = true;
                    }
                    else{
                        error =false;
                    }
                }
            }while(error);
                System.out.println("Enter Price: ");
                price = scan.next();
                do{
                System.out.println("State this item is halal or non-halal: 1. halal  2. non-halal");
                selection = scan.nextInt();
            
                if(selection==1){
                    halal = "Halal"; 
                }
                else if(selection == 2){
                    halal="Non-halal";
                }  
             }while(selection>2);
                System.out.println("Enter the description of the item: ");
                desp = scan.next();
                list.add(new Item(name, price, halal, desp,"Available"));
                int num =1;
            for (Item i : list) {
                System.out.println(num+"\t" + i);
                num++;
            }
            System.out.println("Do you want to continue?(y/n)");
            dec3 = scan.next();
              if(dec3.equals("y"))
                addItem();
            else if(dec3.equals("n"))
                MainMenu();

        
    }
}
