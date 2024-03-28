package RestaurantDecorator;

import java.util.LinkedList;
import java.util.List;

public class Order {

    List<Food> order;

    public Order() {
        this.order = new LinkedList<>();
    }

    public void addToOrder(Food food) {
        order.add(food);
    }

    public double getPrice() {
        double sum = 0;
        for (Food food : order) {
            sum += food.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Food food : order) {
            stringBuilder.append(food.getName()).append(" and ");
        }
        return stringBuilder.substring(0, stringBuilder.length() - 5);
    }
}
