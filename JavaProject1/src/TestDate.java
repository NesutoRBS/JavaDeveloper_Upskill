public class TestDate {
    public static void main(String[] args) {
        //Create Object d1 to call method in Class Date
        Date d1 = new Date(2025, 8, 8);
        //System.out.println(d1.toString());
        System.out.println(d1); //call toString Method

        d1.setYear(2024);
        d1.setMonth(12);
        d1.setDay(23);
        System.out.println("Year is: " + d1.getYear());
        System.out.println("Month is: " + d1.getMonth());
        System.out.println("Day is: " + d1.getDay());

        d1.setDate(2020, 1, 2);
        System.out.println(d1); //call toString Method
    }
}
