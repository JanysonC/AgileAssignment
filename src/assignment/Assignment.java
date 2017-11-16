
package assignment;

import Control.orderFood;
import Control.orderFoodInterface;
import Model.Food;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment {

  
    
    public static void main(String[] args) {
        int selection = 0;
        ArrayList<Food> f = new ArrayList<>();
        ArrayList<Food> f1 = new ArrayList<>();
        ArrayList<Food> f2 = new ArrayList<>();
        
        orderFoodInterface orderFood = new orderFood();
        f = orderFood.insertFoodToArrayList();
        f1 = orderFood.insertFoodToArrayList1();
        f2 = orderFood.insertFoodToArrayList2();
        String choice = "";
        
       
       do{
       
 
        selection =  orderFood.displayRestaurant();
        orderFood.displayFood(selection,f,f1,f2);
        int foodOrdered  = orderFood.orderFoods();
        
        if(selection==1){
        System.out.println("");
        System.out.println("You have been selected: " + f.get(foodOrdered-1).getName());
        System.out.println(String.format("Price                 : RM %.2f",f.get(foodOrdered-1).getPrice()));       
        int quantity = orderFood.enterQuantity();
        double total = orderFood.calculateTotal(quantity, f.get(foodOrdered-1).getPrice());
        System.out.println("");
        System.out.println("");
        System.out.println(f.get(foodOrdered-1).getName());
        System.out.println(String.format("Price: RM %.2f", f.get(foodOrdered-1).getPrice()));
        System.out.println("Quantity: x"+quantity);
        System.out.println(String.format("Total Price : RM %.2f",total));
        choice = continues();
        
        }
        else if(selection==2){
                System.out.println("");
        System.out.println("You have been selected: " + f1.get(foodOrdered-1).getName());
        System.out.println(String.format("Price                 : RM %.2f",f1.get(foodOrdered-1).getPrice()));       
        int quantity = orderFood.enterQuantity();
        double total = orderFood.calculateTotal(quantity, f1.get(foodOrdered-1).getPrice());
        System.out.println("");
        System.out.println("");
        System.out.println(f1.get(foodOrdered-1).getName());
        System.out.println(String.format("Price: RM %.2f", f1.get(foodOrdered-1).getPrice()));
        System.out.println("Quantity: x"+quantity);
        System.out.println(String.format("Total Price : RM %.2f",total));
        choice = continues();
        
                
        }
        else if(selection==3){
            System.out.println("");
        System.out.println("You have been selected: " + f2.get(foodOrdered-1).getName());
        System.out.println(String.format("Price                 : RM %.2f",f2.get(foodOrdered-1).getPrice()));       
        int quantity = orderFood.enterQuantity();
        double total = orderFood.calculateTotal(quantity, f2.get(foodOrdered-1).getPrice());
        System.out.println("");
        System.out.println("");
        System.out.println(f2.get(foodOrdered-1).getName());
        System.out.println(String.format("Price: RM %.2f", f2.get(foodOrdered-1).getPrice()));
        System.out.println("Quantity: x"+quantity);
        System.out.println(String.format("Total Price : RM %.2f",total));
        choice = continues();
        
          
        }
        }while(choice.equals("y")||choice.equals("Y"));
       
        
    
       
        
   
       
        
        
    }
   
   
    public  static String continues(){
         System.out.printf("Do you want to eat other food? Y/N\n");
        Scanner s = new Scanner(System.in);
        String choice = s.next();
        
        return choice;
    }

   
    
}
