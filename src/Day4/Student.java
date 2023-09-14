package Day4;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private String studentID;
    private List<Double> grades;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void addGrade(double grade){
        if(grades==null){
            grades= new ArrayList<>();
        }
        grades.add(grade);
    }

    public List<Double> getGrades() {
        return grades;
    }
}
