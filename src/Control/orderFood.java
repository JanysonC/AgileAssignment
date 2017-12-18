/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Interface.orderFoodInterface;
import Objects.Food;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author User
 */
public class orderFood implements orderFoodInterface{

    private int foodOrdered;

    @Override
    public int displayRestaurant() {
        int selection = 0;
          do{
           
        try{
        
        System.out.println("1.James Foo Western Food");
        System.out.println("2.myBurgerLag Oug");
        System.out.println("3.Mc Donald's");
        System.out.println("4.Exit");
        System.out.printf("Please select your restaurant:");
        Scanner scanner = new Scanner(System.in);
        selection = scanner.nextInt();
        
       
        
        }catch(InputMismatchException ex){
            System.out.println("Please enter correctly.");
           System.out.println("");
             selection = 0;
        }
        
         }while(selection<1 || selection >4);
          
          
         
          
          
        return selection;
    }

    @Override
    public void displayFood(int selection,ArrayList<Food> f,ArrayList<Food> f1,ArrayList<Food> f2) {
        
        if(selection ==1){
            System.out.println("");
            System.out.println("James Foo's Restaurant");
           for(int i=0;i<f.size();i++){
               
               
               System.out.println((i+1)+"."+f.get(i).getName());
           }
        }
        else if(selection ==2){
            System.out.println("");
            System.out.println("myBurgerLag Oug");
           for(int i=0;i<f1.size();i++){
               
               
               System.out.println((i+1)+"."+f1.get(i).getName());
           }
   
        }
        else if(selection ==3){
            System.out.println("");
            System.out.println("Mc Donald's");
           for(int i=0;i<f2.size();i++){
               
               
               System.out.println((i+1)+"."+f2.get(i).getName());
           }
          
        }
        else if(selection ==4)
        {
            System.out.close();
        }
    }

    @Override
    public int orderFoods() {
        int selected = 0;
        boolean result =true;
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.print("Please Enter your choice(Order food):");
        try{
            selected = scanner.nextInt();
            if(selected!=0){
                
            result = false;
        }
        }catch(Exception ex){
            System.out.println("Please enter correctly.");
            System.out.println("");
            scanner.nextLine();
        }
        }while(result||selected<1||selected>3);
        
      
        return selected;
    }
        
    
     

    @Override
    public ArrayList<Food> insertFoodToArrayList() {
        
        ArrayList<Food> f  = new ArrayList<>();
        
        Food food = new Food();
        food.setFoodId("F01");
        food.setName("Oriental Chicken Chop");
        food.setPrice(10.90);
        f.add(food);
        
        
         food = new Food();
        food.setFoodId("F02");
        food.setName("Fish & Chips");
        food.setPrice(10.90);
        f.add(food);
        
         food = new Food();
        food.setFoodId("F03");
        food.setName("Chicken Spaghetti");
        food.setPrice(8.90);
        f.add(food);
        
        return f;
        
    }
    @Override
    public ArrayList<Food> insertFoodToArrayList1() {
        
        ArrayList<Food> f1  = new ArrayList<>();
        
        Food food = new Food();
        food.setFoodId("F01");
        food.setName("Chicken (The Ultraman 3.0)");
        food.setPrice(19.80);
        f1.add(food);
        
        
         food = new Food();
        food.setFoodId("F02");
        food.setName("Big AF CheeseBurgers");
        food.setPrice(23.90);
        f1.add(food);
        
         food = new Food();
        food.setFoodId("F03");
        food.setName("Beef (Hangover)");
        food.setPrice(18.90);
        f1.add(food);
        
        return f1 ;
        
    }
    @Override
    public ArrayList<Food> insertFoodToArrayList2() {
        
        ArrayList<Food> f2  = new ArrayList<>();
        
        Food food = new Food();
        food.setFoodId("F01");
        food.setName("Mc Chicken");
        food.setPrice(8.99);
        f2.add(food);
        
        
         food = new Food();
        food.setFoodId("F02");
        food.setName("Fillet-O-Fish");
        food.setPrice(8.99);
        f2.add(food);
        
         food = new Food();
        food.setFoodId("F03");
        food.setName("Spicy Chicken McDeluxe");
        food.setPrice(11.50);
        f2.add(food);
        
        return f2;
        
    }
    
  
    public int enterQuantity() {
         int Quantity = 0;
         boolean result = true;      
        Scanner s = new Scanner(System.in);
        do{
        System.out.printf("Enter your quantity(Quantity):");
        try{
            Quantity = s.nextInt();
            if(Quantity!=0)
            result = false;
        }catch(InputMismatchException ex){
            System.out.println("Please enter only number");
            System.out.println("");
            s.nextLine();
          
        }
        
        }while(result);
         
    
        return Quantity;
       
    }

    @Override
    public double calculateTotal(int quantity, double price) {
       
        return quantity*price;

            
        }
        
      
        
    

   


   

   

    
    
    
}
