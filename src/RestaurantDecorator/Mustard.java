package RestaurantDecorator;

public class Mustard extends Topping {


    public Mustard(Food food) {
        super(food);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + .4;
    }

    @Override
    public String getName() {
        return super.getName() + " with Mustard";
    }
}
