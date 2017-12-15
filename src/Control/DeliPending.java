package Control;

import Objects.DeliveryInfo;
import java.util.*;
 
public class DeliPending {
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        ArrayList<DeliveryInfo> myArray = new ArrayList<>();
        
        String time;
        int sum = 0;
        int g = 0;
        
        String[] DeliName = {"John","Lucifer","Anthony"};
        String[] Restau = {"James Foo Restaurant","Sushi Mentai","Blue Chef"};
        String[] deliF = {"Prestint 10,Penang","Straits Quay,Penang","Queens Bay,Penang"};
        String[] deliT = {"17,Macalister Road,Penang","21,Campbell Street,Penang","03,Tanjung Tokong,Penang"};
        String[] custName = {"Maggie","Daisy","Amber"};
        String[] timeOE = {"11:22:28PM","-------","11:26:17PM"};
        String[] status = {"Delivered","On Delivering","Delivered"};
        
        String[] DeliName2 = {"Alan","Tilda","Luffy"};
        String[] Restau2 = {"Canton-i Restaurant","Dragon-i Cuisine","Hokkaido Ramen"};
        String[] deliF2 = {"Prestint 10,Penang","Straits Quay,Penang","Queens Bay,Penang"};
        String[] deliT2 = {"17,Macalister Road,Penang","21,Campbell Street,Penang","03,Tanjung Tokong,Penang"};
        String[] custName2 = {"Darren","Wakanda","Sokovia"};
        String[] timeOE2 = {"12:19:28PM","12:32:17PM","-------"};
        String[] status2 = {"Delivered","Delivered","On Delivering"};
        
        DeliveryInfo d = new DeliveryInfo();
        d.setDeliName(DeliName[0]);
        d.setRestaurant(Restau[0]);
        d.setDeliFrom(deliF[0]);
        d.setDeliTo(deliT[0]);
        d.setCustName(custName[0]);
        d.setTimeEnd(timeOE[0]);
        d.setStatus(status[0]);
       
        DeliveryInfo d2 = new DeliveryInfo();
        d2.setDeliName(DeliName[1]);
        d2.setRestaurant(Restau[1]);
        d2.setDeliFrom(deliF[1]);
        d2.setDeliTo(deliT[1]);
        d2.setCustName(custName[1]);
        d2.setTimeEnd(timeOE[1]);
        d2.setStatus(status[1]);
        
        DeliveryInfo d3 = new DeliveryInfo();
        d3.setDeliName(DeliName[2]);
        d3.setRestaurant(Restau[2]);
        d3.setDeliFrom(deliF[2]);
        d3.setDeliTo(deliT[2]);
        d3.setCustName(custName[2]);
        d3.setTimeEnd(timeOE[2]);
        d3.setStatus(status[2]);
        
        myArray.add(d);
        myArray.add(d2);
        myArray.add(d3);
        
        DeliveryInfo e = new DeliveryInfo();
        e.setDeliName(DeliName2[0]);
        e.setRestaurant(Restau2[0]);
        e.setDeliFrom(deliF2[0]);
        e.setDeliTo(deliT2[0]);
        e.setCustName(custName2[0]);
        e.setTimeEnd(timeOE2[0]);
        e.setStatus(status2[0]);
        
        DeliveryInfo e2 = new DeliveryInfo();
        e2.setDeliName(DeliName2[1]);
        e2.setRestaurant(Restau2[1]);
        e2.setDeliFrom(deliF2[1]);
        e2.setDeliTo(deliT2[1]);
        e2.setCustName(custName2[1]);
        e2.setTimeEnd(timeOE2[1]);
        e2.setStatus(status2[1]);
        
        DeliveryInfo e3 = new DeliveryInfo();
        e3.setDeliName(DeliName2[2]);
        e3.setRestaurant(Restau2[2]);
        e3.setDeliFrom(deliF2[2]);
        e3.setDeliTo(deliT2[2]);
        e3.setCustName(custName2[2]);
        e3.setTimeEnd(timeOE2[2]);
        e3.setStatus(status2[2]);

        do{
        System.out.println("\nPlease insert the time to check delivery status: ");
        time = sc.nextLine();
        
             System.out.println("=================================================================================================================="
                                + "=================================="); 
            System.out.println("||Delivery Man   |Reataurant            |Deliver From           |Deliver To                  "
                                + "|Customer Name      |Time End        |Status         ||");
        
          if(time.equals("1130")|| time.equals("11.30") || time.equals("11.30am")){
            System.out.println("1." + d.getDeliName() + "            " + d.getRestaurant() +"   "+ d.getDeliFrom() + "      " 
                                + d.getDeliTo() +"    "+ d.getCustName() + "              " + d.getTimeEnd() + "       " 
                                + d.getStatus());
            System.out.println("2." + d2.getDeliName() + "         " + d2.getRestaurant() +"           "+ d2.getDeliFrom() + "     " 
                                + d2.getDeliTo() +"    "+ d2.getCustName() + "                " + d2.getTimeEnd() + "        " 
                                + d2.getStatus());
            System.out.println("2." + d3.getDeliName() + "         " + d3.getRestaurant() +"              "+ d3.getDeliFrom() + "       " 
                                + d3.getDeliTo() +"     "+ d3.getCustName() + "               " + d3.getTimeEnd() + "       " 
                                + d3.getStatus());
            
            
            
            for(int i=0; i<2; i++){

            if(d.getStatus()=="Delivered"){
                g++;
            }
             else if(d2.getStatus()=="Delivered"){
                        g++;
            }   
             else if(d3.getStatus()=="Delivered"){
                        g++;
            }   
          }    
            
            for(int a=0; a<1; a++){
                if(d.getStatus()=="On Delivering"){
                        sum++;
            }
             else if(d2.getStatus()=="On Delivering"){
                        sum++;
            }   
             else if(d3.getStatus()=="On Delivering"){
                        sum++;
            }  
            }
            
                 System.out.println("\nThe number of total delivered :" + g);
                 System.out.println("The number of total which still on delivering :" + sum);
     
            
            }  
            else if(time.equals("1200") || time.equals("12pm")){
              System.out.println("1." + e.getDeliName() + "            " + e.getRestaurant() +"    "+ e.getDeliFrom() + "      " 
                                  + e.getDeliTo() +"    "+ e.getCustName() + "              " + e.getTimeEnd() + "       " 
                                  + e.getStatus());
             System.out.println("2." + e2.getDeliName() + "           " + e2.getRestaurant() +"       "+ e2.getDeliFrom() + "     " 
                                  + e2.getDeliTo() +"    "+ e2.getCustName() + "             " + e2.getTimeEnd() + "       " 
                                  + e2.getStatus());  
             System.out.println("3." + e3.getDeliName() + "           " + e3.getRestaurant() +"         "+ e3.getDeliFrom() + "       " 
                                  + e3.getDeliTo() +"     "+ e3.getCustName() + "              " + e3.getTimeEnd() + "        " 
                                  + e3.getStatus());  
             
             for(int i=0; i<2; i++){

            if(d.getStatus()=="Delivered"){
                g++;
                
            }
             else if(d2.getStatus()=="Delivered"){
                        g++;
            }   
             else if(d3.getStatus()=="Delivered"){
                        g++;
            }   
          }    
            
            for(int a=0; a<1; a++){
                if(d.getStatus()=="On Delivering"){
                sum++;
                
            }
             else if(d2.getStatus()=="On Delivering"){
                        sum++;
            }   
             else if(d3.getStatus()=="On Delivering"){
                        sum++;
            }  
            }
             
             
             System.out.println("\nThe number of total delivered :" + g);
             System.out.println("The number of total which still on delivering :" + sum);
            }
                else{
                     System.out.println("================================================================================================="
                                        + "===================================================");
                     System.out.println("======================================================[Sorry no such time on delivery!]===================="
                                        + "=========================================\n");
                }
          
         }while(time.equals(time));

        System.exit(0);

        }
        
    }

    
    
    
   
