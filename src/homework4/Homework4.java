package homework4;

import java.util.Scanner;


public class Homework4 {
    public static void main(String[] args) {
//        -Напишите программу, которая выводит на консоль таблицу умножения
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для которого хотите узнать таблицу умножения:");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));

        }
//        - В цикле программа просит у пользователя ввести два числа и выводит результат их умножения.
//                После вывода результата умножения программа спрашивает, надо ли завершить выполнение.
//                И если пользователь введет число 1, то программа завершает цикл. Если введено любое другое число,
//                то программа продолжает спрашивать у пользователя два числа и умножать их.
//
        int j = 0;
        while (j != 1) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("введите первое число: ");
            int firstNum = sc1.nextInt();
            System.out.println("введите второе число: ");
            int secNum = sc1.nextInt();
            System.out.println(firstNum + " * " + secNum + " = " + (firstNum * secNum));
            System.out.println("Завершить выполнение программы?");
            System.out.println("Если да, введите цифру 1");
            j = sc1.nextInt();
        }
        System.out.println("Программа завершена, спасибо)");







//        - Последовательность Фибоначчи - последовательность целых чисел, построенная по следующему правилу:
//        каждый член последовательности, начиная с 3-го, равен сумме двух предыдущих. Напишите класс, который
//        получает с клавиатуры два первых члена последовательности и целое положительное число N. Класс
//        подсчитает и выведет на экран сумму первых N членов последовательности Фибоначчи
        int firNumFib, secNumFib, N;
        Scanner scFib = new Scanner(System.in);

        System.out.println("Введите первый член последовательности:");
        firNumFib = scFib.nextInt();

        System.out.println("Введите второй член последовательности:");
        secNumFib = scFib.nextInt();

        System.out.println("Введите количество чисел последовательности");
        N = scFib.nextInt();

        fib(firNumFib, secNumFib, N);



//        Напишите класс, который принимает с клавиатуры числа, пока не будет введено значение 0.
//        Для каждого введенного с клавиатуры положительного числа класс должен выводить на
//        экран текст “Плюс”, для каждого отрицательного - “Минус”.
        int num3 = 1;
        while (num3 != 0) {
            System.out.println("Пожалуйста введите любое число: ");
            Scanner sc4 = new Scanner(System.in);
            num3 = sc4.nextInt();
            if (num3 > 0) {
                System.out.println("Плюс");
            } else {
                System.out.println("Минус");
            }

        }
        System.out.println("Программа завершена, спасибо)");

//        ъъъъ- * В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
//        Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов
//        с номерами от 000001 до 999999. «Счастливым» считается билетик у которого сумма
//        первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах
//        с номерами 003102 или 567576. Трамвайное депо решило подарить сувенир обладателю каждого
//        счастливого билета и теперь раздумывает, как много сувениров потребуется. С помощью
//        программы подсчитайте сколько счастливых билетов в одном рулоне?
        int i = 999999, firParTicket, lasParTicket, firDigit, secDigit, thiDigit, fourDigit, fivDigit, sixDigit, sum1, sum2, winMen = 0;
        for (; i > 0; i--) {

            firParTicket = (i / 1000);
            firDigit = firParTicket / 100;
            secDigit = (firParTicket / 10) % 10;
            thiDigit = firParTicket % 10;
            lasParTicket = (i % 1000);
            fourDigit = lasParTicket / 100;
            fivDigit = (lasParTicket / 10) % 10;
            sixDigit = lasParTicket % 10;
            sum1 = firDigit + secDigit + thiDigit;
            sum2 = fourDigit + fivDigit + sixDigit;
            if (sum1 == sum2) {
                winMen++;
            }


        }
        System.out.println("количество победителей: " + winMen);
    }



    public static void fib(int firNumFib, int secNumFib, int N) {
        int nowNumFib;
        int N_ =N-1;
        if(N_+1!=0) {
            nowNumFib = firNumFib + secNumFib;
            System.out.println(nowNumFib);
            firNumFib = secNumFib;
            secNumFib = nowNumFib;
            fib(firNumFib,secNumFib,N_);
        }





    }


}
