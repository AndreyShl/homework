package pract1.OOP;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Man man = new Man();
//        System.out.println();
        Student student = new Student(2);
        student.setYearStudy(3);
        String studentString = student.toStringStudent();
        System.out.println(studentString);

    }

}
