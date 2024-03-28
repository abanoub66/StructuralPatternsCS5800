import RestaurantDecorator.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RestaurantTest {

    @Test
    public void testBurger() {
        Food burger = new Burger();
        Assertions.assertEquals(5, burger.getPrice());
        Assertions.assertEquals("Burger", burger.getName());
    }

    @Test
    public void testHotDog() {
        Food hotDog = new HotDog();
        Assertions.assertEquals(4, hotDog.getPrice());
        Assertions.assertEquals("Hot Dog", hotDog.getName());
    }

    @Test
    public void testFries() {
        Food fries = new Fries();
        Assertions.assertEquals(3, fries.getPrice());
        Assertions.assertEquals("Fries", fries.getName());
    }

    @Test
    public void testWithKetchup() {
        Food burgerWithKetchup = new Ketchup(new Burger());
        Assertions.assertEquals(5.5, burgerWithKetchup.getPrice());
        Assertions.assertEquals("Burger with Ketchup", burgerWithKetchup.getName());
        Food hotDogWithKetchup = new Ketchup(new HotDog());
        Assertions.assertEquals(4.5, hotDogWithKetchup.getPrice());
        Assertions.assertEquals("Hot Dog with Ketchup", hotDogWithKetchup.getName());
        Food friesWithKetchup = new Ketchup(new Fries());
        Assertions.assertEquals(3.5, friesWithKetchup.getPrice());
        Assertions.assertEquals("Fries with Ketchup", friesWithKetchup.getName());
    }

    @Test
    public void testWithMustard() {
        Food burgerWithMustard = new Mustard(new Burger());
        Assertions.assertEquals(5.4, burgerWithMustard.getPrice());
        Assertions.assertEquals("Burger with Mustard", burgerWithMustard.getName());
        Food hotDogWithMustard = new Mustard(new HotDog());
        Assertions.assertEquals(4.4, hotDogWithMustard.getPrice());
        Assertions.assertEquals("Hot Dog with Mustard", hotDogWithMustard.getName());
        Food friesWithMustard = new Mustard(new Fries());
        Assertions.assertEquals(3.4, friesWithMustard.getPrice());
        Assertions.assertEquals("Fries with Mustard", friesWithMustard.getName());
    }

    @Test
    public void testWithRelish() {
        Food burgerWithRelish = new Relish(new Burger());
        Assertions.assertEquals(5.6, burgerWithRelish.getPrice());
        Assertions.assertEquals("Burger with Relish", burgerWithRelish.getName());
        Food hotDogWithRelish = new Relish(new HotDog());
        Assertions.assertEquals(4.6, hotDogWithRelish.getPrice());
        Assertions.assertEquals("Hot Dog with Relish", hotDogWithRelish.getName());
        Food friesWithRelish = new Relish(new Fries());
        Assertions.assertEquals(3.6, friesWithRelish.getPrice());
        Assertions.assertEquals("Fries with Relish", friesWithRelish.getName());
    }

    @Test
    public void testWithCheese() {
        Food burgerWithCheese = new Cheese(new Burger());
        Assertions.assertEquals(6, burgerWithCheese.getPrice());
        Assertions.assertEquals("Burger with Cheese", burgerWithCheese.getName());
        Food hotDogWithCheese = new Cheese(new HotDog());
        Assertions.assertEquals(5, hotDogWithCheese.getPrice());
        Assertions.assertEquals("Hot Dog with Cheese", hotDogWithCheese.getName());
        Food friesWithCheese = new Cheese(new Fries());
        Assertions.assertEquals(4, friesWithCheese.getPrice());
        Assertions.assertEquals("Fries with Cheese", friesWithCheese.getName());
    }

    @Test
    public void testWithGuacamole() {
        Food burgerWithGuacamole = new Guacamole(new Burger());
        Assertions.assertEquals(105, burgerWithGuacamole.getPrice());
        Assertions.assertEquals("Burger with Guacamole", burgerWithGuacamole.getName());
        Food hotDogWithGuacamole = new Guacamole(new HotDog());
        Assertions.assertEquals(104, hotDogWithGuacamole.getPrice());
        Assertions.assertEquals("Hot Dog with Guacamole", hotDogWithGuacamole.getName());
        Food friesWithGuacamole = new Guacamole(new Fries());
        Assertions.assertEquals(103, friesWithGuacamole.getPrice());
        Assertions.assertEquals("Fries with Guacamole", friesWithGuacamole.getName());
    }

    @Test
    public void testBurgerWithAllToppings() {
        Food burgerWithAll = new Guacamole(new Cheese(new Relish(new Mustard(new Ketchup(new Burger())))));
        Assertions.assertEquals(107.5, burgerWithAll.getPrice());
        Assertions.assertEquals("Burger with Ketchup with Mustard with Relish with Cheese with Guacamole"
                , burgerWithAll.getName());
    }

    @Test
    public void testHotDogWithAllToppings() {
        Food hotDogWithAll = new Guacamole(new Cheese(new Relish(new Mustard(new Ketchup(new HotDog())))));
        Assertions.assertEquals(106.5, hotDogWithAll.getPrice());
        Assertions.assertEquals("Hot Dog with Ketchup with Mustard with Relish with Cheese with Guacamole"
                , hotDogWithAll.getName());
    }

    @Test
    public void testFriesWithAllToppings() {
        Food friesWithAll = new Guacamole(new Cheese(new Relish(new Mustard(new Ketchup(new Fries())))));
        Assertions.assertEquals(105.5, friesWithAll.getPrice());
        Assertions.assertEquals("Fries with Ketchup with Mustard with Relish with Cheese with Guacamole"
                , friesWithAll.getName());
    }

    @Test
    public void testOrderWithBurgerAndFries() {
        Food burger = new Burger();
        Food fries = new Fries();
        Order order = new Order();
        order.addToOrder(burger);
        order.addToOrder(fries);
        Assertions.assertEquals(8, order.getPrice());
        Assertions.assertEquals("Burger and Fries", order.toString());
    }

    @Test
    public void testOrderWithBurgerWithKetchupWithMustardAndFriesWithRelish() {
        Food burgerWithKetchupAndMustard = new Mustard(new Ketchup(new Burger()));
        Food friesWithRelish = new Relish(new Fries());
        Order order = new Order();
        order.addToOrder(burgerWithKetchupAndMustard);
        order.addToOrder(friesWithRelish);
        Assertions.assertEquals(9.5, order.getPrice());
        Assertions.assertEquals("Burger with Ketchup with Mustard and Fries with Relish", order.toString());
    }

    @Test
    public void testOrderWithBurgerAndFriesWithLoyaltyStatusBronze() {
        Food burger = new Burger();
        Food fries = new Fries();
        Order order = new Order();
        order.addToOrder(burger);
        order.addToOrder(fries);
        LoyaltyStatus status = new LoyaltyStatus(Status.BRONZE);
        Assertions.assertEquals(7.2, status.discount(order.getPrice()));
    }

    @Test
    public void testOrderWithBurgerAndFriesWithLoyaltyStatusSilver() {
        Food burger = new Burger();
        Food fries = new Fries();
        Order order = new Order();
        order.addToOrder(burger);
        order.addToOrder(fries);
        LoyaltyStatus status = new LoyaltyStatus(Status.SILVER);
        Assertions.assertEquals(6, status.discount(order.getPrice()));
    }

    @Test
    public void testOrderWithBurgerAndFriesWithLoyaltyStatusGold() {
        Food burger = new Burger();
        Food fries = new Fries();
        Order order = new Order();
        order.addToOrder(burger);
        order.addToOrder(fries);
        LoyaltyStatus status = new LoyaltyStatus(Status.GOLD);
        Assertions.assertEquals(4, status.discount(order.getPrice()));
    }
}
