/**
 * A test class to demonstrate the functionality of the refactored Student
 * class.
 */
class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Ratchawin Jaidee", "Pattanakarn 37");
        System.out.println(s1);

        s1.addCourseGrade("Math", 90);
        s1.addCourseGrade("English", 85);
        s1.addCourseGrade("History", 78);
        s1.addCourseGrade("Physics", 92);

        s1.printGrades();

        System.out.printf("Average Grade: %.2f\n", s1.getAverageGrade());

        StudentList s2 = new StudentList("Techin", "Pattanakarn 38");

        s2.addCourseGrade("Math", 65);
        s2.addCourseGrade("English", 90);
        s2.addCourseGrade("History", 25);

        s2.printGrades();

        System.out.printf("Average Grade: %.2f\n", s2.getAverageGrade());
    }
}