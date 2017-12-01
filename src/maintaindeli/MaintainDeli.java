
package maintaindeli;

import java.util.Scanner;
import deliInfo.DeliStaInfo;
import java.util.ArrayList;

public class MaintainDeli {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<DeliStaInfo> addDeli = new ArrayList<>();
        ArrayList<DeliStaInfo> updDeli = new ArrayList<>();
        ArrayList<DeliStaInfo> viewStat = new ArrayList<>();
        
          String choice = "";
            int selection = 0;
            
            DeliStaInfo statMan = new DeliStaInfo(); 
            statMan = new DeliStaInfo();
            
            int id = 1000;
            
    do{
      
        int idc;
        
        System.out.println("\n======================================");
        System.out.println("||  1. Add new Delivery Man         ||");
        System.out.println("||  2. Update Delivery Man Status   ||");
        System.out.println("||  3. Check Delivery Man Status    ||");
        System.out.println("======================================");
        System.out.println("Please choose which one you want to determine: ");
        selection = sc.nextInt();

        if(selection  == 1){
            
            statMan = new DeliStaInfo();
            
            String dname;
            String dIC;
            String dGender;
            String dContact;
            String dEmail;
            String dAddress;

            System.out.println("\n------------Add New Delivery Man Info------------\n");
            System.out.print("1. Name :");
            dname = sc.next();
            statMan.setDeliName(dname);
            
            System.out.print("2. IC No :");
            dIC = sc.next();
            statMan.setDeliIC(dIC);
            
            System.out.print("3. Gender :");
            dGender = sc.next();
            statMan.setGender(dGender);
            
            System.out.print("4. Contact No :");
            dContact = sc.next();
            statMan.setDeliContact(dContact);
            
            System.out.print("5. Email :");
            dEmail = sc.next();
            statMan.setEmail(dEmail);
            
            System.out.print("6. Address :");
            dAddress = sc.next();
            statMan.setAddress(dAddress);
            
            id++;
            
            statMan.setDeliID(id);
            statMan.setStatus("Working");
            addDeli.add(statMan);
            
            System.out.println("\n-----------------------------------------------------------------------------------------------");
            System.out.println("---------------------------------||New Delivery Man Added||-------------------------------------");
            System.out.println("|Name         |IC No            |Gender       |Contact No        |Email             |Address       ");
            
            for(int i=0; i<addDeli.size(); i++){
                        
             System.out.println(String.format("%8s     %13s     %6s       %13s     %20s   %13s",addDeli.get(i).getDeliName()
                                ,addDeli.get(i).getDeliIC(),addDeli.get(i).getGender(),addDeli.get(i).getDeliContact(),addDeli.get(i).getEmail()
                                ,addDeli.get(i).getAddress()));  
                
            }
            choice = continues();
        }
        
        else if(selection == 2){
            
            Scanner snip = new Scanner(System.in);
            String stat;

            System.out.println("\n-------------------------------------------------------------------------");
            System.out.println("Delivery Man ID           |Name               |Contact No         |Status");

            for(int i=0; i<addDeli.size(); i++){
                          
            System.out.println(String.format("%15d          %10s         %13s         %10s",addDeli.get(i).getDeliID(), addDeli.get(i).getDeliName(),addDeli.get(i).getDeliContact(),addDeli.get(i).getStatus()));
        
            }
    
            System.out.print("\nPlease insert Delivery Man's ID to update :");
            idc = snip.nextInt();
            
            for(int a=0; a<addDeli.size(); a++){
                
                if(idc == addDeli.get(a).getDeliID()){
                    
                    System.out.print("Update Status :");
                    stat = sc.next();                    
                    
                    if(stat.equals("Retired") || stat.equals("retired") || stat.equals("Resigned") || stat.equals("resigned")){                        
                       // System didnt run this statement here   
                        statMan.setStatus(stat);
                        System.out.println("You are successfully updated the delivery man to '"+ stat + "' status! Please note that Mr."
                                           + addDeli.get(a).getDeliName() +" is not longer in the company.");  
                    }
                    
                    else{
                        
                        System.out.println("\nPlease insert correct status for updating delivery man status! Thank You!"); 
                   }
                }
                
                else if(idc != addDeli.get(a).getDeliID()){
                    System.out.println("Please insert correct Delivery Man's ID!");
                }
                
            }

            choice = continues();
                
        }
        
        else if(selection == 3){
   
            int select = 0;
            // Add Status list
            System.out.println("\n====================================");
            System.out.println("1.||    Still in Working Status   ||");
            System.out.println("2.||       Retired Status         ||");
            System.out.println("3.||       Resigned Status        ||");
            System.out.println("4.||  Overall Delivery Man Status ||");
            System.out.println("====================================");
            System.out.println("Please select which status you want to check: ");
            select = sc.nextInt();
            
            if(select == 1){
                
                System.out.println("\n==================================================================================");
                System.out.println("||  Delivery Man ID         |Name            |Contact No          |Status       ||");
                
              for(int i=0; i<addDeli.size(); i++){
                
                if(addDeli.get(i).getStatus().equals("Working")){
                     System.out.println(String.format("%15d          %10s         %13s         %10s",addDeli.get(i).getDeliID(), addDeli.get(i).getDeliName()
                                        ,addDeli.get(i).getDeliContact(),addDeli.get(i).getStatus()));     
                }
              }
            }  
            else if(select == 2){
                
                System.out.println("\n==================================================================================");
                System.out.println("||  Delivery Man ID         |Name            |Contact No          |Status       ||");
                
               for(int i=0; i<addDeli.size(); i++){
                   
                    if(addDeli.get(i).getStatus().equals("Retired") || addDeli.get(i).getStatus().equals("retired") ){
                     System.out.println(String.format("%15d          %10s         %13s         %10s",addDeli.get(i).getDeliID(), addDeli.get(i).getDeliName()
                                        ,addDeli.get(i).getDeliContact(),addDeli.get(i).getStatus()));     
                } 
               }   
            }
            else if(select == 3){
                
                System.out.println("\n==================================================================================");
                System.out.println("||  Delivery Man ID         |Name            |Contact No          |Status       ||");
                
                for(int i=0; i<addDeli.size(); i++){
                    
                  if(addDeli.get(i).getStatus().equals("Resigned") || addDeli.get(i).getStatus().equals("resigned") ){
                     System.out.println(String.format("%15d          %10s         %13s         %10s",addDeli.get(i).getDeliID(), addDeli.get(i).getDeliName()
                                        ,addDeli.get(i).getDeliContact(),addDeli.get(i).getStatus()));     
                  } 
                }   
                
            }
            else if(select == 4){
                System.out.println("\n==================================================================================");
                System.out.println("||  Delivery Man ID         |Name            |Contact No          |Status       ||");
                
                for(int i=0; i<addDeli.size(); i++){
                    System.out.println(String.format("%15d          %10s         %13s         %10s",addDeli.get(i).getDeliID(), addDeli.get(i).getDeliName()
                                        ,addDeli.get(i).getDeliContact(),addDeli.get(i).getStatus()));  
                }
                
            }
            else{
                System.out.println("Please insert the correct choices for above selection!");
            }
            
            choice = continues();
        }
        
       }while(choice.equals("y") || choice.equals("Y"));
        
    }  
      
    public  static String continues(){
        System.out.printf("\nDo you want to continue?(Y/N)\n");
        Scanner s = new Scanner(System.in);
        String choice = s.next();
        
        return choice;
    }
    
}
