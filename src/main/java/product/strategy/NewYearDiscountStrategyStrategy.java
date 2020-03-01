package product.strategy;

public class NewYearDiscountStrategyStrategy implements DiscountStrategy {
    @Override
    public double discount(double cost) {
        double discountCost = 0.2 * cost;
        return discountCost;
    }
}
