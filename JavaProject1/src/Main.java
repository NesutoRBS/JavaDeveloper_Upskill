// -----------------------------------------------------------------------------
// 7. Main Class with a main() method to demonstrate the code
// -----------------------------------------------------------------------------
public class Main {
    public static void main(String[] args) {
        // 1. Create different discount policy objects
        DiscountPolicy noDiscount = new NoDiscountPolicy();
        DiscountPolicy percentDiscount = new PercentageDiscountPolicy(15);
        DiscountPolicy vipDiscount = new VIPBonusDiscountPolicy(10, 5, 2000.0);
 
        // 2. Create customer objects with different discount policies
        Customer customer1 = new Customer(101, "Alice", noDiscount);
        Customer customer2 = new Customer(102, "Bob", percentDiscount);
        Customer customer3 = new Customer(103, "Charlie", vipDiscount);
 
        System.out.println("--- Customer Information ---");
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println();
 
        // 3. Create invoice objects for each customer
        System.out.println("--- Invoices Before Discounts ---");
        Invoice invoice1 = new Invoice(1, customer1, 500.0);
        Invoice invoice2 = new Invoice(2, customer2, 500.0);
        Invoice invoice3 = new Invoice(3, customer3, 1500.0); // Below VIP threshold
        Invoice invoice4 = new Invoice(4, customer3, 2500.0); // Above VIP threshold
       
        System.out.println("Invoice 1 (Alice): Original Amount = " + String.format("%.2f", invoice1.getAmount()));
        System.out.println("Invoice 2 (Bob):   Original Amount = " + String.format("%.2f", invoice2.getAmount()));
        System.out.println("Invoice 3 (Charlie): Original Amount = " + String.format("%.2f", invoice3.getAmount()));
        System.out.println("Invoice 4 (Charlie): Original Amount = " + String.format("%.2f", invoice4.getAmount()));
        System.out.println();
 
        // 4. Demonstrate polymorphism by calculating and printing final amounts
        System.out.println("--- Final Invoice Amounts (After Discount) ---");
        System.out.println("Invoice 1 (Alice): " + String.format("%.2f", invoice1.getAmountAfterDiscount())); // Expected: 500.00
        System.out.println("Invoice 2 (Bob):   " + String.format("%.2f", invoice2.getAmountAfterDiscount()));   // Expected: 500 * (1 - 0.15) = 425.00
        System.out.println("Invoice 3 (Charlie): " + String.format("%.2f", invoice3.getAmountAfterDiscount())); // Expected: 1500 * (1 - 0.10) = 1350.00 (below threshold)
        System.out.println("Invoice 4 (Charlie): " + String.format("%.2f", invoice4.getAmountAfterDiscount())); // Expected: 2500 * (1 - 0.15) = 2125.00 (above threshold)
        System.out.println();
       
        // 5. Demonstrate the toString() method of the Invoice class
        System.out.println("--- Full Invoice Details ---");
        System.out.println(invoice1);
        System.out.println(invoice2);
        System.out.println(invoice3);
        System.out.println(invoice4);
    }
}