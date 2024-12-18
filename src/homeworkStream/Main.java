package homeworkStream;


/*Создать список строк List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
Используя stream и lambda выполнить следующие действия:
Удалить все содержащие “3”+
Отсортировать сперва по числу (по возрастанию), потом по букве (по убыванию)
Отбросить первый и последний элемент+
Привести в uppercase+
Выдать на печать результат+
Напечатать количество оставшихся элементов+
*/

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger();
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        System.out.println("начальный список: " + myList);
        myList.stream().
                filter(str -> str.matches("\\w[^3]")).
                sorted((str1, str2) -> {
                    String firstIndex1 = str1.substring(1, 2);
                    String firstIndex2 = str2.substring(1, 2);
                    return firstIndex1.compareTo(firstIndex2);
                })
                .sorted((str1, str2) -> {
                    String firstIndex1 = str1.substring(0, 1);
                    String firstIndex2 = str2.substring(0, 1);
                    return firstIndex2.compareTo(firstIndex1);
                }).skip(1).
                limit(myList.stream().filter(str -> str.matches("\\w[^3]")).count() - 2).
                forEach(str -> {
                    System.out.print(str.toUpperCase() + " ");
                    counter.getAndIncrement();
                });

        System.out.println();
        System.out.println("Конечное количество элементов: " + counter);


    }


}
