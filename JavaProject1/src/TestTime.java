
public class TestTime {
    public static void main(String[] args) {
        // Test constructor and toString()
        Time t1 = new Time(59, 59, 23);
        System.out.println("Starting time: " + t1); // 23:59:59
        // Test nextSecond()
        t1.nextSecond();
        System.out.println("After adding 1 second: " + t1); // 00:00:00
        // Test method chaining
        t1.nextSecond().nextSecond().nextSecond();
        System.out.println("After adding 3 more seconds (with chaining): " + t1);
        // Test setters and getters
        t1.setHour(12);
        t1.setMinute(34);
        t1.setSecond(56);
        System.out.println("New time set via setters: " + t1); // 12:34:56
        System.out.println("Hour is: " + t1.getHour());
        System.out.println("Minute is: " + t1.getMinute());
        System.out.println("Second is: " + t1.getSecond());
        // Test setTime()
        t1.setTime(3, 2, 1);
        System.out.println("New time set with setTime(): " + t1); // 01:02:03
        // --- Demonstrate invalid input handling ---
        System.out.println("\n--- Testing invalid input handling ---");
        try {
            t1.setHour(25); // Invalid hour
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " +
                    e.getMessage());
        }
        try {
            // Invalid minute in constructor
            Time invalidTime = new Time(10, 65, 0); 
            
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " +
                    e.getMessage());
        }
    }
}