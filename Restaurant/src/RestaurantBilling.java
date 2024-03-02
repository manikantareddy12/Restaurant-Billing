import java.util.ArrayList;

public class RestaurantBilling implements Billing{

    @Override
    public double calculateTotalBill(ArrayList<Restaurant> items) {
        double totalBill = 0;
        for(Restaurant item: items){
            totalBill+=item.getPrice();
        }
        return totalBill;
    }
}
