/*
 * 4. VIPBonusDiscountPolicy Class
 * This class applies a base percentage and 
 * an additional bonus if th amount exceeds a thresold.
 */
public class VIPBonusDiscountPolicy implements DiscountPolicy{
    private int basePercent; //ส่วนลดพื้นฐานที่ลูกค้า VIP ได้รับเสมอ
    private int bonusPercent; //ส่วนลดพิเศษที่จะได้รับเพิ่ม จาก basePercent
    //เงื่อนไขโดยยอดเงินที่จ่ายมากกว่า bonusThreshold เมื่อไหร่
    //ส่วนลดพิเศษ(bonusPercent) จะถูกนำมาบวกเพิ่มกับ basePercent
    private double bonusThreshold; 

    public VIPBonusDiscountPolicy(int basePercent,int bonusPercent,double bonusThreshold){
        if(basePercent < 0 || basePercent > 100){
            throw new IllegalArgumentException("Base percentage must be between 0 and 100.");
        }
        this.basePercent = basePercent;
        this.bonusPercent = bonusPercent;
        this.bonusThreshold = bonusThreshold;
    }

    @Override
    public double applyDiscount(double amount) {
        // TODO Auto-generated method stub
        if(amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative.");
        }

        int totalPercent = basePercent;
        if(amount > bonusThreshold){
            totalPercent += bonusPercent;
        }

        // Cap the total discount at 100% to prevent negative prices
        if(totalPercent > 100){
            totalPercent = 100;
        }

        return amount * (1 - totalPercent/100.0);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%d base + %d bonus over %.2f", basePercent,bonusPercent,bonusThreshold);
    }
}
