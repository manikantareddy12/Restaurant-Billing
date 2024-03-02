import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Order{

    void orderFoodItems() {
        ArrayList<Restaurant> orderedItems = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        //Fixed Menu
        Restaurant[] menu = {
                new FoodItems("Dosa", 20),
                new FoodItems("Idly", 15),
                new FoodItems("Chapathi", 30),
                new FoodItems("Rice", 50),
                new FoodItems("Biryani", 100)
        };
        System.out.println("Welcome to 'Java' Restaurant\nPlease enter your name:");
        String name = scan.next();
        System.out.println("\nPlease order from the Menu: ");

        int orderNumber = 0;
        while(true){
            for(int i=0; i<menu.length; i++){
                System.out.println((i+1 + ". " + menu[i].getName() + " - Rs" + menu[i].getPrice()));
            }
            System.out.println((menu.length+1) + ". Done with Order");

            System.out.println("Enter Your Choice (1-" + (menu.length+1) + "):");

            int choice = scan.nextInt();
            if(choice == menu.length+1){
                orderNumber+=1;
                break;
            }
            if(choice>=1 && choice<=menu.length){
                System.out.println("Enter the quantity:");
                int quantity =scan.nextInt();
                for (int i=0; i<quantity;i++){
                    orderedItems.add(menu[choice-1]);
                }
                System.out.println(quantity + " Plates of " + menu[choice-1].getName() + " was added to your order.");
            }
            else System.out.println("Invalid choice. Please choose Again!");
            }
        //Calculate Billing
        RestaurantBilling restaurantBilling = new RestaurantBilling();
        double totalBill = restaurantBilling.calculateTotalBill(orderedItems);

        System.out.println("Your Order:");
        for (Restaurant items: orderedItems){
            System.out.println(items.getName() + " - Rs" + items.getPrice());
        }
        System.out.println("Total Bill Is: Rs"+ totalBill);
        Chef chef = new Chef();
        chef.cookFood(name, orderNumber);


    }


}
