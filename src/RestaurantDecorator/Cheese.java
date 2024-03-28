package RestaurantDecorator;

public class Cheese extends Topping {

    public Cheese(Food food) {
        super(food);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1;
    }

    @Override
    public String getName() {
        return super.getName() + " with Cheese";
    }
}
