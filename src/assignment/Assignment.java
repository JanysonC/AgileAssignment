package assignment;
// no   problem
import Control.orderFood;
import Control.orderFoodInterface;
import Model.Food;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import Model.OrderedFood;
import java.util.Arrays;

public class Assignment {

    
    
    public static void main(String[] args) {
       
        String abc = "";
        String abc1 = "";
        String abc2 ="";
        int a=0;
        int b=0;
        int c=0;
        int no=0;
        int foodOrdered;
        
      
        ArrayList<String> orderedMenu = new ArrayList<>();
        
        ArrayList<OrderedFood> restaurant1  = new ArrayList<>();
        OrderedFood orderedFood = new OrderedFood();
        
        ArrayList<OrderedFood> restaurant2  = new ArrayList<>();
        OrderedFood orderedFood2 = new OrderedFood();
        
        ArrayList<OrderedFood> restaurant3  = new ArrayList<>();
        OrderedFood orderedFood3 = new OrderedFood();
        
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
        char ch = ' ';
         
       
       
          System.out.println("");
        selection =  orderFood.displayRestaurant();
        
        do{

       orderFood.displayFood(selection,f,f1,f2);
         foodOrdered  = orderFood.orderFoods();
        
        
        
        
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
       a=0;
        a++;
        
        ch = continues();
        
        
        for(int i=0; i<a; i++){
        no++;
        
        orderedFood=new OrderedFood();
        orderedFood.setFoodNo(no);
        orderedFood.setName(f.get(foodOrdered-1).getName());
        orderedFood.setPrice(f.get(foodOrdered-1).getPrice());
        orderedFood.setQuantity(quantity);
        orderedFood.setSubtotal(subtotal);
        
        restaurant1.add(orderedFood);
        
        
        
         
//        String ordered  =  String.format("%d\t%24s\t\tRM %5.2f\t\t%d\t\tRM %6.2f\n",
//                        no,f.get(foodOrdered-1).getName(),f.get(foodOrdered-1).getPrice(),quantity,subtotal);
//        orderedMenu.add(ordered);
        
        }
        
        String display = "";
        int orderNo=1;
        String restName="";
        if(selection==1){
             restName = "James Foo Western Food";
        }
        else if(selection==2){
             restName = "myBurgerLag Oug";
        }
        else if(selection==3){
            restName = "Mc Donald's";
        }
        if(ch=='n'||ch=='N'){
        System.out.println("");
        System.out.println("You have been selected the following food:");
        System.out.println("No        Food Name\t\t         Price                  Unit            Subtotal");
 /*here*/        for(int g=0;g<restaurant1.size();g++ )
            {
                if(restaurant1.get(g).getName().length() ==21){
                   System.out.print(String.format("%d        %21s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else if(restaurant1.get(g).getName().length() ==17){
                    System.out.print(String.format("%d        %17s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else 
                    System.out.print(String.format("%d        %s\t\t        RM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");    
        System.out.println(String.format("\t\t\t\t\t\t\t\t  Total Price: RM %6.2f\n",totalPrices));
        int confirmChoice=0;
        boolean result =true;
        Scanner s = new Scanner(System.in);
        do{
            
        System.out.println("Would you like to confirm your order?");
        System.out.println("Please enter your choice:");
        System.out.println("1. Confirm Order");
        System.out.println("2. Delete Order");
        try{
            confirmChoice = s.nextInt();
            if(confirmChoice!=0){
                
            result = false;
        }
        }catch(Exception ex){
            System.out.println("Please enter correctly.");
            System.out.println("");
            s.nextLine();
        }
        
        
        
        if(confirmChoice == 2){
            Scanner s1 = new Scanner(System.in);
            boolean result1 = true;
            int choiceDel=0;
            System.out.println("");
             System.out.println("No        Food Name\t\t         Price                  Unit            Subtotal");
            for(int g=0;g<restaurant1.size();g++ )
            {
                if(restaurant1.get(g).getName().length() ==21){
                   System.out.print(String.format("%d        %21s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else if(restaurant1.get(g).getName().length() ==17){
                    System.out.print(String.format("%d        %17s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else 
                    System.out.print(String.format("%d        %s\t\t        RM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");    
        System.out.println(String.format("\t\t\t\t\t\t\t\t  Total Price: RM %6.2f\n",totalPrices));
            System.out.println("Please enter the no of food that u want to delete:");
            choiceDel  = s1.nextInt();
            
           
            
            totalPrices -=  restaurant1.get(choiceDel-1).getPrice()*restaurant1.get(choiceDel-1).getQuantity();
           restaurant1.remove(choiceDel-1);
           
           int v=0;
           for(int g=0;g<restaurant1.size();g++ )
            {
                v++;
                    
                    restaurant1.get(g).setFoodNo(v);
                   
                    
                    
            }
            
//            totalPrices -=restaurant1.get(choiceDel-1).getPrice();
          //  totalPrices-=f.get(choiceDel-1).getPrice();
            System.out.println("");
            System.out.println("You have been selected the following food:");
             System.out.println("No        Food Name\t\t         Price                  Unit            Subtotal");
           for(int g=0;g<restaurant1.size();g++ )
            {
                if(restaurant1.get(g).getName().length() ==21){
                   System.out.print(String.format("%d        %21s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else if(restaurant1.get(g).getName().length() ==17){
                    System.out.print(String.format("%d        %17s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else 
                    System.out.print(String.format("%d        %s\t\t        RM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");    
        System.out.println(String.format("\t\t\t\t\t\t\t\t  Total Price: RM %6.2f\n",totalPrices));
            }
        
            else if(confirmChoice==1){
                display = String.format("\n*********************************************************************************************************************\nOrder No: %05d\nRestaurant: %s\n*********************************************************************************************************************\n",orderNo++,restName);
                System.out.println(display);
                 System.out.println("No        Food Name\t\t         Price                  Unit            Subtotal");
 /*here*/       for(int g=0;g<restaurant1.size();g++ )
            {
                if(restaurant1.get(g).getName().length() ==21){
                   System.out.print(String.format("%d        %21s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else if(restaurant1.get(g).getName().length() ==17){
                    System.out.print(String.format("%d        %17s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else 
                    System.out.print(String.format("%d        %s\t\t        RM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                } 
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");    
        System.out.println(String.format("\t\t\t\t\t\t\t\t  Total Price: RM %6.2f\n",totalPrices));
            }

        else if(confirmChoice == 1){
        display = String.format("\n*********************************************************************************************************************\nOrder No: %05d\nRestaurant: %s\n*********************************************************************************************************************\n",orderNo++,restName);
        System.out.println(display);
         System.out.println("No        Food Name\t\t         Price                  Unit            Subtotal");
 /*here*/        for(int g=0;g<restaurant1.size();g++ )
            {
                if(restaurant1.get(g).getName().length() ==21){
                   System.out.print(String.format("%d        %21s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else if(restaurant1.get(g).getName().length() ==17){
                    System.out.print(String.format("%d        %17s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else 
                    System.out.print(String.format("%d        %s\t\t        RM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");    
        System.out.println(String.format("\t\t\t\t\t\t\t\t  Total Price: RM %6.2f\n",totalPrices));
        }
        }while(result||confirmChoice==2);
        
        
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
        b=0;
        b++;
        ch = continues();
        for(int i=0; i<b; i++){
        no++;
        
        orderedFood=new OrderedFood();
        orderedFood.setFoodNo(no);
        orderedFood.setName(f1.get(foodOrdered-1).getName());
        orderedFood.setPrice(f1.get(foodOrdered-1).getPrice());
        orderedFood.setQuantity(quantity);
        orderedFood.setSubtotal(subtotal);
        
        restaurant1.add(orderedFood);
        
        
        
         
//        String ordered  =  String.format("%d\t%24s\t\tRM %5.2f\t\t%d\t\tRM %6.2f\n",
//                        no,f.get(foodOrdered-1).getName(),f.get(foodOrdered-1).getPrice(),quantity,subtotal);
//        orderedMenu.add(ordered);
        
        }
        
        String display = "";
        int orderNo=1;
        String restName="";
        if(selection==1){
             restName = "James Foo Western Food";
        }
        else if(selection==2){
             restName = "myBurgerLag Oug";
        }
        else if(selection==3){
            restName = "Mc Donald's";
        }
        if(ch=='n'||ch=='N'){
        System.out.println("");
        System.out.println("You have been selected the following food:");
         System.out.println("No        Food Name\t\t                 Price                  Unit            Subtotal");
         /*
         
         for(int g=0;g<restaurant1.size();g++ )
            {
                if(restaurant1.get(g).getName().length() ==21){
                   System.out.print(String.format("%d        %21s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else if(restaurant1.get(g).getName().length() ==17){
                    System.out.print(String.format("%d        %17s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else 
                    System.out.print(String.format("%d        %s\t\t        RM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
         
         */
         
 /*here*/        for(int g=0;g<restaurant1.size();g++ )
            {
                if(restaurant1.get(g).getName().length()==26){
                   System.out.print(String.format("%d        %26s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else if(restaurant1.get(g).getName().length()==20){
                   System.out.print(String.format("%d        %20s\t\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else 
                    System.out.print(String.format("%d        %s\t\t        RM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                
            }
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");    
        System.out.println(String.format("\t\t\t\t\t\t\t\t\t  Total Price: RM %6.2f\n",totalPrices));
        int confirmChoice=0;
        boolean result =true;
        Scanner s = new Scanner(System.in);
        do{
            
        System.out.println("Would you like to confirm your order?");
        System.out.println("Please enter your choice:");
        System.out.println("1. Confirm Order");
        System.out.println("2. Delete Order");
        try{
            confirmChoice = s.nextInt();
            if(confirmChoice!=0){
                
            result = false;
        }
        }catch(Exception ex){
            System.out.println("Please enter correctly.");
            System.out.println("");
            s.nextLine();
        }
        
        
        
        if(confirmChoice == 2){
            Scanner s1 = new Scanner(System.in);
            boolean result1 = true;
            int choiceDel=0;
            System.out.println("");
            System.out.println("No        Food Name\t\t                 Price                  Unit            Subtotal");
 /*here*/        for(int g=0;g<restaurant1.size();g++ )
            {
                if(restaurant1.get(g).getName().length()==26){
                   System.out.print(String.format("%d        %26s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else if(restaurant1.get(g).getName().length()==20){
                   System.out.print(String.format("%d        %20s\t\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else 
                    System.out.print(String.format("%d        %s\t\t        RM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                
            }
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");    
        System.out.println(String.format("\t\t\t\t\t\t\t\t\t  Total Price: RM %6.2f\n",totalPrices));
            System.out.println("Please enter the no of food that u want to delete:");
            choiceDel  = s1.nextInt();
            
           
            totalPrices -=  restaurant1.get(choiceDel-1).getPrice()*restaurant1.get(choiceDel-1).getQuantity();
            
           restaurant1.remove(choiceDel-1);
           
           int v=0;
           for(int g=0;g<restaurant1.size();g++ )
            {
                v++;
                    
                    restaurant1.get(g).setFoodNo(v);
                   
                    
                    
            }
            
//            totalPrices -=restaurant1.get(choiceDel-1).getPrice();
          //  totalPrices-=f.get(choiceDel-1).getPrice();
            System.out.println("");
            System.out.println("You have been selected the following food:");
             System.out.println("No        Food Name\t\t                 Price                  Unit            Subtotal");
 /*here*/        for(int g=0;g<restaurant1.size();g++ )
            {
                if(restaurant1.get(g).getName().length()==26){
                   System.out.print(String.format("%d        %26s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else if(restaurant1.get(g).getName().length()==20){
                   System.out.print(String.format("%d        %20s\t\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else 
                    System.out.print(String.format("%d        %s\t\t        RM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                
            }
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");    
        System.out.println(String.format("\t\t\t\t\t\t\t\t\t  Total Price: RM %6.2f\n",totalPrices));
            }
        
            else if(confirmChoice==1){
               display = String.format("\n*********************************************************************************************************************\nOrder No: %05d\nRestaurant: %s\n*********************************************************************************************************************\n",orderNo++,restName);
                System.out.println(display);
                 System.out.println("No        Food Name\t\t                 Price                  Unit            Subtotal");
 /*here*/        for(int g=0;g<restaurant1.size();g++ )
            {
                if(restaurant1.get(g).getName().length()==26){
                   System.out.print(String.format("%d        %26s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else if(restaurant1.get(g).getName().length()==20){
                   System.out.print(String.format("%d        %20s\t\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else 
                    System.out.print(String.format("%d        %s\t\t        RM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                
            }
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");    
        System.out.println(String.format("\t\t\t\t\t\t\t\t\t  Total Price: RM %6.2f\n",totalPrices));
            }

        else if(confirmChoice == 1){
        display = String.format("\n*********************************************************************************************************************\nOrder No: %05d\nRestaurant: %s\n*********************************************************************************************************************\n",orderNo++,restName);
        System.out.println(display);
         System.out.println("No        Food Name\t\t                 Price                  Unit            Subtotal");
 /*here*/        for(int g=0;g<restaurant1.size();g++ )
            {
                if(restaurant1.get(g).getName().length()==26){
                   System.out.print(String.format("%d        %26s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else if(restaurant1.get(g).getName().length()==20){
                   System.out.print(String.format("%d        %20s\t\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else 
                    System.out.print(String.format("%d        %s\t\t        RM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                
            }
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");    
        System.out.println(String.format("\t\t\t\t\t\t\t\t\t  Total Price: RM %6.2f\n",totalPrices));
        }
        }while(result||confirmChoice==2);
        
        
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
        c=0;
        c++;
        ch= continues();
        for(int i=0; i<c; i++){
        no++;
        
        orderedFood=new OrderedFood();
        orderedFood.setFoodNo(no);
        orderedFood.setName(f2.get(foodOrdered-1).getName());
        orderedFood.setPrice(f2.get(foodOrdered-1).getPrice());
        orderedFood.setQuantity(quantity);
        orderedFood.setSubtotal(subtotal);
        
        restaurant1.add(orderedFood);
        
        
        
         
//        String ordered  =  String.format("%d\t%24s\t\tRM %5.2f\t\t%d\t\tRM %6.2f\n",
//                        no,f.get(foodOrdered-1).getName(),f.get(foodOrdered-1).getPrice(),quantity,subtotal);
//        orderedMenu.add(ordered);
        
        }
        
        String display = "";
        int orderNo=1;
        String restName="";
        if(selection==1){
             restName = "James Foo Western Food";
        }
        else if(selection==2){
             restName = "myBurgerLag Oug";
        }
        else if(selection==3){
            restName = "Mc Donald's";
        }
        if(ch=='n'||ch=='N'){
        System.out.println("");
        System.out.println("You have been selected the following food:");
         System.out.println("No        Food Name\t\t         Price                  Unit            Subtotal");
 /*here*/        for(int g=0;g<restaurant1.size();g++ )
            {
                if(restaurant1.get(g).getName().length()==22){
                   System.out.print(String.format("%d        %22s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else if(restaurant1.get(g).getName().length()==13){
                   System.out.print(String.format("%d        %13s\t\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else
                    System.out.print(String.format("%d        %s\t\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
            }
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");    
        System.out.println(String.format("\t\t\t\t\t\t\t\t  Total Price: RM %6.2f\n",totalPrices));
        int confirmChoice=0;
        boolean result =true;
        Scanner s = new Scanner(System.in);
        do{
            
        System.out.println("Would you like to confirm your order?");
        System.out.println("Please enter your choice:");
        System.out.println("1. Confirm Order");
        System.out.println("2. Delete Order");
        try{
            confirmChoice = s.nextInt();
            if(confirmChoice!=0){
                
            result = false;
        }
        }catch(Exception ex){
            System.out.println("Please enter correctly.");
            System.out.println("");
            s.nextLine();
        }
        
        
        
        if(confirmChoice == 2){
            Scanner s1 = new Scanner(System.in);
            boolean result1 = true;
            int choiceDel=0;
            System.out.println("");
             System.out.println("No        Food Name\t\t         Price                  Unit            Subtotal");
 /*here*/         for(int g=0;g<restaurant1.size();g++ )
            {
                if(restaurant1.get(g).getName().length()==22){
                   System.out.print(String.format("%d        %22s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else if(restaurant1.get(g).getName().length()==13){
                   System.out.print(String.format("%d        %13s\t\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else
                    System.out.print(String.format("%d        %s\t\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
            }
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");    
        System.out.println(String.format("\t\t\t\t\t\t\t\t  Total Price: RM %6.2f\n",totalPrices));
            System.out.println("Please enter the no of food that u want to delete:");
            choiceDel  = s1.nextInt();
            
           
            totalPrices -=  restaurant1.get(choiceDel-1).getPrice()*restaurant1.get(choiceDel-1).getQuantity();
           restaurant1.remove(choiceDel-1);
           //System.out.println(restaurant1.size());
           int v=0;
           for(int g=0;g<restaurant1.size();g++ )
            {
                v++;
                    
                    restaurant1.get(g).setFoodNo(v);
                   
                    
                    
            }
            
//            totalPrices -=restaurant1.get(choiceDel-1).getPrice();
          //  totalPrices-=f.get(choiceDel-1).getPrice();
            System.out.println("");
            System.out.println("You have been selected the following food:");
             System.out.println("No        Food Name\t\t         Price                  Unit            Subtotal");
 /*here*/        for(int g=0;g<restaurant1.size();g++ )
            {
                if(restaurant1.get(g).getName().length()==22){
                   System.out.print(String.format("%d        %22s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else if(restaurant1.get(g).getName().length()==13){
                   System.out.print(String.format("%d        %13s\t\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else
                    System.out.print(String.format("%d        %s\t\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
            }
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");    
        System.out.println(String.format("\t\t\t\t\t\t\t\t  Total Price: RM %6.2f\n",totalPrices));
            }
        
            else if(confirmChoice==1){
                display = String.format("\n*********************************************************************************************************************\nOrder No: %05d\nRestaurant: %s\n*********************************************************************************************************************\n",orderNo++,restName);
                System.out.println(display);
                 System.out.println("No        Food Name\t\t         Price                  Unit            Subtotal");
 /*here*/         for(int g=0;g<restaurant1.size();g++ )
            {
                if(restaurant1.get(g).getName().length()==22){
                   System.out.print(String.format("%d        %22s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else if(restaurant1.get(g).getName().length()==13){
                   System.out.print(String.format("%d        %13s\t\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else
                    System.out.print(String.format("%d        %s\t\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
            }
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");    
        System.out.println(String.format("\t\t\t\t\t\t\t\t  Total Price: RM %6.2f\n",totalPrices));
            }

        else if(confirmChoice == 1){
        display = String.format("\n***************************************************************************************************************\nOrder No: %05d\nRestaurant: %s\n*********************************************************************************************************************\n",orderNo++,restName);
        System.out.println(display);
         System.out.println("No        Food Name\t\t         Price                  Unit            Subtotal");
 /*here*/         for(int g=0;g<restaurant1.size();g++ )
            {
                if(restaurant1.get(g).getName().length()==22){
                   System.out.print(String.format("%d        %22s\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else if(restaurant1.get(g).getName().length()==13){
                   System.out.print(String.format("%d        %13s\t\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
                }
                else
                    System.out.print(String.format("%d        %s\t\t\tRM %5.2f                 %d             RM %6.2f\n",restaurant1.get(g).getFoodNo(),restaurant1.get(g).getName(),restaurant1.get(g).getPrice(),restaurant1.get(g).getQuantity(),restaurant1.get(g).getSubtotal()));
            }
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");    
        System.out.println(String.format("\t\t\t\t\t\t\t\t  Total Price: RM %6.2f\n",totalPrices));
        }
        }while(result||confirmChoice==2);
        
        
    }
        }
        }while(ch=='y'||ch=='Y');
       
        
        
        
    
       
    }

       
        
        
    
    
   
    public  static char continues(){
        boolean result = true;
        Scanner s = new Scanner(System.in);
        char choice;
        do{
            System.out.printf("Do you want to eat other food? Y/N to confirm order.\n");
            choice = s.next().charAt(0);
            if(choice =='Y'){
                result = false;
            }
            else if(choice == 'y'){
                 result = false;
            }
            else if(choice == 'N'){
                 result = false;
            }
            else if(choice == 'n'){
                 result = false;
            }
            else{
                 result = true;
            }
        }while(result);
        return choice;
       
    }
    
    public static int confirmOrder(){
        int choice=0;
        boolean result =true;
        Scanner s = new Scanner(System.in);
        do{
        System.out.println("Would you like to confirm your order?");
        System.out.println("Please enter your choice:");
        System.out.println("1. Confirm Order");
        System.out.println("2. Delete Order");
        try{
            choice = s.nextInt();
            if(choice!=0){
                
            result = false;
        }
        }catch(Exception ex){
            System.out.println("Please enter correctly.");
            System.out.println("");
            s.nextLine();
        }
        }while(result||choice<1||choice>2);
        
        
        
        
        return choice;
   }
    

}