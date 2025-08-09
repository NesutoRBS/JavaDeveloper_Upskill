/*
 * 5.Customer Class
 * It has a "has-a" relationship with DiscountPolicy.
 * This Class represents a customerwith an ID, name and a DiscountPolicy.
 */
public class Customer {
    private final int id; // ป้องกันการทำงานใน Attribute นี้ให้ปลอดภัยยิ่งขึ้น
    private String name;
    private DiscountPolicy discountPolicy;
    /*
     * Constructor for create Customer object
     * 
     * @param id ไม่เป็นค่าติดลบ
     * 
     * @param name ไม่เป็นค่าว่าง
     * 
     * @param discount ส่วนลด(%) ต้องอยู่ระหว่าง 0-100
     * 
     * @throws IllegalArgumentException หาก @param ไม่ถูกต้อง
     */

    public Customer(int id, String name, DiscountPolicy discountPolicy) {
        if (id < 0) {
            throw new IllegalArgumentException("Customer ID must be non-negative.");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Customer Name must not be null or blank.");
        }
        if (discountPolicy == null) {
            throw new IllegalArgumentException("Customer must have a discount policy");
        }

        this.id = id;
        this.name = name;
        this.discountPolicy = discountPolicy;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public DiscountPolicy getDiscountPolicy() {
        return discountPolicy;
    }

    public void setDiscountPolicy(DiscountPolicy policy) {
        if (policy == null) {
            throw new IllegalArgumentException("Customer must have a discount policy");
        }
        this.discountPolicy = policy;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Customer{ id : " + id +", name: " + name +" ,DiscountPolicy : " + discountPolicy +" }";
    }
}
