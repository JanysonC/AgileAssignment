
package assignment;

import Control.orderFood;
import Control.orderFoodInterface;
import Model.Food;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Assignment {

    
    
    public static void main(String[] args) {
       
        String abc = "";
        String abc1 = "";
        String abc2 ="";
        
        
        
        int selection = 0;
        ArrayList<Food> f = new ArrayList<>();
        ArrayList<Food> f1 = new ArrayList<>();
        ArrayList<Food> f2 = new ArrayList<>();
        double totalPrices = 0;
        
        orderFoodInterface orderFood = new orderFood();
        f = orderFood.insertFoodToArrayList();
        f1 = orderFood.insertFoodToArrayList1();
        f2 = orderFood.insertFoodToArrayList2();
        String choice = "";
        
       
       
          System.out.println("");
        selection =  orderFood.displayRestaurant();
        
        do{

       orderFood.displayFood(selection,f,f1,f2);
        int foodOrdered  = orderFood.orderFoods();
        
        
        
        
        if(selection==1){
            
        System.out.println("");
        System.out.println("You have been selected: " + f.get(foodOrdered-1).getName());
        System.out.println(String.format("Price                 : RM %.2f",f.get(foodOrdered-1).getPrice()));       
        int quantity = orderFood.enterQuantity();
        totalPrices += orderFood.calculateTotal(quantity, f.get(foodOrdered-1).getPrice());
        System.out.println("");
        System.out.println("");
        System.out.println(f.get(foodOrdered-1).getName());
        System.out.println(String.format("Price: RM %.2f", f.get(foodOrdered-1).getPrice()));
        System.out.println("Quantity: x"+quantity);
        double subtotal = orderFood.calculateTotal(quantity, f.get(foodOrdered-1).getPrice());
        System.out.println(String.format("Subtotal Price: RM %.2f",subtotal));
        System.out.println(String.format("Total Price : RM %.2f",totalPrices));
        int a=0;
        a++;
        
        choice = continues();
        
        for(int i=0; i<a; i++){
        
        
        abc += String.format("%24s\t\t\tRM %5.2f\t\t%d\t\tRM %6.2f\n",
                        f.get(foodOrdered-1).getName(),f.get(foodOrdered-1).getPrice(),quantity,subtotal);
        

        }
        
   
        
        }
        
        else if(selection==2){
        System.out.println("");
        System.out.println("You have been selected: " + f1.get(foodOrdered-1).getName());
        System.out.println(String.format("Price                 : RM %.2f",f1.get(foodOrdered-1).getPrice()));       
        int quantity = orderFood.enterQuantity();
        totalPrices += orderFood.calculateTotal(quantity, f1.get(foodOrdered-1).getPrice());
        System.out.println("");
        System.out.println("");
        System.out.println(f1.get(foodOrdered-1).getName());
        System.out.println(String.format("Price: RM %.2f", f1.get(foodOrdered-1).getPrice()));
        System.out.println("Quantity: x"+quantity);
        double subtotal = orderFood.calculateTotal(quantity, f1.get(foodOrdered-1).getPrice());
        System.out.println(String.format("Subtotal Price: RM %.2f",subtotal));
        System.out.println(String.format("Total Price : RM %.2f",totalPrices));
        int b=0;
        b++;
        choice = continues();
        for(int i=0; i<b; i++){
        
        
        abc += String.format("%24s\t\t\tRM %5.2f\t\t%d\t\tRM %6.2f\n",
                        f1.get(foodOrdered-1).getName(),f1.get(foodOrdered-1).getPrice(),quantity,subtotal);
        

        }
        
                
        }
        else if(selection==3){
        System.out.println("");
        System.out.println("You have been selected: " + f2.get(foodOrdered-1).getName());
        System.out.println(String.format("Price                 : RM %.2f",f2.get(foodOrdered-1).getPrice()));       
        int quantity = orderFood.enterQuantity();
        totalPrices += orderFood.calculateTotal(quantity, f2.get(foodOrdered-1).getPrice());
        System.out.println("");
        System.out.println("");
        System.out.println(f2.get(foodOrdered-1).getName());
        System.out.println(String.format("Price: RM %.2f", f2.get(foodOrdered-1).getPrice()));
        System.out.println("Quantity: x"+quantity);
        double subtotal = orderFood.calculateTotal(quantity, f2.get(foodOrdered-1).getPrice());
        System.out.println(String.format("Subtotal Price: RM %.2f",subtotal));
        System.out.println(String.format("Total Price : RM %.2f",totalPrices));
        int c=0;
        c++;
        choice = continues();
        for(int i=0; i<c; i++){
        
        
        abc += String.format("%24s\t\t\tRM %5.2f\t\t%d\t\tRM %6.2f\n",
                        f2.get(foodOrdered-1).getName(),f2.get(foodOrdered-1).getPrice(),quantity,subtotal);
        

        }
        
          
        }
        }while(choice.equals("y")||choice.equals("Y"));
       
        
        String display = "";
        int orderNo=1;
        
        display = String.format("\n***************************************************************************************************************************\nOrder No: %05d\nRestaurant: James Foo Western Food\n***************************************************************************************************************************\n",orderNo++);
        System.out.println(display);
        System.out.println("          Food Name                              Price                 Unit             Subtotal");
        System.out.println(abc);
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");
        System.out.println(String.format("\t\t\t\t\t\t\t\t\t   Total Price: RM %6.2f\n",totalPrices));
        
        
        
    
       
        
   
       
        
        
    }
   
   
    public  static String continues(){
         System.out.printf("Do you want to eat other food? Y/N to confirm order.\n");
        Scanner s = new Scanner(System.in);
        String choice = s.next();
        
        return choice;
    }
    
}