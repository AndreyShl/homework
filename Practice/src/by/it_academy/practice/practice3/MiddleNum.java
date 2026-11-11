package by.it_academy.practice.practice3;

import java.util.Scanner;

public class MiddleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int number1 = sc.nextInt();
        System.out.println("Enter the number2");
        int number2 = sc.nextInt();
        System.out.println("Enter the number3");
        int number3 = sc.nextInt();
        if ((number3 > number1 && number3 < number2) || (number3 < number1 && number3 > number2)) {
            System.out.println("middle num = " + number3);
        } else if ((number2 > number3 && number2 < number1) || (number2 < number3 && number2 > number1)) {
            System.out.println("middle num = " + number2);
        } else if ((number1 > number2 && number1 < number3) || (number1 < number2 && number1 > number3)) {
            System.out.println("middle num = " + number1);
        } else {
            System.out.println("cant find middle num");
        }


    }
}