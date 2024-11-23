package homeworkRegEx;

//ДЗ по строкам
//
//        1. Введите строку (текст). Показать номера символов, совпадающих с последним символом строки.
//
//        2. Напишите класс, который принимает с клавиатуры строковое значение и определяет, является ли оно палиндромом (симметричным).
//
//        3. Найдите количество вхождения слова 'test' в строке.
//
//        4. Напишите регулярное выражение чтобы найти все годы между 1977 и 1982
//        1975 1976 1977 1978 1979 1980 1981 1982 1983 1984
//
//        5.  Напишите регулярное выражение для  IP адреса. 4 группы цифр (от 1 до 3 цифр в каждой) разделены точками. Группа содержит число в диапазоне от 1 до 255
//Пример: 127.0.0.1  255.255.255.253   100.99.44.2

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

//        //TASK1

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < stringBuilder.length() - 1; i++) {
            if (stringBuilder.charAt(i) == stringBuilder.charAt(stringBuilder.length() - 1)) {
                System.out.format("Номер символа совпадающим с символом '%s' это %d ", stringBuilder.charAt(stringBuilder.length() - 1), i++);
                System.out.println();
            }
        }


//        //TASK2

        StrPollinomOrNot str = new StrPollinomOrNot();
        str.checkerPollinomOrNot();



//        TASK3
        String stringPattern = "test";
        String value = "gfdsdjtestdkfjglstesttest";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(value);
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        System.out.format("количество вхождения слова '%s' равно:%d", stringPattern, matches);
        System.out.println();

        //TASK4
        String stringPatternYears = "19[7-8]+[7-9|0-2]";
        String valueYears = "1945 1975 1976 1977 1978 1979 1980 1981 1982 1983 1984";
        Pattern patternYears = Pattern.compile(stringPatternYears);
        Matcher matcherYears = patternYears.matcher(valueYears);
        while (matcherYears.find()) {
            System.out.println(valueYears.substring(matcherYears.start(), matcherYears.end()));
        }

        //TASK5  5.  Напишите регулярное выражение для  IP адреса. 4 группы цифр (от 1 до 3 цифр в каждой) разделены точками.
        // Группа содержит число в диапазоне от 1 до 255
        ////Пример: 127.0.0.1  255.255.255.253   100.99.44.2


        String stringPatternIP = "^((([0-1]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-1]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5]){1})$";
        String value2 = "127.0.0.13";
        Pattern patternIP = Pattern.compile(stringPatternIP);
        Matcher matcherIP = patternIP.matcher(value2);
        if (matcherIP.find()) {
            System.out.println(value2 + " является IP адресом ");
        } else if (!matcherIP.find()) {
            System.out.println(value2 + "не является IP адресом ");
        }


    }


}
