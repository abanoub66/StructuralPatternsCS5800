package RestaurantDecorator;

public class Relish extends Topping {


    public Relish(Food food) {
        super(food);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + .6;
    }

    @Override
    public String getName() {
        return super.getName() + " with Relish";
    }
}
