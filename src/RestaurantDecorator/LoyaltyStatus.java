package RestaurantDecorator;

public class LoyaltyStatus {

    private Status status;

    public LoyaltyStatus(Status status) {
        this.status = status;
    }

    public double discount(double price) {
        if (status.equals(Status.BRONZE)) {
            return price * .9;
        } else if (status.equals(Status.SILVER)) {
            return price * .75;
        } else {
            return price * .5;
        }
    }
}
