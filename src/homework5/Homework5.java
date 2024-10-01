package homework5;


import java.util.Arrays;
import java.lang.String;

import java.util.Scanner;


public class Homework5 {
    public static void main(String[] args) {
//        Задача 1
//        Продолжи последовательность:
//        1. Определить закономерность, согласно которой формируется та или иная числовая последовательность.
//        2. Написать функцию, которая формирует первые N элементов данной последовательности в виде целочисленного
//        массива и выводит элементы массива на экран:
//        (i+1)*-1^i
//        1, -2,  3,  -4,   5,  -6     …
//        1,  0,  2,   0,   3,   0,  4....
        tack1();

//        Задача 2
//        Заменить каждый элемент массива с нечетным индексом на ноль

        tack2();
//        Задача 3
//        Является ли массив возрастающей последовательностью: создайте массив из 4 случайных целых чисел из отрезка [10;99],
//        выведите его на экран в строку. Далее определите и выведите на экран сообщение о том, является ли
//        массив строго возрастающей последовательностью.
        tack3();

//        Напишите класс, который заполняет случайными двузначными числами массив, размер которого при инициализации вводится с клавиатуры.
//        После заполнения класс должен вывести на экран значения массива следующим образом:
//        в первой строке - значения из четных ячеек массива;
//        во второй строке - значения из нечетных ячеек массива.
        tack4();

//        Задача 5
//        Напишите метод, который принимает два параметра: массив целых чисел М и еще одно целое число Х.
//        Метод проверяет, находится ли число Х в массиве
        tack5();



//        Задача 6*
//    Cоздать второй массив из четных элементов первого массива.
//    Условие задачи:
//   1. Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3. Введенное пользователем число сохраняется в переменную n.
//   2. Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
//   3. Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.+
//   4. Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
        tack6();

//        Напишите метод, который получает в качестве параметра массив и заполняет его положительными случайными
//        двузначными числами так, чтобы первая и вторая половины массива были идентичными.
//        массив который заполняется рандомными числами на половину
//        скоировать половинну масиива и вставить его во вторую часть массива
        int[] array = new int[0];
        tack7(array,12);

    }
    private static void tack1(){
        System.out.println("задача 1");
        int[] array1;
        int[] array2;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("введите количество элементов массива: ");
        int n1 = sc1.nextInt();


        array1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            array1[i] = (int) ((i + 1) * Math.pow(-1, i));
        }
        System.out.println(Arrays.toString(array1));


        Scanner sc2 = new Scanner(System.in);
        System.out.println("введите количество элементов массива: ");
        int n2 = sc2.nextInt();
        array2 = new int[n2];
        int index = 1;
        for (int i = 0; i < n2; i = i + 2) {
            array2[i] = index++;
        }
        System.out.println(Arrays.toString(array2));
    }


    private static void tack2(){
        System.out.println("задача 2");

        int[] newArray;
        Scanner sc3 = new Scanner(System.in);
        System.out.println("введите количество элементов массива: ");
        int n3 = sc3.nextInt();
        newArray = new int[n3];
        for (int i = 0; i < n3; i++) {
            if ((i % 2) == 0) {
                newArray[i] = i;
            } else newArray[i] = 0;
        }
        System.out.println(Arrays.toString(newArray));
    }

    private static void tack3(){
        System.out.println("задача 3");
        int[] array3;

        array3 = new int[4];
        int nowIndex = 0;


        for (int i = 0; i < array3.length; i++) {
            array3[i] = (int) (Math.random() * 89 + 10);
            System.out.println(Arrays.toString(array3));
            if (array3[i] > nowIndex) {
                System.out.println("+");
                nowIndex = array3[i];
            } else {
                System.out.println("-");
            }
        }
    }


    private static void tack4(){
        System.out.println("задача 4");
        int[] array4;
        int evenArrayLength = 0;
        int oddArrayLength = 0;

        Scanner sc4 = new Scanner(System.in);
        System.out.println("введите количество элементов в массиве: ");
        int n4 = sc4.nextInt();
        array4 = new int[n4];

        for (int i = 0; i < array4.length; i++) {
            array4[i] = (int) (Math.random() * 89 + 10);
            if (array4[i] % 2 == 0) {
                evenArrayLength++;
            } else if (array4[i] % 2 != 0) {
                oddArrayLength++;
            }

        }
        int[] evenArray = new int[evenArrayLength];
        int[] oddArray = new int[oddArrayLength];
        int evenArrayIndex = 0;
        int oddArrayIndex = 0;
        for (int element : array4) {
            if (element % 2 == 0) {
                evenArray[evenArrayIndex] = element;
                evenArrayIndex++;
            } else {
                oddArray[oddArrayIndex] = element;
                oddArrayIndex++;
            }
        }
        System.out.println(Arrays.toString(evenArray));
        System.out.println(Arrays.toString(oddArray));
    }


    private static void tack5(){
        System.out.println("задача 5");
        int[] array5;
        int array5Lenth;
        Scanner sc5 = new Scanner(System.in);
        System.out.println("введите длину массива ");
        int n5 = sc5.nextInt();
        array5Lenth = n5;
        array5 = new int[array5Lenth];
        for (int i = 0; i < array5Lenth; i++) {
            System.out.println("введите элемент массива :");
            Scanner sc6 = new Scanner(System.in);
            int nowElArray = sc6.nextInt();
            array5[i] = nowElArray;
        }
        System.out.println("Введите число которе хотите найти в массиве: ");
        Scanner sc6 = new Scanner(System.in);
        int foundNum = sc6.nextInt();
        for (int i = 0; i < array5Lenth; i++) {
            if (array5[i] == foundNum) {
                System.out.println("ваше число " + foundNum + " есть в массиве!");
                break;
            } else if (array5[i] != foundNum && i == array5Lenth - 1) {

                System.out.println("ваше число " + foundNum + " отсутствует в массиве!");
            }
        }
    }

    private static void tack6(){
        System.out.println("Задание 6 и уже 2 часа ночи...");
        Scanner sc7 = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = sc7.nextInt();
        for (; n <= 3; ) {
            n = sc7.nextInt();
            System.out.println("Введите размер массива больше трёх ");

        }

        int[] array7;
        int[] array7even;
        int array7evenIndex = 0;
        array7 = new int[n];
        for (int i = 0; i < array7.length; i++) {
            array7[i] = (int) (Math.random() * n);
            if (array7[i] % 2 == 0) {
                array7evenIndex++;
            }
        }
        array7even = new int[array7evenIndex];
        for (int i = 0, even = 0; i < array7.length; i++) {
            if (array7[i] % 2 == 0) {
                array7even[even] = array7[i];
                even++;
            }

        }
        System.out.println("Оригинальный массив случайных чисел " + Arrays.toString(array7));
        System.out.println("массив чётных элементов из первого массива " + Arrays.toString(array7even));
    }



    private static void tack7(int[] array8, int n) {
        System.out.println("Задание 6 и уже 2:40))");

        array8 = new int[n];
        int[] array8copy = Arrays.copyOf(array8, array8.length);


        for (int i = 0, j = array8.length - 1; i < array8.length / 2; i++, j--) {
            array8[i] = (int) (Math.random() * 89 + 10);
            array8copy[j] = array8[i];
        }
        int[] arrayResult;
        arrayResult = new int[array8.length];
        for (int i = 0; i < array8.length / 2; i++) {
            arrayResult[i] = array8[i];
        }
        for (int i = array8copy.length / 2; i < array8copy.length; i++) {
            arrayResult[i] = array8copy[i];
        }

        System.out.println(Arrays.toString(array8));
        System.out.println(Arrays.toString(array8copy));
        System.out.println(Arrays.toString(arrayResult));


    }

}




