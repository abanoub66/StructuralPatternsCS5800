package RestaurantDecorator;

public class HotDog implements Food {

    @Override
    public double getPrice() {
        return 4;
    }

    @Override
    public String getName() {
        return "Hot Dog";
    }
}
