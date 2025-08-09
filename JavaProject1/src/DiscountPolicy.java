/*
 * 1.DiscountPolicy Interface
 */
public interface DiscountPolicy {
    /*
     * @param amount The original amount
     * 
     * @return the amout after the discount is applied
     */
    double applyDiscount(double amount);
}
