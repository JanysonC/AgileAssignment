package additem;

import java.util.*;

class Item {

    public String name;
    public String price;
    public String halal;
    public String desp;
    public String dec;

    public Item(String name, String price, String halal, String desp) {
        this.name = name;
        this.price = price;
        this.halal = halal;
        this.desp = desp;
        
    }
    public void setName(String Name){
        this.name = Name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(String Price){
        this.price = Price;
    }
    public String getPrice(){
        return price;
    }
    public void setHalal(String Halal){
        this.halal = Halal;
    }
    public String getHalal(){
        return halal;
    }
    public void setDESP(String DESP){
        this.desp = DESP;
    }
    public String getDESP(){
        return desp;
    }
    
    
    public String toString() {
        return "Dish Name = " + this.name + ", Price = " + this.price + ", Halal =" + this.halal + ", Description =" + this.desp;
    }
}

public class AddItem {
    private static String name;
    private static String price;
    private static String halal;
    private static String desp;
    private static String dec;
    static Scanner scan = new Scanner(System.in);
    private static ArrayList<Item> list = new ArrayList<>();
    
    public static void main(String[] args)  
    {
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
    
    public static void addItem(){
        System.out.println("Item List");
         list.add(new Item("Fish&Chips", "RM 15.90", "Halal", "Fresh Fish and suitable to any age"));
          
      do{ 
        for(int i =0; i<list.size();i++){
           
            System.out.println("====================================================================================");
            System.out.println(list.get(i).getName()+".\t"+ list.get(i).getPrice()+".\t"+list.get(i).getHalal()+".\t"+list.get(i).getDESP());
            
            System.out.println("====================================================================================");
        }
        
     System.out.println("Enter Item Name: ");
        name = scan.nextLine();
        System.out.println("Enter Price: ");
        price = scan.nextLine();
        System.out.println("State this item is halal or non-halal: ");
        halal = scan.nextLine();
        System.out.println("Enter the description of the item: ");
        desp =scan.nextLine();
        list.add(new Item(name, price, halal, desp));
        
        for(Item i : list){
            System.out.println(i);
        }
        System.out.println("Do you want to continue?(y/n)");
        dec = scan.nextLine();
       }while(dec.equals("y"));
    }
}
