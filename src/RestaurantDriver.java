import RestaurantDecorator.*;

public class RestaurantDriver {

    public static void main(String[] args) {
        Food burgerWithKetchupAndMustard = new Mustard(new Ketchup(new Burger()));
        Food friesWithRelish = new Relish(new Fries());
        Order order = new Order();
        order.addToOrder(burgerWithKetchupAndMustard);
        order.addToOrder(friesWithRelish);
        LoyaltyStatus status = new LoyaltyStatus(Status.GOLD);
        System.out.println(order);
        System.out.println(status.discount(order.getPrice()));
    }
}
