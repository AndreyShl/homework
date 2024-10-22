package pract1.OOP;

public class Student extends Man {
    private int yearStudy;

    public Student(int yearStudy) {
        this.yearStudy = yearStudy;
    }

    public void setYearStudy(int yearStudy) {
        this.yearStudy = yearStudy;
    }


    public String toStringStudent() {
        return "Student{ " + toStringMan() +
                "yearStudy=" + yearStudy +
                '}';
    }
}
