public class FoodItems implements Restaurant{
    String Name;
    double Price;

    public FoodItems(String name, double price) {
        Name = name;
        Price = price;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public double getPrice() {
        return Price;
    }
}
