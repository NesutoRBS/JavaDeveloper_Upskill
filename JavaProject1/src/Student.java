public class Student {
    private String name;
    private String address;
    private int numCourse = 0;
    // define array variable
    private String[] courses = new String[30];
    private int[] grades = new int[30];

    // Constructor
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // Setter
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name + "(" + getAddress() + ")";
    }

    public void addCourseGrade(String course, int grade) {
        if (numCourse < 30) {
            courses[numCourse] = course;
            grades[numCourse] = grade;
            numCourse++;
        } else {
            System.out.println("Cannot add more than 30 course");
        }
    }

    public void printGrades() {
        System.out.print(this.name + " ");
        for (int i = 0; i < numCourse; i++) {
            System.out.print(courses[i] + ":" + grades[i]);
            if (i < numCourse - 1)
                System.out.print(", ");
        }
        System.out.println();
    }

    public double getAverageGrade() {
        if (numCourse == 0)
            return 0.0;
        int sum = 0;
        for (int i = 0; i < numCourse; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourse;
    }
}
