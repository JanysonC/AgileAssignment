package Objects;

public class Item {

    public String name;
    public String price;
    public String halal;
    public String desp;
    public String status;
    public String dec;
    
    public Item(String name, String price, String halal, String desp, String status) {
        this.name = name;
        this.price = price;
        this.halal = halal;
        this.desp = desp;
       this.status = status;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(String Price) {
        this.price = Price;
    }

    public String getPrice() {
        return price;
    }

    public void setHalal(String Halal) {
        this.halal = Halal;
    }

    public String getHalal() {
        return halal;
    }

    public void setDESP(String DESP) {
        this.desp = DESP;
    }

    public String getDESP() {
        return desp;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
   

    public String toString() {
        return "Dish Name = " + this.name + ", Price = " + this.price + ", Halal =" + this.halal + ", Description =" + this.desp+",Status="+this.status;
    }
}
