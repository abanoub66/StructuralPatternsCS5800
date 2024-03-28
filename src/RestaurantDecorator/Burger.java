package RestaurantDecorator;

public class Burger implements Food {

    @Override
    public double getPrice() {
        return 5;
    }

    @Override
    public String getName() {
        return "Burger";
    }
}
