package Objects;

public class CustomerOB {
    private String CusID;
    private String Name;
    private String Password;
    private String OrderID;
    private String Status;
    private String OrderDate;
    
    public CustomerOB(String cusID, String name, String password, String orderID, String status, String orderDate){
        this.CusID = cusID;
        this.Name = name;
        this.Password = password;
        this.OrderID = orderID;
        this.Status = status;
        this.OrderDate = orderDate;
    }
    public String getCusID(){
        return CusID;
    }
    public String getName(){
        return Name;
    }
    public String getPassword(){
        return Password;
    }
    public String getOrderID(){
        return OrderID;
    }
    public String getStatus(){
        return Status;
    }
    public String getOrderDate(){
        return OrderDate;
    }
}
