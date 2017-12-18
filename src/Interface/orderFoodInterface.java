
package Interface;

import Objects.Food;
import java.util.ArrayList;

public interface orderFoodInterface {
    
    public int displayRestaurant();
    public void displayFood(int selection,ArrayList<Food> f,ArrayList<Food> f1,ArrayList<Food> f2);
    public int orderFoods();
    public int enterQuantity();
    public ArrayList<Food> insertFoodToArrayList();
    public ArrayList<Food> insertFoodToArrayList1();
    public ArrayList<Food> insertFoodToArrayList2();

    public double calculateTotal(int quantity, double price);

    

    
}
