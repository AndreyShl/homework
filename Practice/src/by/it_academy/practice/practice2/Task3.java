package by.it_academy.practice.practice2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = sc.nextLine();
        System.out.println("Введите фамилию");
        String lastName = sc.nextLine();
        System.out.println("Имя и фамилия: " + name + " " + lastName);
    }
}
