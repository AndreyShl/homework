package homeworkRegEx;


//Напишите класс, который принимает с клавиатуры строковое значение и определяет, является ли оно палиндромом (симметричным).

import java.util.Objects;
import java.util.Scanner;

public class StrPollinomOrNot {


    public StrPollinomOrNot() {
        System.out.println("Пожалуйста введите строку для проверки на полиндромность:");

    }

    public void checkerPollinomOrNot() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(scanner.next());
        String str1=stringBuilder.substring(0);
        StringBuilder stringBuilderClone = new StringBuilder(stringBuilder.reverse());
        String str2=stringBuilderClone.substring(0);

        if (str1.equals(str2)) {
            System.out.println("строка является полиндроном ");

        } else {
            System.out.println("строка не является полинроном");
        }

    }
}
