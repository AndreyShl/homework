package HomeworkArrayToMap;
/*Напишите метод, который получает на вход массив элементов типа К (Generic)
и возвращает Map<K, Integer>, где K — значение из массива,
а Integer — количество вхождений в массив.
Сигнатура метода: <K> Map<K, Integer> arrayToMap(K[] ks)*/


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Integer[] firstArray = {1, 2, 3, 4, 61, 1, 1, 1};
        String[] secArray = {"Вася", "Андрей", "Николай", "Андрей", "Андрей", "Николай"};

        System.out.println(arrayToMap(firstArray));
        System.out.println(arrayToMap(secArray));

    }


    public static <K> Map<K, Integer> arrayToMap(K[] startArray) {

        Map<K, Integer> resoultMap = new HashMap<>();
        for (int i = 0; i < startArray.length; i++)/*цикл для перебора элементов*/ {
            Integer joins = 0;
            for (int j = 0; j < startArray.length; j++)/*цикл для количества вхождений каждого элемента */ {
                if (startArray[i] == startArray[j]) {
                    joins++;
                }
            }
            resoultMap.put(startArray[i], joins);
        }

        return resoultMap;
    }
}
