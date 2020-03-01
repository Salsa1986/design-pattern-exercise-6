package product.strategy;

public class EasterDiscountStrategyStrategy implements DiscountStrategy {
    @Override
    public double discount(double cost) {
        double discountCost = 0.10 * cost;
        return discountCost;
    }
}
