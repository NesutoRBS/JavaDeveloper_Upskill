/*
 * 3.NoDiscountPolicy
 */
public class NoDiscountPolicy implements DiscountPolicy{
    @Override
    public double applyDiscount(double amount) {
        // TODO Auto-generated method stub
        if(amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        return amount;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "No Discount";
    }
}
