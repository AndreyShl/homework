package by.it_academy.practice.practice3;

import java.util.Scanner;

public class ExampleGoodCode {
    public static void main(String[] args) {
        int number = getNumber();

        int thirdDigit = getThirdDigit(number);

        System.out.println("Third digit of " + thirdDigit + " is " + thirdDigit);

//        int n1 = getNumber();
//        System.out.println("Entered number is: " + n1);
//        int n2 = getNumber();
//        System.out.println("Entered number is: " + n2);
//        int n3 = getNumber();
//        System.out.println("Entered number is: " + n3);
        printString("Hello!");


    }

    private static int getThirdDigit(int number) {
        String numberString = String.valueOf(number);
        String thirdDigitStr = numberString.substring(2,3);
        int thirdDigit = Integer.parseInt(thirdDigitStr);
        return thirdDigit;
    }


    private static int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int number = sc.nextInt();
        return number;
    }

    private static void printString(String string) {
        System.out.println("String: " + string);
        System.out.println("String one more time: " + string);
    }

}
