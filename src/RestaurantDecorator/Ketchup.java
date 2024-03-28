package RestaurantDecorator;

public class Ketchup extends Topping {


    public Ketchup(Food food) {
        super(food);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + .5;
    }

    @Override
    public String getName() {
        return super.getName() + " with Ketchup";
    }
}
