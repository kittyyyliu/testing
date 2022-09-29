// Sze Ka Yi 20065571D

public class Course {
    private String courseName;
    private int testMarks;

    public Course() {
    }

    public Course(String name,int mark) {
        courseName = name;
        testMarks = mark;
    }

    public String toString() {
        return courseName+", "+testMarks;
    }
}
