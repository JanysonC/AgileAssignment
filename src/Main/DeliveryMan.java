package Main;

public class DeliveryMan {
    private String Name;
    private String ID;
    private String Gender;
    private String Status;
    private String ClockIn;
    private String ClockOut;
    
    public DeliveryMan(){}
    
    public DeliveryMan(String name, String id, String gender, String status, String clockIn, String clockOut){
        this.Name = name;
        this.ID = id;
        this.Gender = gender;
        this.Status = status;
        this.ClockIn = clockIn;
        this.ClockOut = clockOut;
    }
    
    public String getName(){
        return Name;
    }
    public String getID(){
        return ID;
    }
    public String getGender(){
        return Gender;
    }
    public void setStatus(String status){
	this.Status = status;
    }
    public String getStatus(){
        return Status;
    }
    public void setClockIn(String clockIn){
	this.ClockIn = clockIn;
    }
    public String getClockIn(){
        return ClockIn;
    }
    public void setClockOut(String clockOut){
	this.ClockOut = clockOut;
    }
    public String getClockOut(){
        return ClockOut;
    }
}
