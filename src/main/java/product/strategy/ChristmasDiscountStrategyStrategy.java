package product.strategy;

public class ChristmasDiscountStrategyStrategy implements DiscountStrategy {
    @Override
    public double discount(double cost) {
        double discountCost = 0.15 * cost;
        return discountCost;
    }
}
