package by.it_academy.practice.practice3;

import java.util.Scanner;

public class ExampleFingerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter finger number: ");
        int fingerNumber = sc.nextInt();
//        switch (fingerNumber) {
//            case 1:
//                System.out.println(fingerNumber + " is Thumb ");
//                break;
//            case 2:
//                System.out.println(fingerNumber + " is Index ");
//                break;
//            case 3:
//                System.out.println(fingerNumber + " is Middle");
//                break;
//            case 4:
//                System.out.println(fingerNumber + " is Ring");
//                break;
//            case 5:
//                System.out.println(fingerNumber + " is Pinky");
//                break;
//            default:
//                System.out.println("Invalid finger number");
//        }
        String fingerName = switch (fingerNumber) {
            case 1 -> "Thumb";
            case 2 -> "Index";
            case 3 -> "Middle";
            case 4 -> "Ring";
            case 5 -> "Pinky";
            default -> "Invalid finger number";
        };
        System.out.println(fingerNumber + " is " + fingerName);
    }
}
