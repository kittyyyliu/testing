// Sze Ka Yi 20065571D

public class UniversityStudent {
    private String studentName;
    private int courseNumber;
    private Course [] courseList;

    public UniversityStudent() {    
    }
    
    public UniversityStudent(String name, int noCourse, Course [] list) {
        studentName = name;
        courseNumber = noCourse;
        courseList = list;
    }

    public void print() {
        System.out.println("Student Name: "+studentName);
        for (int i=0;i<courseNumber;i++) {
            System.out.println(courseList[i].toString());
        }
    }
}
