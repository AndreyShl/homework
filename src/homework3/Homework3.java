package homework3;

import java.util.Scanner;

//    Напишите класс, который принимает с клавиатуры целое положительное трехзначное число
//    и выводит его на экран в «полном виде»: например, для числа 364 это будет выглядеть как 300+60+4.
public class Homework3 {
    private static int number;

    public static void main(String[] args) {
        System.out.println("The first task");

        int number = getNumber(), firstNum = number / 100, secondNum = (number / 10) % 10, thirdNum = number % 10;

        if (thirdDigitNumOrNot(number)) {
            System.out.println("This digit in full view: " + (firstNum * 100) + "+" + (secondNum * 10) + "+" + thirdNum);
        } else {
            System.out.println("ERROR,Please write 3 digit number");
        }
//        Назовем «степенью четности» числа количество четных цифр в нем.
//        Например, для числа 4612 степень четности равна 3 (в его составе три четных цифры - 4, 6 и 2).
//        Напишите класс, который принимает с клавиатуры положительное трехзначное число, а затем
//        вычисляет и выводит на экран его «степень четности».
        System.out.println("The second task");
        int Num = getNumber();
        int firstNumEven = (Num / 100) ;
        int secondNumEven = ((Num / 10) % 10) ;
        int thirdNumEven = (Num % 10) ;
        int degreePar = 0;
        if (isOdd(firstNumEven)) {
            degreePar++;
            if (isOdd(secondNumEven)) {
                degreePar++;
                if (isOdd(thirdNumEven)) {
                    degreePar++;
                }
            }

        } else if (isOdd(secondNumEven)) {
            degreePar++;
            if (isOdd(thirdNumEven)) {
                degreePar++;
            }
        } else if (isOdd(thirdNumEven)) {
            degreePar++;
        } else System.out.println("degreePar is:" + degreePar);
        System.out.println("degreePar is:"+degreePar);


//        Трехзначное число называется «симметричным», если первая и последняя его цифры одинаковы.
//                Напишите класс, который принимает с клавиатуры трехзначное положительное число и
//        проверяет, является ли оно «симметричным». В соответствии с результатом проверки надо вывести
//        на экран соответствующее текстовое сообщение.
        System.out.println("The Third task");
        int simmNum = getNumber();
        int firstNumSim = simmNum / 100;
        int thirdNumSim = simmNum % 10;
        if (firstNumSim == thirdNumSim) {
            System.out.println("This digit is symmetrical");
        } else if (checkСorrectNum(simmNum)) {
            System.out.println("ERROR,Please write 3 digit number");
        } else {
            System.out.println("this digit is not symmetrical");
        }
//        Напишите класс, который принимает с клавиатуры три положительных числа и проверяет,
//        могут ли они являться длинами сторон треугольника. По результатам проверки следует
//        вывести на экран соответствующее текстовое сообщение.
        System.out.println("The fourth task");
        Scanner triangle = new Scanner(System.in);
        System.out.println("enter length three sides of triangle:");
        int firstSideTriang = triangle.nextInt(), secondSideTriang = triangle.nextInt(), thirtSideTriang = triangle.nextInt();
        if (checkTriangle(firstSideTriang, secondSideTriang, thirtSideTriang)) {
            System.out.println("this triangle is exists");

        } else {
            System.out.println("this triangle is not exists");
        }
//        (switch) Напишите класс, который принимает с клавиатуры целое число, которое должно означать порядковый
//        номер месяца. В случае если полученное значение действительно соответствует порядковому номеру одного
//        из месяцев, следует вывести сезон (лето, осень, зима, весна), к которому относится месяц.
//        В случае если введенное значение не является порядковым номером месяца, следует вывести
//        на экран соответствующее текстовое сообщение.
        System.out.println("The fifth task");
        int mounthNum = getNumber();
        switch (mounthNum) {
            case 1, 2, 12:
                System.out.println("this month is Winter");
                break;
            case 3, 4, 5:
                System.out.println("this month is Spring");
                break;
            case 6, 7, 8:
                System.out.println("this month is Summer");
                break;
            case 9, 10, 11:
                System.out.println("this month is Autumn");
                break;
            default:
                System.out.println("ERROR. Try enter correct number of month");
        }


    }

    private static boolean checkСorrectNum(int simmNum) {
        return simmNum <= 100 || simmNum >= 999;
    }

    private static boolean checkTriangle(int firstSideTriang, int secondSideTriang, int thirtSideTriang) {
        return firstSideTriang < secondSideTriang + thirtSideTriang && secondSideTriang < firstSideTriang + thirtSideTriang && thirtSideTriang < firstSideTriang + secondSideTriang;
    }


    private static boolean thirdDigitNumOrNot(int number) {
        return number <= 999 && number >= 100;
    }

    private static int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digit positive number: ");

        int number = sc.nextInt();
        return number;
    }

    private static boolean isOdd(int number) {
        return number % 2 == 0;
    }

}
