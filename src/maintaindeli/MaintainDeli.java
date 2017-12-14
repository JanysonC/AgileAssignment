package maintaindeli;

import java.util.Scanner;
import deliInfo.DeliStaInfo;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaintainDeli {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<DeliStaInfo> addDeli = new ArrayList<>();
        ArrayList<DeliStaInfo> updDeli = new ArrayList<>();
        ArrayList<DeliStaInfo> viewStat = new ArrayList<>();
        
          String choice = "";
          String ch = "";
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
            String dIC ;
            String dGender;
            String dContact;
            String dEmail;
            String dAddress;
            
            System.out.println("\n=================================================");
            System.out.println("------------Add New Delivery Man Info------------\n");
            
        do{  
            do{
              System.out.print("1. Name :");
              dname = sc.next();
              if(isAlpha(dname)){
                 statMan.setDeliName(dname);   
              }
              else{
                  System.out.print("Invalid input of the name. Please enter again, Thank You\n");
              }
            }while(!isAlpha(dname));

            do{
                System.out.print("2. IC No :");
                dIC = sc.next();
                statMan.setDeliIC(dIC);
                    
                if (!validateIC(dIC)) {  
                  System.out.println("Invalid for IC number please insert again,Thank You!\n");                     
                }                   
            }while(!validateIC(dIC));
            
            do{
                System.out.print("3. Gender (M/F) :"); //check if only 'Male' and 'Female' is allowed
                dGender = sc.next();
                
                if(checkGender(dGender)){
                  statMan.setGender(dGender);
                }else{
                  System.out.println("Invalid for Gender. Enter only F/f or M/m. Thank You!");
                }
                
            }while(!checkGender(dGender));

            do{
               System.out.print("4. Contact No :");
               dContact = sc.next();
               
               if(CheckNum(dContact)){
                 statMan.setDeliContact(dContact);
               }
               else{
                   System.out.println("Invalid insert of contact number.Please enter again,Thank You!");
               }
            }while(!CheckNum(dContact));
              
            do{
                System.out.print("5. Email :");
                dEmail = sc.next();
                if(validate(dEmail)){
                    statMan.setEmail(dEmail);
                }
                else{
                    System.out.println("Invalid for E-mail enter. Please enter correct email. Thank You!");
                }    
            }while(!validate(dEmail));  
                      
            System.out.print("6. Address :");
            dAddress = sc.next();
            statMan.setAddress(dAddress);
                        
            }while(ch.equals('y')||ch.equals('Y'));
            
            id++;        
            statMan.setDeliID(id);
            statMan.setStatus("Working");
            addDeli.add(statMan);
            
            System.out.println("\n-------------------------------------------------------------------------------------------------------");
            System.out.println("---------------------------------||New Delivery Man Added||--------------------------------------------");
            System.out.println("|Name          |IC No            |Gender       |Contact No          |Email                |Address       ");
            
            for(int i=0; i<addDeli.size(); i++){            
             System.out.println(String.format("%8s     %13s     %6s       %13s     %21s      %8s",addDeli.get(i).getDeliName()
                                ,addDeli.get(i).getDeliIC(),addDeli.get(i).getGender(),addDeli.get(i).getDeliContact(),addDeli.get(i).getEmail()
                                ,addDeli.get(i).getAddress()));  
                
            }
            choice = continues();
        }
        
        else if(selection == 2){
            
            Scanner snip = new Scanner(System.in);
            String stat;

            System.out.println("\n------------------------------------------------------------------------------");
            System.out.println("Delivery Man ID         |Name               |Contact No         |Status   ");

            for(int i=0; i<addDeli.size(); i++){
                          
            System.out.println(String.format("R%d          %15s       %18s       %10s", addDeli.get(i).getDeliID(), addDeli.get(i).getDeliName(),addDeli.get(i).getDeliContact(),addDeli.get(i).getStatus()));
        
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
    
     public static boolean isAlpha(String aString){
         int charCount=0;
         String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         
         if(aString.length() == 0) 
             return false;//zero length string ain't alpha
         
         for(int i=0;i<aString.length();i++){
              for(int j=0;j<alphabet.length();j++){
                 if(aString.substring(i,i+1).equals(alphabet.substring(j,j+1))
                     || aString.substring(i,i+1).equals(alphabet.substring(j,j+1).toLowerCase()))
                        charCount++;
              }
                if(charCount != (i+1)){
                     return false;
                }
        }
          return true;
    }

    public static boolean validateIC(String str){
         if(CheckNum(str) && CheckIClength(str))
             return true;
         else
             return false;
    }
    
    public static boolean CheckNum(String str) {
        for (int i = 0; i < str.length(); i++) {
         if (!Character.isDigit(str.charAt(i)))
            return false;
        }
        return true;
  }
  
    public static boolean CheckIClength(String str){
      
      if(str.length() > 12 || str.length() < 12)
        return false;
      else
          return true;
    }
  
    public static boolean checkGender(String inp){
      
      if(inp.length() == 1 ){
       
          switch(inp.charAt(0)){
              case 'F':
              case 'f':
              case 'M':
              case 'm':
                  return true;
              default:
                  return false;   
          }
      }
      else
          return false;
    }
  
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
        Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }
  
}
