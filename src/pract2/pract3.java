package pract2;

import java.util.Locale;
import java.util.Scanner;

public class pract3 {
    public static void main(String[] args) {
//        Ввод строки: Считывание строки, введенной пользователем.
//
//                Удалить пробельные символы: ведущие и завершающие пробельные символы.
//
//                Заменить символы: заменить все символы ‘a’ на ‘@’.
//
//        Вставить текст: Вставить в начало строки “JAVA”.
//
//        Обратить строку: Перевернуть всю строку.
//
//                Преобразовать в верхний регистр.
//
//                Отобразить результаты: вывести исходную и преобразованную строку.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = scanner.nextLine();
        String strTrim=str.trim();
        System.out.println(strTrim);
        String strRep=strTrim.replace('a','@');
        System.out.println(strRep);
        StringBuffer strBuf = new StringBuffer(strRep);
        strBuf.insert(0,"JAVA");
        System.out.println(strBuf);
        strBuf.reverse();
        System.out.println(strBuf);
        String strUpp = strBuf.toString().toUpperCase();
        System.out.println(strUpp);





    }
}
