package pract2;

import java.util.Scanner;

public class pract2 {
    public static void main(String[] args) {
//        Введите строку. Если она начинается на ‘abc’, то заменить их на ‘www’, иначе добавить в конец строки ‘zzz’.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = scanner.nextLine();
        if (str.startsWith("abc")){
            str=str.replace("abc","www");
        }
        else {
            str=str+"zzz";
        }
        System.out.println(str);

    }
}
