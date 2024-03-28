package RestaurantDecorator;

public class Guacamole extends Topping {

    public Guacamole(Food food) {
        super(food);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 100;
    }

    @Override
    public String getName() {
        return super.getName() + " with Guacamole";
    }
}
