package Objects;

public class OrderOB {
    private String CusID;
    private String OrderID;
    private String FoodID;
    private String Destination;
    
    public OrderOB(){ }
    
    public OrderOB(String cusID, String orderID, String foodID, String destination){
        this.CusID = cusID;
        this.FoodID = foodID;
        this.OrderID = orderID;
        this.Destination = destination;
    }
    
    public String getCusID(){
        return CusID;
    }
    public String getOrderID(){
        return OrderID;
    }
    public String getFoodID(){
        return FoodID;
    }
    public String getDestination(){
        return Destination;
    }
}
