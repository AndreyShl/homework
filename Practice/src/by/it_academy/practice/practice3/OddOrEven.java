package by.it_academy.practice.practice3;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if (isOdd(number)) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }
    private static boolean isOdd(int number) {
        return number % 2 == 0;
    }
}