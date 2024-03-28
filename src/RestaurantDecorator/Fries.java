package RestaurantDecorator;

public class Fries implements Food {

    @Override
    public double getPrice() {
        return 3;
    }

    @Override
    public String getName() {
        return "Fries";
    }
}
