package by.it_academy.practice.practice3;

import java.util.Scanner;

public class UpNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3-digit number");
        int number = sc.nextInt();
        int firstDigit = number / 100;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = number % 10;
        if ((firstDigit < secondDigit && firstDigit < thirdDigit) && (secondDigit < thirdDigit)) {
            System.out.println("Number is up");
        } else {
            System.out.println("Number is not up");
        }
    }
}