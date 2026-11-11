package pract.pract19;

import java.util.List;
import java.util.Optional;

//Дана коллекция Collection<String> col. С помощью stream api:
//
//узнать, содержит ли какая-нибудь из строк слово login
//
//найти самую длинную строку
//
//найти самую короткую строку
//
//найти строки-слова (не содержат пробелов и знаков препинания)
//
//получить все слова используемые в строках
public class main {
    public static void main(String[] args) {
        List<String> data = List.of("a!","bd","fg,sa","login","da.ta","papert");

        boolean containsLogin = data.stream().anyMatch(string -> string.contains("login"));
        System.out.println(containsLogin);

        Optional<String> maxString = data.stream().max((str1, str2) -> Integer.compare(str1.length(), str2.length()));
        System.out.println(maxString);
        Optional<String> minString = data.stream().min((str1, str2) -> Integer.compare(str1.length(), str2.length()));
        System.out.println(minString);

        List<String> stringList = data.stream().filter(string -> string.matches("\\w+")).toList();
        System.out.println(stringList);

    }
}
